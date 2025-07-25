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
// source: google/events/cloud/datastream/v1/data.proto

package com.google.events.cloud.datastream.v1;

/**
 *
 *
 * <pre>
 * Oracle database structure.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.datastream.v1.OracleRdbms}
 */
public final class OracleRdbms extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.datastream.v1.OracleRdbms)
    OracleRdbmsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use OracleRdbms.newBuilder() to construct.
  private OracleRdbms(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OracleRdbms() {
    oracleSchemas_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OracleRdbms();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_OracleRdbms_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_OracleRdbms_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.datastream.v1.OracleRdbms.class,
            com.google.events.cloud.datastream.v1.OracleRdbms.Builder.class);
  }

  public static final int ORACLE_SCHEMAS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.events.cloud.datastream.v1.OracleSchema> oracleSchemas_;

  /**
   *
   *
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.events.cloud.datastream.v1.OracleSchema> getOracleSchemasList() {
    return oracleSchemas_;
  }

  /**
   *
   *
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.events.cloud.datastream.v1.OracleSchemaOrBuilder>
      getOracleSchemasOrBuilderList() {
    return oracleSchemas_;
  }

  /**
   *
   *
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
   */
  @java.lang.Override
  public int getOracleSchemasCount() {
    return oracleSchemas_.size();
  }

  /**
   *
   *
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.datastream.v1.OracleSchema getOracleSchemas(int index) {
    return oracleSchemas_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Oracle schemas/databases in the database server.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.datastream.v1.OracleSchemaOrBuilder getOracleSchemasOrBuilder(
      int index) {
    return oracleSchemas_.get(index);
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
    for (int i = 0; i < oracleSchemas_.size(); i++) {
      output.writeMessage(1, oracleSchemas_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < oracleSchemas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, oracleSchemas_.get(i));
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
    if (!(obj instanceof com.google.events.cloud.datastream.v1.OracleRdbms)) {
      return super.equals(obj);
    }
    com.google.events.cloud.datastream.v1.OracleRdbms other =
        (com.google.events.cloud.datastream.v1.OracleRdbms) obj;

    if (!getOracleSchemasList().equals(other.getOracleSchemasList())) return false;
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
    if (getOracleSchemasCount() > 0) {
      hash = (37 * hash) + ORACLE_SCHEMAS_FIELD_NUMBER;
      hash = (53 * hash) + getOracleSchemasList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.datastream.v1.OracleRdbms prototype) {
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
   * Oracle database structure.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.datastream.v1.OracleRdbms}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.datastream.v1.OracleRdbms)
      com.google.events.cloud.datastream.v1.OracleRdbmsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_OracleRdbms_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_OracleRdbms_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.datastream.v1.OracleRdbms.class,
              com.google.events.cloud.datastream.v1.OracleRdbms.Builder.class);
    }

    // Construct using com.google.events.cloud.datastream.v1.OracleRdbms.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (oracleSchemasBuilder_ == null) {
        oracleSchemas_ = java.util.Collections.emptyList();
      } else {
        oracleSchemas_ = null;
        oracleSchemasBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_OracleRdbms_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.OracleRdbms getDefaultInstanceForType() {
      return com.google.events.cloud.datastream.v1.OracleRdbms.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.OracleRdbms build() {
      com.google.events.cloud.datastream.v1.OracleRdbms result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.OracleRdbms buildPartial() {
      com.google.events.cloud.datastream.v1.OracleRdbms result =
          new com.google.events.cloud.datastream.v1.OracleRdbms(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.events.cloud.datastream.v1.OracleRdbms result) {
      if (oracleSchemasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          oracleSchemas_ = java.util.Collections.unmodifiableList(oracleSchemas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.oracleSchemas_ = oracleSchemas_;
      } else {
        result.oracleSchemas_ = oracleSchemasBuilder_.build();
      }
    }

    private void buildPartial0(com.google.events.cloud.datastream.v1.OracleRdbms result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.events.cloud.datastream.v1.OracleRdbms) {
        return mergeFrom((com.google.events.cloud.datastream.v1.OracleRdbms) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.datastream.v1.OracleRdbms other) {
      if (other == com.google.events.cloud.datastream.v1.OracleRdbms.getDefaultInstance())
        return this;
      if (oracleSchemasBuilder_ == null) {
        if (!other.oracleSchemas_.isEmpty()) {
          if (oracleSchemas_.isEmpty()) {
            oracleSchemas_ = other.oracleSchemas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOracleSchemasIsMutable();
            oracleSchemas_.addAll(other.oracleSchemas_);
          }
          onChanged();
        }
      } else {
        if (!other.oracleSchemas_.isEmpty()) {
          if (oracleSchemasBuilder_.isEmpty()) {
            oracleSchemasBuilder_.dispose();
            oracleSchemasBuilder_ = null;
            oracleSchemas_ = other.oracleSchemas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            oracleSchemasBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOracleSchemasFieldBuilder()
                    : null;
          } else {
            oracleSchemasBuilder_.addAllMessages(other.oracleSchemas_);
          }
        }
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
                com.google.events.cloud.datastream.v1.OracleSchema m =
                    input.readMessage(
                        com.google.events.cloud.datastream.v1.OracleSchema.parser(),
                        extensionRegistry);
                if (oracleSchemasBuilder_ == null) {
                  ensureOracleSchemasIsMutable();
                  oracleSchemas_.add(m);
                } else {
                  oracleSchemasBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.events.cloud.datastream.v1.OracleSchema> oracleSchemas_ =
        java.util.Collections.emptyList();

    private void ensureOracleSchemasIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        oracleSchemas_ =
            new java.util.ArrayList<com.google.events.cloud.datastream.v1.OracleSchema>(
                oracleSchemas_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.events.cloud.datastream.v1.OracleSchema,
            com.google.events.cloud.datastream.v1.OracleSchema.Builder,
            com.google.events.cloud.datastream.v1.OracleSchemaOrBuilder>
        oracleSchemasBuilder_;

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public java.util.List<com.google.events.cloud.datastream.v1.OracleSchema>
        getOracleSchemasList() {
      if (oracleSchemasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(oracleSchemas_);
      } else {
        return oracleSchemasBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public int getOracleSchemasCount() {
      if (oracleSchemasBuilder_ == null) {
        return oracleSchemas_.size();
      } else {
        return oracleSchemasBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleSchema getOracleSchemas(int index) {
      if (oracleSchemasBuilder_ == null) {
        return oracleSchemas_.get(index);
      } else {
        return oracleSchemasBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder setOracleSchemas(
        int index, com.google.events.cloud.datastream.v1.OracleSchema value) {
      if (oracleSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleSchemasIsMutable();
        oracleSchemas_.set(index, value);
        onChanged();
      } else {
        oracleSchemasBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder setOracleSchemas(
        int index, com.google.events.cloud.datastream.v1.OracleSchema.Builder builderForValue) {
      if (oracleSchemasBuilder_ == null) {
        ensureOracleSchemasIsMutable();
        oracleSchemas_.set(index, builderForValue.build());
        onChanged();
      } else {
        oracleSchemasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder addOracleSchemas(com.google.events.cloud.datastream.v1.OracleSchema value) {
      if (oracleSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleSchemasIsMutable();
        oracleSchemas_.add(value);
        onChanged();
      } else {
        oracleSchemasBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder addOracleSchemas(
        int index, com.google.events.cloud.datastream.v1.OracleSchema value) {
      if (oracleSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleSchemasIsMutable();
        oracleSchemas_.add(index, value);
        onChanged();
      } else {
        oracleSchemasBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder addOracleSchemas(
        com.google.events.cloud.datastream.v1.OracleSchema.Builder builderForValue) {
      if (oracleSchemasBuilder_ == null) {
        ensureOracleSchemasIsMutable();
        oracleSchemas_.add(builderForValue.build());
        onChanged();
      } else {
        oracleSchemasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder addOracleSchemas(
        int index, com.google.events.cloud.datastream.v1.OracleSchema.Builder builderForValue) {
      if (oracleSchemasBuilder_ == null) {
        ensureOracleSchemasIsMutable();
        oracleSchemas_.add(index, builderForValue.build());
        onChanged();
      } else {
        oracleSchemasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder addAllOracleSchemas(
        java.lang.Iterable<? extends com.google.events.cloud.datastream.v1.OracleSchema> values) {
      if (oracleSchemasBuilder_ == null) {
        ensureOracleSchemasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, oracleSchemas_);
        onChanged();
      } else {
        oracleSchemasBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder clearOracleSchemas() {
      if (oracleSchemasBuilder_ == null) {
        oracleSchemas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        oracleSchemasBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public Builder removeOracleSchemas(int index) {
      if (oracleSchemasBuilder_ == null) {
        ensureOracleSchemasIsMutable();
        oracleSchemas_.remove(index);
        onChanged();
      } else {
        oracleSchemasBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleSchema.Builder getOracleSchemasBuilder(
        int index) {
      return getOracleSchemasFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleSchemaOrBuilder getOracleSchemasOrBuilder(
        int index) {
      if (oracleSchemasBuilder_ == null) {
        return oracleSchemas_.get(index);
      } else {
        return oracleSchemasBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public java.util.List<? extends com.google.events.cloud.datastream.v1.OracleSchemaOrBuilder>
        getOracleSchemasOrBuilderList() {
      if (oracleSchemasBuilder_ != null) {
        return oracleSchemasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(oracleSchemas_);
      }
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleSchema.Builder addOracleSchemasBuilder() {
      return getOracleSchemasFieldBuilder()
          .addBuilder(com.google.events.cloud.datastream.v1.OracleSchema.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleSchema.Builder addOracleSchemasBuilder(
        int index) {
      return getOracleSchemasFieldBuilder()
          .addBuilder(
              index, com.google.events.cloud.datastream.v1.OracleSchema.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Oracle schemas/databases in the database server.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleSchema oracle_schemas = 1;</code>
     */
    public java.util.List<com.google.events.cloud.datastream.v1.OracleSchema.Builder>
        getOracleSchemasBuilderList() {
      return getOracleSchemasFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.events.cloud.datastream.v1.OracleSchema,
            com.google.events.cloud.datastream.v1.OracleSchema.Builder,
            com.google.events.cloud.datastream.v1.OracleSchemaOrBuilder>
        getOracleSchemasFieldBuilder() {
      if (oracleSchemasBuilder_ == null) {
        oracleSchemasBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.events.cloud.datastream.v1.OracleSchema,
                com.google.events.cloud.datastream.v1.OracleSchema.Builder,
                com.google.events.cloud.datastream.v1.OracleSchemaOrBuilder>(
                oracleSchemas_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        oracleSchemas_ = null;
      }
      return oracleSchemasBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.datastream.v1.OracleRdbms)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.datastream.v1.OracleRdbms)
  private static final com.google.events.cloud.datastream.v1.OracleRdbms DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.datastream.v1.OracleRdbms();
  }

  public static com.google.events.cloud.datastream.v1.OracleRdbms getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleRdbms> PARSER =
      new com.google.protobuf.AbstractParser<OracleRdbms>() {
        @java.lang.Override
        public OracleRdbms parsePartialFrom(
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

  public static com.google.protobuf.Parser<OracleRdbms> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleRdbms> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.datastream.v1.OracleRdbms getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
