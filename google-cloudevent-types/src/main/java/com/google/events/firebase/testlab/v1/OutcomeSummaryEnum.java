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

public enum OutcomeSummaryEnum {
    FAILURE, INCONCLUSIVE, OUTCOME_SUMMARY_UNSPECIFIED, SKIPPED, SUCCESS;

    public String toValue() {
        switch (this) {
            case FAILURE: return "FAILURE";
            case INCONCLUSIVE: return "INCONCLUSIVE";
            case OUTCOME_SUMMARY_UNSPECIFIED: return "OUTCOME_SUMMARY_UNSPECIFIED";
            case SKIPPED: return "SKIPPED";
            case SUCCESS: return "SUCCESS";
        }
        return null;
    }

    public static OutcomeSummaryEnum forValue(String value) throws IOException {
        if (value.equals("FAILURE")) return FAILURE;
        if (value.equals("INCONCLUSIVE")) return INCONCLUSIVE;
        if (value.equals("OUTCOME_SUMMARY_UNSPECIFIED")) return OUTCOME_SUMMARY_UNSPECIFIED;
        if (value.equals("SKIPPED")) return SKIPPED;
        if (value.equals("SUCCESS")) return SUCCESS;
        throw new IOException("Cannot deserialize OutcomeSummaryEnum");
    }
}
