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
// source: google/events/cloud/dataflow/v1beta3/data.proto

package com.google.events.cloud.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Specifies the algorithm used to determine the number of worker
 * processes to run at any given point in time, based on the amount of
 * data left to process, the number of workers, and how quickly
 * existing workers are processing data.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm}
 */
public enum AutoscalingAlgorithm implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The algorithm is unknown, or unspecified.
   * </pre>
   *
   * <code>AUTOSCALING_ALGORITHM_UNKNOWN = 0;</code>
   */
  AUTOSCALING_ALGORITHM_UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * Disable autoscaling.
   * </pre>
   *
   * <code>AUTOSCALING_ALGORITHM_NONE = 1;</code>
   */
  AUTOSCALING_ALGORITHM_NONE(1),
  /**
   *
   *
   * <pre>
   * Increase worker count over time to reduce job execution time.
   * </pre>
   *
   * <code>AUTOSCALING_ALGORITHM_BASIC = 2;</code>
   */
  AUTOSCALING_ALGORITHM_BASIC(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The algorithm is unknown, or unspecified.
   * </pre>
   *
   * <code>AUTOSCALING_ALGORITHM_UNKNOWN = 0;</code>
   */
  public static final int AUTOSCALING_ALGORITHM_UNKNOWN_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Disable autoscaling.
   * </pre>
   *
   * <code>AUTOSCALING_ALGORITHM_NONE = 1;</code>
   */
  public static final int AUTOSCALING_ALGORITHM_NONE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Increase worker count over time to reduce job execution time.
   * </pre>
   *
   * <code>AUTOSCALING_ALGORITHM_BASIC = 2;</code>
   */
  public static final int AUTOSCALING_ALGORITHM_BASIC_VALUE = 2;

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
  public static AutoscalingAlgorithm valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AutoscalingAlgorithm forNumber(int value) {
    switch (value) {
      case 0:
        return AUTOSCALING_ALGORITHM_UNKNOWN;
      case 1:
        return AUTOSCALING_ALGORITHM_NONE;
      case 2:
        return AUTOSCALING_ALGORITHM_BASIC;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AutoscalingAlgorithm>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AutoscalingAlgorithm>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AutoscalingAlgorithm>() {
            public AutoscalingAlgorithm findValueByNumber(int number) {
              return AutoscalingAlgorithm.forNumber(number);
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
    return com.google.events.cloud.dataflow.v1beta3.Data.getDescriptor().getEnumTypes().get(4);
  }

  private static final AutoscalingAlgorithm[] VALUES = values();

  public static AutoscalingAlgorithm valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AutoscalingAlgorithm(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm)
}
