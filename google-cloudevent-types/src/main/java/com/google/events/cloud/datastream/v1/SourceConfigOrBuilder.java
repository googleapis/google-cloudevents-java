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

public interface SourceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.datastream.v1.SourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Source connection profile resoource.
   * Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
   * </pre>
   *
   * <code>string source_connection_profile = 1;</code>
   *
   * @return The sourceConnectionProfile.
   */
  java.lang.String getSourceConnectionProfile();

  /**
   *
   *
   * <pre>
   * Required. Source connection profile resoource.
   * Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
   * </pre>
   *
   * <code>string source_connection_profile = 1;</code>
   *
   * @return The bytes for sourceConnectionProfile.
   */
  com.google.protobuf.ByteString getSourceConnectionProfileBytes();

  /**
   *
   *
   * <pre>
   * Oracle data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.OracleSourceConfig oracle_source_config = 100;</code>
   *
   * @return Whether the oracleSourceConfig field is set.
   */
  boolean hasOracleSourceConfig();

  /**
   *
   *
   * <pre>
   * Oracle data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.OracleSourceConfig oracle_source_config = 100;</code>
   *
   * @return The oracleSourceConfig.
   */
  com.google.events.cloud.datastream.v1.OracleSourceConfig getOracleSourceConfig();

  /**
   *
   *
   * <pre>
   * Oracle data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.OracleSourceConfig oracle_source_config = 100;</code>
   */
  com.google.events.cloud.datastream.v1.OracleSourceConfigOrBuilder
      getOracleSourceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * MySQL data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlSourceConfig mysql_source_config = 101;</code>
   *
   * @return Whether the mysqlSourceConfig field is set.
   */
  boolean hasMysqlSourceConfig();

  /**
   *
   *
   * <pre>
   * MySQL data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlSourceConfig mysql_source_config = 101;</code>
   *
   * @return The mysqlSourceConfig.
   */
  com.google.events.cloud.datastream.v1.MysqlSourceConfig getMysqlSourceConfig();

  /**
   *
   *
   * <pre>
   * MySQL data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlSourceConfig mysql_source_config = 101;</code>
   */
  com.google.events.cloud.datastream.v1.MysqlSourceConfigOrBuilder getMysqlSourceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * PostgreSQL data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PostgresqlSourceConfig postgresql_source_config = 102;
   * </code>
   *
   * @return Whether the postgresqlSourceConfig field is set.
   */
  boolean hasPostgresqlSourceConfig();

  /**
   *
   *
   * <pre>
   * PostgreSQL data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PostgresqlSourceConfig postgresql_source_config = 102;
   * </code>
   *
   * @return The postgresqlSourceConfig.
   */
  com.google.events.cloud.datastream.v1.PostgresqlSourceConfig getPostgresqlSourceConfig();

  /**
   *
   *
   * <pre>
   * PostgreSQL data source configuration.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.PostgresqlSourceConfig postgresql_source_config = 102;
   * </code>
   */
  com.google.events.cloud.datastream.v1.PostgresqlSourceConfigOrBuilder
      getPostgresqlSourceConfigOrBuilder();

  public com.google.events.cloud.datastream.v1.SourceConfig.SourceStreamConfigCase
      getSourceStreamConfigCase();
}
