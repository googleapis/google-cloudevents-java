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

/**
 * The data within all Firestore document events.
 */
public class DocumentEventData {
    private OldValue oldValue;
    private UpdateMask updateMask;
    private Value value;

    /**
     * A Document object containing a pre-operation document snapshot.
     * This is only populated for update and delete events.
     */
    public OldValue getOldValue() { return oldValue; }
    public void setOldValue(OldValue value) { this.oldValue = value; }

    /**
     * A DocumentMask object that lists changed fields.
     * This is only populated for update events.
     */
    public UpdateMask getUpdateMask() { return updateMask; }
    public void setUpdateMask(UpdateMask value) { this.updateMask = value; }

    /**
     * A Document object containing a post-operation document snapshot.
     * This is not populated for delete events. (TODO: check this!)
     */
    public Value getValue() { return value; }
    public void setValue(Value value) { this.value = value; }
}
