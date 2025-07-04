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
// source: google/events/cloud/audit/v1/data.proto

package com.google.events.cloud.audit.v1;

public interface AuthenticationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.audit.v1.AuthenticationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The email address of the authenticated user (or service account on behalf
   * of third party principal) making the request. For third party identity
   * callers, the `principal_subject` field is populated instead of this field.
   * For privacy reasons, the principal email address is sometimes redacted.
   * For more information, see [Caller identities in audit
   * logs](https://cloud.google.com/logging/docs/audit#user-id).
   * </pre>
   *
   * <code>string principal_email = 1;</code>
   *
   * @return The principalEmail.
   */
  java.lang.String getPrincipalEmail();

  /**
   *
   *
   * <pre>
   * The email address of the authenticated user (or service account on behalf
   * of third party principal) making the request. For third party identity
   * callers, the `principal_subject` field is populated instead of this field.
   * For privacy reasons, the principal email address is sometimes redacted.
   * For more information, see [Caller identities in audit
   * logs](https://cloud.google.com/logging/docs/audit#user-id).
   * </pre>
   *
   * <code>string principal_email = 1;</code>
   *
   * @return The bytes for principalEmail.
   */
  com.google.protobuf.ByteString getPrincipalEmailBytes();

  /**
   *
   *
   * <pre>
   * The authority selector specified by the requestor, if any.
   * It is not guaranteed that the principal was allowed to use this authority.
   * </pre>
   *
   * <code>string authority_selector = 2;</code>
   *
   * @return The authoritySelector.
   */
  java.lang.String getAuthoritySelector();

  /**
   *
   *
   * <pre>
   * The authority selector specified by the requestor, if any.
   * It is not guaranteed that the principal was allowed to use this authority.
   * </pre>
   *
   * <code>string authority_selector = 2;</code>
   *
   * @return The bytes for authoritySelector.
   */
  com.google.protobuf.ByteString getAuthoritySelectorBytes();

  /**
   *
   *
   * <pre>
   * The third party identification (if any) of the authenticated user making
   * the request.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct third_party_principal = 4;</code>
   *
   * @return Whether the thirdPartyPrincipal field is set.
   */
  boolean hasThirdPartyPrincipal();

  /**
   *
   *
   * <pre>
   * The third party identification (if any) of the authenticated user making
   * the request.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct third_party_principal = 4;</code>
   *
   * @return The thirdPartyPrincipal.
   */
  com.google.protobuf.Struct getThirdPartyPrincipal();

  /**
   *
   *
   * <pre>
   * The third party identification (if any) of the authenticated user making
   * the request.
   * When the JSON object represented here has a proto equivalent, the proto
   * name will be indicated in the `&#64;type` property.
   * </pre>
   *
   * <code>.google.protobuf.Struct third_party_principal = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getThirdPartyPrincipalOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the service account key used to create or exchange
   * credentials for authenticating the service account making the request.
   * This is a scheme-less URI full resource name. For example:
   * "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}"
   * </pre>
   *
   * <code>string service_account_key_name = 5;</code>
   *
   * @return The serviceAccountKeyName.
   */
  java.lang.String getServiceAccountKeyName();

  /**
   *
   *
   * <pre>
   * The name of the service account key used to create or exchange
   * credentials for authenticating the service account making the request.
   * This is a scheme-less URI full resource name. For example:
   * "//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}"
   * </pre>
   *
   * <code>string service_account_key_name = 5;</code>
   *
   * @return The bytes for serviceAccountKeyName.
   */
  com.google.protobuf.ByteString getServiceAccountKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Identity delegation history of an authenticated service account that makes
   * the request. It contains information on the real authorities that try to
   * access GCP resources by delegating on a service account. When multiple
   * authorities present, they are guaranteed to be sorted based on the original
   * ordering of the identity delegation events.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.audit.v1.ServiceAccountDelegationInfo service_account_delegation_info = 6;
   * </code>
   */
  java.util.List<com.google.events.cloud.audit.v1.ServiceAccountDelegationInfo>
      getServiceAccountDelegationInfoList();

  /**
   *
   *
   * <pre>
   * Identity delegation history of an authenticated service account that makes
   * the request. It contains information on the real authorities that try to
   * access GCP resources by delegating on a service account. When multiple
   * authorities present, they are guaranteed to be sorted based on the original
   * ordering of the identity delegation events.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.audit.v1.ServiceAccountDelegationInfo service_account_delegation_info = 6;
   * </code>
   */
  com.google.events.cloud.audit.v1.ServiceAccountDelegationInfo getServiceAccountDelegationInfo(
      int index);

  /**
   *
   *
   * <pre>
   * Identity delegation history of an authenticated service account that makes
   * the request. It contains information on the real authorities that try to
   * access GCP resources by delegating on a service account. When multiple
   * authorities present, they are guaranteed to be sorted based on the original
   * ordering of the identity delegation events.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.audit.v1.ServiceAccountDelegationInfo service_account_delegation_info = 6;
   * </code>
   */
  int getServiceAccountDelegationInfoCount();

  /**
   *
   *
   * <pre>
   * Identity delegation history of an authenticated service account that makes
   * the request. It contains information on the real authorities that try to
   * access GCP resources by delegating on a service account. When multiple
   * authorities present, they are guaranteed to be sorted based on the original
   * ordering of the identity delegation events.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.audit.v1.ServiceAccountDelegationInfo service_account_delegation_info = 6;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.audit.v1.ServiceAccountDelegationInfoOrBuilder>
      getServiceAccountDelegationInfoOrBuilderList();

  /**
   *
   *
   * <pre>
   * Identity delegation history of an authenticated service account that makes
   * the request. It contains information on the real authorities that try to
   * access GCP resources by delegating on a service account. When multiple
   * authorities present, they are guaranteed to be sorted based on the original
   * ordering of the identity delegation events.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.audit.v1.ServiceAccountDelegationInfo service_account_delegation_info = 6;
   * </code>
   */
  com.google.events.cloud.audit.v1.ServiceAccountDelegationInfoOrBuilder
      getServiceAccountDelegationInfoOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * String representation of identity of requesting party.
   * Populated for both first and third party identities.
   * </pre>
   *
   * <code>string principal_subject = 8;</code>
   *
   * @return The principalSubject.
   */
  java.lang.String getPrincipalSubject();

  /**
   *
   *
   * <pre>
   * String representation of identity of requesting party.
   * Populated for both first and third party identities.
   * </pre>
   *
   * <code>string principal_subject = 8;</code>
   *
   * @return The bytes for principalSubject.
   */
  com.google.protobuf.ByteString getPrincipalSubjectBytes();
}
