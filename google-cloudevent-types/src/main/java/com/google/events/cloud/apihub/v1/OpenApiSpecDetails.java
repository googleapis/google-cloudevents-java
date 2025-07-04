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
// source: google/events/cloud/apihub/v1/data.proto

package com.google.events.cloud.apihub.v1;

/**
 *
 *
 * <pre>
 * OpenApiSpecDetails contains the details parsed from an OpenAPI spec in
 * addition to the fields mentioned in
 * [SpecDetails][google.cloud.apihub.v1.SpecDetails].
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.apihub.v1.OpenApiSpecDetails}
 */
public final class OpenApiSpecDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.apihub.v1.OpenApiSpecDetails)
    OpenApiSpecDetailsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use OpenApiSpecDetails.newBuilder() to construct.
  private OpenApiSpecDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OpenApiSpecDetails() {
    format_ = 0;
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OpenApiSpecDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.apihub.v1.Data
        .internal_static_google_events_cloud_apihub_v1_OpenApiSpecDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.apihub.v1.Data
        .internal_static_google_events_cloud_apihub_v1_OpenApiSpecDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.apihub.v1.OpenApiSpecDetails.class,
            com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enumeration of spec formats.
   * </pre>
   *
   * Protobuf enum {@code google.events.cloud.apihub.v1.OpenApiSpecDetails.Format}
   */
  public enum Format implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * SpecFile type unspecified.
     * </pre>
     *
     * <code>FORMAT_UNSPECIFIED = 0;</code>
     */
    FORMAT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * OpenAPI Spec v2.0.
     * </pre>
     *
     * <code>OPEN_API_SPEC_2_0 = 1;</code>
     */
    OPEN_API_SPEC_2_0(1),
    /**
     *
     *
     * <pre>
     * OpenAPI Spec v3.0.
     * </pre>
     *
     * <code>OPEN_API_SPEC_3_0 = 2;</code>
     */
    OPEN_API_SPEC_3_0(2),
    /**
     *
     *
     * <pre>
     * OpenAPI Spec v3.1.
     * </pre>
     *
     * <code>OPEN_API_SPEC_3_1 = 3;</code>
     */
    OPEN_API_SPEC_3_1(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * SpecFile type unspecified.
     * </pre>
     *
     * <code>FORMAT_UNSPECIFIED = 0;</code>
     */
    public static final int FORMAT_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * OpenAPI Spec v2.0.
     * </pre>
     *
     * <code>OPEN_API_SPEC_2_0 = 1;</code>
     */
    public static final int OPEN_API_SPEC_2_0_VALUE = 1;

    /**
     *
     *
     * <pre>
     * OpenAPI Spec v3.0.
     * </pre>
     *
     * <code>OPEN_API_SPEC_3_0 = 2;</code>
     */
    public static final int OPEN_API_SPEC_3_0_VALUE = 2;

    /**
     *
     *
     * <pre>
     * OpenAPI Spec v3.1.
     * </pre>
     *
     * <code>OPEN_API_SPEC_3_1 = 3;</code>
     */
    public static final int OPEN_API_SPEC_3_1_VALUE = 3;

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
    public static Format valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Format forNumber(int value) {
      switch (value) {
        case 0:
          return FORMAT_UNSPECIFIED;
        case 1:
          return OPEN_API_SPEC_2_0;
        case 2:
          return OPEN_API_SPEC_3_0;
        case 3:
          return OPEN_API_SPEC_3_1;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Format> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Format> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Format>() {
          public Format findValueByNumber(int number) {
            return Format.forNumber(number);
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
      return com.google.events.cloud.apihub.v1.OpenApiSpecDetails.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Format[] VALUES = values();

    public static Format valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Format(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.events.cloud.apihub.v1.OpenApiSpecDetails.Format)
  }

  public static final int FORMAT_FIELD_NUMBER = 1;
  private int format_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. The format of the spec.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format format = 1;</code>
   *
   * @return The enum numeric value on the wire for format.
   */
  @java.lang.Override
  public int getFormatValue() {
    return format_;
  }

  /**
   *
   *
   * <pre>
   * Output only. The format of the spec.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format format = 1;</code>
   *
   * @return The format.
   */
  @java.lang.Override
  public com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format getFormat() {
    com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format result =
        com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format.forNumber(format_);
    return result == null
        ? com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format.UNRECOGNIZED
        : result;
  }

  public static final int VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";

  /**
   *
   *
   * <pre>
   * Output only. The version in the spec.
   * This maps to `info.version` in OpenAPI spec.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. The version in the spec.
   * This maps to `info.version` in OpenAPI spec.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OWNER_FIELD_NUMBER = 3;
  private com.google.events.cloud.apihub.v1.Owner owner_;

  /**
   *
   *
   * <pre>
   * Output only. Owner details for the spec.
   * This maps to `info.contact` in OpenAPI spec.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
   *
   * @return Whether the owner field is set.
   */
  @java.lang.Override
  public boolean hasOwner() {
    return owner_ != null;
  }

  /**
   *
   *
   * <pre>
   * Output only. Owner details for the spec.
   * This maps to `info.contact` in OpenAPI spec.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
   *
   * @return The owner.
   */
  @java.lang.Override
  public com.google.events.cloud.apihub.v1.Owner getOwner() {
    return owner_ == null ? com.google.events.cloud.apihub.v1.Owner.getDefaultInstance() : owner_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Owner details for the spec.
   * This maps to `info.contact` in OpenAPI spec.
   * </pre>
   *
   * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.apihub.v1.OwnerOrBuilder getOwnerOrBuilder() {
    return owner_ == null ? com.google.events.cloud.apihub.v1.Owner.getDefaultInstance() : owner_;
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
    if (format_
        != com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format.FORMAT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, format_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (owner_ != null) {
      output.writeMessage(3, getOwner());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (format_
        != com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format.FORMAT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, format_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (owner_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getOwner());
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
    if (!(obj instanceof com.google.events.cloud.apihub.v1.OpenApiSpecDetails)) {
      return super.equals(obj);
    }
    com.google.events.cloud.apihub.v1.OpenApiSpecDetails other =
        (com.google.events.cloud.apihub.v1.OpenApiSpecDetails) obj;

    if (format_ != other.format_) return false;
    if (!getVersion().equals(other.getVersion())) return false;
    if (hasOwner() != other.hasOwner()) return false;
    if (hasOwner()) {
      if (!getOwner().equals(other.getOwner())) return false;
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
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + format_;
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    if (hasOwner()) {
      hash = (37 * hash) + OWNER_FIELD_NUMBER;
      hash = (53 * hash) + getOwner().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.apihub.v1.OpenApiSpecDetails prototype) {
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
   * OpenApiSpecDetails contains the details parsed from an OpenAPI spec in
   * addition to the fields mentioned in
   * [SpecDetails][google.cloud.apihub.v1.SpecDetails].
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.apihub.v1.OpenApiSpecDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.apihub.v1.OpenApiSpecDetails)
      com.google.events.cloud.apihub.v1.OpenApiSpecDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.apihub.v1.Data
          .internal_static_google_events_cloud_apihub_v1_OpenApiSpecDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.apihub.v1.Data
          .internal_static_google_events_cloud_apihub_v1_OpenApiSpecDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.apihub.v1.OpenApiSpecDetails.class,
              com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Builder.class);
    }

    // Construct using com.google.events.cloud.apihub.v1.OpenApiSpecDetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      format_ = 0;
      version_ = "";
      owner_ = null;
      if (ownerBuilder_ != null) {
        ownerBuilder_.dispose();
        ownerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.apihub.v1.Data
          .internal_static_google_events_cloud_apihub_v1_OpenApiSpecDetails_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.apihub.v1.OpenApiSpecDetails getDefaultInstanceForType() {
      return com.google.events.cloud.apihub.v1.OpenApiSpecDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.apihub.v1.OpenApiSpecDetails build() {
      com.google.events.cloud.apihub.v1.OpenApiSpecDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.apihub.v1.OpenApiSpecDetails buildPartial() {
      com.google.events.cloud.apihub.v1.OpenApiSpecDetails result =
          new com.google.events.cloud.apihub.v1.OpenApiSpecDetails(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.apihub.v1.OpenApiSpecDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.format_ = format_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.owner_ = ownerBuilder_ == null ? owner_ : ownerBuilder_.build();
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
      if (other instanceof com.google.events.cloud.apihub.v1.OpenApiSpecDetails) {
        return mergeFrom((com.google.events.cloud.apihub.v1.OpenApiSpecDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.apihub.v1.OpenApiSpecDetails other) {
      if (other == com.google.events.cloud.apihub.v1.OpenApiSpecDetails.getDefaultInstance())
        return this;
      if (other.format_ != 0) {
        setFormatValue(other.getFormatValue());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasOwner()) {
        mergeOwner(other.getOwner());
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
                format_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                version_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getOwnerFieldBuilder().getBuilder(), extensionRegistry);
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

    private int format_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. The format of the spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format format = 1;</code>
     *
     * @return The enum numeric value on the wire for format.
     */
    @java.lang.Override
    public int getFormatValue() {
      return format_;
    }

    /**
     *
     *
     * <pre>
     * Output only. The format of the spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format format = 1;</code>
     *
     * @param value The enum numeric value on the wire for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatValue(int value) {
      format_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The format of the spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format format = 1;</code>
     *
     * @return The format.
     */
    @java.lang.Override
    public com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format getFormat() {
      com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format result =
          com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format.forNumber(format_);
      return result == null
          ? com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. The format of the spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format format = 1;</code>
     *
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(com.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      format_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The format of the spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.OpenApiSpecDetails.Format format = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      bitField0_ = (bitField0_ & ~0x00000001);
      format_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";

    /**
     *
     *
     * <pre>
     * Output only. The version in the spec.
     * This maps to `info.version` in OpenAPI spec.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. The version in the spec.
     * This maps to `info.version` in OpenAPI spec.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. The version in the spec.
     * This maps to `info.version` in OpenAPI spec.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The version in the spec.
     * This maps to `info.version` in OpenAPI spec.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The version in the spec.
     * This maps to `info.version` in OpenAPI spec.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.events.cloud.apihub.v1.Owner owner_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.apihub.v1.Owner,
            com.google.events.cloud.apihub.v1.Owner.Builder,
            com.google.events.cloud.apihub.v1.OwnerOrBuilder>
        ownerBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     *
     * @return Whether the owner field is set.
     */
    public boolean hasOwner() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     *
     * @return The owner.
     */
    public com.google.events.cloud.apihub.v1.Owner getOwner() {
      if (ownerBuilder_ == null) {
        return owner_ == null
            ? com.google.events.cloud.apihub.v1.Owner.getDefaultInstance()
            : owner_;
      } else {
        return ownerBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     */
    public Builder setOwner(com.google.events.cloud.apihub.v1.Owner value) {
      if (ownerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        owner_ = value;
      } else {
        ownerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     */
    public Builder setOwner(com.google.events.cloud.apihub.v1.Owner.Builder builderForValue) {
      if (ownerBuilder_ == null) {
        owner_ = builderForValue.build();
      } else {
        ownerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     */
    public Builder mergeOwner(com.google.events.cloud.apihub.v1.Owner value) {
      if (ownerBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && owner_ != null
            && owner_ != com.google.events.cloud.apihub.v1.Owner.getDefaultInstance()) {
          getOwnerBuilder().mergeFrom(value);
        } else {
          owner_ = value;
        }
      } else {
        ownerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     */
    public Builder clearOwner() {
      bitField0_ = (bitField0_ & ~0x00000004);
      owner_ = null;
      if (ownerBuilder_ != null) {
        ownerBuilder_.dispose();
        ownerBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     */
    public com.google.events.cloud.apihub.v1.Owner.Builder getOwnerBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getOwnerFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     */
    public com.google.events.cloud.apihub.v1.OwnerOrBuilder getOwnerOrBuilder() {
      if (ownerBuilder_ != null) {
        return ownerBuilder_.getMessageOrBuilder();
      } else {
        return owner_ == null
            ? com.google.events.cloud.apihub.v1.Owner.getDefaultInstance()
            : owner_;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Owner details for the spec.
     * This maps to `info.contact` in OpenAPI spec.
     * </pre>
     *
     * <code>.google.events.cloud.apihub.v1.Owner owner = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.apihub.v1.Owner,
            com.google.events.cloud.apihub.v1.Owner.Builder,
            com.google.events.cloud.apihub.v1.OwnerOrBuilder>
        getOwnerFieldBuilder() {
      if (ownerBuilder_ == null) {
        ownerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.apihub.v1.Owner,
                com.google.events.cloud.apihub.v1.Owner.Builder,
                com.google.events.cloud.apihub.v1.OwnerOrBuilder>(
                getOwner(), getParentForChildren(), isClean());
        owner_ = null;
      }
      return ownerBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.apihub.v1.OpenApiSpecDetails)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.apihub.v1.OpenApiSpecDetails)
  private static final com.google.events.cloud.apihub.v1.OpenApiSpecDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.apihub.v1.OpenApiSpecDetails();
  }

  public static com.google.events.cloud.apihub.v1.OpenApiSpecDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenApiSpecDetails> PARSER =
      new com.google.protobuf.AbstractParser<OpenApiSpecDetails>() {
        @java.lang.Override
        public OpenApiSpecDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<OpenApiSpecDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenApiSpecDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.apihub.v1.OpenApiSpecDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
