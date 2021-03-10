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

package com.google.events.firebase.remoteconfig.v1;

import java.io.IOException;

public enum UpdateTypeEnum {
    FORCED_UPDATE, INCREMENTAL_UPDATE, REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED, ROLLBACK;

    public String toValue() {
        switch (this) {
            case FORCED_UPDATE: return "FORCED_UPDATE";
            case INCREMENTAL_UPDATE: return "INCREMENTAL_UPDATE";
            case REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED: return "REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED";
            case ROLLBACK: return "ROLLBACK";
        }
        return null;
    }

    public static UpdateTypeEnum forValue(String value) throws IOException {
        if (value.equals("FORCED_UPDATE")) return FORCED_UPDATE;
        if (value.equals("INCREMENTAL_UPDATE")) return INCREMENTAL_UPDATE;
        if (value.equals("REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED")) return REMOTE_CONFIG_UPDATE_TYPE_UNSPECIFIED;
        if (value.equals("ROLLBACK")) return ROLLBACK;
        throw new IOException("Cannot deserialize UpdateTypeEnum");
    }
}
