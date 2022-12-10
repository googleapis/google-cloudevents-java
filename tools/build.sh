#!/usr/bin/env bash

# Copyright 2022 Google LLC.
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

LIBRARY_SRC="google-cloudevent-types"
PROTOC_OUT="${LIBRARY_SRC}/src/main/java/"
TEST_GEN_OUT="${LIBRARY_SRC}/src/test/java/"

DEBUG=fale
if [[ DEBUG ]]; then
    rm -r $PROTOC_OUT
    mkdir -p $PROTOC_OUT
    rm -r $TEST_GEN_OUT
    mkdir -p $TEST_GEN_OUT
fi

SOURCE_OF_TRUTH="/Users/akitsch/code/projects/google-cloudevents"
PROTOBUF_SRC="${SOURCE_OF_TRUTH}/proto"
THIRDPARTY="${SOURCE_OF_TRUTH}/third_party/googleapis"

# Generate Tests setup
# cd protoc-gen-java-snowpea
# # gradle installDist
# # mvn clean package
# cd $current

# For local builds
BUILD_LOCALLY=true
if [[ BUILD_LOCALLY ]]; then
    current=$(pwd)
    cd $SOURCE_OF_TRUTH
    git restore --staged $PROTOBUF_SRC $THIRDPARTY
    git restore $PROTOBUF_SRC $THIRDPARTY
    git clean -f
    cd $current
fi 

# Setup monitored resource proto with Java options
MonitoredResourceProto=$(find $THIRDPARTY -name "monitored_resource.proto")
echo "\noption java_multiple_files = true;" >> $MonitoredResourceProto
echo "\noption java_outer_classname = \"MonitoredResourceProto\";" >> $MonitoredResourceProto
echo "\noption java_package = \"com.google.api\";" >> $MonitoredResourceProto

_generate() {
    proto_src=$1
    echo
    echo "########################################################"
    echo "# Generating from $proto_src"

    # Comment out preset Java options
    sed -i '.bak' 's/option java/\/\/option java/' $proto_src
    # Set Java option: multiple files
    echo "\noption java_multiple_files = true;" >> $proto_src
    # Set Java option: package name
    awk '/^package/,/;/' $proto_src > PROTO_PACKAGE; # Ex. package google.events.cloud.pubsub.v1; => google.events.cloud.pubsub.v1
    sed -i '.bak' 's/package /option java_package = \"com./' PROTO_PACKAGE
    sed -i '.bak' 's/;/"/'  PROTO_PACKAGE
    echo "\n$(cat PROTO_PACKAGE);" >> $proto_src

    echo "# - proto bindings"
    protoc -I=$PROTOBUF_SRC -I=$THIRDPARTY \
    --java_out=$PROTOC_OUT \
    $proto_src

    echo "# - validation tests"
    protoc --plugin=protoc-gen-java-snowpea=protoc-gen-java-snowpea/build/install/protoc-gen-java-snowpea/bin/protoc-gen-java-snowpea \
    -I $PROTOBUF_SRC \
    -I $THIRDPARTY \
    --java-snowpea_out $TEST_GEN_OUT \
    --experimental_allow_proto3_optional \
    $proto_src
}

for i in $(find "${PROTOBUF_SRC}" -type f -name data.proto); do
  _generate $i
done


echo
echo "########################################################"
echo "# Formatting generated code files..."

# mvn net.revelc.code.formatter:formatter-maven-plugin:2.19.0:format

echo
echo "########################################################"
echo "# Running tests..."

mvn verify

if [[ BUILD_LOCALLY ]]; then
 rm PROTO_PACKAGE*
fi