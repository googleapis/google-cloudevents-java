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
// source: google/events/cloud/beyondcorp/appconnections/v1/data.proto

package com.google.events.cloud.beyondcorp.appconnections.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnectionEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnectionEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/events/cloud/beyondcorp/appconn"
          + "ections/v1/data.proto\0220google.events.clo"
          + "ud.beyondcorp.appconnections.v1\032\037google/"
          + "protobuf/timestamp.proto\"\335\010\n\rAppConnecti"
          + "on\022\014\n\004name\030\001 \001(\t\022/\n\013create_time\030\002 \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013update_time"
          + "\030\003 \001(\0132\032.google.protobuf.Timestamp\022[\n\006la"
          + "bels\030\004 \003(\0132K.google.events.cloud.beyondc"
          + "orp.appconnections.v1.AppConnection.Labe"
          + "lsEntry\022\024\n\014display_name\030\005 \001(\t\022\013\n\003uid\030\006 \001"
          + "(\t\022R\n\004type\030\007 \001(\0162D.google.events.cloud.b"
          + "eyondcorp.appconnections.v1.AppConnectio"
          + "n.Type\022q\n\024application_endpoint\030\010 \001(\0132S.g"
          + "oogle.events.cloud.beyondcorp.appconnect"
          + "ions.v1.AppConnection.ApplicationEndpoin"
          + "t\022\022\n\nconnectors\030\t \003(\t\022T\n\005state\030\n \001(\0162E.g"
          + "oogle.events.cloud.beyondcorp.appconnect"
          + "ions.v1.AppConnection.State\022X\n\007gateway\030\013"
          + " \001(\0132G.google.events.cloud.beyondcorp.ap"
          + "pconnections.v1.AppConnection.Gateway\0321\n"
          + "\023ApplicationEndpoint\022\014\n\004host\030\001 \001(\t\022\014\n\004po"
          + "rt\030\002 \001(\005\032\340\001\n\007Gateway\022Z\n\004type\030\002 \001(\0162L.goo"
          + "gle.events.cloud.beyondcorp.appconnectio"
          + "ns.v1.AppConnection.Gateway.Type\022\013\n\003uri\030"
          + "\003 \001(\t\022\024\n\014ingress_port\030\004 \001(\005\022\023\n\013app_gatew"
          + "ay\030\005 \001(\t\022\r\n\005l7psc\030\006 \001(\t\"2\n\004Type\022\024\n\020TYPE_"
          + "UNSPECIFIED\020\000\022\024\n\020GCP_REGIONAL_MIG\020\001\032-\n\013L"
          + "abelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002"
          + "8\001\"+\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\r\n\tTCP_"
          + "PROXY\020\001\"_\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022"
          + "\014\n\010CREATING\020\001\022\013\n\007CREATED\020\002\022\014\n\010UPDATING\020\003"
          + "\022\014\n\010DELETING\020\004\022\010\n\004DOWN\020\005\"{\n\026AppConnectio"
          + "nEventData\022U\n\007payload\030\001 \001(\0132?.google.eve"
          + "nts.cloud.beyondcorp.appconnections.v1.A"
          + "ppConnectionH\000\210\001\001B\n\n\010_payloadB\337\001\n4com.go"
          + "ogle.events.cloud.beyondcorp.appconnecti"
          + "ons.v1P\001\252\0029Google.Events.Protobuf.Cloud."
          + "BeyondCorp.AppConnections.V1\312\0020Google\\Ev"
          + "ents\\Cloud\\BeyondCorp\\AppConnections\\V1\352"
          + "\0025Google::Events::Cloud::BeyondCorp::App"
          + "Connections::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "DisplayName",
              "Uid",
              "Type",
              "ApplicationEndpoint",
              "Connectors",
              "State",
              "Gateway",
            });
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor =
        internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor,
            new java.lang.String[] {
              "Host", "Port",
            });
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor =
        internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor,
            new java.lang.String[] {
              "Type", "Uri", "IngressPort", "AppGateway", "L7Psc",
            });
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor =
        internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnectionEventData_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnectionEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_appconnections_v1_AppConnectionEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
