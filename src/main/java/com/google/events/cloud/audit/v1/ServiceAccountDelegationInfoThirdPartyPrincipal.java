/**
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

package com.google.events.cloud.audit.v1;

/**
 * Third party identity as the real authority.
 */
public class ServiceAccountDelegationInfoThirdPartyPrincipal {
    private ThirdPartyClaims thirdPartyClaims;

    /**
     * Metadata about third party identity.
     */
    public ThirdPartyClaims getThirdPartyClaims() { return thirdPartyClaims; }
    public void setThirdPartyClaims(ThirdPartyClaims value) { this.thirdPartyClaims = value; }
}
