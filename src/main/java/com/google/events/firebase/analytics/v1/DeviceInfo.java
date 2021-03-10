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
 * Device information.
 */
public class DeviceInfo {
    private String deviceCategory;
    private String deviceID;
    private String deviceModel;
    private Long deviceTimeZoneOffsetSeconds;
    private Boolean limitedAdTracking;
    private String mobileBrandName;
    private String mobileMarketingName;
    private String mobileModelName;
    private String platformVersion;
    private String resettableDeviceID;
    private String userDefaultLanguage;

    /**
     * Device category.
     * Eg. tablet or mobile.
     */
    public String getDeviceCategory() { return deviceCategory; }
    public void setDeviceCategory(String value) { this.deviceCategory = value; }

    /**
     * Vendor specific device identifier. This is IDFV on iOS. Not used for
     * Android.
     * Example: "599F9C00-92DC-4B5C-9464-7971F01F8370"
     */
    public String getDeviceID() { return deviceID; }
    public void setDeviceID(String value) { this.deviceID = value; }

    /**
     * Device model.
     * Eg. GT-I9192
     */
    public String getDeviceModel() { return deviceModel; }
    public void setDeviceModel(String value) { this.deviceModel = value; }

    /**
     * The timezone of the device when data was uploaded as seconds skew from UTC.
     */
    public Long getDeviceTimeZoneOffsetSeconds() { return deviceTimeZoneOffsetSeconds; }
    public void setDeviceTimeZoneOffsetSeconds(Long value) { this.deviceTimeZoneOffsetSeconds = value; }

    /**
     * The device's Limit Ad Tracking setting.
     * When true, we cannot use device_id for remarketing, demographics or
     * influencing ads serving behaviour. However, we can use device_id for
     * conversion tracking and campaign attribution.
     */
    public Boolean getLimitedAdTracking() { return limitedAdTracking; }
    public void setLimitedAdTracking(Boolean value) { this.limitedAdTracking = value; }

    /**
     * Device brand name.
     * Eg. Samsung, HTC, etc.
     */
    public String getMobileBrandName() { return mobileBrandName; }
    public void setMobileBrandName(String value) { this.mobileBrandName = value; }

    /**
     * Device marketing name.
     * Eg. Galaxy S4 Mini
     */
    public String getMobileMarketingName() { return mobileMarketingName; }
    public void setMobileMarketingName(String value) { this.mobileMarketingName = value; }

    /**
     * Device model name.
     * Eg. GT-I9192
     */
    public String getMobileModelName() { return mobileModelName; }
    public void setMobileModelName(String value) { this.mobileModelName = value; }

    /**
     * Device OS version when data capture ended.
     * Eg. 4.4.2
     */
    public String getPlatformVersion() { return platformVersion; }
    public void setPlatformVersion(String value) { this.platformVersion = value; }

    /**
     * The type of the resettable_device_id is always IDFA on iOS and AdId
     * on Android.
     * Example: "71683BF9-FA3B-4B0D-9535-A1F05188BAF3"
     */
    public String getResettableDeviceID() { return resettableDeviceID; }
    public void setResettableDeviceID(String value) { this.resettableDeviceID = value; }

    /**
     * The user language.
     * Eg. "en-us", "en-za", "zh-tw", "jp"
     */
    public String getUserDefaultLanguage() { return userDefaultLanguage; }
    public void setUserDefaultLanguage(String value) { this.userDefaultLanguage = value; }
}
