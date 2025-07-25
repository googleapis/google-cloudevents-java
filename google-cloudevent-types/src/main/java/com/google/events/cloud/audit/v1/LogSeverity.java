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
// source: google/events/cloud/audit/v1/data.proto

package com.google.events.cloud.audit.v1;

/**
 *
 *
 * <pre>
 * The severity of the event described in a log entry, expressed as one of the
 * standard severity levels listed below.  For your reference, the levels are
 * assigned the listed numeric values. The effect of using numeric values other
 * than those listed is undefined.
 * Copied from
 * https://github.com/googleapis/googleapis/blob/master/google/logging/type/log_severity.proto
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.audit.v1.LogSeverity}
 */
public enum LogSeverity implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * (0) The log entry has no assigned severity level.
   * </pre>
   *
   * <code>DEFAULT = 0;</code>
   */
  DEFAULT(0),
  /**
   *
   *
   * <pre>
   * (100) Debug or trace information.
   * </pre>
   *
   * <code>DEBUG = 100;</code>
   */
  DEBUG(100),
  /**
   *
   *
   * <pre>
   * (200) Routine information, such as ongoing status or performance.
   * </pre>
   *
   * <code>INFO = 200;</code>
   */
  INFO(200),
  /**
   *
   *
   * <pre>
   * (300) Normal but significant events, such as start up, shut down, or
   * a configuration change.
   * </pre>
   *
   * <code>NOTICE = 300;</code>
   */
  NOTICE(300),
  /**
   *
   *
   * <pre>
   * (400) Warning events might cause problems.
   * </pre>
   *
   * <code>WARNING = 400;</code>
   */
  WARNING(400),
  /**
   *
   *
   * <pre>
   * (500) Error events are likely to cause problems.
   * </pre>
   *
   * <code>ERROR = 500;</code>
   */
  ERROR(500),
  /**
   *
   *
   * <pre>
   * (600) Critical events cause more severe problems or outages.
   * </pre>
   *
   * <code>CRITICAL = 600;</code>
   */
  CRITICAL(600),
  /**
   *
   *
   * <pre>
   * (700) A person must take an action immediately.
   * </pre>
   *
   * <code>ALERT = 700;</code>
   */
  ALERT(700),
  /**
   *
   *
   * <pre>
   * (800) One or more systems are unusable.
   * </pre>
   *
   * <code>EMERGENCY = 800;</code>
   */
  EMERGENCY(800),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * (0) The log entry has no assigned severity level.
   * </pre>
   *
   * <code>DEFAULT = 0;</code>
   */
  public static final int DEFAULT_VALUE = 0;

  /**
   *
   *
   * <pre>
   * (100) Debug or trace information.
   * </pre>
   *
   * <code>DEBUG = 100;</code>
   */
  public static final int DEBUG_VALUE = 100;

  /**
   *
   *
   * <pre>
   * (200) Routine information, such as ongoing status or performance.
   * </pre>
   *
   * <code>INFO = 200;</code>
   */
  public static final int INFO_VALUE = 200;

  /**
   *
   *
   * <pre>
   * (300) Normal but significant events, such as start up, shut down, or
   * a configuration change.
   * </pre>
   *
   * <code>NOTICE = 300;</code>
   */
  public static final int NOTICE_VALUE = 300;

  /**
   *
   *
   * <pre>
   * (400) Warning events might cause problems.
   * </pre>
   *
   * <code>WARNING = 400;</code>
   */
  public static final int WARNING_VALUE = 400;

  /**
   *
   *
   * <pre>
   * (500) Error events are likely to cause problems.
   * </pre>
   *
   * <code>ERROR = 500;</code>
   */
  public static final int ERROR_VALUE = 500;

  /**
   *
   *
   * <pre>
   * (600) Critical events cause more severe problems or outages.
   * </pre>
   *
   * <code>CRITICAL = 600;</code>
   */
  public static final int CRITICAL_VALUE = 600;

  /**
   *
   *
   * <pre>
   * (700) A person must take an action immediately.
   * </pre>
   *
   * <code>ALERT = 700;</code>
   */
  public static final int ALERT_VALUE = 700;

  /**
   *
   *
   * <pre>
   * (800) One or more systems are unusable.
   * </pre>
   *
   * <code>EMERGENCY = 800;</code>
   */
  public static final int EMERGENCY_VALUE = 800;

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
  public static LogSeverity valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LogSeverity forNumber(int value) {
    switch (value) {
      case 0:
        return DEFAULT;
      case 100:
        return DEBUG;
      case 200:
        return INFO;
      case 300:
        return NOTICE;
      case 400:
        return WARNING;
      case 500:
        return ERROR;
      case 600:
        return CRITICAL;
      case 700:
        return ALERT;
      case 800:
        return EMERGENCY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LogSeverity> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<LogSeverity> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<LogSeverity>() {
        public LogSeverity findValueByNumber(int number) {
          return LogSeverity.forNumber(number);
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
    return com.google.events.cloud.audit.v1.Data.getDescriptor().getEnumTypes().get(0);
  }

  private static final LogSeverity[] VALUES = values();

  public static LogSeverity valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LogSeverity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.audit.v1.LogSeverity)
}
