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
// source: google/events/cloud/clouddms/v1/data.proto

package com.google.events.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Specifies required connection parameters, and the parameters
 * required to create an AlloyDB destination cluster.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.clouddms.v1.AlloyDbConnectionProfile}
 */
public final class AlloyDbConnectionProfile extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.clouddms.v1.AlloyDbConnectionProfile)
    AlloyDbConnectionProfileOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AlloyDbConnectionProfile.newBuilder() to construct.
  private AlloyDbConnectionProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AlloyDbConnectionProfile() {
    clusterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AlloyDbConnectionProfile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.clouddms.v1.Data
        .internal_static_google_events_cloud_clouddms_v1_AlloyDbConnectionProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.clouddms.v1.Data
        .internal_static_google_events_cloud_clouddms_v1_AlloyDbConnectionProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile.class,
            com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile.Builder.class);
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object clusterId_ = "";

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB cluster ID that this connection profile is associated
   * with.
   * </pre>
   *
   * <code>string cluster_id = 1;</code>
   *
   * @return The clusterId.
   */
  @java.lang.Override
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The AlloyDB cluster ID that this connection profile is associated
   * with.
   * </pre>
   *
   * <code>string cluster_id = 1;</code>
   *
   * @return The bytes for clusterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SETTINGS_FIELD_NUMBER = 2;
  private com.google.events.cloud.clouddms.v1.AlloyDbSettings settings_;

  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination AlloyDB cluster.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
   *
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return settings_ != null;
  }

  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination AlloyDB cluster.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
   *
   * @return The settings.
   */
  @java.lang.Override
  public com.google.events.cloud.clouddms.v1.AlloyDbSettings getSettings() {
    return settings_ == null
        ? com.google.events.cloud.clouddms.v1.AlloyDbSettings.getDefaultInstance()
        : settings_;
  }

  /**
   *
   *
   * <pre>
   * Immutable. Metadata used to create the destination AlloyDB cluster.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.clouddms.v1.AlloyDbSettingsOrBuilder getSettingsOrBuilder() {
    return settings_ == null
        ? com.google.events.cloud.clouddms.v1.AlloyDbSettings.getDefaultInstance()
        : settings_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clusterId_);
    }
    if (settings_ != null) {
      output.writeMessage(2, getSettings());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clusterId_);
    }
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSettings());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile)) {
      return super.equals(obj);
    }
    com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile other =
        (com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile) obj;

    if (!getClusterId().equals(other.getClusterId())) return false;
    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings().equals(other.getSettings())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Specifies required connection parameters, and the parameters
   * required to create an AlloyDB destination cluster.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.clouddms.v1.AlloyDbConnectionProfile}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.clouddms.v1.AlloyDbConnectionProfile)
      com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.clouddms.v1.Data
          .internal_static_google_events_cloud_clouddms_v1_AlloyDbConnectionProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.clouddms.v1.Data
          .internal_static_google_events_cloud_clouddms_v1_AlloyDbConnectionProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile.class,
              com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile.Builder.class);
    }

    // Construct using com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      clusterId_ = "";
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.clouddms.v1.Data
          .internal_static_google_events_cloud_clouddms_v1_AlloyDbConnectionProfile_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile
        getDefaultInstanceForType() {
      return com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile build() {
      com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile buildPartial() {
      com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile result =
          new com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clusterId_ = clusterId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.settings_ = settingsBuilder_ == null ? settings_ : settingsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile) {
        return mergeFrom((com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile other) {
      if (other
          == com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile.getDefaultInstance())
        return this;
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                clusterId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object clusterId_ = "";

    /**
     *
     *
     * <pre>
     * Required. The AlloyDB cluster ID that this connection profile is associated
     * with.
     * </pre>
     *
     * <code>string cluster_id = 1;</code>
     *
     * @return The clusterId.
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The AlloyDB cluster ID that this connection profile is associated
     * with.
     * </pre>
     *
     * <code>string cluster_id = 1;</code>
     *
     * @return The bytes for clusterId.
     */
    public com.google.protobuf.ByteString getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The AlloyDB cluster ID that this connection profile is associated
     * with.
     * </pre>
     *
     * <code>string cluster_id = 1;</code>
     *
     * @param value The clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      clusterId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The AlloyDB cluster ID that this connection profile is associated
     * with.
     * </pre>
     *
     * <code>string cluster_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClusterId() {
      clusterId_ = getDefaultInstance().getClusterId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The AlloyDB cluster ID that this connection profile is associated
     * with.
     * </pre>
     *
     * <code>string cluster_id = 1;</code>
     *
     * @param value The bytes for clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      clusterId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.events.cloud.clouddms.v1.AlloyDbSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.clouddms.v1.AlloyDbSettings,
            com.google.events.cloud.clouddms.v1.AlloyDbSettings.Builder,
            com.google.events.cloud.clouddms.v1.AlloyDbSettingsOrBuilder>
        settingsBuilder_;

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     *
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     *
     * @return The settings.
     */
    public com.google.events.cloud.clouddms.v1.AlloyDbSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null
            ? com.google.events.cloud.clouddms.v1.AlloyDbSettings.getDefaultInstance()
            : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     */
    public Builder setSettings(com.google.events.cloud.clouddms.v1.AlloyDbSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
      } else {
        settingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     */
    public Builder setSettings(
        com.google.events.cloud.clouddms.v1.AlloyDbSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     */
    public Builder mergeSettings(com.google.events.cloud.clouddms.v1.AlloyDbSettings value) {
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && settings_ != null
            && settings_
                != com.google.events.cloud.clouddms.v1.AlloyDbSettings.getDefaultInstance()) {
          getSettingsBuilder().mergeFrom(value);
        } else {
          settings_ = value;
        }
      } else {
        settingsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     */
    public Builder clearSettings() {
      bitField0_ = (bitField0_ & ~0x00000002);
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     */
    public com.google.events.cloud.clouddms.v1.AlloyDbSettings.Builder getSettingsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     */
    public com.google.events.cloud.clouddms.v1.AlloyDbSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null
            ? com.google.events.cloud.clouddms.v1.AlloyDbSettings.getDefaultInstance()
            : settings_;
      }
    }

    /**
     *
     *
     * <pre>
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.AlloyDbSettings settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.clouddms.v1.AlloyDbSettings,
            com.google.events.cloud.clouddms.v1.AlloyDbSettings.Builder,
            com.google.events.cloud.clouddms.v1.AlloyDbSettingsOrBuilder>
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.clouddms.v1.AlloyDbSettings,
                com.google.events.cloud.clouddms.v1.AlloyDbSettings.Builder,
                com.google.events.cloud.clouddms.v1.AlloyDbSettingsOrBuilder>(
                getSettings(), getParentForChildren(), isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.events.cloud.clouddms.v1.AlloyDbConnectionProfile)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.clouddms.v1.AlloyDbConnectionProfile)
  private static final com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile();
  }

  public static com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlloyDbConnectionProfile> PARSER =
      new com.google.protobuf.AbstractParser<AlloyDbConnectionProfile>() {
        @java.lang.Override
        public AlloyDbConnectionProfile parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<AlloyDbConnectionProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlloyDbConnectionProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
