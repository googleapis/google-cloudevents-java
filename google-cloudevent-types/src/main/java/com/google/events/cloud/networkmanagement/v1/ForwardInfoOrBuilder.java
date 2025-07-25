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
// source: google/events/cloud/networkmanagement/v1/data.proto

package com.google.events.cloud.networkmanagement.v1;

public interface ForwardInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.networkmanagement.v1.ForwardInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Target type where this packet is forwarded to.
   * </pre>
   *
   * <code>.google.events.cloud.networkmanagement.v1.ForwardInfo.Target target = 1;</code>
   *
   * @return The enum numeric value on the wire for target.
   */
  int getTargetValue();

  /**
   *
   *
   * <pre>
   * Target type where this packet is forwarded to.
   * </pre>
   *
   * <code>.google.events.cloud.networkmanagement.v1.ForwardInfo.Target target = 1;</code>
   *
   * @return The target.
   */
  com.google.events.cloud.networkmanagement.v1.ForwardInfo.Target getTarget();

  /**
   *
   *
   * <pre>
   * URI of the resource that the packet is forwarded to.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   *
   * @return The resourceUri.
   */
  java.lang.String getResourceUri();

  /**
   *
   *
   * <pre>
   * URI of the resource that the packet is forwarded to.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   *
   * @return The bytes for resourceUri.
   */
  com.google.protobuf.ByteString getResourceUriBytes();
}
