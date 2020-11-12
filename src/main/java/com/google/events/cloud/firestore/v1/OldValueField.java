/**
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.firestore.v1;

import java.time.OffsetDateTime;

/**
 * A message that can hold any of the supported value types.
 */
public class OldValueField {
    private ArrayValue arrayValue;
    private Boolean booleanValue;
    private String bytesValue;
    private Double doubleValue;
    private GeoPointValue geoPointValue;
    private IntegerValueUnion integerValue;
    private MapValue mapValue;
    private IntegerValueUnion nullValue;
    private String referenceValue;
    private String stringValue;
    private OffsetDateTime timestampValue;

    /**
     * An array value.
     *
     * Cannot directly contain another array value, though can contain an
     * map which contains another array.
     */
    public ArrayValue getArrayValue() { return arrayValue; }
    public void setArrayValue(ArrayValue value) { this.arrayValue = value; }

    /**
     * A boolean value.
     */
    public Boolean getBooleanValue() { return booleanValue; }
    public void setBooleanValue(Boolean value) { this.booleanValue = value; }

    /**
     * A bytes value.
     *
     * Must not exceed 1 MiB - 89 bytes.
     * Only the first 1,500 bytes are considered by queries.
     */
    public String getBytesValue() { return bytesValue; }
    public void setBytesValue(String value) { this.bytesValue = value; }

    /**
     * A double value.
     */
    public Double getDoubleValue() { return doubleValue; }
    public void setDoubleValue(Double value) { this.doubleValue = value; }

    /**
     * A geo point value representing a point on the surface of Earth.
     */
    public GeoPointValue getGeoPointValue() { return geoPointValue; }
    public void setGeoPointValue(GeoPointValue value) { this.geoPointValue = value; }

    /**
     * An integer value.
     */
    public IntegerValueUnion getIntegerValue() { return integerValue; }
    public void setIntegerValue(IntegerValueUnion value) { this.integerValue = value; }

    /**
     * A map value.
     */
    public MapValue getMapValue() { return mapValue; }
    public void setMapValue(MapValue value) { this.mapValue = value; }

    /**
     * A null value.
     */
    public IntegerValueUnion getNullValue() { return nullValue; }
    public void setNullValue(IntegerValueUnion value) { this.nullValue = value; }

    /**
     * A reference to a document. For example:
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     */
    public String getReferenceValue() { return referenceValue; }
    public void setReferenceValue(String value) { this.referenceValue = value; }

    /**
     * A string value.
     *
     * The string, represented as UTF-8, must not exceed 1 MiB - 89 bytes.
     * Only the first 1,500 bytes of the UTF-8 representation are considered by
     * queries.
     */
    public String getStringValue() { return stringValue; }
    public void setStringValue(String value) { this.stringValue = value; }

    /**
     * A timestamp value.
     *
     * Precise only to microseconds. When stored, any additional precision is
     * rounded down.
     */
    public OffsetDateTime getTimestampValue() { return timestampValue; }
    public void setTimestampValue(OffsetDateTime value) { this.timestampValue = value; }
}
