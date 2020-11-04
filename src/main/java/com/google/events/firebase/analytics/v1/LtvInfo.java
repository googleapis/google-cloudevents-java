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

package com.google.events.firebase.analytics.v1;

/**
 * Lifetime Value information about this user.
 */
public class LtvInfo {
    private String currency;
    private Double revenue;

    /**
     * The currency corresponding to the revenue.
     */
    public String getCurrency() { return currency; }
    public void setCurrency(String value) { this.currency = value; }

    /**
     * The Lifetime Value revenue of this user.
     */
    public Double getRevenue() { return revenue; }
    public void setRevenue(Double value) { this.revenue = value; }
}
