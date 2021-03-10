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

package com.google.events.cloud.audit.v1;

import java.io.IOException;

public enum InsertID {
    ALERT, CRITICAL, DEBUG, DEFAULT, EMERGENCY, ERROR, INFO, NOTICE, WARNING;

    public String toValue() {
        switch (this) {
            case ALERT: return "ALERT";
            case CRITICAL: return "CRITICAL";
            case DEBUG: return "DEBUG";
            case DEFAULT: return "DEFAULT";
            case EMERGENCY: return "EMERGENCY";
            case ERROR: return "ERROR";
            case INFO: return "INFO";
            case NOTICE: return "NOTICE";
            case WARNING: return "WARNING";
        }
        return null;
    }

    public static InsertID forValue(String value) throws IOException {
        if (value.equals("ALERT")) return ALERT;
        if (value.equals("CRITICAL")) return CRITICAL;
        if (value.equals("DEBUG")) return DEBUG;
        if (value.equals("DEFAULT")) return DEFAULT;
        if (value.equals("EMERGENCY")) return EMERGENCY;
        if (value.equals("ERROR")) return ERROR;
        if (value.equals("INFO")) return INFO;
        if (value.equals("NOTICE")) return NOTICE;
        if (value.equals("WARNING")) return WARNING;
        throw new IOException("Cannot deserialize InsertID");
    }
}
