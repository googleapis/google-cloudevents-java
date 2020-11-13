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

public enum TypeEnum {
    MD5, NONE, SHA256;

    public String toValue() {
        switch (this) {
            case MD5: return "MD5";
            case NONE: return "NONE";
            case SHA256: return "SHA256";
        }
        return null;
    }

    public static TypeEnum forValue(String value) throws IOException {
        if (value.equals("MD5")) return MD5;
        if (value.equals("NONE")) return NONE;
        if (value.equals("SHA256")) return SHA256;
        throw new IOException("Cannot deserialize TypeEnum");
    }
}
