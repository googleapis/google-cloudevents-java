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
// source: google/events/cloud/clouddms/v1/data.proto

package com.google.events.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * A message defining the database engine and provider.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.clouddms.v1.DatabaseType}
 */
public final class DatabaseType extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.clouddms.v1.DatabaseType)
    DatabaseTypeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DatabaseType.newBuilder() to construct.
  private DatabaseType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DatabaseType() {
    provider_ = 0;
    engine_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DatabaseType();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.clouddms.v1.Data
        .internal_static_google_events_cloud_clouddms_v1_DatabaseType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.clouddms.v1.Data
        .internal_static_google_events_cloud_clouddms_v1_DatabaseType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.clouddms.v1.DatabaseType.class,
            com.google.events.cloud.clouddms.v1.DatabaseType.Builder.class);
  }

  public static final int PROVIDER_FIELD_NUMBER = 1;
  private int provider_ = 0;
  /**
   *
   *
   * <pre>
   * The database provider.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
   *
   * @return The enum numeric value on the wire for provider.
   */
  @java.lang.Override
  public int getProviderValue() {
    return provider_;
  }
  /**
   *
   *
   * <pre>
   * The database provider.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
   *
   * @return The provider.
   */
  @java.lang.Override
  public com.google.events.cloud.clouddms.v1.DatabaseProvider getProvider() {
    com.google.events.cloud.clouddms.v1.DatabaseProvider result =
        com.google.events.cloud.clouddms.v1.DatabaseProvider.forNumber(provider_);
    return result == null
        ? com.google.events.cloud.clouddms.v1.DatabaseProvider.UNRECOGNIZED
        : result;
  }

  public static final int ENGINE_FIELD_NUMBER = 2;
  private int engine_ = 0;
  /**
   *
   *
   * <pre>
   * The database engine.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
   *
   * @return The enum numeric value on the wire for engine.
   */
  @java.lang.Override
  public int getEngineValue() {
    return engine_;
  }
  /**
   *
   *
   * <pre>
   * The database engine.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
   *
   * @return The engine.
   */
  @java.lang.Override
  public com.google.events.cloud.clouddms.v1.DatabaseEngine getEngine() {
    com.google.events.cloud.clouddms.v1.DatabaseEngine result =
        com.google.events.cloud.clouddms.v1.DatabaseEngine.forNumber(engine_);
    return result == null
        ? com.google.events.cloud.clouddms.v1.DatabaseEngine.UNRECOGNIZED
        : result;
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
    if (provider_
        != com.google.events.cloud.clouddms.v1.DatabaseProvider.DATABASE_PROVIDER_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, provider_);
    }
    if (engine_
        != com.google.events.cloud.clouddms.v1.DatabaseEngine.DATABASE_ENGINE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, engine_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (provider_
        != com.google.events.cloud.clouddms.v1.DatabaseProvider.DATABASE_PROVIDER_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, provider_);
    }
    if (engine_
        != com.google.events.cloud.clouddms.v1.DatabaseEngine.DATABASE_ENGINE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, engine_);
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
    if (!(obj instanceof com.google.events.cloud.clouddms.v1.DatabaseType)) {
      return super.equals(obj);
    }
    com.google.events.cloud.clouddms.v1.DatabaseType other =
        (com.google.events.cloud.clouddms.v1.DatabaseType) obj;

    if (provider_ != other.provider_) return false;
    if (engine_ != other.engine_) return false;
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
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + provider_;
    hash = (37 * hash) + ENGINE_FIELD_NUMBER;
    hash = (53 * hash) + engine_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.clouddms.v1.DatabaseType prototype) {
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
   * A message defining the database engine and provider.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.clouddms.v1.DatabaseType}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.clouddms.v1.DatabaseType)
      com.google.events.cloud.clouddms.v1.DatabaseTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.clouddms.v1.Data
          .internal_static_google_events_cloud_clouddms_v1_DatabaseType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.clouddms.v1.Data
          .internal_static_google_events_cloud_clouddms_v1_DatabaseType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.clouddms.v1.DatabaseType.class,
              com.google.events.cloud.clouddms.v1.DatabaseType.Builder.class);
    }

    // Construct using com.google.events.cloud.clouddms.v1.DatabaseType.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      provider_ = 0;
      engine_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.clouddms.v1.Data
          .internal_static_google_events_cloud_clouddms_v1_DatabaseType_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.clouddms.v1.DatabaseType getDefaultInstanceForType() {
      return com.google.events.cloud.clouddms.v1.DatabaseType.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.clouddms.v1.DatabaseType build() {
      com.google.events.cloud.clouddms.v1.DatabaseType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.clouddms.v1.DatabaseType buildPartial() {
      com.google.events.cloud.clouddms.v1.DatabaseType result =
          new com.google.events.cloud.clouddms.v1.DatabaseType(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.clouddms.v1.DatabaseType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.provider_ = provider_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.engine_ = engine_;
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
      if (other instanceof com.google.events.cloud.clouddms.v1.DatabaseType) {
        return mergeFrom((com.google.events.cloud.clouddms.v1.DatabaseType) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.clouddms.v1.DatabaseType other) {
      if (other == com.google.events.cloud.clouddms.v1.DatabaseType.getDefaultInstance())
        return this;
      if (other.provider_ != 0) {
        setProviderValue(other.getProviderValue());
      }
      if (other.engine_ != 0) {
        setEngineValue(other.getEngineValue());
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
                provider_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                engine_ = input.readEnum();
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

    private int provider_ = 0;
    /**
     *
     *
     * <pre>
     * The database provider.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
     *
     * @return The enum numeric value on the wire for provider.
     */
    @java.lang.Override
    public int getProviderValue() {
      return provider_;
    }
    /**
     *
     *
     * <pre>
     * The database provider.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
     *
     * @param value The enum numeric value on the wire for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderValue(int value) {
      provider_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The database provider.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
     *
     * @return The provider.
     */
    @java.lang.Override
    public com.google.events.cloud.clouddms.v1.DatabaseProvider getProvider() {
      com.google.events.cloud.clouddms.v1.DatabaseProvider result =
          com.google.events.cloud.clouddms.v1.DatabaseProvider.forNumber(provider_);
      return result == null
          ? com.google.events.cloud.clouddms.v1.DatabaseProvider.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The database provider.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
     *
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(com.google.events.cloud.clouddms.v1.DatabaseProvider value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      provider_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The database provider.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProvider() {
      bitField0_ = (bitField0_ & ~0x00000001);
      provider_ = 0;
      onChanged();
      return this;
    }

    private int engine_ = 0;
    /**
     *
     *
     * <pre>
     * The database engine.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
     *
     * @return The enum numeric value on the wire for engine.
     */
    @java.lang.Override
    public int getEngineValue() {
      return engine_;
    }
    /**
     *
     *
     * <pre>
     * The database engine.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
     *
     * @param value The enum numeric value on the wire for engine to set.
     * @return This builder for chaining.
     */
    public Builder setEngineValue(int value) {
      engine_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The database engine.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
     *
     * @return The engine.
     */
    @java.lang.Override
    public com.google.events.cloud.clouddms.v1.DatabaseEngine getEngine() {
      com.google.events.cloud.clouddms.v1.DatabaseEngine result =
          com.google.events.cloud.clouddms.v1.DatabaseEngine.forNumber(engine_);
      return result == null
          ? com.google.events.cloud.clouddms.v1.DatabaseEngine.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The database engine.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
     *
     * @param value The engine to set.
     * @return This builder for chaining.
     */
    public Builder setEngine(com.google.events.cloud.clouddms.v1.DatabaseEngine value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      engine_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The database engine.
     * </pre>
     *
     * <code>.google.events.cloud.clouddms.v1.DatabaseEngine engine = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEngine() {
      bitField0_ = (bitField0_ & ~0x00000002);
      engine_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.clouddms.v1.DatabaseType)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.clouddms.v1.DatabaseType)
  private static final com.google.events.cloud.clouddms.v1.DatabaseType DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.clouddms.v1.DatabaseType();
  }

  public static com.google.events.cloud.clouddms.v1.DatabaseType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatabaseType> PARSER =
      new com.google.protobuf.AbstractParser<DatabaseType>() {
        @java.lang.Override
        public DatabaseType parsePartialFrom(
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

  public static com.google.protobuf.Parser<DatabaseType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatabaseType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.clouddms.v1.DatabaseType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}