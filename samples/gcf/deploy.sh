REGION=us-central1
SERVICE_NAME=java-cloudevent-function

gcloud functions deploy ${SERVICE_NAME} \
  --gen2 \
  --region=${REGION} \
  --runtime=java11 \
  --source=. \
  --entry-point=functions.HelloProto \
  --trigger-event-filters="type=google.cloud.audit.log.v1.written" \
  --trigger-event-filters="serviceName=compute.googleapis.com"
