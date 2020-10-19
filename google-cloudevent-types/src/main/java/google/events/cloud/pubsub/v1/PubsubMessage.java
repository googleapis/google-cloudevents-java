// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package google.events.cloud.pubsub.v1;

import java.util.Map;

/**
 * The message that was published.
 *
 * A message published to a topic.
 */
public class PubsubMessage {
    private Map<String, Object> attributes;
    private String data;
    private String messageID;

    /**
     * Attributes for this message. If this field is empty, the message must contain non-empty
     * data. This can be used to filter messages on the subscription.
     */
    public Map<String, Object> getAttributes() { return attributes; }
    public void setAttributes(Map<String, Object> value) { this.attributes = value; }

    /**
     * The message data field. If this field is empty, the message must contain at least one
     * attribute. A base64-encoded string.
     */
    public String getData() { return data; }
    public void setData(String value) { this.data = value; }

    /**
     * ID of this message, assigned by the server when the message is published. Guaranteed to
     * be unique within the topic. This value may be read by a subscriber that receives a
     * PubsubMessage via a subscriptions.pull call or a push delivery. It must not be populated
     * by the publisher in a topics.publish call.
     */
    public String getMessageID() { return messageID; }
    public void setMessageID(String value) { this.messageID = value; }
}
