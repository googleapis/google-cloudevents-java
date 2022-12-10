/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package functions;

import static io.cloudevents.core.CloudEventUtils.mapData;

import java.util.logging.Logger;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.cloud.functions.CloudEventsFunction;
import google.events.cloud.audit.v1.LogEntryData;

import io.cloudevents.CloudEvent;
import io.cloudevents.core.data.PojoCloudEventData;
import io.cloudevents.jackson.PojoCloudEventDataMapper;

// Uses the Cloud Event Jackson library to unmarshal CloudEvent data
public class HelloCloudEvent implements CloudEventsFunction {
  private static final Logger logger = Logger.getLogger(HelloCloudEvent.class.getName());
  @Override
  public void accept(CloudEvent event) {
    // Configure Jackson's ObjectMapper
    // ObjectMapper provides functionality for reading and writing JSON
    // Ignore unknown fields in CloudEvent data
    ObjectMapper objectMapper =
        new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    // Register JavaTimeModule to handle timestamps
    objectMapper.registerModule(new JavaTimeModule());

    if (event.getData() != null) { // && event.getType().contains("audit")
      // Unmarshal the data directly from the event
      PojoCloudEventData<LogEntryData> cloudEventData =
          mapData(event, PojoCloudEventDataMapper.from(objectMapper, LogEntryData.class));
      // Get unmarshalled data
      LogEntryData data = cloudEventData.getValue();
      logger.info(data.getResource().getType());
      logger.info(data.getProtoPayload().getAuthenticationInfo().getPrincipalEmail());
    }
  }
}
