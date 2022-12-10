/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package functions;


import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.logging.Logger;

import com.google.cloud.functions.CloudEventsFunction;
import google.events.cloud.audit.v1.LogEntryData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import io.cloudevents.CloudEvent;

// Uses the Gson library to unmarshal CloudEvent data
public class HelloCloudEventGson implements CloudEventsFunction {
  private static final Logger logger = Logger.getLogger(HelloCloudEvent.class.getName());

  @Override
  public void accept(CloudEvent event) {
    // Create custom deserializer to handle timestamps
    class DateDeserializer implements JsonDeserializer<OffsetDateTime> {
      @Override
      public OffsetDateTime deserialize(
          JsonElement json, Type typeOfT, JsonDeserializationContext context)
          throws JsonParseException {
        return OffsetDateTime.parse(json.getAsString());
      }
    }
    // Configure Gson with custom deserializer
    Gson gson =
        new GsonBuilder()
            .registerTypeAdapter(OffsetDateTime.class, new DateDeserializer())
            .create();

    if (event.getData() != null ) { // && event.getType().contains("audit")
      // Get serialized data from CloudEvent
      String cloudEventData = new String(event.getData().toBytes(), StandardCharsets.UTF_8);
      // Deserialize data to unmarshal the data
      logger.info(cloudEventData);
      LogEntryData data = gson.fromJson(cloudEventData, LogEntryData.class);
      logger.info(data.toString());
      logger.info(data.getProtoPayload().getAuthenticationInfo().getPrincipalEmail());
      logger.info(data.getResource().getType());
    }
  }
}
