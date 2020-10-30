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

package com.google.events.cloud.firestore.v1;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * A Document object containing a post-operation document snapshot.
 * This is not populated for delete events. (TODO: check this!)
 *
 * A Document object containing a pre-operation document snapshot.
 * This is only populated for update and delete events.
 *
 * A Firestore document.
 */
public class Value {
    private OffsetDateTime createTime;
    private Map<String, OldValueField> fields;
    private String name;
    private OffsetDateTime updateTime;

    /**
     * The time at which the document was created.
     *
     * This value increases monotonically when a document is deleted then
     * recreated. It can also be compared to values from other documents and
     * the `read_time` of a query.
     */
    public OffsetDateTime getCreateTime() { return createTime; }
    public void setCreateTime(OffsetDateTime value) { this.createTime = value; }

    /**
     * The document's fields.
     *
     * The map keys represent field names.
     *
     * A simple field name contains only characters `a` to `z`, `A` to `Z`,
     * `0` to `9`, or `_`, and must not start with `0` to `9`. For example,
     * `foo_bar_17`.
     *
     * Field names matching the regular expression `__.*__` are reserved. Reserved
     * field names are forbidden except in certain documented contexts. The map
     * keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be
     * empty.
     *
     * Field paths may be used in other contexts to refer to structured fields
     * defined here. For `map_value`, the field path is represented by the simple
     * or quoted field names of the containing fields, delimited by `.`. For
     * example, the structured field
     * `"foo" : { map_value: { "x&y" : { string_value: "hello" }}}` would be
     * represented by the field path `foo.x&y`.
     *
     * Within a field path, a quoted field name starts and ends with `` ` `` and
     * may contain any character. Some characters, including `` ` ``, must be
     * escaped using a `\`. For example, `` `x&y` `` represents `x&y` and
     * `` `bak\`tik` `` represents `` bak`tik ``.
     */
    public Map<String, OldValueField> getFields() { return fields; }
    public void setFields(Map<String, OldValueField> value) { this.fields = value; }

    /**
     * The resource name of the document, for example
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * The time at which the document was last changed.
     *
     * This value is initially set to the `create_time` then increases
     * monotonically with each change to the document. It can also be
     * compared to values from other documents and the `read_time` of a query.
     */
    public OffsetDateTime getUpdateTime() { return updateTime; }
    public void setUpdateTime(OffsetDateTime value) { this.updateTime = value; }
}
