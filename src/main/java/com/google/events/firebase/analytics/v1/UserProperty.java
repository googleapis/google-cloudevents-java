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

public class UserProperty {
    private Long index;
    private String setTimestampUsec;
    private Value value;

    /**
     * Index for user property (one-based).
     */
    public Long getIndex() { return index; }
    public void setIndex(Long value) { this.index = value; }

    /**
     * UTC client time when user property was last set.
     */
    public String getSetTimestampUsec() { return setTimestampUsec; }
    public void setSetTimestampUsec(String value) { this.setTimestampUsec = value; }

    /**
     * Last set value of user property.
     */
    public Value getValue() { return value; }
    public void setValue(Value value) { this.value = value; }
}
