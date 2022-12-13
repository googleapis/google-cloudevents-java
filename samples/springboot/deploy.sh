REGION=us-central1
SERVICE_NAME=java-cloudevent-service

gcloud run deploy ${SERVICE_NAME} --region ${REGION} --source . --allow-unauthenticated

gcloud eventarc triggers create ${SERVICE_NAME} \
    --destination-run-service=${SERVICE_NAME} \
    --destination-run-region=${REGION} \
    --location=${REGION} \
    --event-filters="type=google.cloud.pubsub.topic.v1.messagePublished"

TOPIC_ID=$(basename $(gcloud eventarc triggers describe ${SERVICE_NAME} \
  --format='value(transport.pubsub.topic)'))
gcloud pubsub topics publish $TOPIC_ID --message "Hello there"