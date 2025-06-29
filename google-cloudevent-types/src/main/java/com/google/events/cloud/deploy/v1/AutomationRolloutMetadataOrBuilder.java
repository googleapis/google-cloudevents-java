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
// source: google/events/cloud/deploy/v1/data.proto

package com.google.events.cloud.deploy.v1;

public interface AutomationRolloutMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.AutomationRolloutMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The ID of the AutomationRun initiated by a promote release
   * rule.
   * </pre>
   *
   * <code>string promote_automation_run = 1;</code>
   *
   * @return The promoteAutomationRun.
   */
  java.lang.String getPromoteAutomationRun();

  /**
   *
   *
   * <pre>
   * Output only. The ID of the AutomationRun initiated by a promote release
   * rule.
   * </pre>
   *
   * <code>string promote_automation_run = 1;</code>
   *
   * @return The bytes for promoteAutomationRun.
   */
  com.google.protobuf.ByteString getPromoteAutomationRunBytes();

  /**
   *
   *
   * <pre>
   * Output only. The IDs of the AutomationRuns initiated by an advance rollout
   * rule.
   * </pre>
   *
   * <code>repeated string advance_automation_runs = 2;</code>
   *
   * @return A list containing the advanceAutomationRuns.
   */
  java.util.List<java.lang.String> getAdvanceAutomationRunsList();

  /**
   *
   *
   * <pre>
   * Output only. The IDs of the AutomationRuns initiated by an advance rollout
   * rule.
   * </pre>
   *
   * <code>repeated string advance_automation_runs = 2;</code>
   *
   * @return The count of advanceAutomationRuns.
   */
  int getAdvanceAutomationRunsCount();

  /**
   *
   *
   * <pre>
   * Output only. The IDs of the AutomationRuns initiated by an advance rollout
   * rule.
   * </pre>
   *
   * <code>repeated string advance_automation_runs = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The advanceAutomationRuns at the given index.
   */
  java.lang.String getAdvanceAutomationRuns(int index);

  /**
   *
   *
   * <pre>
   * Output only. The IDs of the AutomationRuns initiated by an advance rollout
   * rule.
   * </pre>
   *
   * <code>repeated string advance_automation_runs = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the advanceAutomationRuns at the given index.
   */
  com.google.protobuf.ByteString getAdvanceAutomationRunsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The IDs of the AutomationRuns initiated by a repair rollout
   * rule.
   * </pre>
   *
   * <code>repeated string repair_automation_runs = 3;</code>
   *
   * @return A list containing the repairAutomationRuns.
   */
  java.util.List<java.lang.String> getRepairAutomationRunsList();

  /**
   *
   *
   * <pre>
   * Output only. The IDs of the AutomationRuns initiated by a repair rollout
   * rule.
   * </pre>
   *
   * <code>repeated string repair_automation_runs = 3;</code>
   *
   * @return The count of repairAutomationRuns.
   */
  int getRepairAutomationRunsCount();

  /**
   *
   *
   * <pre>
   * Output only. The IDs of the AutomationRuns initiated by a repair rollout
   * rule.
   * </pre>
   *
   * <code>repeated string repair_automation_runs = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The repairAutomationRuns at the given index.
   */
  java.lang.String getRepairAutomationRuns(int index);

  /**
   *
   *
   * <pre>
   * Output only. The IDs of the AutomationRuns initiated by a repair rollout
   * rule.
   * </pre>
   *
   * <code>repeated string repair_automation_runs = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the repairAutomationRuns at the given index.
   */
  com.google.protobuf.ByteString getRepairAutomationRunsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The current AutomationRun repairing the rollout.
   * </pre>
   *
   * <code>string current_repair_automation_run = 4;</code>
   *
   * @return The currentRepairAutomationRun.
   */
  java.lang.String getCurrentRepairAutomationRun();

  /**
   *
   *
   * <pre>
   * Output only. The current AutomationRun repairing the rollout.
   * </pre>
   *
   * <code>string current_repair_automation_run = 4;</code>
   *
   * @return The bytes for currentRepairAutomationRun.
   */
  com.google.protobuf.ByteString getCurrentRepairAutomationRunBytes();
}
