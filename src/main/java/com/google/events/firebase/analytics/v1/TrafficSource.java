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

package com.google.events.firebase.analytics.v1;

/**
 * Information about marketing campaign which acquired the user.
 */
public class TrafficSource {
    private String userAcquiredCampaign;
    private String userAcquiredMedium;
    private String userAcquiredSource;

    /**
     * The name of the campaign which acquired the user.
     */
    public String getUserAcquiredCampaign() { return userAcquiredCampaign; }
    public void setUserAcquiredCampaign(String value) { this.userAcquiredCampaign = value; }

    /**
     * The name of the medium which acquired the user.
     */
    public String getUserAcquiredMedium() { return userAcquiredMedium; }
    public void setUserAcquiredMedium(String value) { this.userAcquiredMedium = value; }

    /**
     * The name of the network which acquired the user.
     */
    public String getUserAcquiredSource() { return userAcquiredSource; }
    public void setUserAcquiredSource(String value) { this.userAcquiredSource = value; }
}
