/*
 * Copyright 2020 Google LLC
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

package com.google.events.cloud;

import static org.junit.Assert.assertEquals;

import java.util.Base64;

import com.google.events.cloud.pubsub.v1.MessagePublishedData;
import com.google.events.cloud.pubsub.v1.PubsubMessage;

import org.junit.Test;

/**
 * Tests that you can create a Pub/Sub Message.
 */
public class PubSubTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        String base64String = Base64.getEncoder().encodeToString("foo".getBytes());
        
        // Create Pub/Sub message POJO
        PubsubMessage pubsubMessage = new PubsubMessage();
        pubsubMessage.setData(base64String);
        MessagePublishedData data = new MessagePublishedData();
        data.setMessage(pubsubMessage);

        // Test POJO can get data correctly
        assertEquals(data.getMessage().getData(), base64String);
    }
}
