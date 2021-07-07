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

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The message that was published.
 */
public class Message {
    private Map<String, String> attributes;
    private String data;
    private String messageID;
    private OffsetDateTime publishTime;

    /**
     * Attributes for this message.
     */
    public Map<String, String> getAttributes() { return attributes; }
    public void setAttributes(Map<String, String> value) { this.attributes = value; }

    /**
     * The binary data in the message.
     */
    public String getData() { return data; }
    public void setData(String value) { this.data = value; }

    /**
     * ID of this message, assigned by the server when the message is published.
     * Guaranteed to be unique within the topic.
     */
    public String getMessageID() { return messageID; }
    public void setMessageID(String value) { this.messageID = value; }

    /**
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call.
     */
    public OffsetDateTime getPublishTime() { return publishTime; }
    public void setPublishTime(OffsetDateTime value) { this.publishTime = value; }
}
