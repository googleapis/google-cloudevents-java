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

package com.google.events.firebase.auth.v1;

/**
 * The data within all Firebase Auth events
 */
public class AuthEventData {
    private CustomClaims customClaims;
    private Boolean disabled;
    private String displayName;
    private String email;
    private Boolean emailVerified;
    private Metadata metadata;
    private String phoneNumber;
    private String photoURL;
    private ProviderDatum[] providerData;
    private String uid;

    /**
     * User's custom claims, typically used to define user roles and propagated
     * to an authenticated user's ID token.
     */
    public CustomClaims getCustomClaims() { return customClaims; }
    public void setCustomClaims(CustomClaims value) { this.customClaims = value; }

    /**
     * Whether the user is disabled.
     */
    public Boolean getDisabled() { return disabled; }
    public void setDisabled(Boolean value) { this.disabled = value; }

    /**
     * The user's display name.
     */
    public String getDisplayName() { return displayName; }
    public void setDisplayName(String value) { this.displayName = value; }

    /**
     * The user's primary email, if set.
     */
    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    /**
     * Whether or not the user's primary email is verified.
     */
    public Boolean getEmailVerified() { return emailVerified; }
    public void setEmailVerified(Boolean value) { this.emailVerified = value; }

    /**
     * Additional metadata about the user.
     */
    public Metadata getMetadata() { return metadata; }
    public void setMetadata(Metadata value) { this.metadata = value; }

    /**
     * The user's phone number.
     */
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String value) { this.phoneNumber = value; }

    /**
     * The user's photo URL.
     */
    public String getPhotoURL() { return photoURL; }
    public void setPhotoURL(String value) { this.photoURL = value; }

    /**
     * User's info at the providers
     */
    public ProviderDatum[] getProviderData() { return providerData; }
    public void setProviderData(ProviderDatum[] value) { this.providerData = value; }

    /**
     * The user identifier in the Firebase app.
     */
    public String getUid() { return uid; }
    public void setUid(String value) { this.uid = value; }
}
