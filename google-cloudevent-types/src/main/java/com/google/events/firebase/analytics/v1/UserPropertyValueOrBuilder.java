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
// source: google/events/firebase/analytics/v1/data.proto

package com.google.events.firebase.analytics.v1;

public interface UserPropertyValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.analytics.v1.UserPropertyValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Last set value of user property.
   * </pre>
   *
   * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();

  /**
   *
   *
   * <pre>
   * Last set value of user property.
   * </pre>
   *
   * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
   *
   * @return The value.
   */
  com.google.events.firebase.analytics.v1.AnalyticsValue getValue();

  /**
   *
   *
   * <pre>
   * Last set value of user property.
   * </pre>
   *
   * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
   */
  com.google.events.firebase.analytics.v1.AnalyticsValueOrBuilder getValueOrBuilder();

  /**
   *
   *
   * <pre>
   * UTC client time when user property was last set.
   * </pre>
   *
   * <code>int64 set_timestamp_usec = 2;</code>
   *
   * @return The setTimestampUsec.
   */
  long getSetTimestampUsec();

  /**
   *
   *
   * <pre>
   * Index for user property (one-based).
   * </pre>
   *
   * <code>int32 index = 3;</code>
   *
   * @return The index.
   */
  int getIndex();
}
