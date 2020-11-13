/*
 * Copyright 2020 Google LLC
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

package com.google.events.cloud.cloudbuild.v1;

import java.io.IOException;

public enum LogStreamingOptionEnum {
    STREAM_DEFAULT, STREAM_OFF, STREAM_ON;

    public String toValue() {
        switch (this) {
            case STREAM_DEFAULT: return "STREAM_DEFAULT";
            case STREAM_OFF: return "STREAM_OFF";
            case STREAM_ON: return "STREAM_ON";
        }
        return null;
    }

    public static LogStreamingOptionEnum forValue(String value) throws IOException {
        if (value.equals("STREAM_DEFAULT")) return STREAM_DEFAULT;
        if (value.equals("STREAM_OFF")) return STREAM_OFF;
        if (value.equals("STREAM_ON")) return STREAM_ON;
        throw new IOException("Cannot deserialize LogStreamingOptionEnum");
    }
}
