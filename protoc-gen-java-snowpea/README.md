# Protoc Plugin: protoc-gen-java-snowpea

This plugin generates tests for Google Event Types Library for Java to ensure the ability to unmarshal data.

## Things to Know

* This plugin generates a test file per "main" event type
    * The "main" event type is determined by the protobuf's message "Data" suffix, i.e. generate "MessagePublishedData" and not "PubSubMessage"
    * These main event types are found in `data.proto`
    * Generate file name and path ensure the Java package and event type is used: `google/events/cloud/pubsub/v1/data.proto` is converted to `com/google/events/cloud/pubsub/v1/MessagePublishedDataTest.java`

* The binary is defined by the [startup-script.sh](./startup-script.sh) to run the uber-jar
    * It is designed to run from parent directory

* The test read in test data from the `google-cloudevents` repo
    * Set path via `$TEST_DATA_PATH` (Default: `../../google-cloudevents/testdata/`)

* Tests include a strict, `JsonFormat.parser().merge(json, builder);` and loose, 
`JsonFormat.parser().ignoringUnknownFields().merge(json, builder);`, unmarshalling tests.
    * "MessagePublishedData" and "LogEntryData" tests do not pass strict unmarshalling due to the "@type" field
    * "MessagePublishedData" test does not pass loose unmarshalling due to duplicated fields. 


## Prerequisites

To run the plugin, install:

* [protoc](https://grpc.io/docs/protoc-installation/)


## Installation

Assemble the single distributable archive ([uber-jar](https://maven.apache.org/plugins/maven-assembly-plugin/descriptor-refs.html#jar-with-dependencies)):
```sh
# Parent Project Directory
mvn clean package assembly:single -f protoc-gen-java-snowpea/

# Or Direct Project Directory
mvn clean package assembly:single
```

## Running

```sh
protoc \
    --plugin=protoc-gen-java-snowpea=protoc-gen-java-snowpea/startup-script.sh \
    --java-snowpea_out <OUTPUT_PATH> \
    --java-snowpea_opt <OPTIONS> \
    -I <ADDITIONAL_PROTOBUFS_NEEDED>
    --experimental_allow_proto3_optional \
    <PROTOBUF_TO_GENERATE>
```

Where:

* `--plugin`: specifies path to plugin binary
* `--java-snowpea_out`: specifies path to output files
* `--java-snowpea_opt`: specifies a list of plugin options
* `--experimental_allow_proto3_optional`: allows `optional` fields in proto3

**Plugin Options**
* Specify the event type name (Test class) to skip, i.e. "MessagePublishedData"
* Specify the skipping only the strict unmarshalling test, i.e. "LogEntryData#strict"

Currently, [build.sh](../tools/build.sh) sets `--java-snowpea_opt "MessagePublishedData,LogEntryData#strict"` to skip
both the strict and non-strict MessagePublishedData tests and the strict LogEntryData test. 

Find more info about [protoc plugin configuration](https://developers.google.com/protocol-buffers/docs/reference/cpp/google.protobuf.compiler.plugin).

## Examples

In the parent project directory, `google-cloudevents-java`:

* Set local path to `google-cloudevents` repo:
```sh
export GOOGLE_CLOUDEVENTS=<LOCAL_PATH>
```

* Create `tmp` directory:
```sh
mkdir tmp
```

* Run plugin:
```sh
protoc \
    --plugin=protoc-gen-java-snowpea=protoc-gen-java-snowpea/startup-script.sh \
    --java-snowpea_out ./tmp \
    -I $GOOGLE_CLOUDEVENTS/proto \
    -I $GOOGLE_CLOUDEVENTS/third_party \
    --experimental_allow_proto3_optional \
    $GOOGLE_CLOUDEVENTS/proto/google/events/cloud/pubsub/v1/data.proto
```