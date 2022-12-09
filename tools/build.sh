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

# Generates code from https://github.com/googleapis/google-cloudevents:
# - Types from protobuf messages
#
# Configuration:
# - GENERATE_DATA_SOURCE: Path to google-cloudevent repo.
# - GENERATE_PROTOC_PATH: Path to protobuf tool. 
#
# Usage:
# - sh ./build.sh
# - GENERATE_DATA_SOURCE=tmp/google-cloudevents GENERATE_PROTOC_PATH=protoc sh ./build.sh

set -e

# export PROTOC_OUT="./src/main/java/"
# rm -r $PROTOC_OUT
# mkdir -p $PROTOC_OUT
# export TEST_GEN_OUT="./src/test/java/"
# rm -r $TEST_GEN_OUT
# mkdir -p $TEST_GEN_OUT
# export current=$(pwd)
# cd /Users/akitsch/code/projects/google-cloudevents
# git restore --staged $PROTOBUF_SRC $THIRDPARTY
# git restore $PROTOBUF_SRC $THIRDPARTY
# git clean -f
# cd $current



SOURCE_OF_TRUTH="../google-cloudevents"
PROTOBUF_SRC="${SOURCE_OF_TRUTH}/proto"
THIRDPARTY="${SOURCE_OF_TRUTH}/third_party/googleapis"



# Setup monitored resource proto
echo "\noption java_multiple_files = true;\noption java_outer_classname = \"MonitoredResourceProto\";\noption java_package = \"com.google.api\";" >> $(find $THIRDPARTY -name "monitored_resource.proto")

# Run protoc on protos
for file in $(find $PROTOBUF_SRC -name "*.proto")
do
    if [[ ($file != *"events.proto"*) && ($file != *"cloudevent.proto"*) ]]; then
        # Comment out current java options
        sed -i '.bak' 's|option java|\/\/option java|g' $file 

        # Add Java options to protos
        echo "\noption java_multiple_files = true;" >> $file
        PACKAGE=$(cat $file | grep -oP '(?<=package ).*(?=;)'); # Ex. package google.events.cloud.pubsub.v1; => google.events.cloud.pubsub.v1
        echo "\noption java_package = \"com.${PACKAGE}\";" >> $file


        protoc -I=$PROTOBUF_SRC -I=$THIRDPARTY \
        --java_out=$PROTOC_OUT \
        $file
    
    fi
done

# for file in $(find $PROTOC_OUT -name "*.java")
# do
#     sed -i '.bak' 's/google\.events\./com\.google\.events\./g' $file 
#     sed -i '.bak' 's|google\/events\/|com/google/events/|g' $file 
#     sed -i '.bak' 's/google_events_/com_google_events_/g' $file 
#     # may need better regex for safety
# done


# # Format generated code
# mvn net.revelc.code.formatter:formatter-maven-plugin:2.19.0:format

# # Generate Tests
# cd protoc-gen-java-snowpea
# gradle installDist
# # mvn clean package
# cd $current

# protoc --plugin=protoc-gen-java-snowpea=protoc-gen-java-snowpea/build/install/protoc-gen-java-snowpea/bin/protoc-gen-java-snowpea \
# -I $PROTOBUF_SRC \
# -I $THIRDPARTY \
# --java-snowpea_out $TEST_GEN_OUT \
# --experimental_allow_proto3_optional \
# $(find $PROTOBUF_SRC/ -name "*.proto")

# # protoc --plugin=protoc-gen-java-snowpea=$(java -jar protoc-gen-java-snowpea/target/protoc-gen-java-snowpea-1.0-SNAPSHOT-jar-with-dependcies.jar) \
# # -I $PROTOBUF_SRC \
# # -I $THIRDPARTY \
# # --java-snowpea_out $TEST_GEN_OUT \
# # --experimental_allow_proto3_optional \
# # $(find $PROTOBUF_SRC/ -name "*.proto")
