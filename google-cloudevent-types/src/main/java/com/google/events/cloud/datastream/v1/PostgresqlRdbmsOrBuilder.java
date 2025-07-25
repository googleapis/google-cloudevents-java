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

public interface PostgresqlRdbmsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.datastream.v1.PostgresqlRdbms)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * PostgreSQL schemas in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlSchema postgresql_schemas = 1;
   * </code>
   */
  java.util.List<com.google.events.cloud.datastream.v1.PostgresqlSchema> getPostgresqlSchemasList();

  /**
   *
   *
   * <pre>
   * PostgreSQL schemas in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlSchema postgresql_schemas = 1;
   * </code>
   */
  com.google.events.cloud.datastream.v1.PostgresqlSchema getPostgresqlSchemas(int index);

  /**
   *
   *
   * <pre>
   * PostgreSQL schemas in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlSchema postgresql_schemas = 1;
   * </code>
   */
  int getPostgresqlSchemasCount();

  /**
   *
   *
   * <pre>
   * PostgreSQL schemas in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlSchema postgresql_schemas = 1;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.datastream.v1.PostgresqlSchemaOrBuilder>
      getPostgresqlSchemasOrBuilderList();

  /**
   *
   *
   * <pre>
   * PostgreSQL schemas in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlSchema postgresql_schemas = 1;
   * </code>
   */
  com.google.events.cloud.datastream.v1.PostgresqlSchemaOrBuilder getPostgresqlSchemasOrBuilder(
      int index);
}
