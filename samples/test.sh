export PUBSUB='{"subscription": "projects/my-project/subscriptions/my-subscription", "message": {"data": "aGVsbG8=","messageId": "5663984426718396","message_id": "5663984426718396","publishTime": "2022-09-16T20:22:18.115Z","publish_time": "2022-09-16T20:22:18.115Z"}}'
curl -X POST \
-H 'content-type: application/json' \
-H 'ce-specversion: 1.0' \
-H 'ce-source: curl-command' \
-H 'ce-type: curl.demo' \
-H 'ce-id: 123-abc' \
-d "$PUBSUB" \
http://localhost:8080

export AUDIT='{"protoPayload": {"status": {},"authenticationInfo": {"principalEmail": "akitsch@google.com"},"requestMetadata": {"callerIp": "2601:601:1100:2350:2432:932c:91bd:b80c","callerSuppliedUserAgent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe),gzip(gfe)","requestAttributes": {"time": "2022-09-16T20:25:05.309589547Z","auth": {}},"destinationAttributes": {}},"serviceName": "storage.googleapis.com","methodName": "storage.buckets.list","authorizationInfo": [{"permission": "storage.buckets.list","granted": true,"resourceAttributes": {}}],"serviceData": {},"resourceLocation": {"currentLocations": ["global"]}},"insertId": "820106efskfk","resource": {"type": "gcs_bucket","labels": {"project_id": "PROJECT_ID","bucket_name": "","location": "global"}},"timestamp": "2022-09-16T20:25:05.300935629Z","severity": "INFO","logName": "projects/PROJECT_ID/logs/cloudaudit.googleapis.com%2Fdata_access","receiveTimestamp": "2022-09-16T20:25:05.353074004Z"}'
curl -X POST \
-H 'content-type: application/json' \
-H 'ce-specversion: 1.0' \
-H 'ce-source: curl-command' \
-H 'ce-type: curl.demo' \
-H 'ce-id: 123-abc' \
-d "$AUDIT" \
http://localhost:8080