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
// source: google/events/cloud/gkehub/v1/data.proto

package com.google.events.cloud.gkehub.v1;

public interface MembershipBindingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.gkehub.v1.MembershipBinding)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Workspace resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;scopes/&#42;`.
   * </pre>
   *
   * <code>string scope = 3;</code>
   *
   * @return Whether the scope field is set.
   */
  boolean hasScope();

  /**
   *
   *
   * <pre>
   * A Workspace resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;scopes/&#42;`.
   * </pre>
   *
   * <code>string scope = 3;</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();

  /**
   *
   *
   * <pre>
   * A Workspace resource name in the format
   * `projects/&#42;&#47;locations/&#42;&#47;scopes/&#42;`.
   * </pre>
   *
   * <code>string scope = 3;</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Whether the membershipbinding is Fleet-wide; true means that this
   * Membership should be bound to all Namespaces in this entire Fleet.
   * </pre>
   *
   * <code>bool fleet = 4;</code>
   *
   * @return Whether the fleet field is set.
   */
  boolean hasFleet();

  /**
   *
   *
   * <pre>
   * Whether the membershipbinding is Fleet-wide; true means that this
   * Membership should be bound to all Namespaces in this entire Fleet.
   * </pre>
   *
   * <code>bool fleet = 4;</code>
   *
   * @return The fleet.
   */
  boolean getFleet();

  /**
   *
   *
   * <pre>
   * The resource name for the membershipbinding itself
   * `projects/{project}/locations/{location}/memberships/{membership}/bindings/{membershipbinding}`
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
   * The resource name for the membershipbinding itself
   * `projects/{project}/locations/{location}/memberships/{membership}/bindings/{membershipbinding}`
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
   * Output only. Google-generated UUID for this resource. This is unique across
   * all membershipbinding resources. If a membershipbinding resource is deleted
   * and another resource with the same name is created, it gets a different
   * uid.
   * </pre>
   *
   * <code>string uid = 2;</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. Google-generated UUID for this resource. This is unique across
   * all membershipbinding resources. If a membershipbinding resource is deleted
   * and another resource with the same name is created, it gets a different
   * uid.
   * </pre>
   *
   * <code>string uid = 2;</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7;</code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7;</code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. When the membership binding was deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the membership binding resource.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState state = 8;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();

  /**
   *
   *
   * <pre>
   * Output only. State of the membership binding resource.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState state = 8;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState getState();

  /**
   *
   *
   * <pre>
   * Output only. State of the membership binding resource.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState state = 8;</code>
   */
  com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleStateOrBuilder getStateOrBuilder();

  public com.google.events.cloud.gkehub.v1.MembershipBinding.TargetCase getTargetCase();
}
