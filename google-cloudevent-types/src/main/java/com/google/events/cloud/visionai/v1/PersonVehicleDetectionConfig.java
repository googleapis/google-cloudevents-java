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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Message describing PersonVehicleDetectionConfig.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.visionai.v1.PersonVehicleDetectionConfig}
 */
public final class PersonVehicleDetectionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.visionai.v1.PersonVehicleDetectionConfig)
    PersonVehicleDetectionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PersonVehicleDetectionConfig.newBuilder() to construct.
  private PersonVehicleDetectionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PersonVehicleDetectionConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PersonVehicleDetectionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_PersonVehicleDetectionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_PersonVehicleDetectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig.class,
            com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig.Builder.class);
  }

  public static final int ENABLE_PEOPLE_COUNTING_FIELD_NUMBER = 1;
  private boolean enablePeopleCounting_ = false;
  /**
   *
   *
   * <pre>
   * At least one of enable_people_counting and enable_vehicle_counting fields
   * must be set to true.
   * Whether to count the appearances of people, output counts have 'people' as
   * the key.
   * </pre>
   *
   * <code>bool enable_people_counting = 1;</code>
   *
   * @return The enablePeopleCounting.
   */
  @java.lang.Override
  public boolean getEnablePeopleCounting() {
    return enablePeopleCounting_;
  }

  public static final int ENABLE_VEHICLE_COUNTING_FIELD_NUMBER = 2;
  private boolean enableVehicleCounting_ = false;
  /**
   *
   *
   * <pre>
   * Whether to count the appearances of vehicles, output counts will have
   * 'vehicle' as the key.
   * </pre>
   *
   * <code>bool enable_vehicle_counting = 2;</code>
   *
   * @return The enableVehicleCounting.
   */
  @java.lang.Override
  public boolean getEnableVehicleCounting() {
    return enableVehicleCounting_;
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
    if (enablePeopleCounting_ != false) {
      output.writeBool(1, enablePeopleCounting_);
    }
    if (enableVehicleCounting_ != false) {
      output.writeBool(2, enableVehicleCounting_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enablePeopleCounting_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enablePeopleCounting_);
    }
    if (enableVehicleCounting_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, enableVehicleCounting_);
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
    if (!(obj instanceof com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig)) {
      return super.equals(obj);
    }
    com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig other =
        (com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig) obj;

    if (getEnablePeopleCounting() != other.getEnablePeopleCounting()) return false;
    if (getEnableVehicleCounting() != other.getEnableVehicleCounting()) return false;
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
    hash = (37 * hash) + ENABLE_PEOPLE_COUNTING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnablePeopleCounting());
    hash = (37 * hash) + ENABLE_VEHICLE_COUNTING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableVehicleCounting());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig parseFrom(
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
      com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig prototype) {
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
   * Message describing PersonVehicleDetectionConfig.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.visionai.v1.PersonVehicleDetectionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.visionai.v1.PersonVehicleDetectionConfig)
      com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_PersonVehicleDetectionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_PersonVehicleDetectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig.class,
              com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig.Builder.class);
    }

    // Construct using com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enablePeopleCounting_ = false;
      enableVehicleCounting_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_PersonVehicleDetectionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig
        getDefaultInstanceForType() {
      return com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig build() {
      com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig buildPartial() {
      com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig result =
          new com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enablePeopleCounting_ = enablePeopleCounting_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enableVehicleCounting_ = enableVehicleCounting_;
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
      if (other instanceof com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig) {
        return mergeFrom((com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig other) {
      if (other
          == com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig.getDefaultInstance())
        return this;
      if (other.getEnablePeopleCounting() != false) {
        setEnablePeopleCounting(other.getEnablePeopleCounting());
      }
      if (other.getEnableVehicleCounting() != false) {
        setEnableVehicleCounting(other.getEnableVehicleCounting());
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
                enablePeopleCounting_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                enableVehicleCounting_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private boolean enablePeopleCounting_;
    /**
     *
     *
     * <pre>
     * At least one of enable_people_counting and enable_vehicle_counting fields
     * must be set to true.
     * Whether to count the appearances of people, output counts have 'people' as
     * the key.
     * </pre>
     *
     * <code>bool enable_people_counting = 1;</code>
     *
     * @return The enablePeopleCounting.
     */
    @java.lang.Override
    public boolean getEnablePeopleCounting() {
      return enablePeopleCounting_;
    }
    /**
     *
     *
     * <pre>
     * At least one of enable_people_counting and enable_vehicle_counting fields
     * must be set to true.
     * Whether to count the appearances of people, output counts have 'people' as
     * the key.
     * </pre>
     *
     * <code>bool enable_people_counting = 1;</code>
     *
     * @param value The enablePeopleCounting to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePeopleCounting(boolean value) {

      enablePeopleCounting_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * At least one of enable_people_counting and enable_vehicle_counting fields
     * must be set to true.
     * Whether to count the appearances of people, output counts have 'people' as
     * the key.
     * </pre>
     *
     * <code>bool enable_people_counting = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnablePeopleCounting() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enablePeopleCounting_ = false;
      onChanged();
      return this;
    }

    private boolean enableVehicleCounting_;
    /**
     *
     *
     * <pre>
     * Whether to count the appearances of vehicles, output counts will have
     * 'vehicle' as the key.
     * </pre>
     *
     * <code>bool enable_vehicle_counting = 2;</code>
     *
     * @return The enableVehicleCounting.
     */
    @java.lang.Override
    public boolean getEnableVehicleCounting() {
      return enableVehicleCounting_;
    }
    /**
     *
     *
     * <pre>
     * Whether to count the appearances of vehicles, output counts will have
     * 'vehicle' as the key.
     * </pre>
     *
     * <code>bool enable_vehicle_counting = 2;</code>
     *
     * @param value The enableVehicleCounting to set.
     * @return This builder for chaining.
     */
    public Builder setEnableVehicleCounting(boolean value) {

      enableVehicleCounting_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to count the appearances of vehicles, output counts will have
     * 'vehicle' as the key.
     * </pre>
     *
     * <code>bool enable_vehicle_counting = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableVehicleCounting() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enableVehicleCounting_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.visionai.v1.PersonVehicleDetectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.visionai.v1.PersonVehicleDetectionConfig)
  private static final com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig();
  }

  public static com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonVehicleDetectionConfig> PARSER =
      new com.google.protobuf.AbstractParser<PersonVehicleDetectionConfig>() {
        @java.lang.Override
        public PersonVehicleDetectionConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<PersonVehicleDetectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonVehicleDetectionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}