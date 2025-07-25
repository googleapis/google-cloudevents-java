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

public interface NormalizedPolylineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.visionai.v1.NormalizedPolyline)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A sequence of vertices connected by straight lines.
   * </pre>
   *
   * <code>repeated .google.events.cloud.visionai.v1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  java.util.List<com.google.events.cloud.visionai.v1.NormalizedVertex> getNormalizedVerticesList();

  /**
   *
   *
   * <pre>
   * A sequence of vertices connected by straight lines.
   * </pre>
   *
   * <code>repeated .google.events.cloud.visionai.v1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  com.google.events.cloud.visionai.v1.NormalizedVertex getNormalizedVertices(int index);

  /**
   *
   *
   * <pre>
   * A sequence of vertices connected by straight lines.
   * </pre>
   *
   * <code>repeated .google.events.cloud.visionai.v1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  int getNormalizedVerticesCount();

  /**
   *
   *
   * <pre>
   * A sequence of vertices connected by straight lines.
   * </pre>
   *
   * <code>repeated .google.events.cloud.visionai.v1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.visionai.v1.NormalizedVertexOrBuilder>
      getNormalizedVerticesOrBuilderList();

  /**
   *
   *
   * <pre>
   * A sequence of vertices connected by straight lines.
   * </pre>
   *
   * <code>repeated .google.events.cloud.visionai.v1.NormalizedVertex normalized_vertices = 1;
   * </code>
   */
  com.google.events.cloud.visionai.v1.NormalizedVertexOrBuilder getNormalizedVerticesOrBuilder(
      int index);
}
