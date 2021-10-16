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

package com.google.events.firebase.testlab.v1;

/**
 * Locations where test results are stored.
 */
public class ResultStorage {
    private String gcsPath;
    private String resultsURI;
    private String toolResultsExecution;
    private String toolResultsHistory;

    /**
     * Location in Google Cloud Storage where test results are written to.
     * In the form "gs://bucket/path/to/somewhere".
     */
    public String getGcsPath() { return gcsPath; }
    public void setGcsPath(String value) { this.gcsPath = value; }

    /**
     * URI to the test results in the Firebase Web Console.
     */
    public String getResultsURI() { return resultsURI; }
    public void setResultsURI(String value) { this.resultsURI = value; }

    /**
     * Tool Results execution resource containing test results. Format is
     * `projects/{project_id}/histories/{history_id}/executions/{execution_id}`.
     * Optional, can be omitted in erroneous test states.
     * See https://firebase.google.com/docs/test-lab/reference/toolresults/rest
     * for more information.
     */
    public String getToolResultsExecution() { return toolResultsExecution; }
    public void setToolResultsExecution(String value) { this.toolResultsExecution = value; }

    /**
     * Tool Results history resource containing test results. Format is
     * `projects/{project_id}/histories/{history_id}`.
     * See https://firebase.google.com/docs/test-lab/reference/toolresults/rest
     * for more information.
     */
    public String getToolResultsHistory() { return toolResultsHistory; }
    public void setToolResultsHistory(String value) { this.toolResultsHistory = value; }
}
