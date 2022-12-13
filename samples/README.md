# Samples

|          Sample            |                     Description                         |
| -------------------------- | ------------------------------------------------------- |
| [Cloud Function](./gcf) | Event-driven Cloud Function uses type `LogEntryData` |
| [Springboot w/ Proto Wire Format](./springboot-proto) | Accepts protobuf wire format and uses `org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter` to convert data to a JavaBean uses type `MessagePublishedData` |
| [Springboot w/ JSON Wire Format](./springboot) | Accepts JSON wire format and uses `com.google.protobuf.util.JsonFormat` to convert data to a JavaBean uses type `MessagePublishedData` |