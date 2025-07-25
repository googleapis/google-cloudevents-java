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
// source: google/events/cloud/functions/v2/data.proto

package com.google.events.cloud.functions.v2;

/**
 *
 *
 * <pre>
 * Provenance of the source. Ways to find the original source, or verify that
 * some source was used for this build.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.functions.v2.SourceProvenance}
 */
public final class SourceProvenance extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.functions.v2.SourceProvenance)
    SourceProvenanceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SourceProvenance.newBuilder() to construct.
  private SourceProvenance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceProvenance() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceProvenance();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.functions.v2.Data
        .internal_static_google_events_cloud_functions_v2_SourceProvenance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.functions.v2.Data
        .internal_static_google_events_cloud_functions_v2_SourceProvenance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.functions.v2.SourceProvenance.class,
            com.google.events.cloud.functions.v2.SourceProvenance.Builder.class);
  }

  public static final int RESOLVED_STORAGE_SOURCE_FIELD_NUMBER = 1;
  private com.google.events.cloud.functions.v2.StorageSource resolvedStorageSource_;

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
   *
   * @return Whether the resolvedStorageSource field is set.
   */
  @java.lang.Override
  public boolean hasResolvedStorageSource() {
    return resolvedStorageSource_ != null;
  }

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
   *
   * @return The resolvedStorageSource.
   */
  @java.lang.Override
  public com.google.events.cloud.functions.v2.StorageSource getResolvedStorageSource() {
    return resolvedStorageSource_ == null
        ? com.google.events.cloud.functions.v2.StorageSource.getDefaultInstance()
        : resolvedStorageSource_;
  }

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.storage_source`, if exists, with any
   * generations resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.functions.v2.StorageSourceOrBuilder
      getResolvedStorageSourceOrBuilder() {
    return resolvedStorageSource_ == null
        ? com.google.events.cloud.functions.v2.StorageSource.getDefaultInstance()
        : resolvedStorageSource_;
  }

  public static final int RESOLVED_REPO_SOURCE_FIELD_NUMBER = 2;
  private com.google.events.cloud.functions.v2.RepoSource resolvedRepoSource_;

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
   *
   * @return Whether the resolvedRepoSource field is set.
   */
  @java.lang.Override
  public boolean hasResolvedRepoSource() {
    return resolvedRepoSource_ != null;
  }

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
   *
   * @return The resolvedRepoSource.
   */
  @java.lang.Override
  public com.google.events.cloud.functions.v2.RepoSource getResolvedRepoSource() {
    return resolvedRepoSource_ == null
        ? com.google.events.cloud.functions.v2.RepoSource.getDefaultInstance()
        : resolvedRepoSource_;
  }

  /**
   *
   *
   * <pre>
   * A copy of the build's `source.repo_source`, if exists, with any
   * revisions resolved.
   * </pre>
   *
   * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.functions.v2.RepoSourceOrBuilder getResolvedRepoSourceOrBuilder() {
    return resolvedRepoSource_ == null
        ? com.google.events.cloud.functions.v2.RepoSource.getDefaultInstance()
        : resolvedRepoSource_;
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
    if (resolvedStorageSource_ != null) {
      output.writeMessage(1, getResolvedStorageSource());
    }
    if (resolvedRepoSource_ != null) {
      output.writeMessage(2, getResolvedRepoSource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resolvedStorageSource_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getResolvedStorageSource());
    }
    if (resolvedRepoSource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getResolvedRepoSource());
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
    if (!(obj instanceof com.google.events.cloud.functions.v2.SourceProvenance)) {
      return super.equals(obj);
    }
    com.google.events.cloud.functions.v2.SourceProvenance other =
        (com.google.events.cloud.functions.v2.SourceProvenance) obj;

    if (hasResolvedStorageSource() != other.hasResolvedStorageSource()) return false;
    if (hasResolvedStorageSource()) {
      if (!getResolvedStorageSource().equals(other.getResolvedStorageSource())) return false;
    }
    if (hasResolvedRepoSource() != other.hasResolvedRepoSource()) return false;
    if (hasResolvedRepoSource()) {
      if (!getResolvedRepoSource().equals(other.getResolvedRepoSource())) return false;
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
    if (hasResolvedStorageSource()) {
      hash = (37 * hash) + RESOLVED_STORAGE_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResolvedStorageSource().hashCode();
    }
    if (hasResolvedRepoSource()) {
      hash = (37 * hash) + RESOLVED_REPO_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResolvedRepoSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance parseFrom(
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
      com.google.events.cloud.functions.v2.SourceProvenance prototype) {
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
   * Provenance of the source. Ways to find the original source, or verify that
   * some source was used for this build.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.functions.v2.SourceProvenance}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.functions.v2.SourceProvenance)
      com.google.events.cloud.functions.v2.SourceProvenanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.functions.v2.Data
          .internal_static_google_events_cloud_functions_v2_SourceProvenance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.functions.v2.Data
          .internal_static_google_events_cloud_functions_v2_SourceProvenance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.functions.v2.SourceProvenance.class,
              com.google.events.cloud.functions.v2.SourceProvenance.Builder.class);
    }

    // Construct using com.google.events.cloud.functions.v2.SourceProvenance.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resolvedStorageSource_ = null;
      if (resolvedStorageSourceBuilder_ != null) {
        resolvedStorageSourceBuilder_.dispose();
        resolvedStorageSourceBuilder_ = null;
      }
      resolvedRepoSource_ = null;
      if (resolvedRepoSourceBuilder_ != null) {
        resolvedRepoSourceBuilder_.dispose();
        resolvedRepoSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.functions.v2.Data
          .internal_static_google_events_cloud_functions_v2_SourceProvenance_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.functions.v2.SourceProvenance getDefaultInstanceForType() {
      return com.google.events.cloud.functions.v2.SourceProvenance.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.functions.v2.SourceProvenance build() {
      com.google.events.cloud.functions.v2.SourceProvenance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.functions.v2.SourceProvenance buildPartial() {
      com.google.events.cloud.functions.v2.SourceProvenance result =
          new com.google.events.cloud.functions.v2.SourceProvenance(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.functions.v2.SourceProvenance result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resolvedStorageSource_ =
            resolvedStorageSourceBuilder_ == null
                ? resolvedStorageSource_
                : resolvedStorageSourceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resolvedRepoSource_ =
            resolvedRepoSourceBuilder_ == null
                ? resolvedRepoSource_
                : resolvedRepoSourceBuilder_.build();
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
      if (other instanceof com.google.events.cloud.functions.v2.SourceProvenance) {
        return mergeFrom((com.google.events.cloud.functions.v2.SourceProvenance) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.functions.v2.SourceProvenance other) {
      if (other == com.google.events.cloud.functions.v2.SourceProvenance.getDefaultInstance())
        return this;
      if (other.hasResolvedStorageSource()) {
        mergeResolvedStorageSource(other.getResolvedStorageSource());
      }
      if (other.hasResolvedRepoSource()) {
        mergeResolvedRepoSource(other.getResolvedRepoSource());
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
                input.readMessage(
                    getResolvedStorageSourceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getResolvedRepoSourceFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.events.cloud.functions.v2.StorageSource resolvedStorageSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.functions.v2.StorageSource,
            com.google.events.cloud.functions.v2.StorageSource.Builder,
            com.google.events.cloud.functions.v2.StorageSourceOrBuilder>
        resolvedStorageSourceBuilder_;

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     *
     * @return Whether the resolvedStorageSource field is set.
     */
    public boolean hasResolvedStorageSource() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     *
     * @return The resolvedStorageSource.
     */
    public com.google.events.cloud.functions.v2.StorageSource getResolvedStorageSource() {
      if (resolvedStorageSourceBuilder_ == null) {
        return resolvedStorageSource_ == null
            ? com.google.events.cloud.functions.v2.StorageSource.getDefaultInstance()
            : resolvedStorageSource_;
      } else {
        return resolvedStorageSourceBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     */
    public Builder setResolvedStorageSource(
        com.google.events.cloud.functions.v2.StorageSource value) {
      if (resolvedStorageSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resolvedStorageSource_ = value;
      } else {
        resolvedStorageSourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     */
    public Builder setResolvedStorageSource(
        com.google.events.cloud.functions.v2.StorageSource.Builder builderForValue) {
      if (resolvedStorageSourceBuilder_ == null) {
        resolvedStorageSource_ = builderForValue.build();
      } else {
        resolvedStorageSourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     */
    public Builder mergeResolvedStorageSource(
        com.google.events.cloud.functions.v2.StorageSource value) {
      if (resolvedStorageSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && resolvedStorageSource_ != null
            && resolvedStorageSource_
                != com.google.events.cloud.functions.v2.StorageSource.getDefaultInstance()) {
          getResolvedStorageSourceBuilder().mergeFrom(value);
        } else {
          resolvedStorageSource_ = value;
        }
      } else {
        resolvedStorageSourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     */
    public Builder clearResolvedStorageSource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      resolvedStorageSource_ = null;
      if (resolvedStorageSourceBuilder_ != null) {
        resolvedStorageSourceBuilder_.dispose();
        resolvedStorageSourceBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     */
    public com.google.events.cloud.functions.v2.StorageSource.Builder
        getResolvedStorageSourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResolvedStorageSourceFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     */
    public com.google.events.cloud.functions.v2.StorageSourceOrBuilder
        getResolvedStorageSourceOrBuilder() {
      if (resolvedStorageSourceBuilder_ != null) {
        return resolvedStorageSourceBuilder_.getMessageOrBuilder();
      } else {
        return resolvedStorageSource_ == null
            ? com.google.events.cloud.functions.v2.StorageSource.getDefaultInstance()
            : resolvedStorageSource_;
      }
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.storage_source`, if exists, with any
     * generations resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.StorageSource resolved_storage_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.functions.v2.StorageSource,
            com.google.events.cloud.functions.v2.StorageSource.Builder,
            com.google.events.cloud.functions.v2.StorageSourceOrBuilder>
        getResolvedStorageSourceFieldBuilder() {
      if (resolvedStorageSourceBuilder_ == null) {
        resolvedStorageSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.functions.v2.StorageSource,
                com.google.events.cloud.functions.v2.StorageSource.Builder,
                com.google.events.cloud.functions.v2.StorageSourceOrBuilder>(
                getResolvedStorageSource(), getParentForChildren(), isClean());
        resolvedStorageSource_ = null;
      }
      return resolvedStorageSourceBuilder_;
    }

    private com.google.events.cloud.functions.v2.RepoSource resolvedRepoSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.functions.v2.RepoSource,
            com.google.events.cloud.functions.v2.RepoSource.Builder,
            com.google.events.cloud.functions.v2.RepoSourceOrBuilder>
        resolvedRepoSourceBuilder_;

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     *
     * @return Whether the resolvedRepoSource field is set.
     */
    public boolean hasResolvedRepoSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     *
     * @return The resolvedRepoSource.
     */
    public com.google.events.cloud.functions.v2.RepoSource getResolvedRepoSource() {
      if (resolvedRepoSourceBuilder_ == null) {
        return resolvedRepoSource_ == null
            ? com.google.events.cloud.functions.v2.RepoSource.getDefaultInstance()
            : resolvedRepoSource_;
      } else {
        return resolvedRepoSourceBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     */
    public Builder setResolvedRepoSource(com.google.events.cloud.functions.v2.RepoSource value) {
      if (resolvedRepoSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resolvedRepoSource_ = value;
      } else {
        resolvedRepoSourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     */
    public Builder setResolvedRepoSource(
        com.google.events.cloud.functions.v2.RepoSource.Builder builderForValue) {
      if (resolvedRepoSourceBuilder_ == null) {
        resolvedRepoSource_ = builderForValue.build();
      } else {
        resolvedRepoSourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     */
    public Builder mergeResolvedRepoSource(com.google.events.cloud.functions.v2.RepoSource value) {
      if (resolvedRepoSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && resolvedRepoSource_ != null
            && resolvedRepoSource_
                != com.google.events.cloud.functions.v2.RepoSource.getDefaultInstance()) {
          getResolvedRepoSourceBuilder().mergeFrom(value);
        } else {
          resolvedRepoSource_ = value;
        }
      } else {
        resolvedRepoSourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     */
    public Builder clearResolvedRepoSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resolvedRepoSource_ = null;
      if (resolvedRepoSourceBuilder_ != null) {
        resolvedRepoSourceBuilder_.dispose();
        resolvedRepoSourceBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     */
    public com.google.events.cloud.functions.v2.RepoSource.Builder getResolvedRepoSourceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResolvedRepoSourceFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     */
    public com.google.events.cloud.functions.v2.RepoSourceOrBuilder
        getResolvedRepoSourceOrBuilder() {
      if (resolvedRepoSourceBuilder_ != null) {
        return resolvedRepoSourceBuilder_.getMessageOrBuilder();
      } else {
        return resolvedRepoSource_ == null
            ? com.google.events.cloud.functions.v2.RepoSource.getDefaultInstance()
            : resolvedRepoSource_;
      }
    }

    /**
     *
     *
     * <pre>
     * A copy of the build's `source.repo_source`, if exists, with any
     * revisions resolved.
     * </pre>
     *
     * <code>.google.events.cloud.functions.v2.RepoSource resolved_repo_source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.functions.v2.RepoSource,
            com.google.events.cloud.functions.v2.RepoSource.Builder,
            com.google.events.cloud.functions.v2.RepoSourceOrBuilder>
        getResolvedRepoSourceFieldBuilder() {
      if (resolvedRepoSourceBuilder_ == null) {
        resolvedRepoSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.functions.v2.RepoSource,
                com.google.events.cloud.functions.v2.RepoSource.Builder,
                com.google.events.cloud.functions.v2.RepoSourceOrBuilder>(
                getResolvedRepoSource(), getParentForChildren(), isClean());
        resolvedRepoSource_ = null;
      }
      return resolvedRepoSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.functions.v2.SourceProvenance)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.functions.v2.SourceProvenance)
  private static final com.google.events.cloud.functions.v2.SourceProvenance DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.functions.v2.SourceProvenance();
  }

  public static com.google.events.cloud.functions.v2.SourceProvenance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceProvenance> PARSER =
      new com.google.protobuf.AbstractParser<SourceProvenance>() {
        @java.lang.Override
        public SourceProvenance parsePartialFrom(
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

  public static com.google.protobuf.Parser<SourceProvenance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceProvenance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.functions.v2.SourceProvenance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
