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

package google.events.cloud.audit.v1;

import java.util.Map;

public class Auth {
    private String[] accessLevels;
    private String[] audiences;
    private Map<String, Object> claims;
    private String presenter;
    private String principal;

    public String[] getAccessLevels() { return accessLevels; }
    public void setAccessLevels(String[] value) { this.accessLevels = value; }

    public String[] getAudiences() { return audiences; }
    public void setAudiences(String[] value) { this.audiences = value; }

    public Map<String, Object> getClaims() { return claims; }
    public void setClaims(Map<String, Object> value) { this.claims = value; }

    public String getPresenter() { return presenter; }
    public void setPresenter(String value) { this.presenter = value; }

    public String getPrincipal() { return principal; }
    public void setPrincipal(String value) { this.principal = value; }
}
