#!/usr/bin/env bash

# Copyright 2023 Google LLC.
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

mkdir tmp

# Protobuf Setup
PROTOBUF_VERSION=21.12
# protoc is a native application, so we need to download different zip files
# and use different binaries depending on the OS.
echo "- Determining OS type"
case "$OSTYPE" in
  linux*)
    PROTOBUF_PLATFORM=linux-x86_64
    PROTOC=tmp/protobuf/bin/protoc
    ;;
  win* | msys* | cygwin*)
    PROTOBUF_PLATFORM=win64
    PROTOC=tmp/protobuf/bin/protoc.exe
    ;;
  darwin*)
    PROTOBUF_PLATFORM=osx-x86_64
    PROTOC=tmp/protobuf/bin/protoc
    ;;    
  *)
    echo "Unknown OSTYPE: $OSTYPE"
    exit 1
esac

# We download a specific version rather than using package managers
# for portability and being able to rely on the version being available
# as soon as it's released on GitHub.
echo "- Downloading protobuf tools..."
pushd tmp
curl -sSL \
  https://github.com/protocolbuffers/protobuf/releases/download/v$PROTOBUF_VERSION/protoc-$PROTOBUF_VERSION-$PROTOBUF_PLATFORM.zip \
  --output protobuf.zip
(mkdir protobuf && cd protobuf && unzip -q ../protobuf.zip)
popd
chmod +x $PROTOC

echo "- Downloaded protobuf ${PROTOBUF_VERSION} for ${PROTOBUF_PLATFORM}"