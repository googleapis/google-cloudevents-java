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
// source: google/events/cloud/vmmigration/v1/data.proto

package com.google.events.cloud.vmmigration.v1;

public interface ApplianceVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.vmmigration.v1.ApplianceVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The appliance version.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * The appliance version.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * A link for downloading the version.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();

  /**
   *
   *
   * <pre>
   * A link for downloading the version.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Determine whether it's critical to upgrade the appliance to this version.
   * </pre>
   *
   * <code>bool critical = 3;</code>
   *
   * @return The critical.
   */
  boolean getCritical();

  /**
   *
   *
   * <pre>
   * Link to a page that contains the version release notes.
   * </pre>
   *
   * <code>string release_notes_uri = 4;</code>
   *
   * @return The releaseNotesUri.
   */
  java.lang.String getReleaseNotesUri();

  /**
   *
   *
   * <pre>
   * Link to a page that contains the version release notes.
   * </pre>
   *
   * <code>string release_notes_uri = 4;</code>
   *
   * @return The bytes for releaseNotesUri.
   */
  com.google.protobuf.ByteString getReleaseNotesUriBytes();
}
