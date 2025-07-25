/*
 * Copyright 2025 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/functions/v2/data.proto

package com.google.events.cloud.functions.v2;

public interface EventTriggerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.functions.v2.EventTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Eventarc trigger. The format of this
   * field is `projects/{project}/locations/{region}/triggers/{trigger}`.
   * </pre>
   *
   * <code>string trigger = 1;</code>
   *
   * @return The trigger.
   */
  java.lang.String getTrigger();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Eventarc trigger. The format of this
   * field is `projects/{project}/locations/{region}/triggers/{trigger}`.
   * </pre>
   *
   * <code>string trigger = 1;</code>
   *
   * @return The bytes for trigger.
   */
  com.google.protobuf.ByteString getTriggerBytes();

  /**
   *
   *
   * <pre>
   * The region that the trigger will be in. The trigger will only receive
   * events originating in this region. It can be the same
   * region as the function, a different region or multi-region, or the global
   * region. If not provided, defaults to the same region as the function.
   * </pre>
   *
   * <code>string trigger_region = 2;</code>
   *
   * @return The triggerRegion.
   */
  java.lang.String getTriggerRegion();

  /**
   *
   *
   * <pre>
   * The region that the trigger will be in. The trigger will only receive
   * events originating in this region. It can be the same
   * region as the function, a different region or multi-region, or the global
   * region. If not provided, defaults to the same region as the function.
   * </pre>
   *
   * <code>string trigger_region = 2;</code>
   *
   * @return The bytes for triggerRegion.
   */
  com.google.protobuf.ByteString getTriggerRegionBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of event to observe. For example:
   * `google.cloud.audit.log.v1.written` or
   * `google.cloud.pubsub.topic.v1.messagePublished`.
   * </pre>
   *
   * <code>string event_type = 3;</code>
   *
   * @return The eventType.
   */
  java.lang.String getEventType();

  /**
   *
   *
   * <pre>
   * Required. The type of event to observe. For example:
   * `google.cloud.audit.log.v1.written` or
   * `google.cloud.pubsub.topic.v1.messagePublished`.
   * </pre>
   *
   * <code>string event_type = 3;</code>
   *
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString getEventTypeBytes();

  /**
   *
   *
   * <pre>
   * Criteria used to filter events.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.EventFilter event_filters = 4;</code>
   */
  java.util.List<com.google.events.cloud.functions.v2.EventFilter> getEventFiltersList();

  /**
   *
   *
   * <pre>
   * Criteria used to filter events.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.EventFilter event_filters = 4;</code>
   */
  com.google.events.cloud.functions.v2.EventFilter getEventFilters(int index);

  /**
   *
   *
   * <pre>
   * Criteria used to filter events.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.EventFilter event_filters = 4;</code>
   */
  int getEventFiltersCount();

  /**
   *
   *
   * <pre>
   * Criteria used to filter events.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.EventFilter event_filters = 4;</code>
   */
  java.util.List<? extends com.google.events.cloud.functions.v2.EventFilterOrBuilder>
      getEventFiltersOrBuilderList();

  /**
   *
   *
   * <pre>
   * Criteria used to filter events.
   * </pre>
   *
   * <code>repeated .google.events.cloud.functions.v2.EventFilter event_filters = 4;</code>
   */
  com.google.events.cloud.functions.v2.EventFilterOrBuilder getEventFiltersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The name of a Pub/Sub topic in the same project that will be used
   * as the transport topic for the event delivery. Format:
   * `projects/{project}/topics/{topic}`.
   * This is only valid for events of type
   * `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here
   * will not be deleted at function deletion.
   * </pre>
   *
   * <code>string pubsub_topic = 5;</code>
   *
   * @return The pubsubTopic.
   */
  java.lang.String getPubsubTopic();

  /**
   *
   *
   * <pre>
   * Optional. The name of a Pub/Sub topic in the same project that will be used
   * as the transport topic for the event delivery. Format:
   * `projects/{project}/topics/{topic}`.
   * This is only valid for events of type
   * `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here
   * will not be deleted at function deletion.
   * </pre>
   *
   * <code>string pubsub_topic = 5;</code>
   *
   * @return The bytes for pubsubTopic.
   */
  com.google.protobuf.ByteString getPubsubTopicBytes();

  /**
   *
   *
   * <pre>
   * Optional. The email of the trigger's service account. The service account
   * must have permission to invoke Cloud Run services, the permission is
   * `run.routes.invoke`.
   * If empty, defaults to the Compute Engine default service account:
   * `{project_number}-compute&#64;developer.gserviceaccount.com`.
   * </pre>
   *
   * <code>string service_account_email = 6;</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();

  /**
   *
   *
   * <pre>
   * Optional. The email of the trigger's service account. The service account
   * must have permission to invoke Cloud Run services, the permission is
   * `run.routes.invoke`.
   * If empty, defaults to the Compute Engine default service account:
   * `{project_number}-compute&#64;developer.gserviceaccount.com`.
   * </pre>
   *
   * <code>string service_account_email = 6;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * Optional. If unset, then defaults to ignoring failures (i.e. not retrying
   * them).
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.EventTrigger.RetryPolicy retry_policy = 7;</code>
   *
   * @return The enum numeric value on the wire for retryPolicy.
   */
  int getRetryPolicyValue();

  /**
   *
   *
   * <pre>
   * Optional. If unset, then defaults to ignoring failures (i.e. not retrying
   * them).
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.EventTrigger.RetryPolicy retry_policy = 7;</code>
   *
   * @return The retryPolicy.
   */
  com.google.events.cloud.functions.v2.EventTrigger.RetryPolicy getRetryPolicy();

  /**
   *
   *
   * <pre>
   * Optional. The name of the channel associated with the trigger in
   * `projects/{project}/locations/{location}/channels/{channel}` format.
   * You must provide a channel to receive events from Eventarc SaaS partners.
   * </pre>
   *
   * <code>string channel = 8;</code>
   *
   * @return The channel.
   */
  java.lang.String getChannel();

  /**
   *
   *
   * <pre>
   * Optional. The name of the channel associated with the trigger in
   * `projects/{project}/locations/{location}/channels/{channel}` format.
   * You must provide a channel to receive events from Eventarc SaaS partners.
   * </pre>
   *
   * <code>string channel = 8;</code>
   *
   * @return The bytes for channel.
   */
  com.google.protobuf.ByteString getChannelBytes();
}
