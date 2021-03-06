/*
 * Copyright 2021 Google LLC
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

package com.google.events.firebase.analytics.v1;

/**
 * Value for Event Params and UserProperty can be of type string or int or
 * float or double.
 */
public class AnalyticsValue {
    private Double doubleValue;
    private Double floatValue;
    private Long intValue;
    private String stringValue;

    public Double getDoubleValue() { return doubleValue; }
    public void setDoubleValue(Double value) { this.doubleValue = value; }

    public Double getFloatValue() { return floatValue; }
    public void setFloatValue(Double value) { this.floatValue = value; }

    public Long getIntValue() { return intValue; }
    public void setIntValue(Long value) { this.intValue = value; }

    public String getStringValue() { return stringValue; }
    public void setStringValue(String value) { this.stringValue = value; }
}
