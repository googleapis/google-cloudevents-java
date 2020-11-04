#!/bin/bash

# Copyright 2020 Google LLC.
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

set -e

# Delete current types
rm -rf src

# Generate new types
qt \
--in=$(dirname $PWD)/google-cloudevents/jsonschema \
--out=$PWD \
--l=java

# Move types to correct directory
mkdir -p src/main/java/com/google
mv google src/main/java/com

# Get all generated type files
PATHS=$(grep -r "package io.quicktype;" src)

# For each path, fix the package.
#
# Example:
# PATH: src/main/java/com/google/google/events/cloud/audit/v1/AuditLog.java
# i.e. IN: "package io.quicktype;" – default generated package
# i.e. OUT: "package com.google.google.events.cloud.audit.v1;" – desired package
while IFS= read -r PATHS; do
    FILE=$(echo $PATHS | cut -f1 -d:)
    # Generator defaults string to: package io.quicktype;
    IO_QUICKTYPE_STRING=$(echo $PATHS | cut -f2 -d:)

    # Remove the prefix (path)
    # IN: src/main/java/com/google/google/events/cloud/pubsub/v1/MessagePublishedData.java
    # OUT: com/google/google/events/cloud/pubsub/v1/MessagePublishedData.java
    FILE_PREFIX="src/main/java/"
    FILE_WITHOUT_PREFIX=${FILE#"$FILE_PREFIX"}

    # Remove suffix (all characters after last "/")
    # From: https://askubuntu.com/a/1010311
    # IN: com/google/google/events/cloud/pubsub/v1/MessagePublishedData.java
    # OUT: com/google/google/events/cloud/pubsub/v1
    FILE_WITHOUT_PREFIX_OR_SUFFIX=$(echo $FILE_WITHOUT_PREFIX | sed 's|\(.*\)/.*|\1|')

    # Replace "/" with "."
    PACKAGE=$(echo $FILE_WITHOUT_PREFIX_OR_SUFFIX | tr / .)
    # Get correct package string. Like "package com.google.google.events.cloud.audit.v1;"
    PACKAGE_STRING="package $PACKAGE;"

    # Replace bad package string with good package string.
    sed -i '' "s/package io.quicktype;/${PACKAGE_STRING}/" $FILE
done <<< "$PATHS"