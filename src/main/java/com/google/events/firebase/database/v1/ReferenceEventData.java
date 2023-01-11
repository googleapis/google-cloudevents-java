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

package com.google.events.firebase.database.v1;

import java.util.Map;

/**
 * The data within all Firebase Real Time Database reference events.
 */
public class ReferenceEventData {
    private Data data;
    private Data delta;

    /**
     * `Value` represents a dynamically typed value which can be either
     * null, a number, a string, a boolean, a recursive struct value, or a
     * list of values. A producer of value is expected to set one of that
     * variants, absence of any variant indicates an error.
     *
     * The JSON representation for `Value` is JSON value.
     */
    public Data getData() { return data; }
    public void setData(Data value) { this.data = value; }

    /**
     * `Value` represents a dynamically typed value which can be either
     * null, a number, a string, a boolean, a recursive struct value, or a
     * list of values. A producer of value is expected to set one of that
     * variants, absence of any variant indicates an error.
     *
     * The JSON representation for `Value` is JSON value.
     */
    public Data getDelta() { return delta; }
    public void setDelta(Data value) { this.delta = value; }
}
