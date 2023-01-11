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

package com.google.events.cloud.cloudbuild.v1;

import java.io.IOException;

public enum SubstitutionOptionEnum {
    ALLOW_LOOSE, MUST_MATCH;

    public String toValue() {
        switch (this) {
            case ALLOW_LOOSE: return "ALLOW_LOOSE";
            case MUST_MATCH: return "MUST_MATCH";
        }
        return null;
    }

    public static SubstitutionOptionEnum forValue(String value) throws IOException {
        if (value.equals("ALLOW_LOOSE")) return ALLOW_LOOSE;
        if (value.equals("MUST_MATCH")) return MUST_MATCH;
        throw new IOException("Cannot deserialize SubstitutionOptionEnum");
    }
}
