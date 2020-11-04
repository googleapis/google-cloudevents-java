/**
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.events.firebase.auth.v1;

/**
 * User's info at the identity provider
 */
public class ProviderDatum {
    private String displayName;
    private String email;
    private String photoURL;
    private String providerID;
    private String uid;

    /**
     * The display name for the linked provider.
     */
    public String getDisplayName() { return displayName; }
    public void setDisplayName(String value) { this.displayName = value; }

    /**
     * The email for the linked provider.
     */
    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    /**
     * The photo URL for the linked provider.
     */
    public String getPhotoURL() { return photoURL; }
    public void setPhotoURL(String value) { this.photoURL = value; }

    /**
     * The linked provider ID (e.g. "google.com" for the Google provider).
     */
    public String getProviderID() { return providerID; }
    public void setProviderID(String value) { this.providerID = value; }

    /**
     * The user identifier for the linked provider.
     */
    public String getUid() { return uid; }
    public void setUid(String value) { this.uid = value; }
}
