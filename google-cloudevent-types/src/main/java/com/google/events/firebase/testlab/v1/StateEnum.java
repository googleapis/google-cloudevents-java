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

package com.google.events.firebase.testlab.v1;

import java.io.IOException;

public enum StateEnum {
    ERROR, FINISHED, INVALID, PENDING, TEST_STATE_UNSPECIFIED, VALIDATING;

    public String toValue() {
        switch (this) {
            case ERROR: return "ERROR";
            case FINISHED: return "FINISHED";
            case INVALID: return "INVALID";
            case PENDING: return "PENDING";
            case TEST_STATE_UNSPECIFIED: return "TEST_STATE_UNSPECIFIED";
            case VALIDATING: return "VALIDATING";
        }
        return null;
    }

    public static StateEnum forValue(String value) throws IOException {
        if (value.equals("ERROR")) return ERROR;
        if (value.equals("FINISHED")) return FINISHED;
        if (value.equals("INVALID")) return INVALID;
        if (value.equals("PENDING")) return PENDING;
        if (value.equals("TEST_STATE_UNSPECIFIED")) return TEST_STATE_UNSPECIFIED;
        if (value.equals("VALIDATING")) return VALIDATING;
        throw new IOException("Cannot deserialize StateEnum");
    }
}
