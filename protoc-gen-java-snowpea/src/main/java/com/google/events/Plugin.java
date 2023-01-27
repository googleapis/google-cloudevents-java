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

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorRequest;
import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plugin {
  private static final Logger LOGGER = LoggerFactory.getLogger(Plugin.class);

  public static void main(String[] args) throws IOException {
    // An encoded CodeGeneratorRequest is written to the plugin's stdin
    CodeGeneratorRequest request = CodeGeneratorRequest.parseFrom(System.in);
    LOGGER.info("Plugin opt: " + request.getParameter());
    // Generate test files from proto messages
    CodeGeneratorResponse response = Generator.generate(request);
    // Write to Plugin's stdout
    response.writeTo(System.out);
  }
}
