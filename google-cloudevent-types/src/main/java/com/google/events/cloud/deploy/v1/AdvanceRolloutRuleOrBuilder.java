/*
 * Copyright 2024 Google LLC
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
// source: google/events/cloud/deploy/v1/data.proto

package com.google.events.cloud.deploy.v1;

public interface AdvanceRolloutRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.AdvanceRolloutRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. ID of the rule. This id must be unique in the `Automation`
   * resource to which this rule belongs. The format is `[a-z][a-z0-9&#92;-]{0,62}`.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * Required. ID of the rule. This id must be unique in the `Automation`
   * resource to which this rule belongs. The format is `[a-z][a-z0-9&#92;-]{0,62}`.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Proceeds only after phase name matched any one in the list.
   * This value must consist of lower-case letters, numbers, and hyphens,
   * start with a letter and end with a letter or a number, and have a max
   * length of 63 characters. In other words, it must match the following
   * regex: `^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * </pre>
   *
   * <code>repeated string source_phases = 6;</code>
   *
   * @return A list containing the sourcePhases.
   */
  java.util.List<java.lang.String> getSourcePhasesList();

  /**
   *
   *
   * <pre>
   * Optional. Proceeds only after phase name matched any one in the list.
   * This value must consist of lower-case letters, numbers, and hyphens,
   * start with a letter and end with a letter or a number, and have a max
   * length of 63 characters. In other words, it must match the following
   * regex: `^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * </pre>
   *
   * <code>repeated string source_phases = 6;</code>
   *
   * @return The count of sourcePhases.
   */
  int getSourcePhasesCount();

  /**
   *
   *
   * <pre>
   * Optional. Proceeds only after phase name matched any one in the list.
   * This value must consist of lower-case letters, numbers, and hyphens,
   * start with a letter and end with a letter or a number, and have a max
   * length of 63 characters. In other words, it must match the following
   * regex: `^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * </pre>
   *
   * <code>repeated string source_phases = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The sourcePhases at the given index.
   */
  java.lang.String getSourcePhases(int index);

  /**
   *
   *
   * <pre>
   * Optional. Proceeds only after phase name matched any one in the list.
   * This value must consist of lower-case letters, numbers, and hyphens,
   * start with a letter and end with a letter or a number, and have a max
   * length of 63 characters. In other words, it must match the following
   * regex: `^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$`.
   * </pre>
   *
   * <code>repeated string source_phases = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sourcePhases at the given index.
   */
  com.google.protobuf.ByteString getSourcePhasesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. How long to wait after a rollout is finished.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 3;</code>
   *
   * @return Whether the wait field is set.
   */
  boolean hasWait();

  /**
   *
   *
   * <pre>
   * Optional. How long to wait after a rollout is finished.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 3;</code>
   *
   * @return The wait.
   */
  com.google.protobuf.Duration getWait();

  /**
   *
   *
   * <pre>
   * Optional. How long to wait after a rollout is finished.
   * </pre>
   *
   * <code>.google.protobuf.Duration wait = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getWaitOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Information around the state of the Automation rule.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.AutomationRuleCondition condition = 5;</code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();

  /**
   *
   *
   * <pre>
   * Output only. Information around the state of the Automation rule.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.AutomationRuleCondition condition = 5;</code>
   *
   * @return The condition.
   */
  com.google.events.cloud.deploy.v1.AutomationRuleCondition getCondition();

  /**
   *
   *
   * <pre>
   * Output only. Information around the state of the Automation rule.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.AutomationRuleCondition condition = 5;</code>
   */
  com.google.events.cloud.deploy.v1.AutomationRuleConditionOrBuilder getConditionOrBuilder();
}