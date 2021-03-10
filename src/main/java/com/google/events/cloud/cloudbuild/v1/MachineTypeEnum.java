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

public enum MachineTypeEnum {
    N1_HIGHCPU_32, N1_HIGHCPU_8, UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case N1_HIGHCPU_32: return "N1_HIGHCPU_32";
            case N1_HIGHCPU_8: return "N1_HIGHCPU_8";
            case UNSPECIFIED: return "UNSPECIFIED";
        }
        return null;
    }

    public static MachineTypeEnum forValue(String value) throws IOException {
        if (value.equals("N1_HIGHCPU_32")) return N1_HIGHCPU_32;
        if (value.equals("N1_HIGHCPU_8")) return N1_HIGHCPU_8;
        if (value.equals("UNSPECIFIED")) return UNSPECIFIED;
        throw new IOException("Cannot deserialize MachineTypeEnum");
    }
}
