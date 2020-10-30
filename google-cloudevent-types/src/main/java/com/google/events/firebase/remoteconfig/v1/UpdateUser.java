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

package com.google.events.firebase.remoteconfig.v1;

/**
 * Aggregation of all metadata fields about the account that performed the update.
 */
public class UpdateUser {
    private String email;
    private String imageURL;
    private String name;

    /**
     * Email address.
     */
    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    /**
     * Image URL.
     */
    public String getImageURL() { return imageURL; }
    public void setImageURL(String value) { this.imageURL = value; }

    /**
     * Display name.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}
