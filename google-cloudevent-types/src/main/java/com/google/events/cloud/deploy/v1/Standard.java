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
// source: google/events/cloud/deploy/v1/data.proto

package com.google.events.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Standard represents the standard deployment strategy.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.deploy.v1.Standard}
 */
public final class Standard extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.deploy.v1.Standard)
    StandardOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Standard.newBuilder() to construct.
  private Standard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Standard() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Standard();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_Standard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_Standard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.deploy.v1.Standard.class,
            com.google.events.cloud.deploy.v1.Standard.Builder.class);
  }

  public static final int VERIFY_FIELD_NUMBER = 1;
  private boolean verify_ = false;

  /**
   *
   *
   * <pre>
   * Whether to verify a deployment.
   * </pre>
   *
   * <code>bool verify = 1;</code>
   *
   * @return The verify.
   */
  @java.lang.Override
  public boolean getVerify() {
    return verify_;
  }

  public static final int PREDEPLOY_FIELD_NUMBER = 2;
  private com.google.events.cloud.deploy.v1.Predeploy predeploy_;

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job. If this is not configured,
   * predeploy job will not be present.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
   *
   * @return Whether the predeploy field is set.
   */
  @java.lang.Override
  public boolean hasPredeploy() {
    return predeploy_ != null;
  }

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job. If this is not configured,
   * predeploy job will not be present.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
   *
   * @return The predeploy.
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.Predeploy getPredeploy() {
    return predeploy_ == null
        ? com.google.events.cloud.deploy.v1.Predeploy.getDefaultInstance()
        : predeploy_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job. If this is not configured,
   * predeploy job will not be present.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.PredeployOrBuilder getPredeployOrBuilder() {
    return predeploy_ == null
        ? com.google.events.cloud.deploy.v1.Predeploy.getDefaultInstance()
        : predeploy_;
  }

  public static final int POSTDEPLOY_FIELD_NUMBER = 3;
  private com.google.events.cloud.deploy.v1.Postdeploy postdeploy_;

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job. If this is not configured,
   * postdeploy job will not be present.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
   *
   * @return Whether the postdeploy field is set.
   */
  @java.lang.Override
  public boolean hasPostdeploy() {
    return postdeploy_ != null;
  }

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job. If this is not configured,
   * postdeploy job will not be present.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
   *
   * @return The postdeploy.
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.Postdeploy getPostdeploy() {
    return postdeploy_ == null
        ? com.google.events.cloud.deploy.v1.Postdeploy.getDefaultInstance()
        : postdeploy_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job. If this is not configured,
   * postdeploy job will not be present.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.PostdeployOrBuilder getPostdeployOrBuilder() {
    return postdeploy_ == null
        ? com.google.events.cloud.deploy.v1.Postdeploy.getDefaultInstance()
        : postdeploy_;
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
    if (verify_ != false) {
      output.writeBool(1, verify_);
    }
    if (predeploy_ != null) {
      output.writeMessage(2, getPredeploy());
    }
    if (postdeploy_ != null) {
      output.writeMessage(3, getPostdeploy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (verify_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, verify_);
    }
    if (predeploy_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPredeploy());
    }
    if (postdeploy_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPostdeploy());
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
    if (!(obj instanceof com.google.events.cloud.deploy.v1.Standard)) {
      return super.equals(obj);
    }
    com.google.events.cloud.deploy.v1.Standard other =
        (com.google.events.cloud.deploy.v1.Standard) obj;

    if (getVerify() != other.getVerify()) return false;
    if (hasPredeploy() != other.hasPredeploy()) return false;
    if (hasPredeploy()) {
      if (!getPredeploy().equals(other.getPredeploy())) return false;
    }
    if (hasPostdeploy() != other.hasPostdeploy()) return false;
    if (hasPostdeploy()) {
      if (!getPostdeploy().equals(other.getPostdeploy())) return false;
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
    hash = (37 * hash) + VERIFY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getVerify());
    if (hasPredeploy()) {
      hash = (37 * hash) + PREDEPLOY_FIELD_NUMBER;
      hash = (53 * hash) + getPredeploy().hashCode();
    }
    if (hasPostdeploy()) {
      hash = (37 * hash) + POSTDEPLOY_FIELD_NUMBER;
      hash = (53 * hash) + getPostdeploy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.Standard parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.deploy.v1.Standard prototype) {
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
   * Standard represents the standard deployment strategy.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.deploy.v1.Standard}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.deploy.v1.Standard)
      com.google.events.cloud.deploy.v1.StandardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_Standard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_Standard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.deploy.v1.Standard.class,
              com.google.events.cloud.deploy.v1.Standard.Builder.class);
    }

    // Construct using com.google.events.cloud.deploy.v1.Standard.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      verify_ = false;
      predeploy_ = null;
      if (predeployBuilder_ != null) {
        predeployBuilder_.dispose();
        predeployBuilder_ = null;
      }
      postdeploy_ = null;
      if (postdeployBuilder_ != null) {
        postdeployBuilder_.dispose();
        postdeployBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_Standard_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.Standard getDefaultInstanceForType() {
      return com.google.events.cloud.deploy.v1.Standard.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.Standard build() {
      com.google.events.cloud.deploy.v1.Standard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.Standard buildPartial() {
      com.google.events.cloud.deploy.v1.Standard result =
          new com.google.events.cloud.deploy.v1.Standard(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.deploy.v1.Standard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.verify_ = verify_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.predeploy_ = predeployBuilder_ == null ? predeploy_ : predeployBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.postdeploy_ = postdeployBuilder_ == null ? postdeploy_ : postdeployBuilder_.build();
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
      if (other instanceof com.google.events.cloud.deploy.v1.Standard) {
        return mergeFrom((com.google.events.cloud.deploy.v1.Standard) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.deploy.v1.Standard other) {
      if (other == com.google.events.cloud.deploy.v1.Standard.getDefaultInstance()) return this;
      if (other.getVerify() != false) {
        setVerify(other.getVerify());
      }
      if (other.hasPredeploy()) {
        mergePredeploy(other.getPredeploy());
      }
      if (other.hasPostdeploy()) {
        mergePostdeploy(other.getPostdeploy());
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
            case 8:
              {
                verify_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getPredeployFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getPostdeployFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private boolean verify_;

    /**
     *
     *
     * <pre>
     * Whether to verify a deployment.
     * </pre>
     *
     * <code>bool verify = 1;</code>
     *
     * @return The verify.
     */
    @java.lang.Override
    public boolean getVerify() {
      return verify_;
    }

    /**
     *
     *
     * <pre>
     * Whether to verify a deployment.
     * </pre>
     *
     * <code>bool verify = 1;</code>
     *
     * @param value The verify to set.
     * @return This builder for chaining.
     */
    public Builder setVerify(boolean value) {

      verify_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether to verify a deployment.
     * </pre>
     *
     * <code>bool verify = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVerify() {
      bitField0_ = (bitField0_ & ~0x00000001);
      verify_ = false;
      onChanged();
      return this;
    }

    private com.google.events.cloud.deploy.v1.Predeploy predeploy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.Predeploy,
            com.google.events.cloud.deploy.v1.Predeploy.Builder,
            com.google.events.cloud.deploy.v1.PredeployOrBuilder>
        predeployBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     *
     * @return Whether the predeploy field is set.
     */
    public boolean hasPredeploy() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     *
     * @return The predeploy.
     */
    public com.google.events.cloud.deploy.v1.Predeploy getPredeploy() {
      if (predeployBuilder_ == null) {
        return predeploy_ == null
            ? com.google.events.cloud.deploy.v1.Predeploy.getDefaultInstance()
            : predeploy_;
      } else {
        return predeployBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     */
    public Builder setPredeploy(com.google.events.cloud.deploy.v1.Predeploy value) {
      if (predeployBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        predeploy_ = value;
      } else {
        predeployBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     */
    public Builder setPredeploy(
        com.google.events.cloud.deploy.v1.Predeploy.Builder builderForValue) {
      if (predeployBuilder_ == null) {
        predeploy_ = builderForValue.build();
      } else {
        predeployBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     */
    public Builder mergePredeploy(com.google.events.cloud.deploy.v1.Predeploy value) {
      if (predeployBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && predeploy_ != null
            && predeploy_ != com.google.events.cloud.deploy.v1.Predeploy.getDefaultInstance()) {
          getPredeployBuilder().mergeFrom(value);
        } else {
          predeploy_ = value;
        }
      } else {
        predeployBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     */
    public Builder clearPredeploy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      predeploy_ = null;
      if (predeployBuilder_ != null) {
        predeployBuilder_.dispose();
        predeployBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     */
    public com.google.events.cloud.deploy.v1.Predeploy.Builder getPredeployBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPredeployFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     */
    public com.google.events.cloud.deploy.v1.PredeployOrBuilder getPredeployOrBuilder() {
      if (predeployBuilder_ != null) {
        return predeployBuilder_.getMessageOrBuilder();
      } else {
        return predeploy_ == null
            ? com.google.events.cloud.deploy.v1.Predeploy.getDefaultInstance()
            : predeploy_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the predeploy job. If this is not configured,
     * predeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Predeploy predeploy = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.Predeploy,
            com.google.events.cloud.deploy.v1.Predeploy.Builder,
            com.google.events.cloud.deploy.v1.PredeployOrBuilder>
        getPredeployFieldBuilder() {
      if (predeployBuilder_ == null) {
        predeployBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.deploy.v1.Predeploy,
                com.google.events.cloud.deploy.v1.Predeploy.Builder,
                com.google.events.cloud.deploy.v1.PredeployOrBuilder>(
                getPredeploy(), getParentForChildren(), isClean());
        predeploy_ = null;
      }
      return predeployBuilder_;
    }

    private com.google.events.cloud.deploy.v1.Postdeploy postdeploy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.Postdeploy,
            com.google.events.cloud.deploy.v1.Postdeploy.Builder,
            com.google.events.cloud.deploy.v1.PostdeployOrBuilder>
        postdeployBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     *
     * @return Whether the postdeploy field is set.
     */
    public boolean hasPostdeploy() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     *
     * @return The postdeploy.
     */
    public com.google.events.cloud.deploy.v1.Postdeploy getPostdeploy() {
      if (postdeployBuilder_ == null) {
        return postdeploy_ == null
            ? com.google.events.cloud.deploy.v1.Postdeploy.getDefaultInstance()
            : postdeploy_;
      } else {
        return postdeployBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     */
    public Builder setPostdeploy(com.google.events.cloud.deploy.v1.Postdeploy value) {
      if (postdeployBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        postdeploy_ = value;
      } else {
        postdeployBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     */
    public Builder setPostdeploy(
        com.google.events.cloud.deploy.v1.Postdeploy.Builder builderForValue) {
      if (postdeployBuilder_ == null) {
        postdeploy_ = builderForValue.build();
      } else {
        postdeployBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     */
    public Builder mergePostdeploy(com.google.events.cloud.deploy.v1.Postdeploy value) {
      if (postdeployBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && postdeploy_ != null
            && postdeploy_ != com.google.events.cloud.deploy.v1.Postdeploy.getDefaultInstance()) {
          getPostdeployBuilder().mergeFrom(value);
        } else {
          postdeploy_ = value;
        }
      } else {
        postdeployBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     */
    public Builder clearPostdeploy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      postdeploy_ = null;
      if (postdeployBuilder_ != null) {
        postdeployBuilder_.dispose();
        postdeployBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     */
    public com.google.events.cloud.deploy.v1.Postdeploy.Builder getPostdeployBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPostdeployFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     */
    public com.google.events.cloud.deploy.v1.PostdeployOrBuilder getPostdeployOrBuilder() {
      if (postdeployBuilder_ != null) {
        return postdeployBuilder_.getMessageOrBuilder();
      } else {
        return postdeploy_ == null
            ? com.google.events.cloud.deploy.v1.Postdeploy.getDefaultInstance()
            : postdeploy_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Configuration for the postdeploy job. If this is not configured,
     * postdeploy job will not be present.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Postdeploy postdeploy = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.Postdeploy,
            com.google.events.cloud.deploy.v1.Postdeploy.Builder,
            com.google.events.cloud.deploy.v1.PostdeployOrBuilder>
        getPostdeployFieldBuilder() {
      if (postdeployBuilder_ == null) {
        postdeployBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.deploy.v1.Postdeploy,
                com.google.events.cloud.deploy.v1.Postdeploy.Builder,
                com.google.events.cloud.deploy.v1.PostdeployOrBuilder>(
                getPostdeploy(), getParentForChildren(), isClean());
        postdeploy_ = null;
      }
      return postdeployBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.deploy.v1.Standard)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.deploy.v1.Standard)
  private static final com.google.events.cloud.deploy.v1.Standard DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.deploy.v1.Standard();
  }

  public static com.google.events.cloud.deploy.v1.Standard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Standard> PARSER =
      new com.google.protobuf.AbstractParser<Standard>() {
        @java.lang.Override
        public Standard parsePartialFrom(
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

  public static com.google.protobuf.Parser<Standard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Standard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.deploy.v1.Standard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
