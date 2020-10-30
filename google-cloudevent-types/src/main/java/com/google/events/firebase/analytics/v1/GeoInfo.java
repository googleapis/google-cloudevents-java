// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.events.firebase.analytics.v1;

/**
 * User's geographic information.
 */
public class GeoInfo {
    private String city;
    private String continent;
    private String country;
    private String region;

    /**
     * The geographic city.
     * Eg. Sao Paulo
     */
    public String getCity() { return city; }
    public void setCity(String value) { this.city = value; }

    /**
     * The geographic continent.
     * Eg. Americas
     */
    public String getContinent() { return continent; }
    public void setContinent(String value) { this.continent = value; }

    /**
     * The geographic country.
     * Eg. Brazil
     */
    public String getCountry() { return country; }
    public void setCountry(String value) { this.country = value; }

    /**
     * The geographic region.
     * Eg. State of Sao Paulo
     */
    public String getRegion() { return region; }
    public void setRegion(String value) { this.region = value; }
}
