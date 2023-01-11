/*
 * Copyright 2021 Google LLC
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

package com.google.events.cloud.cloudbuild.v1;

/**
 * Volume describes a Docker container volume which is mounted into build steps
 * in order to persist files across build step execution.
 */
public class Volume {
    private String name;
    private String path;

    /**
     * Name of the volume to mount.
     *
     * Volume names must be unique per build step and must be valid names for
     * Docker volumes. Each named volume must be used by at least two build steps.
     */
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    /**
     * Path at which to mount the volume.
     *
     * Paths must be absolute and cannot conflict with other volume paths on the
     * same build step or with certain reserved volume paths.
     */
    public String getPath() { return path; }
    public void setPath(String value) { this.path = value; }
}
