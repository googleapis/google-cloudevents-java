/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.appengine;

import static io.cloudevents.core.CloudEventUtils.mapData;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.events.cloud.pubsub.v1.Message;
import com.google.events.cloud.pubsub.v1.MessagePublishedData;
import io.cloudevents.CloudEvent;
import io.cloudevents.core.data.PojoCloudEventData;
import io.cloudevents.core.message.MessageReader;
import io.cloudevents.http.HttpMessageFactory;
import io.cloudevents.jackson.PojoCloudEventDataMapper;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Enumeration;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Index", value = "")
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    CloudEvent event = createMessageReader(request).toEvent();

    ObjectMapper objectMapper =
        new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.registerModule(new JavaTimeModule());
    PojoCloudEventData<MessagePublishedData> cloudEventData =
        mapData(event, PojoCloudEventDataMapper.from(objectMapper, MessagePublishedData.class));

    Message message = cloudEventData.getValue().getMessage();
    System.out.println(
        new String(Base64.getDecoder().decode(message.getData()), StandardCharsets.UTF_8));
    System.out.println(message.getMessageId());
    System.out.println(event.getSource());

    response.setContentType("text/plain");
    response.getWriter().println("received!");
  }

  private static MessageReader createMessageReader(HttpServletRequest httpServletRequest)
      throws IOException {
    Consumer<BiConsumer<String, String>> forEachHeader =
        processHeader -> {
          Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
          while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            processHeader.accept(name, httpServletRequest.getHeader(name));
          }
        };

    byte[] body = httpServletRequest.getInputStream().readAllBytes();
    return HttpMessageFactory.createReader(forEachHeader, body);
  }
}
