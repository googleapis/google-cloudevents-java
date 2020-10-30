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
 * App information.
 */
public class AppInfo {
    private String appID;
    private String appInstanceID;
    private String appPlatform;
    private String appStore;
    private String appVersion;

    /**
     * Unique application identifier within an app store.
     */
    public String getAppID() { return appID; }
    public void setAppID(String value) { this.appID = value; }

    /**
     * Unique id for this instance of the app.
     * Example: "71683BF9FA3B4B0D9535A1F05188BAF3"
     */
    public String getAppInstanceID() { return appInstanceID; }
    public void setAppInstanceID(String value) { this.appInstanceID = value; }

    /**
     * The app platform.
     * Eg "ANDROID", "IOS".
     */
    public String getAppPlatform() { return appPlatform; }
    public void setAppPlatform(String value) { this.appPlatform = value; }

    /**
     * The identifier of the store that installed the app.
     * Eg. "com.sec.android.app.samsungapps", "com.amazon.venezia",
     * "com.nokia.nstore"
     */
    public String getAppStore() { return appStore; }
    public void setAppStore(String value) { this.appStore = value; }

    /**
     * The app's version name
     * Examples: "1.0", "4.3.1.1.213361", "2.3 (1824253)", "v1.8b22p6"
     */
    public String getAppVersion() { return appVersion; }
    public void setAppVersion(String value) { this.appVersion = value; }
}
