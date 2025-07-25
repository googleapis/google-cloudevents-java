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
// source: google/events/cloud/vmmigration/v1/data.proto

package com.google.events.cloud.vmmigration.v1;

public interface SchedulingNodeAffinityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.vmmigration.v1.SchedulingNodeAffinity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The label key of Node resource to reference.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();

  /**
   *
   *
   * <pre>
   * The label key of Node resource to reference.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * The operator to use for the node resources specified in the `values`
   * parameter.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.SchedulingNodeAffinity.Operator operator = 2;</code>
   *
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();

  /**
   *
   *
   * <pre>
   * The operator to use for the node resources specified in the `values`
   * parameter.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.SchedulingNodeAffinity.Operator operator = 2;</code>
   *
   * @return The operator.
   */
  com.google.events.cloud.vmmigration.v1.SchedulingNodeAffinity.Operator getOperator();

  /**
   *
   *
   * <pre>
   * Corresponds to the label values of Node resource.
   * </pre>
   *
   * <code>repeated string values = 3;</code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();

  /**
   *
   *
   * <pre>
   * Corresponds to the label values of Node resource.
   * </pre>
   *
   * <code>repeated string values = 3;</code>
   *
   * @return The count of values.
   */
  int getValuesCount();

  /**
   *
   *
   * <pre>
   * Corresponds to the label values of Node resource.
   * </pre>
   *
   * <code>repeated string values = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);

  /**
   *
   *
   * <pre>
   * Corresponds to the label values of Node resource.
   * </pre>
   *
   * <code>repeated string values = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);
}
