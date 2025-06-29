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
// source: google/events/firebase/analytics/v1/data.proto

package com.google.events.firebase.analytics.v1;

public interface GeoInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.analytics.v1.GeoInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The geographic continent.
   * Eg. Americas
   * </pre>
   *
   * <code>string continent = 1;</code>
   *
   * @return The continent.
   */
  java.lang.String getContinent();

  /**
   *
   *
   * <pre>
   * The geographic continent.
   * Eg. Americas
   * </pre>
   *
   * <code>string continent = 1;</code>
   *
   * @return The bytes for continent.
   */
  com.google.protobuf.ByteString getContinentBytes();

  /**
   *
   *
   * <pre>
   * The geographic country.
   * Eg. Brazil
   * </pre>
   *
   * <code>string country = 2;</code>
   *
   * @return The country.
   */
  java.lang.String getCountry();

  /**
   *
   *
   * <pre>
   * The geographic country.
   * Eg. Brazil
   * </pre>
   *
   * <code>string country = 2;</code>
   *
   * @return The bytes for country.
   */
  com.google.protobuf.ByteString getCountryBytes();

  /**
   *
   *
   * <pre>
   * The geographic region.
   * Eg. State of Sao Paulo
   * </pre>
   *
   * <code>string region = 3;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();

  /**
   *
   *
   * <pre>
   * The geographic region.
   * Eg. State of Sao Paulo
   * </pre>
   *
   * <code>string region = 3;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * The geographic city.
   * Eg. Sao Paulo
   * </pre>
   *
   * <code>string city = 4;</code>
   *
   * @return The city.
   */
  java.lang.String getCity();

  /**
   *
   *
   * <pre>
   * The geographic city.
   * Eg. Sao Paulo
   * </pre>
   *
   * <code>string city = 4;</code>
   *
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString getCityBytes();
}
