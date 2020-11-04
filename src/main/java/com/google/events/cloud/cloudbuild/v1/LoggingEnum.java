/**
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.cloud.cloudbuild.v1;

import java.io.IOException;

public enum LoggingEnum {
    GCS_ONLY, LEGACY, LOGGING_UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case GCS_ONLY: return "GCS_ONLY";
            case LEGACY: return "LEGACY";
            case LOGGING_UNSPECIFIED: return "LOGGING_UNSPECIFIED";
        }
        return null;
    }

    public static LoggingEnum forValue(String value) throws IOException {
        if (value.equals("GCS_ONLY")) return GCS_ONLY;
        if (value.equals("LEGACY")) return LEGACY;
        if (value.equals("LOGGING_UNSPECIFIED")) return LOGGING_UNSPECIFIED;
        throw new IOException("Cannot deserialize LoggingEnum");
    }
}
