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
// source: google/events/cloud/datastream/v1/data.proto

package com.google.events.cloud.datastream.v1;

public interface PrivateConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.datastream.v1.PrivateConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource's name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource's name.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The create time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The create time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The create time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The update time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The update time of the resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Display name.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Display name.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state of the Private Connection.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PrivateConnection.State state = 6;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the Private Connection.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PrivateConnection.State state = 6;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.datastream.v1.PrivateConnection.State getState();

  /**
   *
   *
   * <pre>
   * Output only. In case of error, the details of the error in a user-friendly format.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.Error error = 7;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. In case of error, the details of the error in a user-friendly format.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.Error error = 7;</code>
   *
   * @return The error.
   */
  com.google.events.cloud.datastream.v1.Error getError();
  /**
   *
   *
   * <pre>
   * Output only. In case of error, the details of the error in a user-friendly format.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.Error error = 7;</code>
   */
  com.google.events.cloud.datastream.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * VPC Peering Config.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.VpcPeeringConfig vpc_peering_config = 100;</code>
   *
   * @return Whether the vpcPeeringConfig field is set.
   */
  boolean hasVpcPeeringConfig();
  /**
   *
   *
   * <pre>
   * VPC Peering Config.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.VpcPeeringConfig vpc_peering_config = 100;</code>
   *
   * @return The vpcPeeringConfig.
   */
  com.google.events.cloud.datastream.v1.VpcPeeringConfig getVpcPeeringConfig();
  /**
   *
   *
   * <pre>
   * VPC Peering Config.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.VpcPeeringConfig vpc_peering_config = 100;</code>
   */
  com.google.events.cloud.datastream.v1.VpcPeeringConfigOrBuilder getVpcPeeringConfigOrBuilder();
}