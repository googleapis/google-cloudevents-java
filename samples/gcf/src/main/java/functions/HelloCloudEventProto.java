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

import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;
import com.google.cloud.functions.CloudEventsFunction;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import google.events.cloud.audit.v1.LogEntryData;
import io.cloudevents.CloudEvent;

// Uses the Cloud Event Jackson library to unmarshal CloudEvent data
public class HelloCloudEventProto implements CloudEventsFunction {
  private static final Logger logger = Logger.getLogger(HelloCloudEvent.class.getName());
  @Override
  public void accept(CloudEvent event) throws InvalidProtocolBufferException {
    if (event.getData() != null ) {
      String json = new String(event.getData().toBytes(), StandardCharsets.UTF_8);
      LogEntryData.Builder builder = LogEntryData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      LogEntryData data = builder.build();

      logger.info(data.getResource().getType());
      logger.info(data.getProtoPayload().getAuthenticationInfo().getPrincipalEmail());
    }
  }
}
