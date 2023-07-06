/*
 * Copyright 2023 Google LLC
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

public interface CloneJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.vmmigration.v1.CloneJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Details of the target VM in Compute Engine.
   * </pre>
   *
   * <code>
   * .google.events.cloud.vmmigration.v1.ComputeEngineTargetDetails compute_engine_target_details = 20;
   * </code>
   *
   * @return Whether the computeEngineTargetDetails field is set.
   */
  boolean hasComputeEngineTargetDetails();
  /**
   *
   *
   * <pre>
   * Output only. Details of the target VM in Compute Engine.
   * </pre>
   *
   * <code>
   * .google.events.cloud.vmmigration.v1.ComputeEngineTargetDetails compute_engine_target_details = 20;
   * </code>
   *
   * @return The computeEngineTargetDetails.
   */
  com.google.events.cloud.vmmigration.v1.ComputeEngineTargetDetails getComputeEngineTargetDetails();
  /**
   *
   *
   * <pre>
   * Output only. Details of the target VM in Compute Engine.
   * </pre>
   *
   * <code>
   * .google.events.cloud.vmmigration.v1.ComputeEngineTargetDetails compute_engine_target_details = 20;
   * </code>
   */
  com.google.events.cloud.vmmigration.v1.ComputeEngineTargetDetailsOrBuilder
      getComputeEngineTargetDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the clone job was created (as an API call, not when
   * it was actually created in the target).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the clone job was created (as an API call, not when
   * it was actually created in the target).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the clone job was created (as an API call, not when
   * it was actually created in the target).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the clone job was ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 22;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the clone job was ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 22;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the clone job was ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 22;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the clone.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the clone.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. State of the clone job.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.CloneJob.State state = 12;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the clone job.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.CloneJob.State state = 12;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.vmmigration.v1.CloneJob.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The time the state was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 14;</code>
   *
   * @return Whether the stateTime field is set.
   */
  boolean hasStateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the state was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 14;</code>
   *
   * @return The stateTime.
   */
  com.google.protobuf.Timestamp getStateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the state was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Provides details for the errors that led to the Clone Job's
   * state.
   * </pre>
   *
   * <code>.google.rpc.Status error = 17;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. Provides details for the errors that led to the Clone Job's
   * state.
   * </pre>
   *
   * <code>.google.rpc.Status error = 17;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. Provides details for the errors that led to the Clone Job's
   * state.
   * </pre>
   *
   * <code>.google.rpc.Status error = 17;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The clone steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.CloneStep steps = 23;</code>
   */
  java.util.List<com.google.events.cloud.vmmigration.v1.CloneStep> getStepsList();
  /**
   *
   *
   * <pre>
   * Output only. The clone steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.CloneStep steps = 23;</code>
   */
  com.google.events.cloud.vmmigration.v1.CloneStep getSteps(int index);
  /**
   *
   *
   * <pre>
   * Output only. The clone steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.CloneStep steps = 23;</code>
   */
  int getStepsCount();
  /**
   *
   *
   * <pre>
   * Output only. The clone steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.CloneStep steps = 23;</code>
   */
  java.util.List<? extends com.google.events.cloud.vmmigration.v1.CloneStepOrBuilder>
      getStepsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The clone steps list representing its progress.
   * </pre>
   *
   * <code>repeated .google.events.cloud.vmmigration.v1.CloneStep steps = 23;</code>
   */
  com.google.events.cloud.vmmigration.v1.CloneStepOrBuilder getStepsOrBuilder(int index);

  public com.google.events.cloud.vmmigration.v1.CloneJob.TargetVmDetailsCase
      getTargetVmDetailsCase();
}