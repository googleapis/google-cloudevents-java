package com.google.events;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import java.io.StringWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.time.Year;

public class Plugin {

    public static void main(String[] args) throws IOException, Descriptors.DescriptorValidationException {
        // Plugin receives a serialized CodeGeneratorRequest via stdin
        CodeGeneratorRequest request = CodeGeneratorRequest.parseFrom(System.in);

        // CodeGeneratorRequest contain FileDescriptorProtos for all the proto files we need to process
        // as well as their dependencies. We want to convert the FileDescriptorProtos into FileDescriptor instances,
        // since they are easier to work with. We will build a map that maps file names to the corresponding file
        // descriptor.
        Map<String, Descriptors.FileDescriptor> filesByName = new HashMap<>();

        for (DescriptorProtos.FileDescriptorProto fp : request.getProtoFileList()) {
            // The dependencies of fp are provided as strings, we look them up in the map as we are generating it.
            Descriptors.FileDescriptor dependencies[] = fp.getDependencyList().stream().map(filesByName::get)
                    .toArray(Descriptors.FileDescriptor[]::new);

            Descriptors.FileDescriptor fd = Descriptors.FileDescriptor.buildFrom(fp, dependencies);
            filesByName.put(fp.getName(), fd);
        }

        // Building the response
        // output to java files under test folder
        // change file name to test file name
        CodeGeneratorResponse.Builder response = CodeGeneratorResponse.newBuilder();
        for (String fileName : request.getFileToGenerateList()) {
            if (!fileName.endsWith("data.proto")) { // Ignore 3P and non-data protos
                continue;
            }
            Descriptors.FileDescriptor fd = filesByName.get(fileName);
            for (Descriptors.Descriptor messageType : fd.getMessageTypes()) {
                if (messageType.getName().endsWith("Data")) {
                    response.addFileBuilder()
                            .setName(fd.getFullName().replaceAll("data.proto", messageType.getName() + "Test.java"))
                            .setContent(generateTestFile(fd, messageType));
                    // .setName(fd.getFullName().replaceAll("\\.proto$", ".java"))
                    // .setContent(generateFileContent(fd));
                }
            }
        }

        // Serialize the response to stdout
        response.setSupportedFeatures((long) 1);
        response.build().writeTo(System.out);
    }

    private static String generateTestFile(Descriptors.FileDescriptor fd, Descriptors.Descriptor messageType) {
        String inputTemplate = "./protoc-gen-java-snowpea/src/main/resources/classTemplate.vm";
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();
        VelocityContext context = new VelocityContext();

        String packageName = fd.getPackage();
        String className = messageType.getName();
        context.put("packageName", packageName);
        context.put("className", className);
        context.put("year", Year.now().getValue());

        StringWriter writer = new StringWriter();
        Velocity.mergeTemplate(inputTemplate, "UTF-8", context, writer);

        return writer.toString();
    }

    private static String generateFileContent(Descriptors.FileDescriptor fd) {
        StringBuilder sb = new StringBuilder();
        for (Descriptors.Descriptor messageType : fd.getMessageTypes()) {
            generateMessage(sb, messageType, 0);
        }
        return sb.toString();
    }

    private static String renderType(Descriptors.FieldDescriptor fd) {
        if (fd.isRepeated()) {
            return "List<" + renderSingleType(fd) + ">";
        } else {
            return renderSingleType(fd);
        }
    }

    private static String renderSingleType(Descriptors.FieldDescriptor fd) {
        if (fd.getType() != Descriptors.FieldDescriptor.Type.MESSAGE) {
            return fd.getType().toString();
        } else {
            return fd.getMessageType().getName();
        }
    }

    private static void generateMessage(StringBuilder sb, Descriptors.Descriptor messageType, int indent) {
        sb.append(String.join("", Collections.nCopies(indent, " ")));
        sb.append("|- ");
        sb.append(messageType.getName());
        sb.append("(");

        sb.append(String.join(", ", messageType.getFields().stream()
                .map(field -> field.getName() + ": " + renderType(field)).collect(Collectors.joining(", "))));
        sb.append(")");
        sb.append(System.getProperty("line.separator"));

        // recurse for nested messages.
        sb.append(String.join("", Collections.nCopies(indent, " ")));
        for (Descriptors.Descriptor nestedType : messageType.getNestedTypes()) {
            generateMessage(sb, nestedType, indent + 3);
        }
    }
}
