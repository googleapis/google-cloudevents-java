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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

public interface RunStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.visionai.v1.RunStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The state of the Process.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * The state of the Process.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.visionai.v1.RunStatus.State getState();

  /**
   *
   *
   * <pre>
   * The reason of becoming the state.
   * </pre>
   *
   * <code>string reason = 2;</code>
   *
   * @return The reason.
   */
  java.lang.String getReason();

  /**
   *
   *
   * <pre>
   * The reason of becoming the state.
   * </pre>
   *
   * <code>string reason = 2;</code>
   *
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString getReasonBytes();
}
