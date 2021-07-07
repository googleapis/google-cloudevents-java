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

package com.google.events.cloud.firestore.v1;

/**
 * An array value.
 *
 * Cannot directly contain another array value, though can contain an
 * map which contains another array.
 */
public class ArrayValue {
    private ValueElement[] values;

    /**
     * Values in the array.
     */
    public ValueElement[] getValues() { return values; }
    public void setValues(ValueElement[] value) { this.values = value; }
}
