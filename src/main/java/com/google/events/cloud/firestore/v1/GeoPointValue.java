/**
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.firestore.v1;

/**
 * A geo point value representing a point on the surface of Earth.
 */
public class GeoPointValue {
    private Double latitude;
    private Double longitude;

    /**
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     */
    public Double getLatitude() { return latitude; }
    public void setLatitude(Double value) { this.latitude = value; }

    /**
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     */
    public Double getLongitude() { return longitude; }
    public void setLongitude(Double value) { this.longitude = value; }
}
