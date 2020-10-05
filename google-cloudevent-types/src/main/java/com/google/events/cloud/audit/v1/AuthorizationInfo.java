package com.google.events.cloud.audit.v1;

/**
 * Authorization information. If there are multiple resources or permissions involved, then
 * there is one AuthorizationInfo element for each {resource, permission} tuple.
 */
public class AuthorizationInfo {
    private Boolean granted;
    private String permission;
    private String resource;
    private Resource resourceAttributes;

    /**
     * Whether or not authorization for resource and permission was granted.
     */
    public Boolean getGranted() { return granted; }
    public void setGranted(Boolean value) { this.granted = value; }

    /**
     * The required IAM permission.
     */
    public String getPermission() { return permission; }
    public void setPermission(String value) { this.permission = value; }

    /**
     * The resource being accessed, as a REST-style string.
     */
    public String getResource() { return resource; }
    public void setResource(String value) { this.resource = value; }

    /**
     * Resource attributes used in IAM condition evaluation. This field contains resource
     * attributes like resource type and resource name. To get the whole view of the attributes
     * used in IAM condition evaluation, the user must also look into
     * AuditLog.request_metadata.request_attributes.
     */
    public Resource getResourceAttributes() { return resourceAttributes; }
    public void setResourceAttributes(Resource value) { this.resourceAttributes = value; }
}
