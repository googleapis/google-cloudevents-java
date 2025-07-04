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
// source: google/events/cloud/notebooks/v1/data.proto

package com.google.events.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Definition of a container image for starting a notebook instance with the
 * environment installed in a container.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.notebooks.v1.ContainerImage}
 */
public final class ContainerImage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.notebooks.v1.ContainerImage)
    ContainerImageOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ContainerImage.newBuilder() to construct.
  private ContainerImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContainerImage() {
    repository_ = "";
    tag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContainerImage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.notebooks.v1.Data
        .internal_static_google_events_cloud_notebooks_v1_ContainerImage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.notebooks.v1.Data
        .internal_static_google_events_cloud_notebooks_v1_ContainerImage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.notebooks.v1.ContainerImage.class,
            com.google.events.cloud.notebooks.v1.ContainerImage.Builder.class);
  }

  public static final int REPOSITORY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object repository_ = "";

  /**
   *
   *
   * <pre>
   * Required. The path to the container image repository. For example:
   * `gcr.io/{project_id}/{image_name}`
   * </pre>
   *
   * <code>string repository = 1;</code>
   *
   * @return The repository.
   */
  @java.lang.Override
  public java.lang.String getRepository() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      repository_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The path to the container image repository. For example:
   * `gcr.io/{project_id}/{image_name}`
   * </pre>
   *
   * <code>string repository = 1;</code>
   *
   * @return The bytes for repository.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRepositoryBytes() {
    java.lang.Object ref = repository_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      repository_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tag_ = "";

  /**
   *
   *
   * <pre>
   * The tag of the container image. If not specified, this defaults
   * to the latest tag.
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The tag.
   */
  @java.lang.Override
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The tag of the container image. If not specified, this defaults
   * to the latest tag.
   * </pre>
   *
   * <code>string tag = 2;</code>
   *
   * @return The bytes for tag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repository_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, repository_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tag_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(repository_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, repository_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tag_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tag_);
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
    if (!(obj instanceof com.google.events.cloud.notebooks.v1.ContainerImage)) {
      return super.equals(obj);
    }
    com.google.events.cloud.notebooks.v1.ContainerImage other =
        (com.google.events.cloud.notebooks.v1.ContainerImage) obj;

    if (!getRepository().equals(other.getRepository())) return false;
    if (!getTag().equals(other.getTag())) return false;
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
    hash = (37 * hash) + REPOSITORY_FIELD_NUMBER;
    hash = (53 * hash) + getRepository().hashCode();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.notebooks.v1.ContainerImage prototype) {
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
   * Definition of a container image for starting a notebook instance with the
   * environment installed in a container.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.notebooks.v1.ContainerImage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.notebooks.v1.ContainerImage)
      com.google.events.cloud.notebooks.v1.ContainerImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.notebooks.v1.Data
          .internal_static_google_events_cloud_notebooks_v1_ContainerImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.notebooks.v1.Data
          .internal_static_google_events_cloud_notebooks_v1_ContainerImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.notebooks.v1.ContainerImage.class,
              com.google.events.cloud.notebooks.v1.ContainerImage.Builder.class);
    }

    // Construct using com.google.events.cloud.notebooks.v1.ContainerImage.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      repository_ = "";
      tag_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.notebooks.v1.Data
          .internal_static_google_events_cloud_notebooks_v1_ContainerImage_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.notebooks.v1.ContainerImage getDefaultInstanceForType() {
      return com.google.events.cloud.notebooks.v1.ContainerImage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.notebooks.v1.ContainerImage build() {
      com.google.events.cloud.notebooks.v1.ContainerImage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.notebooks.v1.ContainerImage buildPartial() {
      com.google.events.cloud.notebooks.v1.ContainerImage result =
          new com.google.events.cloud.notebooks.v1.ContainerImage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.notebooks.v1.ContainerImage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.repository_ = repository_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tag_ = tag_;
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
      if (other instanceof com.google.events.cloud.notebooks.v1.ContainerImage) {
        return mergeFrom((com.google.events.cloud.notebooks.v1.ContainerImage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.notebooks.v1.ContainerImage other) {
      if (other == com.google.events.cloud.notebooks.v1.ContainerImage.getDefaultInstance())
        return this;
      if (!other.getRepository().isEmpty()) {
        repository_ = other.repository_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                repository_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                tag_ = input.readStringRequireUtf8();
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

    private java.lang.Object repository_ = "";

    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1;</code>
     *
     * @return The repository.
     */
    public java.lang.String getRepository() {
      java.lang.Object ref = repository_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        repository_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1;</code>
     *
     * @return The bytes for repository.
     */
    public com.google.protobuf.ByteString getRepositoryBytes() {
      java.lang.Object ref = repository_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        repository_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1;</code>
     *
     * @param value The repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepository(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      repository_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRepository() {
      repository_ = getDefaultInstance().getRepository();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The path to the container image repository. For example:
     * `gcr.io/{project_id}/{image_name}`
     * </pre>
     *
     * <code>string repository = 1;</code>
     *
     * @param value The bytes for repository to set.
     * @return This builder for chaining.
     */
    public Builder setRepositoryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      repository_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object tag_ = "";

    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return The tag.
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return The bytes for tag.
     */
    public com.google.protobuf.ByteString getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      tag_ = getDefaultInstance().getTag();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The tag of the container image. If not specified, this defaults
     * to the latest tag.
     * </pre>
     *
     * <code>string tag = 2;</code>
     *
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.notebooks.v1.ContainerImage)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.notebooks.v1.ContainerImage)
  private static final com.google.events.cloud.notebooks.v1.ContainerImage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.notebooks.v1.ContainerImage();
  }

  public static com.google.events.cloud.notebooks.v1.ContainerImage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContainerImage> PARSER =
      new com.google.protobuf.AbstractParser<ContainerImage>() {
        @java.lang.Override
        public ContainerImage parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContainerImage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContainerImage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.notebooks.v1.ContainerImage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
