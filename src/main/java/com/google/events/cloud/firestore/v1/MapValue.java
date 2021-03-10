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

import java.util.Map;

/**
 * A map value.
 */
public class MapValue {
    private Map<String, MapValueField> fields;

    /**
     * The map's fields.
     *
     * The map keys represent field names. Field names matching the regular
     * expression `__.*__` are reserved. Reserved field names are forbidden except
     * in certain documented contexts. The map keys, represented as UTF-8, must
     * not exceed 1,500 bytes and cannot be empty.
     */
    public Map<String, MapValueField> getFields() { return fields; }
    public void setFields(Map<String, MapValueField> value) { this.fields = value; }
}
