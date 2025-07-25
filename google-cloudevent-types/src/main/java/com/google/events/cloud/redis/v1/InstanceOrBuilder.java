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
// source: google/events/cloud/redis/v1/data.proto

package com.google.events.cloud.redis.v1;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.redis.v1.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * Note: Redis instances are managed and addressed at regional level so
   * location_id here refers to a GCP region; however, users may choose which
   * specific zone (or collection of zones for cross-zone instances) an instance
   * should be provisioned in. Refer to
   * [location_id][google.cloud.redis.v1.Instance.location_id] and
   * [alternative_location_id][google.cloud.redis.v1.Instance.alternative_location_id]
   * fields for more details.
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
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * Note: Redis instances are managed and addressed at regional level so
   * location_id here refers to a GCP region; however, users may choose which
   * specific zone (or collection of zones for cross-zone instances) an instance
   * should be provisioned in. Refer to
   * [location_id][google.cloud.redis.v1.Instance.location_id] and
   * [alternative_location_id][google.cloud.redis.v1.Instance.alternative_location_id]
   * fields for more details.
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
   * An arbitrary and optional user-provided name for the instance.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * An arbitrary and optional user-provided name for the instance.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
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
   * Resource labels to represent user provided metadata
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The zone where the instance will be provisioned. If not provided,
   * the service will choose a zone from the specified region for the instance.
   * For standard tier, additional nodes will be added across multiple zones for
   * protection against zonal failures. If specified, at least one node will be
   * provisioned in this zone.
   * </pre>
   *
   * <code>string location_id = 4;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();

  /**
   *
   *
   * <pre>
   * Optional. The zone where the instance will be provisioned. If not provided,
   * the service will choose a zone from the specified region for the instance.
   * For standard tier, additional nodes will be added across multiple zones for
   * protection against zonal failures. If specified, at least one node will be
   * provisioned in this zone.
   * </pre>
   *
   * <code>string location_id = 4;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. If specified, at least one node will be provisioned in this zone
   * in addition to the zone specified in location_id. Only applicable to
   * standard tier. If provided, it must be a different zone from the one
   * provided in [location_id]. Additional nodes beyond the first 2 will be
   * placed in zones selected by the service.
   * </pre>
   *
   * <code>string alternative_location_id = 5;</code>
   *
   * @return The alternativeLocationId.
   */
  java.lang.String getAlternativeLocationId();

  /**
   *
   *
   * <pre>
   * Optional. If specified, at least one node will be provisioned in this zone
   * in addition to the zone specified in location_id. Only applicable to
   * standard tier. If provided, it must be a different zone from the one
   * provided in [location_id]. Additional nodes beyond the first 2 will be
   * placed in zones selected by the service.
   * </pre>
   *
   * <code>string alternative_location_id = 5;</code>
   *
   * @return The bytes for alternativeLocationId.
   */
  com.google.protobuf.ByteString getAlternativeLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The version of Redis software.
   * If not provided, latest supported version will be used. Currently, the
   * supported values are:
   *  *   `REDIS_3_2` for Redis 3.2 compatibility
   *  *   `REDIS_4_0` for Redis 4.0 compatibility (default)
   *  *   `REDIS_5_0` for Redis 5.0 compatibility
   *  *   `REDIS_6_X` for Redis 6.x compatibility
   * </pre>
   *
   * <code>string redis_version = 7;</code>
   *
   * @return The redisVersion.
   */
  java.lang.String getRedisVersion();

  /**
   *
   *
   * <pre>
   * Optional. The version of Redis software.
   * If not provided, latest supported version will be used. Currently, the
   * supported values are:
   *  *   `REDIS_3_2` for Redis 3.2 compatibility
   *  *   `REDIS_4_0` for Redis 4.0 compatibility (default)
   *  *   `REDIS_5_0` for Redis 5.0 compatibility
   *  *   `REDIS_6_X` for Redis 6.x compatibility
   * </pre>
   *
   * <code>string redis_version = 7;</code>
   *
   * @return The bytes for redisVersion.
   */
  com.google.protobuf.ByteString getRedisVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses
   * that are reserved for this instance. Range must
   * be unique and non-overlapping with existing subnets in an authorized
   * network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP
   * address ranges associated with this private service access connection.
   * If not provided, the service will choose an unused /29 block, for
   * example, 10.0.0.0/29 or 192.168.0.0/29.  For READ_REPLICAS_ENABLED
   * the default block size is /28.
   * </pre>
   *
   * <code>string reserved_ip_range = 9;</code>
   *
   * @return The reservedIpRange.
   */
  java.lang.String getReservedIpRange();

  /**
   *
   *
   * <pre>
   * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses
   * that are reserved for this instance. Range must
   * be unique and non-overlapping with existing subnets in an authorized
   * network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP
   * address ranges associated with this private service access connection.
   * If not provided, the service will choose an unused /29 block, for
   * example, 10.0.0.0/29 or 192.168.0.0/29.  For READ_REPLICAS_ENABLED
   * the default block size is /28.
   * </pre>
   *
   * <code>string reserved_ip_range = 9;</code>
   *
   * @return The bytes for reservedIpRange.
   */
  com.google.protobuf.ByteString getReservedIpRangeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Additional IP range for node placement. Required when enabling
   * read replicas on an existing instance. For DIRECT_PEERING mode value must
   * be a CIDR range of size /28, or "auto". For PRIVATE_SERVICE_ACCESS mode
   * value must be the name of an allocated address range associated with the
   * private service access connection, or "auto".
   * </pre>
   *
   * <code>string secondary_ip_range = 30;</code>
   *
   * @return The secondaryIpRange.
   */
  java.lang.String getSecondaryIpRange();

  /**
   *
   *
   * <pre>
   * Optional. Additional IP range for node placement. Required when enabling
   * read replicas on an existing instance. For DIRECT_PEERING mode value must
   * be a CIDR range of size /28, or "auto". For PRIVATE_SERVICE_ACCESS mode
   * value must be the name of an allocated address range associated with the
   * private service access connection, or "auto".
   * </pre>
   *
   * <code>string secondary_ip_range = 30;</code>
   *
   * @return The bytes for secondaryIpRange.
   */
  com.google.protobuf.ByteString getSecondaryIpRangeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed Redis endpoint used by
   * clients to connect to the service.
   * </pre>
   *
   * <code>string host = 10;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();

  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed Redis endpoint used by
   * clients to connect to the service.
   * </pre>
   *
   * <code>string host = 10;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * Output only. The port number of the exposed Redis endpoint.
   * </pre>
   *
   * <code>int32 port = 11;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Output only. The current zone where the Redis primary node is located. In
   * basic tier, this will always be the same as [location_id]. In
   * standard tier, this can be the zone of any node in the instance.
   * </pre>
   *
   * <code>string current_location_id = 12;</code>
   *
   * @return The currentLocationId.
   */
  java.lang.String getCurrentLocationId();

  /**
   *
   *
   * <pre>
   * Output only. The current zone where the Redis primary node is located. In
   * basic tier, this will always be the same as [location_id]. In
   * standard tier, this can be the zone of any node in the instance.
   * </pre>
   *
   * <code>string current_location_id = 12;</code>
   *
   * @return The bytes for currentLocationId.
   */
  com.google.protobuf.ByteString getCurrentLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the instance was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 13;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this instance.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.Instance.State state = 14;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this instance.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.Instance.State state = 14;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.redis.v1.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current status of this
   * instance, if available.
   * </pre>
   *
   * <code>string status_message = 15;</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current status of this
   * instance, if available.
   * </pre>
   *
   * <code>string status_message = 15;</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16;</code>
   */
  int getRedisConfigsCount();

  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16;</code>
   */
  boolean containsRedisConfigs(java.lang.String key);

  /** Use {@link #getRedisConfigsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getRedisConfigs();

  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getRedisConfigsMap();

  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16;</code>
   */
  /* nullable */
  java.lang.String getRedisConfigsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Redis configuration parameters, according to
   * http://redis.io/topics/config. Currently, the only supported parameters
   * are:
   *  Redis version 3.2 and newer:
   *  *   maxmemory-policy
   *  *   notify-keyspace-events
   *  Redis version 4.0 and newer:
   *  *   activedefrag
   *  *   lfu-decay-time
   *  *   lfu-log-factor
   *  *   maxmemory-gb
   *  Redis version 5.0 and newer:
   *  *   stream-node-max-bytes
   *  *   stream-node-max-entries
   * </pre>
   *
   * <code>map&lt;string, string&gt; redis_configs = 16;</code>
   */
  java.lang.String getRedisConfigsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. The service tier of the instance.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.Instance.Tier tier = 17;</code>
   *
   * @return The enum numeric value on the wire for tier.
   */
  int getTierValue();

  /**
   *
   *
   * <pre>
   * Required. The service tier of the instance.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.Instance.Tier tier = 17;</code>
   *
   * @return The tier.
   */
  com.google.events.cloud.redis.v1.Instance.Tier getTier();

  /**
   *
   *
   * <pre>
   * Required. Redis memory size in GiB.
   * </pre>
   *
   * <code>int32 memory_size_gb = 18;</code>
   *
   * @return The memorySizeGb.
   */
  int getMemorySizeGb();

  /**
   *
   *
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/vpc/docs/vpc) to which the
   * instance is connected. If left unspecified, the `default` network
   * will be used.
   * </pre>
   *
   * <code>string authorized_network = 20;</code>
   *
   * @return The authorizedNetwork.
   */
  java.lang.String getAuthorizedNetwork();

  /**
   *
   *
   * <pre>
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/vpc/docs/vpc) to which the
   * instance is connected. If left unspecified, the `default` network
   * will be used.
   * </pre>
   *
   * <code>string authorized_network = 20;</code>
   *
   * @return The bytes for authorizedNetwork.
   */
  com.google.protobuf.ByteString getAuthorizedNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. Cloud IAM identity used by import / export operations to
   * transfer data to/from Cloud Storage. Format is
   * "serviceAccount:&lt;service_account_email&gt;". The value may change over time
   * for a given instance so should be checked before each import/export
   * operation.
   * </pre>
   *
   * <code>string persistence_iam_identity = 21;</code>
   *
   * @return The persistenceIamIdentity.
   */
  java.lang.String getPersistenceIamIdentity();

  /**
   *
   *
   * <pre>
   * Output only. Cloud IAM identity used by import / export operations to
   * transfer data to/from Cloud Storage. Format is
   * "serviceAccount:&lt;service_account_email&gt;". The value may change over time
   * for a given instance so should be checked before each import/export
   * operation.
   * </pre>
   *
   * <code>string persistence_iam_identity = 21;</code>
   *
   * @return The bytes for persistenceIamIdentity.
   */
  com.google.protobuf.ByteString getPersistenceIamIdentityBytes();

  /**
   *
   *
   * <pre>
   * Optional. The network connect mode of the Redis instance.
   * If not provided, the connect mode defaults to DIRECT_PEERING.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.Instance.ConnectMode connect_mode = 22;</code>
   *
   * @return The enum numeric value on the wire for connectMode.
   */
  int getConnectModeValue();

  /**
   *
   *
   * <pre>
   * Optional. The network connect mode of the Redis instance.
   * If not provided, the connect mode defaults to DIRECT_PEERING.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.Instance.ConnectMode connect_mode = 22;</code>
   *
   * @return The connectMode.
   */
  com.google.events.cloud.redis.v1.Instance.ConnectMode getConnectMode();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If
   * set to "true" AUTH is enabled on the instance. Default value is "false"
   * meaning AUTH is disabled.
   * </pre>
   *
   * <code>bool auth_enabled = 23;</code>
   *
   * @return The authEnabled.
   */
  boolean getAuthEnabled();

  /**
   *
   *
   * <pre>
   * Output only. List of server CA certificates for the instance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.TlsCertificate server_ca_certs = 25;</code>
   */
  java.util.List<com.google.events.cloud.redis.v1.TlsCertificate> getServerCaCertsList();

  /**
   *
   *
   * <pre>
   * Output only. List of server CA certificates for the instance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.TlsCertificate server_ca_certs = 25;</code>
   */
  com.google.events.cloud.redis.v1.TlsCertificate getServerCaCerts(int index);

  /**
   *
   *
   * <pre>
   * Output only. List of server CA certificates for the instance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.TlsCertificate server_ca_certs = 25;</code>
   */
  int getServerCaCertsCount();

  /**
   *
   *
   * <pre>
   * Output only. List of server CA certificates for the instance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.TlsCertificate server_ca_certs = 25;</code>
   */
  java.util.List<? extends com.google.events.cloud.redis.v1.TlsCertificateOrBuilder>
      getServerCaCertsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. List of server CA certificates for the instance.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.TlsCertificate server_ca_certs = 25;</code>
   */
  com.google.events.cloud.redis.v1.TlsCertificateOrBuilder getServerCaCertsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The TLS mode of the Redis instance.
   * If not provided, TLS is disabled for the instance.
   * </pre>
   *
   * <code>
   * .google.events.cloud.redis.v1.Instance.TransitEncryptionMode transit_encryption_mode = 26;
   * </code>
   *
   * @return The enum numeric value on the wire for transitEncryptionMode.
   */
  int getTransitEncryptionModeValue();

  /**
   *
   *
   * <pre>
   * Optional. The TLS mode of the Redis instance.
   * If not provided, TLS is disabled for the instance.
   * </pre>
   *
   * <code>
   * .google.events.cloud.redis.v1.Instance.TransitEncryptionMode transit_encryption_mode = 26;
   * </code>
   *
   * @return The transitEncryptionMode.
   */
  com.google.events.cloud.redis.v1.Instance.TransitEncryptionMode getTransitEncryptionMode();

  /**
   *
   *
   * <pre>
   * Optional. The maintenance policy for the instance. If not provided,
   * maintenance events can be performed at any time.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.MaintenancePolicy maintenance_policy = 27;</code>
   *
   * @return Whether the maintenancePolicy field is set.
   */
  boolean hasMaintenancePolicy();

  /**
   *
   *
   * <pre>
   * Optional. The maintenance policy for the instance. If not provided,
   * maintenance events can be performed at any time.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.MaintenancePolicy maintenance_policy = 27;</code>
   *
   * @return The maintenancePolicy.
   */
  com.google.events.cloud.redis.v1.MaintenancePolicy getMaintenancePolicy();

  /**
   *
   *
   * <pre>
   * Optional. The maintenance policy for the instance. If not provided,
   * maintenance events can be performed at any time.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.MaintenancePolicy maintenance_policy = 27;</code>
   */
  com.google.events.cloud.redis.v1.MaintenancePolicyOrBuilder getMaintenancePolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Date and time of upcoming maintenance events which have been
   * scheduled.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.MaintenanceSchedule maintenance_schedule = 28;</code>
   *
   * @return Whether the maintenanceSchedule field is set.
   */
  boolean hasMaintenanceSchedule();

  /**
   *
   *
   * <pre>
   * Output only. Date and time of upcoming maintenance events which have been
   * scheduled.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.MaintenanceSchedule maintenance_schedule = 28;</code>
   *
   * @return The maintenanceSchedule.
   */
  com.google.events.cloud.redis.v1.MaintenanceSchedule getMaintenanceSchedule();

  /**
   *
   *
   * <pre>
   * Output only. Date and time of upcoming maintenance events which have been
   * scheduled.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.MaintenanceSchedule maintenance_schedule = 28;</code>
   */
  com.google.events.cloud.redis.v1.MaintenanceScheduleOrBuilder getMaintenanceScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The number of replica nodes. The valid range for the Standard
   * Tier with read replicas enabled is [1-5] and defaults to 2. If read
   * replicas are not enabled for a Standard Tier instance, the only valid value
   * is 1 and the default is 1. The valid value for basic tier is 0 and the
   * default is also 0.
   * </pre>
   *
   * <code>int32 replica_count = 31;</code>
   *
   * @return The replicaCount.
   */
  int getReplicaCount();

  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.NodeInfo nodes = 32;</code>
   */
  java.util.List<com.google.events.cloud.redis.v1.NodeInfo> getNodesList();

  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.NodeInfo nodes = 32;</code>
   */
  com.google.events.cloud.redis.v1.NodeInfo getNodes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.NodeInfo nodes = 32;</code>
   */
  int getNodesCount();

  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.NodeInfo nodes = 32;</code>
   */
  java.util.List<? extends com.google.events.cloud.redis.v1.NodeInfoOrBuilder>
      getNodesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Info per node.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.NodeInfo nodes = 32;</code>
   */
  com.google.events.cloud.redis.v1.NodeInfoOrBuilder getNodesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed readonly Redis
   * endpoint. Standard tier only. Targets all healthy replica nodes in
   * instance. Replication is asynchronous and replica nodes will exhibit some
   * lag behind the primary. Write requests must target 'host'.
   * </pre>
   *
   * <code>string read_endpoint = 33;</code>
   *
   * @return The readEndpoint.
   */
  java.lang.String getReadEndpoint();

  /**
   *
   *
   * <pre>
   * Output only. Hostname or IP address of the exposed readonly Redis
   * endpoint. Standard tier only. Targets all healthy replica nodes in
   * instance. Replication is asynchronous and replica nodes will exhibit some
   * lag behind the primary. Write requests must target 'host'.
   * </pre>
   *
   * <code>string read_endpoint = 33;</code>
   *
   * @return The bytes for readEndpoint.
   */
  com.google.protobuf.ByteString getReadEndpointBytes();

  /**
   *
   *
   * <pre>
   * Output only. The port number of the exposed readonly redis
   * endpoint. Standard tier only. Write requests should target 'port'.
   * </pre>
   *
   * <code>int32 read_endpoint_port = 34;</code>
   *
   * @return The readEndpointPort.
   */
  int getReadEndpointPort();

  /**
   *
   *
   * <pre>
   * Optional. Read replicas mode for the instance. Defaults to
   * READ_REPLICAS_DISABLED.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.Instance.ReadReplicasMode read_replicas_mode = 35;</code>
   *
   * @return The enum numeric value on the wire for readReplicasMode.
   */
  int getReadReplicasModeValue();

  /**
   *
   *
   * <pre>
   * Optional. Read replicas mode for the instance. Defaults to
   * READ_REPLICAS_DISABLED.
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.Instance.ReadReplicasMode read_replicas_mode = 35;</code>
   *
   * @return The readReplicasMode.
   */
  com.google.events.cloud.redis.v1.Instance.ReadReplicasMode getReadReplicasMode();

  /**
   *
   *
   * <pre>
   * Optional. The KMS key reference that the customer provides when trying to
   * create the instance.
   * </pre>
   *
   * <code>string customer_managed_key = 36;</code>
   *
   * @return The customerManagedKey.
   */
  java.lang.String getCustomerManagedKey();

  /**
   *
   *
   * <pre>
   * Optional. The KMS key reference that the customer provides when trying to
   * create the instance.
   * </pre>
   *
   * <code>string customer_managed_key = 36;</code>
   *
   * @return The bytes for customerManagedKey.
   */
  com.google.protobuf.ByteString getCustomerManagedKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. Persistence configuration parameters
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.PersistenceConfig persistence_config = 37;</code>
   *
   * @return Whether the persistenceConfig field is set.
   */
  boolean hasPersistenceConfig();

  /**
   *
   *
   * <pre>
   * Optional. Persistence configuration parameters
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.PersistenceConfig persistence_config = 37;</code>
   *
   * @return The persistenceConfig.
   */
  com.google.events.cloud.redis.v1.PersistenceConfig getPersistenceConfig();

  /**
   *
   *
   * <pre>
   * Optional. Persistence configuration parameters
   * </pre>
   *
   * <code>.google.events.cloud.redis.v1.PersistenceConfig persistence_config = 37;</code>
   */
  com.google.events.cloud.redis.v1.PersistenceConfigOrBuilder getPersistenceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. reasons that causes instance in "SUSPENDED" state.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.Instance.SuspensionReason suspension_reasons = 38;
   * </code>
   *
   * @return A list containing the suspensionReasons.
   */
  java.util.List<com.google.events.cloud.redis.v1.Instance.SuspensionReason>
      getSuspensionReasonsList();

  /**
   *
   *
   * <pre>
   * Optional. reasons that causes instance in "SUSPENDED" state.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.Instance.SuspensionReason suspension_reasons = 38;
   * </code>
   *
   * @return The count of suspensionReasons.
   */
  int getSuspensionReasonsCount();

  /**
   *
   *
   * <pre>
   * Optional. reasons that causes instance in "SUSPENDED" state.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.Instance.SuspensionReason suspension_reasons = 38;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The suspensionReasons at the given index.
   */
  com.google.events.cloud.redis.v1.Instance.SuspensionReason getSuspensionReasons(int index);

  /**
   *
   *
   * <pre>
   * Optional. reasons that causes instance in "SUSPENDED" state.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.Instance.SuspensionReason suspension_reasons = 38;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for suspensionReasons.
   */
  java.util.List<java.lang.Integer> getSuspensionReasonsValueList();

  /**
   *
   *
   * <pre>
   * Optional. reasons that causes instance in "SUSPENDED" state.
   * </pre>
   *
   * <code>repeated .google.events.cloud.redis.v1.Instance.SuspensionReason suspension_reasons = 38;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of suspensionReasons at the given index.
   */
  int getSuspensionReasonsValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. The self service update maintenance version.
   * The version is date based such as "20210712_00_00".
   * </pre>
   *
   * <code>string maintenance_version = 39;</code>
   *
   * @return The maintenanceVersion.
   */
  java.lang.String getMaintenanceVersion();

  /**
   *
   *
   * <pre>
   * Optional. The self service update maintenance version.
   * The version is date based such as "20210712_00_00".
   * </pre>
   *
   * <code>string maintenance_version = 39;</code>
   *
   * @return The bytes for maintenanceVersion.
   */
  com.google.protobuf.ByteString getMaintenanceVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The available maintenance versions that an instance could update
   * to.
   * </pre>
   *
   * <code>repeated string available_maintenance_versions = 40;</code>
   *
   * @return A list containing the availableMaintenanceVersions.
   */
  java.util.List<java.lang.String> getAvailableMaintenanceVersionsList();

  /**
   *
   *
   * <pre>
   * Optional. The available maintenance versions that an instance could update
   * to.
   * </pre>
   *
   * <code>repeated string available_maintenance_versions = 40;</code>
   *
   * @return The count of availableMaintenanceVersions.
   */
  int getAvailableMaintenanceVersionsCount();

  /**
   *
   *
   * <pre>
   * Optional. The available maintenance versions that an instance could update
   * to.
   * </pre>
   *
   * <code>repeated string available_maintenance_versions = 40;</code>
   *
   * @param index The index of the element to return.
   * @return The availableMaintenanceVersions at the given index.
   */
  java.lang.String getAvailableMaintenanceVersions(int index);

  /**
   *
   *
   * <pre>
   * Optional. The available maintenance versions that an instance could update
   * to.
   * </pre>
   *
   * <code>repeated string available_maintenance_versions = 40;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the availableMaintenanceVersions at the given index.
   */
  com.google.protobuf.ByteString getAvailableMaintenanceVersionsBytes(int index);
}
