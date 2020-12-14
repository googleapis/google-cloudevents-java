/*
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

package com.google.events.firebase.analytics.v1;

import java.util.Map;

/**
 * Message containing information pertaining to the event.
 */
public class EventDim {
    private String date;
    private String name;
    private Map<String, AnalyticsValue> params;
    private Long previousTimestampMicros;
    private Long timestampMicros;
    private Double valueInUsd;

    /**
     * The date on which this event was logged.
     * (YYYYMMDD format in the registered timezone of your app.)
     */
    public String getDate() { return date; }
    public void setDate(String value) { this.date = value; }

    /**
     * The name of this event.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * A repeated record of the parameters associated with this event.
     */
    public Map<String, AnalyticsValue> getParams() { return params; }
    public void setParams(Map<String, AnalyticsValue> value) { this.params = value; }

    /**
     * UTC client time when the previous event happened.
     */
    public Long getPreviousTimestampMicros() { return previousTimestampMicros; }
    public void setPreviousTimestampMicros(Long value) { this.previousTimestampMicros = value; }

    /**
     * UTC client time when the event happened.
     */
    public Long getTimestampMicros() { return timestampMicros; }
    public void setTimestampMicros(Long value) { this.timestampMicros = value; }

    /**
     * Value param in USD.
     */
    public Double getValueInUsd() { return valueInUsd; }
    public void setValueInUsd(Double value) { this.valueInUsd = value; }
}
