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

public enum StatusEnum {
    CANCELLED, EXPIRED, FAILURE, INTERNAL_ERROR, QUEUED, STATUS_UNKNOWN, SUCCESS, TIMEOUT, WORKING;

    public String toValue() {
        switch (this) {
            case CANCELLED: return "CANCELLED";
            case EXPIRED: return "EXPIRED";
            case FAILURE: return "FAILURE";
            case INTERNAL_ERROR: return "INTERNAL_ERROR";
            case QUEUED: return "QUEUED";
            case STATUS_UNKNOWN: return "STATUS_UNKNOWN";
            case SUCCESS: return "SUCCESS";
            case TIMEOUT: return "TIMEOUT";
            case WORKING: return "WORKING";
        }
        return null;
    }

    public static StatusEnum forValue(String value) throws IOException {
        if (value.equals("CANCELLED")) return CANCELLED;
        if (value.equals("EXPIRED")) return EXPIRED;
        if (value.equals("FAILURE")) return FAILURE;
        if (value.equals("INTERNAL_ERROR")) return INTERNAL_ERROR;
        if (value.equals("QUEUED")) return QUEUED;
        if (value.equals("STATUS_UNKNOWN")) return STATUS_UNKNOWN;
        if (value.equals("SUCCESS")) return SUCCESS;
        if (value.equals("TIMEOUT")) return TIMEOUT;
        if (value.equals("WORKING")) return WORKING;
        throw new IOException("Cannot deserialize StatusEnum");
    }
}
