/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.events;

import static com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.Feature.FEATURE_PROTO3_OPTIONAL;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.time.Year;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plugin {
    private static final Logger LOGGER = LoggerFactory.getLogger(Plugin.class);

    public static void main(String[] args)
            throws IOException, Descriptors.DescriptorValidationException {
        // An encoded CodeGeneratorRequest is written to the plugin's stdin.
        CodeGeneratorRequest request = CodeGeneratorRequest.parseFrom(System.in);
        LOGGER.debug("Plugin opt: " + request.getParameter());

        // CodeGeneratorRequest contain FileDescriptorProtos for all the proto files
        // and associated dependencies
        // FileDescriptorProtos will be converted into FileDescriptor instances and
        // mapped to file names
        // https://cloud.google.com/java/docs/reference/protobuf/latest/com.google.protobuf.Descriptors.FileDescriptor
        // Describes a .proto file, including everything defined within. That
        // includes, in particular, descriptors for all the messages and file
        // descriptors for all
        // other imported .proto files (dependencies).
        Map<String, Descriptors.FileDescriptor> filesByName = new HashMap<>();
        for (DescriptorProtos.FileDescriptorProto fp : request.getProtoFileList()) {
            LOGGER.debug("Preprocessing FileDescriptorProto: " + fp.getName());
            // The dependencies of fp are provided as strings, we look them up in the map as
            // we are generating it.
            Descriptors.FileDescriptor dependencies[] = fp.getDependencyList().stream()
                    .map(filesByName::get)
                    .toArray(Descriptors.FileDescriptor[]::new);
            LOGGER.debug(dependencies.toString());
            Descriptors.FileDescriptor fd = Descriptors.FileDescriptor.buildFrom(fp, dependencies);
            LOGGER.debug("FileDescriptor: " + fd.toString());
            filesByName.put(fp.getName(), fd);
        }

        // The plugin writes an encoded CodeGeneratorResponse to stdout.
        CodeGeneratorResponse.Builder response = CodeGeneratorResponse.newBuilder()
                .setSupportedFeatures(FEATURE_PROTO3_OPTIONAL.getNumber());

        // Process the .proto files that were explicitly listed on the command-line.
        for (String fileName : request.getFileToGenerateList()) {
            // Process only data.proto
            // Ignore events.protos, cloudevent.protos, and named 3P protos
            if (fileName.endsWith("data.proto")) {
                Descriptors.FileDescriptor fd = filesByName.get(fileName);
                for (Descriptors.Descriptor messageType : fd.getMessageTypes()) {
                    // Process Top Level Messages ie message types ending in "Data"
                    if (messageType.getName().endsWith("Data")) {
                        LOGGER.info("Generating Test File for " + messageType.getName());
                        // Generate file name and path
                        // google/events/cloud/pubsub/v1/data.proto -->
                        // google/events/cloud/pubsub/v1/MessagePublishedDataTest.java
                        String name = "com/"
                                + fd.getFullName()
                                        .replaceAll("data.proto", messageType.getName() + "Test.java");
                        // Generate test file
                        String testFileContent = generateTestFile(fd, messageType, request.getParameter());
                        response.addFileBuilder().setName(name).setContent(testFileContent);
                    }
                }
            }
        }

        // Serializes the message and writes it to output.
        response.build().writeTo(System.out);
    }

    private static String generateTestFile(
            Descriptors.FileDescriptor fd, Descriptors.Descriptor messageType, String opts) {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADERS, "classpath");
        velocityEngine.setProperty(
                "resource.loader.classpath.class", ClasspathResourceLoader.class.getName());
        velocityEngine.init();

        Template t = velocityEngine.getTemplate("classTemplate.vm");
        String packageName = fd.getPackage();
        String className = messageType.getName();

        List<String> optList = Arrays.asList(opts.split("\\s*,\\s*"));

        VelocityContext context = new VelocityContext();
        context.put("packageName", packageName);
        context.put("className", className);
        context.put("year", Year.now().getValue());
        context.put("skip", optList.contains(className));

        StringWriter writer = new StringWriter();
        t.merge(context, writer);

        return writer.toString();
    }
}
