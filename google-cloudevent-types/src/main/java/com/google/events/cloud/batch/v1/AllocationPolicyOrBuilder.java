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

public interface AllocationPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.batch.v1.AllocationPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Location where compute resources should be allocated for the Job.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.LocationPolicy location = 1;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();

  /**
   *
   *
   * <pre>
   * Location where compute resources should be allocated for the Job.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.LocationPolicy location = 1;</code>
   *
   * @return The location.
   */
  com.google.events.cloud.batch.v1.AllocationPolicy.LocationPolicy getLocation();

  /**
   *
   *
   * <pre>
   * Location where compute resources should be allocated for the Job.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.LocationPolicy location = 1;</code>
   */
  com.google.events.cloud.batch.v1.AllocationPolicy.LocationPolicyOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  java.util.List<com.google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplate>
      getInstancesList();

  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  com.google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplate getInstances(
      int index);

  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  int getInstancesCount();

  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplateOrBuilder>
      getInstancesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Describe instances that can be created by this AllocationPolicy.
   * Only instances[0] is supported now.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplate instances = 8;
   * </code>
   */
  com.google.events.cloud.batch.v1.AllocationPolicy.InstancePolicyOrTemplateOrBuilder
      getInstancesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Service account that VMs will run as.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.ServiceAccount service_account = 9;</code>
   *
   * @return Whether the serviceAccount field is set.
   */
  boolean hasServiceAccount();

  /**
   *
   *
   * <pre>
   * Service account that VMs will run as.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.ServiceAccount service_account = 9;</code>
   *
   * @return The serviceAccount.
   */
  com.google.events.cloud.batch.v1.ServiceAccount getServiceAccount();

  /**
   *
   *
   * <pre>
   * Service account that VMs will run as.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.ServiceAccount service_account = 9;</code>
   */
  com.google.events.cloud.batch.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
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
   * Labels applied to all VM instances and other resources
   * created by AllocationPolicy.
   * Labels could be user provided or system generated.
   * You can assign up to 64 labels. [Google Compute Engine label
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * apply.
   * Label names that start with "goog-" or "google-" are reserved.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The network policy.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.NetworkPolicy network = 7;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();

  /**
   *
   *
   * <pre>
   * The network policy.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.NetworkPolicy network = 7;</code>
   *
   * @return The network.
   */
  com.google.events.cloud.batch.v1.AllocationPolicy.NetworkPolicy getNetwork();

  /**
   *
   *
   * <pre>
   * The network policy.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.NetworkPolicy network = 7;</code>
   */
  com.google.events.cloud.batch.v1.AllocationPolicy.NetworkPolicyOrBuilder getNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * The placement policy.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.PlacementPolicy placement = 10;</code>
   *
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();

  /**
   *
   *
   * <pre>
   * The placement policy.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.PlacementPolicy placement = 10;</code>
   *
   * @return The placement.
   */
  com.google.events.cloud.batch.v1.AllocationPolicy.PlacementPolicy getPlacement();

  /**
   *
   *
   * <pre>
   * The placement policy.
   * </pre>
   *
   * <code>.google.events.cloud.batch.v1.AllocationPolicy.PlacementPolicy placement = 10;</code>
   */
  com.google.events.cloud.batch.v1.AllocationPolicy.PlacementPolicyOrBuilder
      getPlacementOrBuilder();
}
