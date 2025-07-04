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
// source: google/events/cloud/cloudbuild/v1/data.proto

package com.google.events.cloud.cloudbuild.v1;

public interface BuildOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.cloudbuild.v1.BuildOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Requested hash for SourceProvenance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash.HashType source_provenance_hash = 1;
   * </code>
   *
   * @return A list containing the sourceProvenanceHash.
   */
  java.util.List<com.google.events.cloud.cloudbuild.v1.Hash.HashType> getSourceProvenanceHashList();

  /**
   *
   *
   * <pre>
   * Requested hash for SourceProvenance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash.HashType source_provenance_hash = 1;
   * </code>
   *
   * @return The count of sourceProvenanceHash.
   */
  int getSourceProvenanceHashCount();

  /**
   *
   *
   * <pre>
   * Requested hash for SourceProvenance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash.HashType source_provenance_hash = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The sourceProvenanceHash at the given index.
   */
  com.google.events.cloud.cloudbuild.v1.Hash.HashType getSourceProvenanceHash(int index);

  /**
   *
   *
   * <pre>
   * Requested hash for SourceProvenance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash.HashType source_provenance_hash = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for sourceProvenanceHash.
   */
  java.util.List<java.lang.Integer> getSourceProvenanceHashValueList();

  /**
   *
   *
   * <pre>
   * Requested hash for SourceProvenance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Hash.HashType source_provenance_hash = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of sourceProvenanceHash at the given index.
   */
  int getSourceProvenanceHashValue(int index);

  /**
   *
   *
   * <pre>
   * Requested verifiability options.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.BuildOptions.VerifyOption requested_verify_option = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for requestedVerifyOption.
   */
  int getRequestedVerifyOptionValue();

  /**
   *
   *
   * <pre>
   * Requested verifiability options.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.BuildOptions.VerifyOption requested_verify_option = 2;
   * </code>
   *
   * @return The requestedVerifyOption.
   */
  com.google.events.cloud.cloudbuild.v1.BuildOptions.VerifyOption getRequestedVerifyOption();

  /**
   *
   *
   * <pre>
   * Compute Engine machine type on which to run the build.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.BuildOptions.MachineType machine_type = 3;</code>
   *
   * @return The enum numeric value on the wire for machineType.
   */
  int getMachineTypeValue();

  /**
   *
   *
   * <pre>
   * Compute Engine machine type on which to run the build.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.BuildOptions.MachineType machine_type = 3;</code>
   *
   * @return The machineType.
   */
  com.google.events.cloud.cloudbuild.v1.BuildOptions.MachineType getMachineType();

  /**
   *
   *
   * <pre>
   * Requested disk size for the VM that runs the build. Note that this is *NOT*
   * "disk free"; some of the space will be used by the operating system and
   * build utilities. Also note that this is the minimum disk size that will be
   * allocated for the build -- the build may run with a larger disk than
   * requested. At present, the maximum disk size is 1000GB; builds that request
   * more than the maximum are rejected with an error.
   * </pre>
   *
   * <code>int64 disk_size_gb = 6;</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Option to specify behavior when there is an error in the substitution
   * checks.
   * </pre>
   *
   * <code>
   * .google.events.cloud.cloudbuild.v1.BuildOptions.SubstitutionOption substitution_option = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for substitutionOption.
   */
  int getSubstitutionOptionValue();

  /**
   *
   *
   * <pre>
   * Option to specify behavior when there is an error in the substitution
   * checks.
   * </pre>
   *
   * <code>
   * .google.events.cloud.cloudbuild.v1.BuildOptions.SubstitutionOption substitution_option = 4;
   * </code>
   *
   * @return The substitutionOption.
   */
  com.google.events.cloud.cloudbuild.v1.BuildOptions.SubstitutionOption getSubstitutionOption();

  /**
   *
   *
   * <pre>
   * Option to define build log streaming behavior to Google Cloud
   * Storage.
   * </pre>
   *
   * <code>
   * .google.events.cloud.cloudbuild.v1.BuildOptions.LogStreamingOption log_streaming_option = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for logStreamingOption.
   */
  int getLogStreamingOptionValue();

  /**
   *
   *
   * <pre>
   * Option to define build log streaming behavior to Google Cloud
   * Storage.
   * </pre>
   *
   * <code>
   * .google.events.cloud.cloudbuild.v1.BuildOptions.LogStreamingOption log_streaming_option = 5;
   * </code>
   *
   * @return The logStreamingOption.
   */
  com.google.events.cloud.cloudbuild.v1.BuildOptions.LogStreamingOption getLogStreamingOption();

  /**
   *
   *
   * <pre>
   * Option to specify a `WorkerPool` for the build.
   * Format: projects/{project}/locations/{location}/workerPools/{workerPool}
   * </pre>
   *
   * <code>string worker_pool = 7;</code>
   *
   * @return The workerPool.
   */
  java.lang.String getWorkerPool();

  /**
   *
   *
   * <pre>
   * Option to specify a `WorkerPool` for the build.
   * Format: projects/{project}/locations/{location}/workerPools/{workerPool}
   * </pre>
   *
   * <code>string worker_pool = 7;</code>
   *
   * @return The bytes for workerPool.
   */
  com.google.protobuf.ByteString getWorkerPoolBytes();

  /**
   *
   *
   * <pre>
   * Option to specify the logging mode, which determines where the logs are
   * stored.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.BuildOptions.LoggingMode logging = 11;</code>
   *
   * @return The enum numeric value on the wire for logging.
   */
  int getLoggingValue();

  /**
   *
   *
   * <pre>
   * Option to specify the logging mode, which determines where the logs are
   * stored.
   * </pre>
   *
   * <code>.google.events.cloud.cloudbuild.v1.BuildOptions.LoggingMode logging = 11;</code>
   *
   * @return The logging.
   */
  com.google.events.cloud.cloudbuild.v1.BuildOptions.LoggingMode getLogging();

  /**
   *
   *
   * <pre>
   * A list of global environment variable definitions that will exist for all
   * build steps in this build. If a variable is defined in both globally and in
   * a build step, the variable will use the build step value.
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 12;</code>
   *
   * @return A list containing the env.
   */
  java.util.List<java.lang.String> getEnvList();

  /**
   *
   *
   * <pre>
   * A list of global environment variable definitions that will exist for all
   * build steps in this build. If a variable is defined in both globally and in
   * a build step, the variable will use the build step value.
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 12;</code>
   *
   * @return The count of env.
   */
  int getEnvCount();

  /**
   *
   *
   * <pre>
   * A list of global environment variable definitions that will exist for all
   * build steps in this build. If a variable is defined in both globally and in
   * a build step, the variable will use the build step value.
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 12;</code>
   *
   * @param index The index of the element to return.
   * @return The env at the given index.
   */
  java.lang.String getEnv(int index);

  /**
   *
   *
   * <pre>
   * A list of global environment variable definitions that will exist for all
   * build steps in this build. If a variable is defined in both globally and in
   * a build step, the variable will use the build step value.
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY"
   * being given the value "VALUE".
   * </pre>
   *
   * <code>repeated string env = 12;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the env at the given index.
   */
  com.google.protobuf.ByteString getEnvBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of global environment variables, which are encrypted using a Cloud
   * Key Management Service crypto key. These values must be specified in the
   * build's `Secret`. These variables will be available to all build steps
   * in this build.
   * </pre>
   *
   * <code>repeated string secret_env = 13;</code>
   *
   * @return A list containing the secretEnv.
   */
  java.util.List<java.lang.String> getSecretEnvList();

  /**
   *
   *
   * <pre>
   * A list of global environment variables, which are encrypted using a Cloud
   * Key Management Service crypto key. These values must be specified in the
   * build's `Secret`. These variables will be available to all build steps
   * in this build.
   * </pre>
   *
   * <code>repeated string secret_env = 13;</code>
   *
   * @return The count of secretEnv.
   */
  int getSecretEnvCount();

  /**
   *
   *
   * <pre>
   * A list of global environment variables, which are encrypted using a Cloud
   * Key Management Service crypto key. These values must be specified in the
   * build's `Secret`. These variables will be available to all build steps
   * in this build.
   * </pre>
   *
   * <code>repeated string secret_env = 13;</code>
   *
   * @param index The index of the element to return.
   * @return The secretEnv at the given index.
   */
  java.lang.String getSecretEnv(int index);

  /**
   *
   *
   * <pre>
   * A list of global environment variables, which are encrypted using a Cloud
   * Key Management Service crypto key. These values must be specified in the
   * build's `Secret`. These variables will be available to all build steps
   * in this build.
   * </pre>
   *
   * <code>repeated string secret_env = 13;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the secretEnv at the given index.
   */
  com.google.protobuf.ByteString getSecretEnvBytes(int index);

  /**
   *
   *
   * <pre>
   * Global list of volumes to mount for ALL build steps
   * Each volume is created as an empty volume prior to starting the build
   * process. Upon completion of the build, volumes and their contents are
   * discarded. Global volume names and paths cannot conflict with the volumes
   * defined a build step.
   * Using a global volume in a build with only one step is not valid as
   * it is indicative of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Volume volumes = 14;</code>
   */
  java.util.List<com.google.events.cloud.cloudbuild.v1.Volume> getVolumesList();

  /**
   *
   *
   * <pre>
   * Global list of volumes to mount for ALL build steps
   * Each volume is created as an empty volume prior to starting the build
   * process. Upon completion of the build, volumes and their contents are
   * discarded. Global volume names and paths cannot conflict with the volumes
   * defined a build step.
   * Using a global volume in a build with only one step is not valid as
   * it is indicative of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Volume volumes = 14;</code>
   */
  com.google.events.cloud.cloudbuild.v1.Volume getVolumes(int index);

  /**
   *
   *
   * <pre>
   * Global list of volumes to mount for ALL build steps
   * Each volume is created as an empty volume prior to starting the build
   * process. Upon completion of the build, volumes and their contents are
   * discarded. Global volume names and paths cannot conflict with the volumes
   * defined a build step.
   * Using a global volume in a build with only one step is not valid as
   * it is indicative of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Volume volumes = 14;</code>
   */
  int getVolumesCount();

  /**
   *
   *
   * <pre>
   * Global list of volumes to mount for ALL build steps
   * Each volume is created as an empty volume prior to starting the build
   * process. Upon completion of the build, volumes and their contents are
   * discarded. Global volume names and paths cannot conflict with the volumes
   * defined a build step.
   * Using a global volume in a build with only one step is not valid as
   * it is indicative of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Volume volumes = 14;</code>
   */
  java.util.List<? extends com.google.events.cloud.cloudbuild.v1.VolumeOrBuilder>
      getVolumesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Global list of volumes to mount for ALL build steps
   * Each volume is created as an empty volume prior to starting the build
   * process. Upon completion of the build, volumes and their contents are
   * discarded. Global volume names and paths cannot conflict with the volumes
   * defined a build step.
   * Using a global volume in a build with only one step is not valid as
   * it is indicative of a build request with an incorrect configuration.
   * </pre>
   *
   * <code>repeated .google.events.cloud.cloudbuild.v1.Volume volumes = 14;</code>
   */
  com.google.events.cloud.cloudbuild.v1.VolumeOrBuilder getVolumesOrBuilder(int index);
}
