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

package com.google.events.cloud.audit.v1;

import java.util.Map;

/**
 * The destination of a network activity, such as accepting a TCP connection.
 */
public class Peer {
    private String ip;
    private Map<String, Object> labels;
    private Long port;
    private String principal;
    private String regionCode;

    public String getIP() { return ip; }
    public void setIP(String value) { this.ip = value; }

    public Map<String, Object> getLabels() { return labels; }
    public void setLabels(Map<String, Object> value) { this.labels = value; }

    public Long getPort() { return port; }
    public void setPort(Long value) { this.port = value; }

    public String getPrincipal() { return principal; }
    public void setPrincipal(String value) { this.principal = value; }

    public String getRegionCode() { return regionCode; }
    public void setRegionCode(String value) { this.regionCode = value; }
}
