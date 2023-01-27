/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events;

import static com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.Feature.FEATURE_PROTO3_OPTIONAL;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.DescriptorProtos.DescriptorProto;
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;
import java.io.StringWriter;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Generator {
  private static final Logger LOGGER = LoggerFactory.getLogger(Generator.class);

  public static CodeGeneratorResponse generate(CodeGeneratorRequest request) {

    // CodeGeneratorRequest contain FileDescriptorProtos for all the proto
    // files and associated dependencies.
    List<FieldDescriptorProto> dataFields = new ArrayList<FieldDescriptorProto>();
    Set<FieldDescriptorProto> set = new HashSet<FieldDescriptorProto>();
    for (DescriptorProtos.FileDescriptorProto fp : request.getProtoFileList()) {
      String file = fp.getName();
      LOGGER.info("Input Protobuf: " + file);
      if (!file.endsWith("events.proto")) {
        LOGGER.warn("Expected file: events.proto. Skipping file: " + file);
        continue;
      }

      List<DescriptorProto> messageTypes = fp.getMessageTypeList();
      messageTypes.stream()
          .forEach(
              message -> {
                List<FieldDescriptorProto> fields =
                    message.getFieldList().stream()
                        .filter(field -> field.getName().equalsIgnoreCase("data"))
                        .collect(Collectors.toList());
                // dataFields.addAll(fields);
                set.addAll(fields);
              });
    }

    // The plugin writes an encoded CodeGeneratorResponse to stdout.
    CodeGeneratorResponse.Builder response =
        CodeGeneratorResponse.newBuilder()
            .setSupportedFeatures(FEATURE_PROTO3_OPTIONAL.getNumber());

    for (FieldDescriptorProto dataField : set) {
      List<String> fieldPackage = getPackageName(dataField);
      LOGGER.info("Generating Test File for " + fieldPackage.get(1));
      // Generate file name and path
      // google/events/cloud/pubsub/v1/data.proto -->
      // com/google/events/cloud/pubsub/v1/MessagePublishedDataTest.java
      String name =
          fieldPackage.get(0).replaceAll("\\.", "\\/") + "/" + fieldPackage.get(1) + "Test.java";
      LOGGER.info(name);
      // Generate test file
      String testFileContent = generateTestFile(dataField, request.getParameter());
      // Add test file to response
      response.addFileBuilder().setName(name).setContent(testFileContent);
    }

    return response.build();
  }

  private static String generateTestFile(FieldDescriptorProto dataField, String opts) {
    // Instantiate Velocity Engine
    VelocityEngine velocityEngine = new VelocityEngine();
    // Set properties to locate template
    velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADERS, "classpath");
    velocityEngine.setProperty(
        "resource.loader.classpath.class", ClasspathResourceLoader.class.getName());
    velocityEngine.init();
    Template t = velocityEngine.getTemplate("classTemplate.vm");

    // Get template variable values
    String packageName = getPackageName(dataField).get(0);
    String className = getPackageName(dataField).get(1);
    List<String> optList = Arrays.asList(opts.split("\\s*,\\s*"));
    Boolean skipStrict =
        optList.stream().filter(opt -> opt.contains(className)).collect(Collectors.toList()).size()
            > 0;

    // Add variables to template
    VelocityContext context = new VelocityContext();
    context.put("packageName", packageName);
    context.put("className", className);
    context.put("year", Year.now().getValue());
    context.put("skip", optList.contains(className));
    context.put("skipStrict", skipStrict);
    // Render output
    StringWriter writer = new StringWriter();
    t.merge(context, writer);

    return writer.toString();
  }

  private static List<String> getPackageName(FieldDescriptorProto dataField) {
    List<String> typeName = new ArrayList<String>();
    Collections.addAll(typeName, dataField.getTypeName().substring(1).split("\\."));
    String className = typeName.remove(typeName.size() - 1);
    String packageName = "com." + String.join(".", typeName);
    return Arrays.asList(packageName, className);
  }
}
