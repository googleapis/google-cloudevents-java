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
 * MySQL Column.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.datastream.v1.MysqlColumn}
 */
public final class MysqlColumn extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.datastream.v1.MysqlColumn)
    MysqlColumnOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MysqlColumn.newBuilder() to construct.
  private MysqlColumn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MysqlColumn() {
    column_ = "";
    dataType_ = "";
    collation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MysqlColumn();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_MysqlColumn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_MysqlColumn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.datastream.v1.MysqlColumn.class,
            com.google.events.cloud.datastream.v1.MysqlColumn.Builder.class);
  }

  public static final int COLUMN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object column_ = "";

  /**
   *
   *
   * <pre>
   * Column name.
   * </pre>
   *
   * <code>string column = 1;</code>
   *
   * @return The column.
   */
  @java.lang.Override
  public java.lang.String getColumn() {
    java.lang.Object ref = column_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      column_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Column name.
   * </pre>
   *
   * <code>string column = 1;</code>
   *
   * @return The bytes for column.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getColumnBytes() {
    java.lang.Object ref = column_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      column_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_TYPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object dataType_ = "";

  /**
   *
   *
   * <pre>
   * The MySQL data type. Full data types list can be found here:
   * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The dataType.
   */
  @java.lang.Override
  public java.lang.String getDataType() {
    java.lang.Object ref = dataType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The MySQL data type. Full data types list can be found here:
   * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The bytes for dataType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDataTypeBytes() {
    java.lang.Object ref = dataType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dataType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LENGTH_FIELD_NUMBER = 3;
  private int length_ = 0;

  /**
   *
   *
   * <pre>
   * Column length.
   * </pre>
   *
   * <code>int32 length = 3;</code>
   *
   * @return The length.
   */
  @java.lang.Override
  public int getLength() {
    return length_;
  }

  public static final int COLLATION_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object collation_ = "";

  /**
   *
   *
   * <pre>
   * Column collation.
   * </pre>
   *
   * <code>string collation = 4;</code>
   *
   * @return The collation.
   */
  @java.lang.Override
  public java.lang.String getCollation() {
    java.lang.Object ref = collation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collation_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Column collation.
   * </pre>
   *
   * <code>string collation = 4;</code>
   *
   * @return The bytes for collation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCollationBytes() {
    java.lang.Object ref = collation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      collation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIMARY_KEY_FIELD_NUMBER = 5;
  private boolean primaryKey_ = false;

  /**
   *
   *
   * <pre>
   * Whether or not the column represents a primary key.
   * </pre>
   *
   * <code>bool primary_key = 5;</code>
   *
   * @return The primaryKey.
   */
  @java.lang.Override
  public boolean getPrimaryKey() {
    return primaryKey_;
  }

  public static final int NULLABLE_FIELD_NUMBER = 6;
  private boolean nullable_ = false;

  /**
   *
   *
   * <pre>
   * Whether or not the column can accept a null value.
   * </pre>
   *
   * <code>bool nullable = 6;</code>
   *
   * @return The nullable.
   */
  @java.lang.Override
  public boolean getNullable() {
    return nullable_;
  }

  public static final int ORDINAL_POSITION_FIELD_NUMBER = 7;
  private int ordinalPosition_ = 0;

  /**
   *
   *
   * <pre>
   * The ordinal position of the column in the table.
   * </pre>
   *
   * <code>int32 ordinal_position = 7;</code>
   *
   * @return The ordinalPosition.
   */
  @java.lang.Override
  public int getOrdinalPosition() {
    return ordinalPosition_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(column_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, column_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dataType_);
    }
    if (length_ != 0) {
      output.writeInt32(3, length_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, collation_);
    }
    if (primaryKey_ != false) {
      output.writeBool(5, primaryKey_);
    }
    if (nullable_ != false) {
      output.writeBool(6, nullable_);
    }
    if (ordinalPosition_ != 0) {
      output.writeInt32(7, ordinalPosition_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(column_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, column_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dataType_);
    }
    if (length_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, length_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, collation_);
    }
    if (primaryKey_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, primaryKey_);
    }
    if (nullable_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, nullable_);
    }
    if (ordinalPosition_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(7, ordinalPosition_);
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
    if (!(obj instanceof com.google.events.cloud.datastream.v1.MysqlColumn)) {
      return super.equals(obj);
    }
    com.google.events.cloud.datastream.v1.MysqlColumn other =
        (com.google.events.cloud.datastream.v1.MysqlColumn) obj;

    if (!getColumn().equals(other.getColumn())) return false;
    if (!getDataType().equals(other.getDataType())) return false;
    if (getLength() != other.getLength()) return false;
    if (!getCollation().equals(other.getCollation())) return false;
    if (getPrimaryKey() != other.getPrimaryKey()) return false;
    if (getNullable() != other.getNullable()) return false;
    if (getOrdinalPosition() != other.getOrdinalPosition()) return false;
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
    hash = (37 * hash) + COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + getColumn().hashCode();
    hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDataType().hashCode();
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getLength();
    hash = (37 * hash) + COLLATION_FIELD_NUMBER;
    hash = (53 * hash) + getCollation().hashCode();
    hash = (37 * hash) + PRIMARY_KEY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPrimaryKey());
    hash = (37 * hash) + NULLABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getNullable());
    hash = (37 * hash) + ORDINAL_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getOrdinalPosition();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.datastream.v1.MysqlColumn prototype) {
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
   * MySQL Column.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.datastream.v1.MysqlColumn}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.datastream.v1.MysqlColumn)
      com.google.events.cloud.datastream.v1.MysqlColumnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_MysqlColumn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_MysqlColumn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.datastream.v1.MysqlColumn.class,
              com.google.events.cloud.datastream.v1.MysqlColumn.Builder.class);
    }

    // Construct using com.google.events.cloud.datastream.v1.MysqlColumn.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      column_ = "";
      dataType_ = "";
      length_ = 0;
      collation_ = "";
      primaryKey_ = false;
      nullable_ = false;
      ordinalPosition_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_MysqlColumn_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.MysqlColumn getDefaultInstanceForType() {
      return com.google.events.cloud.datastream.v1.MysqlColumn.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.MysqlColumn build() {
      com.google.events.cloud.datastream.v1.MysqlColumn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.MysqlColumn buildPartial() {
      com.google.events.cloud.datastream.v1.MysqlColumn result =
          new com.google.events.cloud.datastream.v1.MysqlColumn(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.datastream.v1.MysqlColumn result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.column_ = column_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataType_ = dataType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.length_ = length_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.collation_ = collation_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.primaryKey_ = primaryKey_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.nullable_ = nullable_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.ordinalPosition_ = ordinalPosition_;
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
      if (other instanceof com.google.events.cloud.datastream.v1.MysqlColumn) {
        return mergeFrom((com.google.events.cloud.datastream.v1.MysqlColumn) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.datastream.v1.MysqlColumn other) {
      if (other == com.google.events.cloud.datastream.v1.MysqlColumn.getDefaultInstance())
        return this;
      if (!other.getColumn().isEmpty()) {
        column_ = other.column_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDataType().isEmpty()) {
        dataType_ = other.dataType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getLength() != 0) {
        setLength(other.getLength());
      }
      if (!other.getCollation().isEmpty()) {
        collation_ = other.collation_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getPrimaryKey() != false) {
        setPrimaryKey(other.getPrimaryKey());
      }
      if (other.getNullable() != false) {
        setNullable(other.getNullable());
      }
      if (other.getOrdinalPosition() != 0) {
        setOrdinalPosition(other.getOrdinalPosition());
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
                column_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                dataType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                length_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                collation_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
            case 40:
              {
                primaryKey_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
            case 48:
              {
                nullable_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
            case 56:
              {
                ordinalPosition_ = input.readInt32();
                bitField0_ |= 0x00000040;
                break;
              } // case 56
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

    private java.lang.Object column_ = "";

    /**
     *
     *
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column = 1;</code>
     *
     * @return The column.
     */
    public java.lang.String getColumn() {
      java.lang.Object ref = column_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        column_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column = 1;</code>
     *
     * @return The bytes for column.
     */
    public com.google.protobuf.ByteString getColumnBytes() {
      java.lang.Object ref = column_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        column_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column = 1;</code>
     *
     * @param value The column to set.
     * @return This builder for chaining.
     */
    public Builder setColumn(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      column_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearColumn() {
      column_ = getDefaultInstance().getColumn();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Column name.
     * </pre>
     *
     * <code>string column = 1;</code>
     *
     * @param value The bytes for column to set.
     * @return This builder for chaining.
     */
    public Builder setColumnBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      column_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object dataType_ = "";

    /**
     *
     *
     * <pre>
     * The MySQL data type. Full data types list can be found here:
     * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * </pre>
     *
     * <code>string data_type = 2;</code>
     *
     * @return The dataType.
     */
    public java.lang.String getDataType() {
      java.lang.Object ref = dataType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The MySQL data type. Full data types list can be found here:
     * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * </pre>
     *
     * <code>string data_type = 2;</code>
     *
     * @return The bytes for dataType.
     */
    public com.google.protobuf.ByteString getDataTypeBytes() {
      java.lang.Object ref = dataType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dataType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The MySQL data type. Full data types list can be found here:
     * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * </pre>
     *
     * <code>string data_type = 2;</code>
     *
     * @param value The dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dataType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The MySQL data type. Full data types list can be found here:
     * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * </pre>
     *
     * <code>string data_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataType() {
      dataType_ = getDefaultInstance().getDataType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The MySQL data type. Full data types list can be found here:
     * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * </pre>
     *
     * <code>string data_type = 2;</code>
     *
     * @param value The bytes for dataType to set.
     * @return This builder for chaining.
     */
    public Builder setDataTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      dataType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int length_;

    /**
     *
     *
     * <pre>
     * Column length.
     * </pre>
     *
     * <code>int32 length = 3;</code>
     *
     * @return The length.
     */
    @java.lang.Override
    public int getLength() {
      return length_;
    }

    /**
     *
     *
     * <pre>
     * Column length.
     * </pre>
     *
     * <code>int32 length = 3;</code>
     *
     * @param value The length to set.
     * @return This builder for chaining.
     */
    public Builder setLength(int value) {

      length_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Column length.
     * </pre>
     *
     * <code>int32 length = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLength() {
      bitField0_ = (bitField0_ & ~0x00000004);
      length_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object collation_ = "";

    /**
     *
     *
     * <pre>
     * Column collation.
     * </pre>
     *
     * <code>string collation = 4;</code>
     *
     * @return The collation.
     */
    public java.lang.String getCollation() {
      java.lang.Object ref = collation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Column collation.
     * </pre>
     *
     * <code>string collation = 4;</code>
     *
     * @return The bytes for collation.
     */
    public com.google.protobuf.ByteString getCollationBytes() {
      java.lang.Object ref = collation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        collation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Column collation.
     * </pre>
     *
     * <code>string collation = 4;</code>
     *
     * @param value The collation to set.
     * @return This builder for chaining.
     */
    public Builder setCollation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      collation_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Column collation.
     * </pre>
     *
     * <code>string collation = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCollation() {
      collation_ = getDefaultInstance().getCollation();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Column collation.
     * </pre>
     *
     * <code>string collation = 4;</code>
     *
     * @param value The bytes for collation to set.
     * @return This builder for chaining.
     */
    public Builder setCollationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      collation_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private boolean primaryKey_;

    /**
     *
     *
     * <pre>
     * Whether or not the column represents a primary key.
     * </pre>
     *
     * <code>bool primary_key = 5;</code>
     *
     * @return The primaryKey.
     */
    @java.lang.Override
    public boolean getPrimaryKey() {
      return primaryKey_;
    }

    /**
     *
     *
     * <pre>
     * Whether or not the column represents a primary key.
     * </pre>
     *
     * <code>bool primary_key = 5;</code>
     *
     * @param value The primaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryKey(boolean value) {

      primaryKey_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether or not the column represents a primary key.
     * </pre>
     *
     * <code>bool primary_key = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrimaryKey() {
      bitField0_ = (bitField0_ & ~0x00000010);
      primaryKey_ = false;
      onChanged();
      return this;
    }

    private boolean nullable_;

    /**
     *
     *
     * <pre>
     * Whether or not the column can accept a null value.
     * </pre>
     *
     * <code>bool nullable = 6;</code>
     *
     * @return The nullable.
     */
    @java.lang.Override
    public boolean getNullable() {
      return nullable_;
    }

    /**
     *
     *
     * <pre>
     * Whether or not the column can accept a null value.
     * </pre>
     *
     * <code>bool nullable = 6;</code>
     *
     * @param value The nullable to set.
     * @return This builder for chaining.
     */
    public Builder setNullable(boolean value) {

      nullable_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether or not the column can accept a null value.
     * </pre>
     *
     * <code>bool nullable = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNullable() {
      bitField0_ = (bitField0_ & ~0x00000020);
      nullable_ = false;
      onChanged();
      return this;
    }

    private int ordinalPosition_;

    /**
     *
     *
     * <pre>
     * The ordinal position of the column in the table.
     * </pre>
     *
     * <code>int32 ordinal_position = 7;</code>
     *
     * @return The ordinalPosition.
     */
    @java.lang.Override
    public int getOrdinalPosition() {
      return ordinalPosition_;
    }

    /**
     *
     *
     * <pre>
     * The ordinal position of the column in the table.
     * </pre>
     *
     * <code>int32 ordinal_position = 7;</code>
     *
     * @param value The ordinalPosition to set.
     * @return This builder for chaining.
     */
    public Builder setOrdinalPosition(int value) {

      ordinalPosition_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordinal position of the column in the table.
     * </pre>
     *
     * <code>int32 ordinal_position = 7;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOrdinalPosition() {
      bitField0_ = (bitField0_ & ~0x00000040);
      ordinalPosition_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.datastream.v1.MysqlColumn)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.datastream.v1.MysqlColumn)
  private static final com.google.events.cloud.datastream.v1.MysqlColumn DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.datastream.v1.MysqlColumn();
  }

  public static com.google.events.cloud.datastream.v1.MysqlColumn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MysqlColumn> PARSER =
      new com.google.protobuf.AbstractParser<MysqlColumn>() {
        @java.lang.Override
        public MysqlColumn parsePartialFrom(
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

  public static com.google.protobuf.Parser<MysqlColumn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MysqlColumn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.datastream.v1.MysqlColumn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
