PUBSUB='{"subscription": "projects/my-project/subscriptions/my-subscription", "message": {"data": "aGVsbG8=","messageId": "5663984426718396","publishTime": "2022-09-16T20:22:18.115Z"}}'

curl -X POST \
-H 'content-type: application/json' \
-H 'ce-specversion: 1.0' \
-H 'ce-source: curl-command' \
-H 'ce-type: curl.demo' \
-H 'ce-id: 123-abc' \
-d "$PUBSUB" \
http://localhost:8080
