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
// source: google/events/cloud/networkservices/v1/data.proto

package com.google.events.cloud.networkservices.v1;

public interface GatewayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.networkservices.v1.Gateway)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the Gateway resource. It matches pattern
   * `projects/&#42;&#47;locations/&#42;&#47;gateways/&lt;gateway_name&gt;`.
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
   * Required. Name of the Gateway resource. It matches pattern
   * `projects/&#42;&#47;locations/&#42;&#47;gateways/&lt;gateway_name&gt;`.
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
   * Output only. Server-defined URL of this resource
   * </pre>
   *
   * <code>string self_link = 13;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();

  /**
   *
   *
   * <pre>
   * Output only. Server-defined URL of this resource
   * </pre>
   *
   * <code>string self_link = 13;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the Gateway resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the Gateway resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the Gateway resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the Gateway resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
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
   * Optional. Set of label tags associated with the Gateway resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The type of the customer managed gateway.
   * This field is required. If unspecified, an error is returned.
   * </pre>
   *
   * <code>.google.events.cloud.networkservices.v1.Gateway.Type type = 6;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * Immutable. The type of the customer managed gateway.
   * This field is required. If unspecified, an error is returned.
   * </pre>
   *
   * <code>.google.events.cloud.networkservices.v1.Gateway.Type type = 6;</code>
   *
   * @return The type.
   */
  com.google.events.cloud.networkservices.v1.Gateway.Type getType();

  /**
   *
   *
   * <pre>
   * Optional. Zero or one IPv4 or IPv6 address on which the Gateway will
   * receive the traffic. When no address is provided, an IP from the subnetwork
   * is allocated
   * This field only applies to gateways of type 'SECURE_WEB_GATEWAY'.
   * Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6.
   * </pre>
   *
   * <code>repeated string addresses = 7;</code>
   *
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String> getAddressesList();

  /**
   *
   *
   * <pre>
   * Optional. Zero or one IPv4 or IPv6 address on which the Gateway will
   * receive the traffic. When no address is provided, an IP from the subnetwork
   * is allocated
   * This field only applies to gateways of type 'SECURE_WEB_GATEWAY'.
   * Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6.
   * </pre>
   *
   * <code>repeated string addresses = 7;</code>
   *
   * @return The count of addresses.
   */
  int getAddressesCount();

  /**
   *
   *
   * <pre>
   * Optional. Zero or one IPv4 or IPv6 address on which the Gateway will
   * receive the traffic. When no address is provided, an IP from the subnetwork
   * is allocated
   * This field only applies to gateways of type 'SECURE_WEB_GATEWAY'.
   * Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6.
   * </pre>
   *
   * <code>repeated string addresses = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);

  /**
   *
   *
   * <pre>
   * Optional. Zero or one IPv4 or IPv6 address on which the Gateway will
   * receive the traffic. When no address is provided, an IP from the subnetwork
   * is allocated
   * This field only applies to gateways of type 'SECURE_WEB_GATEWAY'.
   * Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6.
   * </pre>
   *
   * <code>repeated string addresses = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString getAddressesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. One or more port numbers (1-65535), on which the Gateway will
   * receive traffic. The proxy binds to the specified ports.
   * Gateways of type 'SECURE_WEB_GATEWAY' are limited to 1 port.
   * Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6 and
   * support multiple ports.
   * </pre>
   *
   * <code>repeated int32 ports = 11;</code>
   *
   * @return A list containing the ports.
   */
  java.util.List<java.lang.Integer> getPortsList();

  /**
   *
   *
   * <pre>
   * Required. One or more port numbers (1-65535), on which the Gateway will
   * receive traffic. The proxy binds to the specified ports.
   * Gateways of type 'SECURE_WEB_GATEWAY' are limited to 1 port.
   * Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6 and
   * support multiple ports.
   * </pre>
   *
   * <code>repeated int32 ports = 11;</code>
   *
   * @return The count of ports.
   */
  int getPortsCount();

  /**
   *
   *
   * <pre>
   * Required. One or more port numbers (1-65535), on which the Gateway will
   * receive traffic. The proxy binds to the specified ports.
   * Gateways of type 'SECURE_WEB_GATEWAY' are limited to 1 port.
   * Gateways of type 'OPEN_MESH' listen on 0.0.0.0 for IPv4 and :: for IPv6 and
   * support multiple ports.
   * </pre>
   *
   * <code>repeated int32 ports = 11;</code>
   *
   * @param index The index of the element to return.
   * @return The ports at the given index.
   */
  int getPorts(int index);

  /**
   *
   *
   * <pre>
   * Optional. Scope determines how configuration across multiple Gateway
   * instances are merged. The configuration for multiple Gateway instances with
   * the same scope will be merged as presented as a single coniguration to the
   * proxy/load balancer.
   * Max length 64 characters.
   * Scope should start with a letter and can only have letters, numbers,
   * hyphens.
   * </pre>
   *
   * <code>string scope = 8;</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();

  /**
   *
   *
   * <pre>
   * Optional. Scope determines how configuration across multiple Gateway
   * instances are merged. The configuration for multiple Gateway instances with
   * the same scope will be merged as presented as a single coniguration to the
   * proxy/load balancer.
   * Max length 64 characters.
   * Scope should start with a letter and can only have letters, numbers,
   * hyphens.
   * </pre>
   *
   * <code>string scope = 8;</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how
   * TLS traffic is terminated. If empty, TLS termination is disabled.
   * </pre>
   *
   * <code>string server_tls_policy = 9;</code>
   *
   * @return The serverTlsPolicy.
   */
  java.lang.String getServerTlsPolicy();

  /**
   *
   *
   * <pre>
   * Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how
   * TLS traffic is terminated. If empty, TLS termination is disabled.
   * </pre>
   *
   * <code>string server_tls_policy = 9;</code>
   *
   * @return The bytes for serverTlsPolicy.
   */
  com.google.protobuf.ByteString getServerTlsPolicyBytes();

  /**
   *
   *
   * <pre>
   * Optional. A fully-qualified Certificates URL reference. The proxy presents
   * a Certificate (selected based on SNI) when establishing a TLS connection.
   * This feature only applies to gateways of type 'SECURE_WEB_GATEWAY'.
   * </pre>
   *
   * <code>repeated string certificate_urls = 14;</code>
   *
   * @return A list containing the certificateUrls.
   */
  java.util.List<java.lang.String> getCertificateUrlsList();

  /**
   *
   *
   * <pre>
   * Optional. A fully-qualified Certificates URL reference. The proxy presents
   * a Certificate (selected based on SNI) when establishing a TLS connection.
   * This feature only applies to gateways of type 'SECURE_WEB_GATEWAY'.
   * </pre>
   *
   * <code>repeated string certificate_urls = 14;</code>
   *
   * @return The count of certificateUrls.
   */
  int getCertificateUrlsCount();

  /**
   *
   *
   * <pre>
   * Optional. A fully-qualified Certificates URL reference. The proxy presents
   * a Certificate (selected based on SNI) when establishing a TLS connection.
   * This feature only applies to gateways of type 'SECURE_WEB_GATEWAY'.
   * </pre>
   *
   * <code>repeated string certificate_urls = 14;</code>
   *
   * @param index The index of the element to return.
   * @return The certificateUrls at the given index.
   */
  java.lang.String getCertificateUrls(int index);

  /**
   *
   *
   * <pre>
   * Optional. A fully-qualified Certificates URL reference. The proxy presents
   * a Certificate (selected based on SNI) when establishing a TLS connection.
   * This feature only applies to gateways of type 'SECURE_WEB_GATEWAY'.
   * </pre>
   *
   * <code>repeated string certificate_urls = 14;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the certificateUrls at the given index.
   */
  com.google.protobuf.ByteString getCertificateUrlsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A fully-qualified GatewaySecurityPolicy URL reference.
   * Defines how a server should apply security policy to inbound
   * (VM to Proxy) initiated connections.
   * For example:
   * `projects/&#42;&#47;locations/&#42;&#47;gatewaySecurityPolicies/swg-policy`.
   * This policy is specific to gateways of type 'SECURE_WEB_GATEWAY'.
   * </pre>
   *
   * <code>string gateway_security_policy = 18;</code>
   *
   * @return The gatewaySecurityPolicy.
   */
  java.lang.String getGatewaySecurityPolicy();

  /**
   *
   *
   * <pre>
   * Optional. A fully-qualified GatewaySecurityPolicy URL reference.
   * Defines how a server should apply security policy to inbound
   * (VM to Proxy) initiated connections.
   * For example:
   * `projects/&#42;&#47;locations/&#42;&#47;gatewaySecurityPolicies/swg-policy`.
   * This policy is specific to gateways of type 'SECURE_WEB_GATEWAY'.
   * </pre>
   *
   * <code>string gateway_security_policy = 18;</code>
   *
   * @return The bytes for gatewaySecurityPolicy.
   */
  com.google.protobuf.ByteString getGatewaySecurityPolicyBytes();

  /**
   *
   *
   * <pre>
   * Optional. The relative resource name identifying the VPC network that is
   * using this configuration. For example:
   * `projects/&#42;&#47;global/networks/network-1`.
   * Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY'.
   * </pre>
   *
   * <code>string network = 16;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();

  /**
   *
   *
   * <pre>
   * Optional. The relative resource name identifying the VPC network that is
   * using this configuration. For example:
   * `projects/&#42;&#47;global/networks/network-1`.
   * Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY'.
   * </pre>
   *
   * <code>string network = 16;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. The relative resource name identifying  the subnetwork in which
   * this SWG is allocated. For example:
   * `projects/&#42;&#47;regions/us-central1/subnetworks/network-1`
   * Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY".
   * </pre>
   *
   * <code>string subnetwork = 17;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();

  /**
   *
   *
   * <pre>
   * Optional. The relative resource name identifying  the subnetwork in which
   * this SWG is allocated. For example:
   * `projects/&#42;&#47;regions/us-central1/subnetworks/network-1`
   * Currently, this field is specific to gateways of type 'SECURE_WEB_GATEWAY".
   * </pre>
   *
   * <code>string subnetwork = 17;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();
}
