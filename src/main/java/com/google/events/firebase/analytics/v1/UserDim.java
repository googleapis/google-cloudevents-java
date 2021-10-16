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

import java.util.Map;

/**
 * User related dimensions.
 *
 * Message containing information about the user associated with the event.
 */
public class UserDim {
    private AppInfo appInfo;
    private BundleInfo bundleInfo;
    private DeviceInfo deviceInfo;
    private Long firstOpenTimestampMicros;
    private GeoInfo geoInfo;
    private LtvInfo ltvInfo;
    private TrafficSource trafficSource;
    private String userID;
    private Map<String, UserPropertyValue> userProperties;

    /**
     * App information.
     */
    public AppInfo getAppInfo() { return appInfo; }
    public void setAppInfo(AppInfo value) { this.appInfo = value; }

    /**
     * Information regarding the bundle in which these events were uploaded.
     */
    public BundleInfo getBundleInfo() { return bundleInfo; }
    public void setBundleInfo(BundleInfo value) { this.bundleInfo = value; }

    /**
     * Device information.
     */
    public DeviceInfo getDeviceInfo() { return deviceInfo; }
    public void setDeviceInfo(DeviceInfo value) { this.deviceInfo = value; }

    /**
     * The time (in microseconds) at which the user first opened the app.
     */
    public Long getFirstOpenTimestampMicros() { return firstOpenTimestampMicros; }
    public void setFirstOpenTimestampMicros(Long value) { this.firstOpenTimestampMicros = value; }

    /**
     * User's geographic information.
     */
    public GeoInfo getGeoInfo() { return geoInfo; }
    public void setGeoInfo(GeoInfo value) { this.geoInfo = value; }

    /**
     * Lifetime Value information about this user.
     */
    public LtvInfo getLtvInfo() { return ltvInfo; }
    public void setLtvInfo(LtvInfo value) { this.ltvInfo = value; }

    /**
     * Information about marketing campaign which acquired the user.
     */
    public TrafficSource getTrafficSource() { return trafficSource; }
    public void setTrafficSource(TrafficSource value) { this.trafficSource = value; }

    /**
     * The user ID set via the setUserId API.
     */
    public String getUserID() { return userID; }
    public void setUserID(String value) { this.userID = value; }

    /**
     * A repeated record of user properties set with the setUserProperty API.
     * https://firebase.google.com/docs/analytics/android/properties
     */
    public Map<String, UserPropertyValue> getUserProperties() { return userProperties; }
    public void setUserProperties(Map<String, UserPropertyValue> value) { this.userProperties = value; }
}
