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
// source: google/events/cloud/batch/v1/data.proto

package com.google.events.cloud.batch.v1;

public interface NFSOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.batch.v1.NFS)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The IP address of the NFS.
   * </pre>
   *
   * <code>string server = 1;</code>
   *
   * @return The server.
   */
  java.lang.String getServer();

  /**
   *
   *
   * <pre>
   * The IP address of the NFS.
   * </pre>
   *
   * <code>string server = 1;</code>
   *
   * @return The bytes for server.
   */
  com.google.protobuf.ByteString getServerBytes();

  /**
   *
   *
   * <pre>
   * Remote source path exported from the NFS, e.g., "/share".
   * </pre>
   *
   * <code>string remote_path = 2;</code>
   *
   * @return The remotePath.
   */
  java.lang.String getRemotePath();

  /**
   *
   *
   * <pre>
   * Remote source path exported from the NFS, e.g., "/share".
   * </pre>
   *
   * <code>string remote_path = 2;</code>
   *
   * @return The bytes for remotePath.
   */
  com.google.protobuf.ByteString getRemotePathBytes();
}
