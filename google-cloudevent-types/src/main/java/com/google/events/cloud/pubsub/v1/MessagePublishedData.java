package com.google.events.cloud.pubsub.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * A message that is published by publishers and consumed by subscribers.
 */
public class MessagePublishedData {
    private PubsubMessage message;
    private String subscription;

    /**
     * The message that was published.
     */
    @JsonProperty("message")
    public PubsubMessage getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(PubsubMessage value) { this.message = value; }

    /**
     * The resource name of the subscription for which this event was generated. The format of
     * the value is `projects/{project-id}/subscriptions/{subscription-id}`.
     */
    @JsonProperty("subscription")
    public String getSubscription() { return subscription; }
    @JsonProperty("subscription")
    public void setSubscription(String value) { this.subscription = value; }
}
