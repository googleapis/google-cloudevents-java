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
 * Request attributes used in IAM condition evaluation. This field contains request
 * attributes like request time and access levels associated with the request.
 */
public class Request {
    private Auth auth;
    private Map<String, Object> headers;
    private String host;
    private String id;
    private String method;
    private String path;
    private String protocol;
    private String query;
    private String reason;
    private String scheme;
    private Long size;
    private String time;

    public Auth getAuth() { return auth; }
    public void setAuth(Auth value) { this.auth = value; }

    public Map<String, Object> getHeaders() { return headers; }
    public void setHeaders(Map<String, Object> value) { this.headers = value; }

    public String getHost() { return host; }
    public void setHost(String value) { this.host = value; }

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public String getMethod() { return method; }
    public void setMethod(String value) { this.method = value; }

    public String getPath() { return path; }
    public void setPath(String value) { this.path = value; }

    public String getProtocol() { return protocol; }
    public void setProtocol(String value) { this.protocol = value; }

    public String getQuery() { return query; }
    public void setQuery(String value) { this.query = value; }

    public String getReason() { return reason; }
    public void setReason(String value) { this.reason = value; }

    public String getScheme() { return scheme; }
    public void setScheme(String value) { this.scheme = value; }

    public Long getSize() { return size; }
    public void setSize(Long value) { this.size = value; }

    public String getTime() { return time; }
    public void setTime(String value) { this.time = value; }
}
