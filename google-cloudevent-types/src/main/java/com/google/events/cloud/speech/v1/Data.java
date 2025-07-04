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
// source: google/events/cloud/speech/v1/data.proto

package com.google.events.cloud.speech.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_speech_v1_CustomClass_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_speech_v1_CustomClass_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_speech_v1_CustomClass_ClassItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_speech_v1_CustomClass_ClassItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_speech_v1_CustomClass_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_speech_v1_CustomClass_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_speech_v1_PhraseSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_speech_v1_PhraseSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_speech_v1_PhraseSet_Phrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_speech_v1_PhraseSet_Phrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_speech_v1_PhraseSet_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_speech_v1_PhraseSet_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_speech_v1_PhraseSetEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_speech_v1_PhraseSetEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_speech_v1_CustomClassEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_speech_v1_CustomClassEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/events/cloud/speech/v1/data.pro"
          + "to\022\035google.events.cloud.speech.v1\032\037googl"
          + "e/protobuf/timestamp.proto\"\361\004\n\013CustomCla"
          + "ss\022\014\n\004name\030\001 \001(\t\022\027\n\017custom_class_id\030\002 \001("
          + "\t\022C\n\005items\030\003 \003(\01324.google.events.cloud.s"
          + "peech.v1.CustomClass.ClassItem\022\024\n\014kms_ke"
          + "y_name\030\006 \001(\t\022\034\n\024kms_key_version_name\030\007 \001"
          + "(\t\022\013\n\003uid\030\010 \001(\t\022\024\n\014display_name\030\t \001(\t\022?\n"
          + "\005state\030\n \001(\01620.google.events.cloud.speec"
          + "h.v1.CustomClass.State\022/\n\013delete_time\030\013 "
          + "\001(\0132\032.google.protobuf.Timestamp\022/\n\013expir"
          + "e_time\030\014 \001(\0132\032.google.protobuf.Timestamp"
          + "\022P\n\013annotations\030\r \003(\0132;.google.events.cl"
          + "oud.speech.v1.CustomClass.AnnotationsEnt"
          + "ry\022\014\n\004etag\030\016 \001(\t\022\023\n\013reconciling\030\017 \001(\010\032\032\n"
          + "\tClassItem\022\r\n\005value\030\001 \001(\t\0322\n\020Annotations"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"7\n"
          + "\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020"
          + "\002\022\013\n\007DELETED\020\004\"\352\004\n\tPhraseSet\022\014\n\004name\030\001 \001"
          + "(\t\022@\n\007phrases\030\002 \003(\0132/.google.events.clou"
          + "d.speech.v1.PhraseSet.Phrase\022\r\n\005boost\030\004 "
          + "\001(\002\022\024\n\014kms_key_name\030\007 \001(\t\022\034\n\024kms_key_ver"
          + "sion_name\030\010 \001(\t\022\013\n\003uid\030\t \001(\t\022\024\n\014display_"
          + "name\030\n \001(\t\022=\n\005state\030\013 \001(\0162..google.event"
          + "s.cloud.speech.v1.PhraseSet.State\022/\n\013del"
          + "ete_time\030\014 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022/\n\013expire_time\030\r \001(\0132\032.google.protobu"
          + "f.Timestamp\022N\n\013annotations\030\016 \003(\01329.googl"
          + "e.events.cloud.speech.v1.PhraseSet.Annot"
          + "ationsEntry\022\014\n\004etag\030\017 \001(\t\022\023\n\013reconciling"
          + "\030\020 \001(\010\032&\n\006Phrase\022\r\n\005value\030\001 \001(\t\022\r\n\005boost"
          + "\030\002 \001(\002\0322\n\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\"7\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\n\n\006ACTIVE\020\002\022\013\n\007DELETED\020\004\"O\n\022P"
          + "hraseSetEventData\0229\n\007payload\030\001 \001(\0132(.goo"
          + "gle.events.cloud.speech.v1.PhraseSet\"S\n\024"
          + "CustomClassEventData\022;\n\007payload\030\001 \001(\0132*."
          + "google.events.cloud.speech.v1.CustomClas"
          + "sB\222\001\n!com.google.events.cloud.speech.v1P"
          + "\001\252\002&Google.Events.Protobuf.Cloud.Speech."
          + "V1\312\002\035Google\\Events\\Cloud\\Speech\\V1\352\002!Goo"
          + "gle::Events::Cloud::Speech::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_cloud_speech_v1_CustomClass_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_speech_v1_CustomClass_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_speech_v1_CustomClass_descriptor,
            new java.lang.String[] {
              "Name",
              "CustomClassId",
              "Items",
              "KmsKeyName",
              "KmsKeyVersionName",
              "Uid",
              "DisplayName",
              "State",
              "DeleteTime",
              "ExpireTime",
              "Annotations",
              "Etag",
              "Reconciling",
            });
    internal_static_google_events_cloud_speech_v1_CustomClass_ClassItem_descriptor =
        internal_static_google_events_cloud_speech_v1_CustomClass_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_speech_v1_CustomClass_ClassItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_speech_v1_CustomClass_ClassItem_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_events_cloud_speech_v1_CustomClass_AnnotationsEntry_descriptor =
        internal_static_google_events_cloud_speech_v1_CustomClass_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_events_cloud_speech_v1_CustomClass_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_speech_v1_CustomClass_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_speech_v1_PhraseSet_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_speech_v1_PhraseSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_speech_v1_PhraseSet_descriptor,
            new java.lang.String[] {
              "Name",
              "Phrases",
              "Boost",
              "KmsKeyName",
              "KmsKeyVersionName",
              "Uid",
              "DisplayName",
              "State",
              "DeleteTime",
              "ExpireTime",
              "Annotations",
              "Etag",
              "Reconciling",
            });
    internal_static_google_events_cloud_speech_v1_PhraseSet_Phrase_descriptor =
        internal_static_google_events_cloud_speech_v1_PhraseSet_descriptor.getNestedTypes().get(0);
    internal_static_google_events_cloud_speech_v1_PhraseSet_Phrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_speech_v1_PhraseSet_Phrase_descriptor,
            new java.lang.String[] {
              "Value", "Boost",
            });
    internal_static_google_events_cloud_speech_v1_PhraseSet_AnnotationsEntry_descriptor =
        internal_static_google_events_cloud_speech_v1_PhraseSet_descriptor.getNestedTypes().get(1);
    internal_static_google_events_cloud_speech_v1_PhraseSet_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_speech_v1_PhraseSet_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_speech_v1_PhraseSetEventData_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_cloud_speech_v1_PhraseSetEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_speech_v1_PhraseSetEventData_descriptor,
            new java.lang.String[] {
              "Payload",
            });
    internal_static_google_events_cloud_speech_v1_CustomClassEventData_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_events_cloud_speech_v1_CustomClassEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_speech_v1_CustomClassEventData_descriptor,
            new java.lang.String[] {
              "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
