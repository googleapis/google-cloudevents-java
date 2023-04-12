# Google CloudEvents Types for Java

[![Maven Central](https://img.shields.io/maven-central/v/com.google.cloud/google-cloudevent-types.svg)](https://central.sonatype.com/artifact/com.google.cloud/google-cloudevent-types)

* [Product Documentation](https://cloud.google.com/eventarc/docs/cloudevents)
* [Client Library Documentation - TBA]()

This library provides Java classes for [Google CloudEvent data](https://cloud.google.com/eventarc/docs/reference/supported-events)
to support unmarshalling of event data into a Java object. This library is generated from the protobufs sourced from https://github.com/googleapis/google-cloudevents.

Example event classes:

- [`com.google.events.cloud.pubsub.v1.MessagePublishedData`](google-cloudevent-types/src/main/java/com/google/events/cloud/pubsub/v1/MessagePublishedData.java)
- [`com.google.events.cloud.audit.v1.LogEntryData`](google-cloudevent-types/src/main/java/com/google/events/cloud/audit/v1/LogEntryData.java)

## Supported Java Versions

Java 11 or above is required.

## Installation

If you are using Maven, add this to your `pom.xml` file:

```xml
<dependency>
  <groupId>com.google.cloud</groupId>
  <artifactId>google-cloudevent-types</artifactId>
  <version>0.8.1</version>
</dependency>
```

## Usage

CloudEvents are currently delivered to [targets](https://cloud.google.com/eventarc/docs/overview#targets)
via [HTTP protocol binding](https://cloud.google.com/eventarc/docs/cloudevents)
with a [JSON payload](https://cloud.google.com/eventarc/docs/workflows/cloudevents).

Using the [JsonFormat](https://developers.google.com/protocol-buffers/docs/reference/java/com/google/protobuf/util/JsonFormat)
the JSON payload can be converted into the specific event type object.

Example usage in an [Event-driven Cloud Function](https://cloud.google.com/functions/docs/writing/write-event-driven-functions#cloudevent-example-java):

```java
package functions;

import com.google.cloud.functions.CloudEventsFunction;
import com.google.events.cloud.audit.v1.LogEntryData;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import io.cloudevents.CloudEvent;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class HelloProto implements CloudEventsFunction {
  private static final Logger LOGGER = Logger.getLogger(HelloProto.class.getName());

  @Override
  public void accept(CloudEvent event) throws InvalidProtocolBufferException {
    if (event.getData() != null) {
      // Extract JSON from CloudEvent
      String json = new String(event.getData().toBytes(), StandardCharsets.UTF_8);
      // Convert data to LogEntryData object
      LogEntryData.Builder builder = LogEntryData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      LogEntryData data = builder.build();
      
      // Extract specific data from LogEntryData object
      LOGGER.info("### CloudEvent Data ###");
      LOGGER.info(data.getLogName());
      LOGGER.info(data.getProtoPayload().getAuthenticationInfo().getPrincipalEmail());
    }
  }
}
```

## Versioning

This library follows [Semantic Versioning](http://semver.org/).

## Contributing

Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING](CONTRIBUTING.md) for more information how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct](CODE_OF_CONDUCT.md) for more
information.

## License

Apache 2.0 - See [LICENSE](LICENSE) for more information.
