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

public enum UpdateOriginEnum {
    ADMIN_SDK_NODE, CONSOLE, REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED, REST_API;

    public String toValue() {
        switch (this) {
            case ADMIN_SDK_NODE: return "ADMIN_SDK_NODE";
            case CONSOLE: return "CONSOLE";
            case REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED: return "REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED";
            case REST_API: return "REST_API";
        }
        return null;
    }

    public static UpdateOriginEnum forValue(String value) throws IOException {
        if (value.equals("ADMIN_SDK_NODE")) return ADMIN_SDK_NODE;
        if (value.equals("CONSOLE")) return CONSOLE;
        if (value.equals("REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED")) return REMOTE_CONFIG_UPDATE_ORIGIN_UNSPECIFIED;
        if (value.equals("REST_API")) return REST_API;
        throw new IOException("Cannot deserialize UpdateOriginEnum");
    }
}
