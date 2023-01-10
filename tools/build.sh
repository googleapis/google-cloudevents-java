#!/usr/bin/env bash

# Copyright 2023 Google LLC.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -e # Must be set for script to fail

LIBRARY_SRC="google-cloudevent-types"
PROTOC_OUT="${LIBRARY_SRC}/src/main/java/"
TEST_GEN_OUT="${LIBRARY_SRC}/src/test/java/"

DATA_SOURCE_PATH="${DATA_SOURCE_PATH:-../}"
SOURCE_OF_TRUTH="${DATA_SOURCE_PATH}/google-cloudevents"
PROTOBUF_SRC="${SOURCE_OF_TRUTH}/proto"
THIRDPARTY="${SOURCE_OF_TRUTH}/third_party/googleapis"

# Clean up previously generated files.
rm -rf $PROTOC_OUT
mkdir -p $PROTOC_OUT
rm -rf $TEST_GEN_OUT
mkdir -p $TEST_GEN_OUT

# Ensure clean source for local builds
BUILD_LOCALLY="${BUILD_LOCALLY:-false}"
if [[ "$BUILD_LOCALLY" == "true" ]]; then
    current=$(pwd)
    cd $SOURCE_OF_TRUTH
    git restore --staged $PROTOBUF_SRC $THIRDPARTY
    git restore $PROTOBUF_SRC $THIRDPARTY
    git clean -f
    cd $current
fi 

# Assemble protoc plugin to generate tests
mvn clean package assembly:single -f protoc-gen-java-snowpea/

# Setup monitored resource proto with Java options
MonitoredResourceProto=$(find $THIRDPARTY -name "monitored_resource.proto")
echo -en "\noption java_multiple_files = true;" >> $MonitoredResourceProto
echo -en "\noption java_outer_classname = \"MonitoredResourceProto\";" >> $MonitoredResourceProto
echo -en "\noption java_package = \"com.google.api\";" >> $MonitoredResourceProto

_generate() {
    proto_src=$1
    echo
    echo "########################################################"
    echo "# Generating from $proto_src"

    # Comment out preset Java options
    sed -i 's/option java/\/\/option java/' $proto_src
    # Set Java option: multiple files
    echo -en "\noption java_multiple_files = true;" >> $proto_src
    # Set Java option: package name
    awk '/^package/,/;/' $proto_src > PROTO_PACKAGE; # Ex. package google.events.cloud.pubsub.v1; => google.events.cloud.pubsub.v1
    sed -i 's/package /option java_package = \"com./' PROTO_PACKAGE
    sed -i 's/;/"/'  PROTO_PACKAGE
    echo -en "\n$(cat PROTO_PACKAGE);" >> $proto_src

    echo "# - proto bindings"
    protoc \
        -I=$PROTOBUF_SRC \
        -I=$THIRDPARTY \
        --java_out=$PROTOC_OUT \
        $proto_src

    echo "# - validation tests"
    protoc \
        --plugin=protoc-gen-java-snowpea=protoc-gen-java-snowpea/startup-script.sh \
        --java-snowpea_out $TEST_GEN_OUT \
        --java-snowpea_opt "MessagePublishedData,LogEntryData" \
        -I $PROTOBUF_SRC \
        -I $THIRDPARTY \
        --experimental_allow_proto3_optional \
        $proto_src
}

for i in $(find "${PROTOBUF_SRC}" -type f -name data.proto); do
  _generate $i
done

# Clean up tmp files
rm PROTO_PACKAGE*

echo
echo "########################################################"
echo "# Formatting generated code files..."
# TODO: Update to use google-java-format
mvn net.revelc.code.formatter:formatter-maven-plugin:2.19.0:format

echo
echo "########################################################"
echo "# Running library tests..."
mvn verify

echo
echo "########################################################"
echo "# Running sample tests..."
mvn install -DskipTests
mvn verify -f samples/gcf
mvn verify -f samples/springboot
mvn verify -f samples/springboot-proto