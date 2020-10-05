# Google CloudEvents – Java

This repository contains POJOs for CloudEvents issued by Google.

## Prerequisites

- Java 7 (or higher)

## Installation

To use Maven, add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>google.events</groupId>
      <artifactId>google-cloudevent-types</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>
  </dependencies>
</project>
```

## CloudEvent Types

This repo contains these types:

- [`com.google.events.cloud.pubsub.v1.MessagePublishedData`](google-cloudevent-types/src/main/java/com/google/events/cloud/pubsub/v1/MessagePublishedData.java)
- [`com.google.events.cloud.audit.v1.LogEntryData`](google-cloudevent-types/src/main/java/com/google/events/cloud/audit/v1/LogEntryData.java)

> Note: This repo is generated from the Google CloudEvent schema sources in https://github.com/googleapis/google-cloudevents.

## Usage

The event types can be used to transform a HTTP POST request's body to a Java object.

For example, in the Spring Framework, this library can be used as such:

```java
import com.google.events.cloud.pubsub.v1.MessagePublishedData;
import com.google.events.cloud.pubsub.v1.PubsubMessage;
//...
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public ResponseEntity<String> receiveMessage(
      @RequestBody MessagePublishedData messagePublisedData, @RequestHeader Map<String, String> headers) {
    // Get PubSub message from request body.
    PubsubMessage message = messagePublisedData.getMessage();
```