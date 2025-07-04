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
// source: google/events/cloud/notebooks/v1/data.proto

package com.google.events.cloud.notebooks.v1;

public interface RuntimeAccessConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.notebooks.v1.RuntimeAccessConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of access mode this instance.
   * </pre>
   *
   * <code>.google.events.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for accessType.
   */
  int getAccessTypeValue();

  /**
   *
   *
   * <pre>
   * The type of access mode this instance.
   * </pre>
   *
   * <code>.google.events.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;
   * </code>
   *
   * @return The accessType.
   */
  com.google.events.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType getAccessType();

  /**
   *
   *
   * <pre>
   * The owner of this runtime after creation. Format: `alias&#64;example.com`
   * Currently supports one owner only.
   * </pre>
   *
   * <code>string runtime_owner = 2;</code>
   *
   * @return The runtimeOwner.
   */
  java.lang.String getRuntimeOwner();

  /**
   *
   *
   * <pre>
   * The owner of this runtime after creation. Format: `alias&#64;example.com`
   * Currently supports one owner only.
   * </pre>
   *
   * <code>string runtime_owner = 2;</code>
   *
   * @return The bytes for runtimeOwner.
   */
  com.google.protobuf.ByteString getRuntimeOwnerBytes();

  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint that is used to access the runtime.
   * </pre>
   *
   * <code>string proxy_uri = 3;</code>
   *
   * @return The proxyUri.
   */
  java.lang.String getProxyUri();

  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint that is used to access the runtime.
   * </pre>
   *
   * <code>string proxy_uri = 3;</code>
   *
   * @return The bytes for proxyUri.
   */
  com.google.protobuf.ByteString getProxyUriBytes();
}
