// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.events.firebase.analytics.v1;

/**
 * The data within Firebase Analytics log events.
 */
public class AnalyticsLogData {
    private EventDim[] eventDim;
    private UserDim userDim;

    /**
     * A repeated record of event related dimensions.
     */
    public EventDim[] getEventDim() { return eventDim; }
    public void setEventDim(EventDim[] value) { this.eventDim = value; }

    /**
     * User related dimensions.
     */
    public UserDim getUserDim() { return userDim; }
    public void setUserDim(UserDim value) { this.userDim = value; }
}
