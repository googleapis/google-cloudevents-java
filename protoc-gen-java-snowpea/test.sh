rm -r google/
gradle installDist

export PROTO_SRC="/Users/akitsch/code/projects/google-cloudevents/proto/"
export THIRD_P="/Users/akitsch/code/projects/google-cloudevents/third_party/googleapis/"
export BAZEL="/Users/akitsch/code/test_projects/gapic-generator-java/bazel-bin"

# protoc \
#     -I $PROTO_SRC \
#     -I $THIRD_P \
#     --plugin=$BAZEL/protoc-gen-java_gapic \
#     --java_gapic_out=test-java \
#     --experimental_allow_proto3_optional \
#     $(find $PROTO_SRC/google/events/cloud/pubsub/ -name "*.proto")
    # --java_gapic_opt="${SERVICE_CONFIG_OPT},${GAPIC_CONFIG_OPT}" \

protoc --plugin=protoc-gen-java-snowpea=build/install/protoc-gen-java-snowpea/bin/protoc-gen-java-snowpea \
-I $PROTO_SRC \
-I $THIRD_P \
--java-snowpea_out . \
--experimental_allow_proto3_optional \
$(find $PROTO_SRC/ -name "*.proto")
# $PROTO_SRC/google/events/cloud/pubsub/v1/data.proto 


# protoc --plugin=protoc-gen-example=../../../test_projects/protoc-plugin-in-java/build/install/myplugin/bin/myplugin \
# -I $PROTO_SRC \
# -I $THIRD_P \
# --example_out . \
# $(find $PROTO_SRC/google/events/cloud/pubsub/ -name "*.proto")
# $PROTO_SRC/google/events/cloud/pubsub/v1/data.proto 