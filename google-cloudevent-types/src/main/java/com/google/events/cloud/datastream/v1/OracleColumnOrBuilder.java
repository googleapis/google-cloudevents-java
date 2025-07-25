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
// source: google/events/cloud/datastream/v1/data.proto

package com.google.events.cloud.datastream.v1;

public interface OracleColumnOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.datastream.v1.OracleColumn)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Column name.
   * </pre>
   *
   * <code>string column = 1;</code>
   *
   * @return The column.
   */
  java.lang.String getColumn();

  /**
   *
   *
   * <pre>
   * Column name.
   * </pre>
   *
   * <code>string column = 1;</code>
   *
   * @return The bytes for column.
   */
  com.google.protobuf.ByteString getColumnBytes();

  /**
   *
   *
   * <pre>
   * The Oracle data type.
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The dataType.
   */
  java.lang.String getDataType();

  /**
   *
   *
   * <pre>
   * The Oracle data type.
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The bytes for dataType.
   */
  com.google.protobuf.ByteString getDataTypeBytes();

  /**
   *
   *
   * <pre>
   * Column length.
   * </pre>
   *
   * <code>int32 length = 3;</code>
   *
   * @return The length.
   */
  int getLength();

  /**
   *
   *
   * <pre>
   * Column precision.
   * </pre>
   *
   * <code>int32 precision = 4;</code>
   *
   * @return The precision.
   */
  int getPrecision();

  /**
   *
   *
   * <pre>
   * Column scale.
   * </pre>
   *
   * <code>int32 scale = 5;</code>
   *
   * @return The scale.
   */
  int getScale();

  /**
   *
   *
   * <pre>
   * Column encoding.
   * </pre>
   *
   * <code>string encoding = 6;</code>
   *
   * @return The encoding.
   */
  java.lang.String getEncoding();

  /**
   *
   *
   * <pre>
   * Column encoding.
   * </pre>
   *
   * <code>string encoding = 6;</code>
   *
   * @return The bytes for encoding.
   */
  com.google.protobuf.ByteString getEncodingBytes();

  /**
   *
   *
   * <pre>
   * Whether or not the column represents a primary key.
   * </pre>
   *
   * <code>bool primary_key = 7;</code>
   *
   * @return The primaryKey.
   */
  boolean getPrimaryKey();

  /**
   *
   *
   * <pre>
   * Whether or not the column can accept a null value.
   * </pre>
   *
   * <code>bool nullable = 8;</code>
   *
   * @return The nullable.
   */
  boolean getNullable();

  /**
   *
   *
   * <pre>
   * The ordinal position of the column in the table.
   * </pre>
   *
   * <code>int32 ordinal_position = 9;</code>
   *
   * @return The ordinalPosition.
   */
  int getOrdinalPosition();
}
