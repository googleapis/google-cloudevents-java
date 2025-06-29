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
// source: google/events/cloud/apigateway/v1/data.proto

package com.google.events.cloud.apigateway.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_Api_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_Api_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_Api_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_Api_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_File_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_OpenApiDocument_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_OpenApiDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_GrpcServiceDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_GrpcServiceDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_ApiConfig_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_Gateway_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_Gateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_Gateway_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_Gateway_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_GatewayEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_GatewayEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_ApiConfigEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_ApiConfigEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_apigateway_v1_ApiEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_apigateway_v1_ApiEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/events/cloud/apigateway/v1/data"
          + ".proto\022!google.events.cloud.apigateway.v"
          + "1\032\037google/protobuf/timestamp.proto\"\266\003\n\003A"
          + "pi\022\014\n\004name\030\001 \001(\t\022/\n\013create_time\030\002 \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013update_time"
          + "\030\003 \001(\0132\032.google.protobuf.Timestamp\022B\n\006la"
          + "bels\030\004 \003(\01322.google.events.cloud.apigate"
          + "way.v1.Api.LabelsEntry\022\024\n\014display_name\030\005"
          + " \001(\t\022\027\n\017managed_service\030\007 \001(\t\022;\n\005state\030\014"
          + " \001(\0162,.google.events.cloud.apigateway.v1"
          + ".Api.State\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r"
          + "\n\005value\030\002 \001(\t:\0028\001\"`\n\005State\022\025\n\021STATE_UNSP"
          + "ECIFIED\020\000\022\014\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\n\n\006F"
          + "AILED\020\003\022\014\n\010DELETING\020\004\022\014\n\010UPDATING\020\005\"\337\007\n\t"
          + "ApiConfig\022\014\n\004name\030\001 \001(\t\022/\n\013create_time\030\002"
          + " \001(\0132\032.google.protobuf.Timestamp\022/\n\013upda"
          + "te_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "p\022H\n\006labels\030\004 \003(\01328.google.events.cloud."
          + "apigateway.v1.ApiConfig.LabelsEntry\022\024\n\014d"
          + "isplay_name\030\005 \001(\t\022\037\n\027gateway_service_acc"
          + "ount\030\016 \001(\t\022\031\n\021service_config_id\030\014 \001(\t\022A\n"
          + "\005state\030\010 \001(\01622.google.events.cloud.apiga"
          + "teway.v1.ApiConfig.State\022W\n\021openapi_docu"
          + "ments\030\t \003(\0132<.google.events.cloud.apigat"
          + "eway.v1.ApiConfig.OpenApiDocument\022Y\n\rgrp"
          + "c_services\030\n \003(\0132B.google.events.cloud.a"
          + "pigateway.v1.ApiConfig.GrpcServiceDefini"
          + "tion\022R\n\027managed_service_configs\030\013 \003(\01321."
          + "google.events.cloud.apigateway.v1.ApiCon"
          + "fig.File\032&\n\004File\022\014\n\004path\030\001 \001(\t\022\020\n\010conten"
          + "ts\030\002 \001(\014\032V\n\017OpenApiDocument\022C\n\010document\030"
          + "\001 \001(\01321.google.events.cloud.apigateway.v"
          + "1.ApiConfig.File\032Z\n\025GrpcServiceDefinitio"
          + "n\022A\n\006source\030\002 \003(\01321.google.events.cloud."
          + "apigateway.v1.ApiConfig.File\032-\n\013LabelsEn"
          + "try\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"p\n\005S"
          + "tate\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020"
          + "\001\022\n\n\006ACTIVE\020\002\022\n\n\006FAILED\020\003\022\014\n\010DELETING\020\004\022"
          + "\014\n\010UPDATING\020\005\022\016\n\nACTIVATING\020\006\"\327\003\n\007Gatewa"
          + "y\022\014\n\004name\030\001 \001(\t\022/\n\013create_time\030\002 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\022/\n\013update_time\030"
          + "\003 \001(\0132\032.google.protobuf.Timestamp\022F\n\006lab"
          + "els\030\004 \003(\01326.google.events.cloud.apigatew"
          + "ay.v1.Gateway.LabelsEntry\022\024\n\014display_nam"
          + "e\030\005 \001(\t\022\022\n\napi_config\030\006 \001(\t\022?\n\005state\030\007 \001"
          + "(\01620.google.events.cloud.apigateway.v1.G"
          + "ateway.State\022\030\n\020default_hostname\030\t \001(\t\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\"`\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\n\n\006FAILED\020\003\022\014\n\010D"
          + "ELETING\020\004\022\014\n\010UPDATING\020\005\"`\n\020GatewayEventD"
          + "ata\022@\n\007payload\030\001 \001(\0132*.google.events.clo"
          + "ud.apigateway.v1.GatewayH\000\210\001\001B\n\n\010_payloa"
          + "d\"d\n\022ApiConfigEventData\022B\n\007payload\030\001 \001(\013"
          + "2,.google.events.cloud.apigateway.v1.Api"
          + "ConfigH\000\210\001\001B\n\n\010_payload\"X\n\014ApiEventData\022"
          + "<\n\007payload\030\001 \001(\0132&.google.events.cloud.a"
          + "pigateway.v1.ApiH\000\210\001\001B\n\n\010_payloadB\242\001\n%co"
          + "m.google.events.cloud.apigateway.v1P\001\252\002*"
          + "Google.Events.Protobuf.Cloud.ApiGateway."
          + "V1\312\002!Google\\Events\\Cloud\\ApiGateway\\V1\352\002"
          + "%Google::Events::Cloud::ApiGateway::V1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_cloud_apigateway_v1_Api_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_apigateway_v1_Api_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_Api_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "DisplayName",
              "ManagedService",
              "State",
            });
    internal_static_google_events_cloud_apigateway_v1_Api_LabelsEntry_descriptor =
        internal_static_google_events_cloud_apigateway_v1_Api_descriptor.getNestedTypes().get(0);
    internal_static_google_events_cloud_apigateway_v1_Api_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_Api_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_ApiConfig_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "DisplayName",
              "GatewayServiceAccount",
              "ServiceConfigId",
              "State",
              "OpenapiDocuments",
              "GrpcServices",
              "ManagedServiceConfigs",
            });
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_File_descriptor =
        internal_static_google_events_cloud_apigateway_v1_ApiConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_File_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_ApiConfig_File_descriptor,
            new java.lang.String[] {
              "Path", "Contents",
            });
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_OpenApiDocument_descriptor =
        internal_static_google_events_cloud_apigateway_v1_ApiConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_OpenApiDocument_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_ApiConfig_OpenApiDocument_descriptor,
            new java.lang.String[] {
              "Document",
            });
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_GrpcServiceDefinition_descriptor =
        internal_static_google_events_cloud_apigateway_v1_ApiConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_GrpcServiceDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_ApiConfig_GrpcServiceDefinition_descriptor,
            new java.lang.String[] {
              "Source",
            });
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_LabelsEntry_descriptor =
        internal_static_google_events_cloud_apigateway_v1_ApiConfig_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_events_cloud_apigateway_v1_ApiConfig_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_ApiConfig_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_apigateway_v1_Gateway_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_events_cloud_apigateway_v1_Gateway_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_Gateway_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "DisplayName",
              "ApiConfig",
              "State",
              "DefaultHostname",
            });
    internal_static_google_events_cloud_apigateway_v1_Gateway_LabelsEntry_descriptor =
        internal_static_google_events_cloud_apigateway_v1_Gateway_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_apigateway_v1_Gateway_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_Gateway_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_events_cloud_apigateway_v1_GatewayEventData_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_events_cloud_apigateway_v1_GatewayEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_GatewayEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    internal_static_google_events_cloud_apigateway_v1_ApiConfigEventData_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_events_cloud_apigateway_v1_ApiConfigEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_ApiConfigEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    internal_static_google_events_cloud_apigateway_v1_ApiEventData_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_events_cloud_apigateway_v1_ApiEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_apigateway_v1_ApiEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
