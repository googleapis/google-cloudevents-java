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
// source: google/events/cloud/alloydb/v1/data.proto

package com.google.events.cloud.alloydb.v1;

/**
 *
 *
 * <pre>
 * EncryptionInfo describes the encryption information of a cluster or a backup.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.alloydb.v1.EncryptionInfo}
 */
public final class EncryptionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.alloydb.v1.EncryptionInfo)
    EncryptionInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use EncryptionInfo.newBuilder() to construct.
  private EncryptionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EncryptionInfo() {
    encryptionType_ = 0;
    kmsKeyVersions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EncryptionInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.alloydb.v1.Data
        .internal_static_google_events_cloud_alloydb_v1_EncryptionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.alloydb.v1.Data
        .internal_static_google_events_cloud_alloydb_v1_EncryptionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.alloydb.v1.EncryptionInfo.class,
            com.google.events.cloud.alloydb.v1.EncryptionInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Possible encryption types.
   * </pre>
   *
   * Protobuf enum {@code google.events.cloud.alloydb.v1.EncryptionInfo.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Encryption type not specified. Defaults to GOOGLE_DEFAULT_ENCRYPTION.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The data is encrypted at rest with a key that is fully managed by Google.
     * No key version will be populated. This is the default state.
     * </pre>
     *
     * <code>GOOGLE_DEFAULT_ENCRYPTION = 1;</code>
     */
    GOOGLE_DEFAULT_ENCRYPTION(1),
    /**
     *
     *
     * <pre>
     * The data is encrypted at rest with a key that is managed by the customer.
     * KMS key versions will be populated.
     * </pre>
     *
     * <code>CUSTOMER_MANAGED_ENCRYPTION = 2;</code>
     */
    CUSTOMER_MANAGED_ENCRYPTION(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Encryption type not specified. Defaults to GOOGLE_DEFAULT_ENCRYPTION.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * The data is encrypted at rest with a key that is fully managed by Google.
     * No key version will be populated. This is the default state.
     * </pre>
     *
     * <code>GOOGLE_DEFAULT_ENCRYPTION = 1;</code>
     */
    public static final int GOOGLE_DEFAULT_ENCRYPTION_VALUE = 1;

    /**
     *
     *
     * <pre>
     * The data is encrypted at rest with a key that is managed by the customer.
     * KMS key versions will be populated.
     * </pre>
     *
     * <code>CUSTOMER_MANAGED_ENCRYPTION = 2;</code>
     */
    public static final int CUSTOMER_MANAGED_ENCRYPTION_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return TYPE_UNSPECIFIED;
        case 1:
          return GOOGLE_DEFAULT_ENCRYPTION;
        case 2:
          return CUSTOMER_MANAGED_ENCRYPTION;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.events.cloud.alloydb.v1.EncryptionInfo.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.events.cloud.alloydb.v1.EncryptionInfo.Type)
  }

  public static final int ENCRYPTION_TYPE_FIELD_NUMBER = 1;
  private int encryptionType_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. Type of encryption.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.EncryptionInfo.Type encryption_type = 1;</code>
   *
   * @return The enum numeric value on the wire for encryptionType.
   */
  @java.lang.Override
  public int getEncryptionTypeValue() {
    return encryptionType_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Type of encryption.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.EncryptionInfo.Type encryption_type = 1;</code>
   *
   * @return The encryptionType.
   */
  @java.lang.Override
  public com.google.events.cloud.alloydb.v1.EncryptionInfo.Type getEncryptionType() {
    com.google.events.cloud.alloydb.v1.EncryptionInfo.Type result =
        com.google.events.cloud.alloydb.v1.EncryptionInfo.Type.forNumber(encryptionType_);
    return result == null
        ? com.google.events.cloud.alloydb.v1.EncryptionInfo.Type.UNRECOGNIZED
        : result;
  }

  public static final int KMS_KEY_VERSIONS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList kmsKeyVersions_;

  /**
   *
   *
   * <pre>
   * Output only. Cloud KMS key versions that are being used to protect the
   * database or the backup.
   * </pre>
   *
   * <code>repeated string kms_key_versions = 2;</code>
   *
   * @return A list containing the kmsKeyVersions.
   */
  public com.google.protobuf.ProtocolStringList getKmsKeyVersionsList() {
    return kmsKeyVersions_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Cloud KMS key versions that are being used to protect the
   * database or the backup.
   * </pre>
   *
   * <code>repeated string kms_key_versions = 2;</code>
   *
   * @return The count of kmsKeyVersions.
   */
  public int getKmsKeyVersionsCount() {
    return kmsKeyVersions_.size();
  }

  /**
   *
   *
   * <pre>
   * Output only. Cloud KMS key versions that are being used to protect the
   * database or the backup.
   * </pre>
   *
   * <code>repeated string kms_key_versions = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The kmsKeyVersions at the given index.
   */
  public java.lang.String getKmsKeyVersions(int index) {
    return kmsKeyVersions_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Output only. Cloud KMS key versions that are being used to protect the
   * database or the backup.
   * </pre>
   *
   * <code>repeated string kms_key_versions = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the kmsKeyVersions at the given index.
   */
  public com.google.protobuf.ByteString getKmsKeyVersionsBytes(int index) {
    return kmsKeyVersions_.getByteString(index);
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
    if (encryptionType_
        != com.google.events.cloud.alloydb.v1.EncryptionInfo.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, encryptionType_);
    }
    for (int i = 0; i < kmsKeyVersions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kmsKeyVersions_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (encryptionType_
        != com.google.events.cloud.alloydb.v1.EncryptionInfo.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, encryptionType_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < kmsKeyVersions_.size(); i++) {
        dataSize += computeStringSizeNoTag(kmsKeyVersions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKmsKeyVersionsList().size();
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
    if (!(obj instanceof com.google.events.cloud.alloydb.v1.EncryptionInfo)) {
      return super.equals(obj);
    }
    com.google.events.cloud.alloydb.v1.EncryptionInfo other =
        (com.google.events.cloud.alloydb.v1.EncryptionInfo) obj;

    if (encryptionType_ != other.encryptionType_) return false;
    if (!getKmsKeyVersionsList().equals(other.getKmsKeyVersionsList())) return false;
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
    hash = (37 * hash) + ENCRYPTION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + encryptionType_;
    if (getKmsKeyVersionsCount() > 0) {
      hash = (37 * hash) + KMS_KEY_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getKmsKeyVersionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.alloydb.v1.EncryptionInfo prototype) {
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
   * EncryptionInfo describes the encryption information of a cluster or a backup.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.alloydb.v1.EncryptionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.alloydb.v1.EncryptionInfo)
      com.google.events.cloud.alloydb.v1.EncryptionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.alloydb.v1.Data
          .internal_static_google_events_cloud_alloydb_v1_EncryptionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.alloydb.v1.Data
          .internal_static_google_events_cloud_alloydb_v1_EncryptionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.alloydb.v1.EncryptionInfo.class,
              com.google.events.cloud.alloydb.v1.EncryptionInfo.Builder.class);
    }

    // Construct using com.google.events.cloud.alloydb.v1.EncryptionInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      encryptionType_ = 0;
      kmsKeyVersions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.alloydb.v1.Data
          .internal_static_google_events_cloud_alloydb_v1_EncryptionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.alloydb.v1.EncryptionInfo getDefaultInstanceForType() {
      return com.google.events.cloud.alloydb.v1.EncryptionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.alloydb.v1.EncryptionInfo build() {
      com.google.events.cloud.alloydb.v1.EncryptionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.alloydb.v1.EncryptionInfo buildPartial() {
      com.google.events.cloud.alloydb.v1.EncryptionInfo result =
          new com.google.events.cloud.alloydb.v1.EncryptionInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.events.cloud.alloydb.v1.EncryptionInfo result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        kmsKeyVersions_ = kmsKeyVersions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.kmsKeyVersions_ = kmsKeyVersions_;
    }

    private void buildPartial0(com.google.events.cloud.alloydb.v1.EncryptionInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.encryptionType_ = encryptionType_;
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
      if (other instanceof com.google.events.cloud.alloydb.v1.EncryptionInfo) {
        return mergeFrom((com.google.events.cloud.alloydb.v1.EncryptionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.alloydb.v1.EncryptionInfo other) {
      if (other == com.google.events.cloud.alloydb.v1.EncryptionInfo.getDefaultInstance())
        return this;
      if (other.encryptionType_ != 0) {
        setEncryptionTypeValue(other.getEncryptionTypeValue());
      }
      if (!other.kmsKeyVersions_.isEmpty()) {
        if (kmsKeyVersions_.isEmpty()) {
          kmsKeyVersions_ = other.kmsKeyVersions_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureKmsKeyVersionsIsMutable();
          kmsKeyVersions_.addAll(other.kmsKeyVersions_);
        }
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
            case 8:
              {
                encryptionType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureKmsKeyVersionsIsMutable();
                kmsKeyVersions_.add(s);
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

    private int encryptionType_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. Type of encryption.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.EncryptionInfo.Type encryption_type = 1;</code>
     *
     * @return The enum numeric value on the wire for encryptionType.
     */
    @java.lang.Override
    public int getEncryptionTypeValue() {
      return encryptionType_;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of encryption.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.EncryptionInfo.Type encryption_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for encryptionType to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptionTypeValue(int value) {
      encryptionType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of encryption.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.EncryptionInfo.Type encryption_type = 1;</code>
     *
     * @return The encryptionType.
     */
    @java.lang.Override
    public com.google.events.cloud.alloydb.v1.EncryptionInfo.Type getEncryptionType() {
      com.google.events.cloud.alloydb.v1.EncryptionInfo.Type result =
          com.google.events.cloud.alloydb.v1.EncryptionInfo.Type.forNumber(encryptionType_);
      return result == null
          ? com.google.events.cloud.alloydb.v1.EncryptionInfo.Type.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of encryption.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.EncryptionInfo.Type encryption_type = 1;</code>
     *
     * @param value The encryptionType to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptionType(com.google.events.cloud.alloydb.v1.EncryptionInfo.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      encryptionType_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of encryption.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.EncryptionInfo.Type encryption_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEncryptionType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      encryptionType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList kmsKeyVersions_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureKmsKeyVersionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        kmsKeyVersions_ = new com.google.protobuf.LazyStringArrayList(kmsKeyVersions_);
        bitField0_ |= 0x00000002;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @return A list containing the kmsKeyVersions.
     */
    public com.google.protobuf.ProtocolStringList getKmsKeyVersionsList() {
      return kmsKeyVersions_.getUnmodifiableView();
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @return The count of kmsKeyVersions.
     */
    public int getKmsKeyVersionsCount() {
      return kmsKeyVersions_.size();
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The kmsKeyVersions at the given index.
     */
    public java.lang.String getKmsKeyVersions(int index) {
      return kmsKeyVersions_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the kmsKeyVersions at the given index.
     */
    public com.google.protobuf.ByteString getKmsKeyVersionsBytes(int index) {
      return kmsKeyVersions_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The kmsKeyVersions to set.
     * @return This builder for chaining.
     */
    public Builder setKmsKeyVersions(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureKmsKeyVersionsIsMutable();
      kmsKeyVersions_.set(index, value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @param value The kmsKeyVersions to add.
     * @return This builder for chaining.
     */
    public Builder addKmsKeyVersions(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureKmsKeyVersionsIsMutable();
      kmsKeyVersions_.add(value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @param values The kmsKeyVersions to add.
     * @return This builder for chaining.
     */
    public Builder addAllKmsKeyVersions(java.lang.Iterable<java.lang.String> values) {
      ensureKmsKeyVersionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, kmsKeyVersions_);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKmsKeyVersions() {
      kmsKeyVersions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Cloud KMS key versions that are being used to protect the
     * database or the backup.
     * </pre>
     *
     * <code>repeated string kms_key_versions = 2;</code>
     *
     * @param value The bytes of the kmsKeyVersions to add.
     * @return This builder for chaining.
     */
    public Builder addKmsKeyVersionsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureKmsKeyVersionsIsMutable();
      kmsKeyVersions_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.alloydb.v1.EncryptionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.alloydb.v1.EncryptionInfo)
  private static final com.google.events.cloud.alloydb.v1.EncryptionInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.alloydb.v1.EncryptionInfo();
  }

  public static com.google.events.cloud.alloydb.v1.EncryptionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptionInfo> PARSER =
      new com.google.protobuf.AbstractParser<EncryptionInfo>() {
        @java.lang.Override
        public EncryptionInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<EncryptionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.alloydb.v1.EncryptionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
