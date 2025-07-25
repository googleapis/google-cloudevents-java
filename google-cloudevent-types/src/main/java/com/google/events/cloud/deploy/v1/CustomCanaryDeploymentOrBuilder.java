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

public interface CustomCanaryDeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.CustomCanaryDeployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1;
   * </code>
   */
  java.util.List<com.google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig>
      getPhaseConfigsList();

  /**
   *
   *
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1;
   * </code>
   */
  com.google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig getPhaseConfigs(int index);

  /**
   *
   *
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1;
   * </code>
   */
  int getPhaseConfigsCount();

  /**
   *
   *
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfigOrBuilder>
      getPhaseConfigsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Configuration for each phase in the canary deployment in the
   * order executed.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfig phase_configs = 1;
   * </code>
   */
  com.google.events.cloud.deploy.v1.CustomCanaryDeployment.PhaseConfigOrBuilder
      getPhaseConfigsOrBuilder(int index);
}
