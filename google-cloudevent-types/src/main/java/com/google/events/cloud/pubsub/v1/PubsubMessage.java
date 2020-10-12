package com.google.events.cloud.pubsub.v1;

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
