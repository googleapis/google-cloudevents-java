package com.google.events.cloud.audit.v1;

import java.util.Map;

/**
 * The log entry payload, which is always an AuditLog for Cloud Audit Log events.
 */
public class AuditLog {
    private AuthenticationInfo authenticationInfo;
    private AuthorizationInfo[] authorizationInfo;
    private Map<String, Object> metadata;
    private String methodName;
    private Long numResponseItems;
    private Map<String, Object> request;
    private RequestMetadata requestMetadata;
    private ResourceLocation resourceLocation;
    private String resourceName;
    private Map<String, Object> resourceOriginalState;
    private Map<String, Object> response;
    private Map<String, Object> serviceData;
    private String serviceName;
    private Status status;

    /**
     * Authentication information.
     */
    public AuthenticationInfo getAuthenticationInfo() { return authenticationInfo; }
    public void setAuthenticationInfo(AuthenticationInfo value) { this.authenticationInfo = value; }

    /**
     * Authorization information. If there are multiple resources or permissions involved, then
     * there is one AuthorizationInfo element for each {resource, permission} tuple.
     */
    public AuthorizationInfo[] getAuthorizationInfo() { return authorizationInfo; }
    public void setAuthorizationInfo(AuthorizationInfo[] value) { this.authorizationInfo = value; }

    /**
     * Other service-specific data about the request, response, and other information associated
     * with the current audited event.
     */
    public Map<String, Object> getMetadata() { return metadata; }
    public void setMetadata(Map<String, Object> value) { this.metadata = value; }

    /**
     * The name of the service method or operation. For example
     * "google.datastore.v1.Datastore.RunQuery"
     */
    public String getMethodName() { return methodName; }
    public void setMethodName(String value) { this.methodName = value; }

    /**
     * The number of items returned from a List or Query API method, if applicable.
     */
    public Long getNumResponseItems() { return numResponseItems; }
    public void setNumResponseItems(Long value) { this.numResponseItems = value; }

    /**
     * The operation request. This may not include all request parameters, such as those that
     * are too large, privacy-sensitive, or duplicated elsewhere in the log record. It should
     * never include user-generated data, such as file contents. When the JSON object
     * represented here has a proto equivalent, the proto name will be indicated in the `@type`
     * property.
     */
    public Map<String, Object> getRequest() { return request; }
    public void setRequest(Map<String, Object> value) { this.request = value; }

    /**
     * Metadata about the operation.
     */
    public RequestMetadata getRequestMetadata() { return requestMetadata; }
    public void setRequestMetadata(RequestMetadata value) { this.requestMetadata = value; }

    /**
     * The resource location information.
     */
    public ResourceLocation getResourceLocation() { return resourceLocation; }
    public void setResourceLocation(ResourceLocation value) { this.resourceLocation = value; }

    /**
     * The resource or collection that is the target of the operation. For example
     * "shelves/SHELF_ID/books"
     */
    public String getResourceName() { return resourceName; }
    public void setResourceName(String value) { this.resourceName = value; }

    /**
     * The resource's original state before mutation.
     */
    public Map<String, Object> getResourceOriginalState() { return resourceOriginalState; }
    public void setResourceOriginalState(Map<String, Object> value) { this.resourceOriginalState = value; }

    /**
     * The operation response. This may not include all response elements, such as those that
     * are too large, privacy-sensitive, or duplicated elsewhere in the log record. It should
     * never include user-generated data, such as file contents. When the JSON object
     * represented here has a proto equivalent, the proto name will be indicated in the `@type`
     * property.
     */
    public Map<String, Object> getResponse() { return response; }
    public void setResponse(Map<String, Object> value) { this.response = value; }

    /**
     * Deprecated, use `metadata` field instead. Other service-specific data about the request,
     * response, and other activities. When the JSON object represented here has a proto
     * equivalent, the proto name will be indicated in the `@type` property.
     */
    public Map<String, Object> getServiceData() { return serviceData; }
    public void setServiceData(Map<String, Object> value) { this.serviceData = value; }

    /**
     * The name of the API service performing the operation. For example,
     * `"datastore.googleapis.com"`.
     */
    public String getServiceName() { return serviceName; }
    public void setServiceName(String value) { this.serviceName = value; }

    /**
     * The status of the overall operation.
     */
    public Status getStatus() { return status; }
    public void setStatus(Status value) { this.status = value; }
}
