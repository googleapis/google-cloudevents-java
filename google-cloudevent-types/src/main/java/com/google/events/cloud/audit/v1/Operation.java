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

package com.google.events.cloud.audit.v1;

/**
 * Information about an operation associated with the log entry, if applicable.
 */
public class Operation {
    private Boolean first;
    private String id;
    private Boolean last;
    private String producer;

    /**
     * True if this is the first log entry in the operation.
     */
    public Boolean getFirst() { return first; }
    public void setFirst(Boolean value) { this.first = value; }

    /**
     * An arbitrary operation identifier. Log entries with the same
     * identifier are assumed to be part of the same operation.
     */
    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    /**
     * True if this is the last log entry in the operation.
     */
    public Boolean getLast() { return last; }
    public void setLast(Boolean value) { this.last = value; }

    /**
     * An arbitrary producer identifier. The combination of `id` and
     * `producer` must be globally unique. Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     */
    public String getProducer() { return producer; }
    public void setProducer(String value) { this.producer = value; }
}
