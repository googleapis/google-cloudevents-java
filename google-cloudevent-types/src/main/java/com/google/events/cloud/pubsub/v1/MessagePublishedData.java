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

/**
 * The event data when a message is published to a topic.
 */
public class MessagePublishedData {
    private Message message;
    private String subscription;

    /**
     * The message that was published.
     */
    public Message getMessage() { return message; }
    public void setMessage(Message value) { this.message = value; }

    /**
     * The resource name of the subscription for which this event was
     * generated. The format of the value is
     * `projects/{project-id}/subscriptions/{subscription-id}`.
     */
    public String getSubscription() { return subscription; }
    public void setSubscription(String value) { this.subscription = value; }
}
