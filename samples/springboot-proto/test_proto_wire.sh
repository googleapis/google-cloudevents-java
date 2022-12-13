mvn spring-boot:start

EVENTTYPE_PROTOS_SRC=../../../google-cloudevents
echo 'subscription:"test" message:{data:"YXZlcmkK" message_id:"1234"}' \
| protoc --encode google.events.cloud.pubsub.v1.MessagePublishedData -I ${EVENTTYPE_PROTOS_SRC}/proto ${EVENTTYPE_PROTOS_SRC}/proto/google/events/cloud/pubsub/v1/data.proto  \
| curl -X POST --header "Content-Type: application/x-protobuf" --data-binary @- http://localhost:8080/

mvn spring-boot:stop