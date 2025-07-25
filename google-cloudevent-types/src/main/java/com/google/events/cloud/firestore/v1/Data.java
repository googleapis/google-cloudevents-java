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
// source: google/events/cloud/firestore/v1/data.proto

package com.google.events.cloud.firestore.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_firestore_v1_DocumentEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_firestore_v1_DocumentEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_firestore_v1_DocumentMask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_firestore_v1_DocumentMask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_firestore_v1_Document_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_firestore_v1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_firestore_v1_Document_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_firestore_v1_Document_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_firestore_v1_Value_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_firestore_v1_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_firestore_v1_ArrayValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_firestore_v1_ArrayValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_firestore_v1_MapValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_firestore_v1_MapValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_firestore_v1_MapValue_FieldsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_firestore_v1_MapValue_FieldsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/events/cloud/firestore/v1/data."
          + "proto\022 google.events.cloud.firestore.v1\032"
          + "\034google/protobuf/struct.proto\032\037google/pr"
          + "otobuf/timestamp.proto\032\030google/type/latl"
          + "ng.proto\"\322\001\n\021DocumentEventData\0229\n\005value\030"
          + "\001 \001(\0132*.google.events.cloud.firestore.v1"
          + ".Document\022=\n\told_value\030\002 \001(\0132*.google.ev"
          + "ents.cloud.firestore.v1.Document\022C\n\013upda"
          + "te_mask\030\003 \001(\0132..google.events.cloud.fire"
          + "store.v1.DocumentMask\"#\n\014DocumentMask\022\023\n"
          + "\013field_paths\030\001 \003(\t\"\232\002\n\010Document\022\014\n\004name\030"
          + "\001 \001(\t\022F\n\006fields\030\002 \003(\01326.google.events.cl"
          + "oud.firestore.v1.Document.FieldsEntry\022/\n"
          + "\013create_time\030\003 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022/\n\013update_time\030\004 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\032V\n\013FieldsEntry\022\013\n\003key\030\001 "
          + "\001(\t\0226\n\005value\030\002 \001(\0132\'.google.events.cloud"
          + ".firestore.v1.Value:\0028\001\"\310\003\n\005Value\0220\n\nnul"
          + "l_value\030\013 \001(\0162\032.google.protobuf.NullValu"
          + "eH\000\022\027\n\rboolean_value\030\001 \001(\010H\000\022\027\n\rinteger_"
          + "value\030\002 \001(\003H\000\022\026\n\014double_value\030\003 \001(\001H\000\0225\n"
          + "\017timestamp_value\030\n \001(\0132\032.google.protobuf"
          + ".TimestampH\000\022\026\n\014string_value\030\021 \001(\tH\000\022\025\n\013"
          + "bytes_value\030\022 \001(\014H\000\022\031\n\017reference_value\030\005"
          + " \001(\tH\000\022.\n\017geo_point_value\030\010 \001(\0132\023.google"
          + ".type.LatLngH\000\022C\n\013array_value\030\t \001(\0132,.go"
          + "ogle.events.cloud.firestore.v1.ArrayValu"
          + "eH\000\022?\n\tmap_value\030\006 \001(\0132*.google.events.c"
          + "loud.firestore.v1.MapValueH\000B\014\n\nvalue_ty"
          + "pe\"E\n\nArrayValue\0227\n\006values\030\001 \003(\0132\'.googl"
          + "e.events.cloud.firestore.v1.Value\"\252\001\n\010Ma"
          + "pValue\022F\n\006fields\030\001 \003(\01326.google.events.c"
          + "loud.firestore.v1.MapValue.FieldsEntry\032V"
          + "\n\013FieldsEntry\022\013\n\003key\030\001 \001(\t\0226\n\005value\030\002 \001("
          + "\0132\'.google.events.cloud.firestore.v1.Val"
          + "ue:\0028\001B\236\001\n$com.google.events.cloud.fires"
          + "tore.v1P\001\252\002)Google.Events.Protobuf.Cloud"
          + ".Firestore.V1\312\002 Google\\Events\\Cloud\\Fire"
          + "store\\V1\352\002$Google::Events::Cloud::Firest"
          + "ore::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
            });
    internal_static_google_events_cloud_firestore_v1_DocumentEventData_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_firestore_v1_DocumentEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_firestore_v1_DocumentEventData_descriptor,
            new java.lang.String[] {
              "Value", "OldValue", "UpdateMask",
            });
    internal_static_google_events_cloud_firestore_v1_DocumentMask_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_firestore_v1_DocumentMask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_firestore_v1_DocumentMask_descriptor,
            new java.lang.String[] {
              "FieldPaths",
            });
    internal_static_google_events_cloud_firestore_v1_Document_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_cloud_firestore_v1_Document_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_firestore_v1_Document_descriptor,
            new java.lang.String[] {
              "Name", "Fields", "CreateTime", "UpdateTime",
            });
    internal_static_google_events_cloud_firestore_v1_Document_FieldsEntry_descriptor =
        internal_static_google_events_cloud_firestore_v1_Document_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_firestore_v1_Document_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_firestore_v1_Document_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_firestore_v1_Value_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_events_cloud_firestore_v1_Value_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_firestore_v1_Value_descriptor,
            new java.lang.String[] {
              "NullValue",
              "BooleanValue",
              "IntegerValue",
              "DoubleValue",
              "TimestampValue",
              "StringValue",
              "BytesValue",
              "ReferenceValue",
              "GeoPointValue",
              "ArrayValue",
              "MapValue",
              "ValueType",
            });
    internal_static_google_events_cloud_firestore_v1_ArrayValue_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_events_cloud_firestore_v1_ArrayValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_firestore_v1_ArrayValue_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_events_cloud_firestore_v1_MapValue_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_events_cloud_firestore_v1_MapValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_firestore_v1_MapValue_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_google_events_cloud_firestore_v1_MapValue_FieldsEntry_descriptor =
        internal_static_google_events_cloud_firestore_v1_MapValue_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_firestore_v1_MapValue_FieldsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_firestore_v1_MapValue_FieldsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
