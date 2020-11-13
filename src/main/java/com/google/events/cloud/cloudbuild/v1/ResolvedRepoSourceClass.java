/*
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

package com.google.events.cloud.cloudbuild.v1;

import java.util.Map;

/**
 * A copy of the build's `source.repo_source`, if exists, with any
 * revisions resolved.
 *
 * If provided, get the source from this location in a Cloud Source
 * Repository.
 *
 * Location of the source in a Google Cloud Source Repository.
 */
public class ResolvedRepoSourceClass {
    private String branchName;
    private String commitSHA;
    private String dir;
    private Boolean invertRegex;
    private String projectID;
    private String repoName;
    private Map<String, String> substitutions;
    private String tagName;

    /**
     * Regex matching branches to build.
     *
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     */
    public String getBranchName() { return branchName; }
    public void setBranchName(String value) { this.branchName = value; }

    /**
     * Explicit commit SHA to build.
     */
    public String getCommitSHA() { return commitSHA; }
    public void setCommitSHA(String value) { this.commitSHA = value; }

    /**
     * Directory, relative to the source root, in which to run the build.
     *
     * This must be a relative path. If a step's `dir` is specified and is an
     * absolute path, this value is ignored for that step's execution.
     */
    public String getDir() { return dir; }
    public void setDir(String value) { this.dir = value; }

    /**
     * Only trigger a build if the revision regex does NOT match the revision
     * regex.
     */
    public Boolean getInvertRegex() { return invertRegex; }
    public void setInvertRegex(Boolean value) { this.invertRegex = value; }

    /**
     * ID of the project that owns the Cloud Source Repository.
     */
    public String getProjectID() { return projectID; }
    public void setProjectID(String value) { this.projectID = value; }

    /**
     * Name of the Cloud Source Repository.
     */
    public String getRepoName() { return repoName; }
    public void setRepoName(String value) { this.repoName = value; }

    /**
     * Substitutions to use in a triggered build.
     * Should only be used with RunBuildTrigger
     */
    public Map<String, String> getSubstitutions() { return substitutions; }
    public void setSubstitutions(Map<String, String> value) { this.substitutions = value; }

    /**
     * Regex matching tags to build.
     *
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     */
    public String getTagName() { return tagName; }
    public void setTagName(String value) { this.tagName = value; }
}
