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

public interface RollbackOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.Rollback)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The starting phase ID for the `Rollout`. If unspecified, the
   * `Rollout` will start in the stable phase.
   * </pre>
   *
   * <code>string destination_phase = 1;</code>
   *
   * @return The destinationPhase.
   */
  java.lang.String getDestinationPhase();

  /**
   *
   *
   * <pre>
   * Optional. The starting phase ID for the `Rollout`. If unspecified, the
   * `Rollout` will start in the stable phase.
   * </pre>
   *
   * <code>string destination_phase = 1;</code>
   *
   * @return The bytes for destinationPhase.
   */
  com.google.protobuf.ByteString getDestinationPhaseBytes();
}