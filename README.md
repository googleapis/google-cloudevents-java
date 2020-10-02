# Google CloudEvents – Java

This repository contains types for CloudEvents issued by Google.

## Prerequisites

- Java 7 (or higher)

## Generate

Generate libraries:

```sh
./gen.sh
```

Observe the new files in `src/`.

---

mvn -B archetype:generate \
-DgroupId=com.google.events \
-DartifactId=google-cloudevent-types \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DarchetypeVersion=1.4

//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
