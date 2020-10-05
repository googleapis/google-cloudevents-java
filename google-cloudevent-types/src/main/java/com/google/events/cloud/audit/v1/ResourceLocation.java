package com.google.events.cloud.audit.v1;

/**
 * The resource location information.
 *
 * Location information about a resource.
 */
public class ResourceLocation {
    private String[] currentLocations;
    private String[] originalLocations;

    /**
     * The locations of a resource after the execution of the operation. Requests to create or
     * delete a location based resource must populate the 'current_locations' field and not the
     * 'original_locations' field.
     */
    public String[] getCurrentLocations() { return currentLocations; }
    public void setCurrentLocations(String[] value) { this.currentLocations = value; }

    /**
     * The locations of a resource prior to the execution of the operation. Requests that mutate
     * the resource's location must populate both the 'original_locations' as well as the
     * 'current_locations' fields. For example:
     */
    public String[] getOriginalLocations() { return originalLocations; }
    public void setOriginalLocations(String[] value) { this.originalLocations = value; }
}
