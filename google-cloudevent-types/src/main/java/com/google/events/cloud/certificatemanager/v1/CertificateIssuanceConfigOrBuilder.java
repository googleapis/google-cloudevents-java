/*
 * Copyright 2023 Google LLC
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
// source: google/events/cloud/certificatemanager/v1/data.proto

package com.google.events.cloud.certificatemanager.v1;

public interface CertificateIssuanceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user-defined name of the certificate issuance config.
   * CertificateIssuanceConfig names must be unique globally and match pattern
   * `projects/&#42;&#47;locations/&#42;&#47;certificateIssuanceConfigs/&#42;`.
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
   * A user-defined name of the certificate issuance config.
   * CertificateIssuanceConfig names must be unique globally and match pattern
   * `projects/&#42;&#47;locations/&#42;&#47;certificateIssuanceConfigs/&#42;`.
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
   * Output only. The creation timestamp of a CertificateIssuanceConfig.
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
   * Output only. The creation timestamp of a CertificateIssuanceConfig.
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
   * Output only. The creation timestamp of a CertificateIssuanceConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a CertificateIssuanceConfig.
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
   * Output only. The last update timestamp of a CertificateIssuanceConfig.
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
   * Output only. The last update timestamp of a CertificateIssuanceConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Set of labels associated with a CertificateIssuanceConfig.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Set of labels associated with a CertificateIssuanceConfig.
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
   * Set of labels associated with a CertificateIssuanceConfig.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Set of labels associated with a CertificateIssuanceConfig.
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
   * Set of labels associated with a CertificateIssuanceConfig.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * One or more paragraphs of text description of a CertificateIssuanceConfig.
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
   * One or more paragraphs of text description of a CertificateIssuanceConfig.
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
   * Required. The CA that issues the workload certificate. It includes the CA address,
   * type, authentication to CA service, etc.
   * </pre>
   *
   * <code>
   * .google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig.CertificateAuthorityConfig certificate_authority_config = 6;
   * </code>
   *
   * @return Whether the certificateAuthorityConfig field is set.
   */
  boolean hasCertificateAuthorityConfig();
  /**
   *
   *
   * <pre>
   * Required. The CA that issues the workload certificate. It includes the CA address,
   * type, authentication to CA service, etc.
   * </pre>
   *
   * <code>
   * .google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig.CertificateAuthorityConfig certificate_authority_config = 6;
   * </code>
   *
   * @return The certificateAuthorityConfig.
   */
  com.google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig.CertificateAuthorityConfig
      getCertificateAuthorityConfig();
  /**
   *
   *
   * <pre>
   * Required. The CA that issues the workload certificate. It includes the CA address,
   * type, authentication to CA service, etc.
   * </pre>
   *
   * <code>
   * .google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig.CertificateAuthorityConfig certificate_authority_config = 6;
   * </code>
   */
  com.google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig
          .CertificateAuthorityConfigOrBuilder
      getCertificateAuthorityConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Workload certificate lifetime requested.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 7;</code>
   *
   * @return Whether the lifetime field is set.
   */
  boolean hasLifetime();
  /**
   *
   *
   * <pre>
   * Required. Workload certificate lifetime requested.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 7;</code>
   *
   * @return The lifetime.
   */
  com.google.protobuf.Duration getLifetime();
  /**
   *
   *
   * <pre>
   * Required. Workload certificate lifetime requested.
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getLifetimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Specifies the percentage of elapsed time of the certificate lifetime to
   * wait before renewing the certificate. Must be a number between 1-99,
   * inclusive.
   * </pre>
   *
   * <code>int32 rotation_window_percentage = 8;</code>
   *
   * @return The rotationWindowPercentage.
   */
  int getRotationWindowPercentage();

  /**
   *
   *
   * <pre>
   * Required. The key algorithm to use when generating the private key.
   * </pre>
   *
   * <code>
   * .google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig.KeyAlgorithm key_algorithm = 9;
   * </code>
   *
   * @return The enum numeric value on the wire for keyAlgorithm.
   */
  int getKeyAlgorithmValue();
  /**
   *
   *
   * <pre>
   * Required. The key algorithm to use when generating the private key.
   * </pre>
   *
   * <code>
   * .google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig.KeyAlgorithm key_algorithm = 9;
   * </code>
   *
   * @return The keyAlgorithm.
   */
  com.google.events.cloud.certificatemanager.v1.CertificateIssuanceConfig.KeyAlgorithm
      getKeyAlgorithm();
}