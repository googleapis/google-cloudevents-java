/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.pubsub.v1;
import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class MessagePublishedDataTest {
  private String decode(String data) {
    return new String(Base64.getDecoder().decode(data), StandardCharsets.UTF_8.toString());
  }

  @Test
  public void testPubSubEvent() {
    final String json = "{\n" +
            "      \"subscription\": \"projects/my-project/subscriptions/my-subscription\",\n" +
            "      \"message\": {\n" +
            "        \"@type\": \"type.googleapis.com/google.pubsub.v1.PubsubMessage\",\n" +
            "        \"attributes\": {\n" +
            "          \"attr1\":\"attr1-value\"\n" +
            "        },\n" +
            "        \"data\": \"dGVzdCBtZXNzYWdlIDM=\",\n" +
            "        \"messageId\": \"message-id\",\n" +
            "      }\n" +
            "}";
    MessagePublishedData m = new Gson().fromJson(json, MessagePublishedData.class);
    assertEquals("test message 3", decode(m.getMessage().getData()));
  }
}
