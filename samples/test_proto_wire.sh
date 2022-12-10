echo 'subscription:"test" message:{data:"YXZlcmkK" message_id:"1234"}' \
| protoc --encode google.events.cloud.pubsub.v1.MessagePublishedData ./proto/google/events/cloud/pubsub/v1/data.proto  \
| curl -X POST --header "Content-Type: application/protobuf" --data-binary @- http://localhost:8080/






# cat  ./cli_message.proto |  protoc --encode google.events.cloud.pubsub.v1.MessagePublishedData ./proto/google/events/cloud/pubsub/v1/data.proto  > output | curl -X POST --header "Content-Type: application/protobuf" --data-binary @- http://localhost:8080/

# file:
# message: {
# data: "YXZlcmkK"
# message_id: "1234"
# }
# subscription: "test"
# https://twitchtv.github.io/twirp/docs/curl.html