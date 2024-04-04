# How to Contribute

We'd love to accept your patches and contributions to this project. There are
just a few small guidelines you need to follow.

## Contributor License Agreement

Contributions to this project must be accompanied by a Contributor License
Agreement. You (or your employer) retain the copyright to your contribution;
this simply gives us permission to use and redistribute your contributions as
part of the project. Head over to <https://cla.developers.google.com/> to see
your current agreements on file or to sign a new one.

You generally only need to submit a CLA once, so if you've already submitted one
(even if it was for a different project), you probably don't need to do it
again.

## Code reviews

All submissions, including submissions by project members, require review. We
use GitHub pull requests for this purpose. Consult
[GitHub Help](https://help.github.com/articles/about-pull-requests/) for more
information on using pull requests.

## Community Guidelines

This project follows
[Google's Open Source Community Guidelines](https://opensource.google.com/conduct/).

## Project Notes

This library is generated from the protobuf source in [googleapis/google-cloudevents](https://github.com/googleapis/google-cloudevents).

The `google-cloudevents-types/` directory is the generated library source code. It should not be manually modified as changes will be overwritten.

The `protoc-gen-java-snowpea/` directory defines a protoc plugin to generate tests for the library. Check out it's [README](protoc-gen-java-snowpea/) to learn more.

the `tools/` directory contains scripts for building the library.

## Building the project

* Install [`protoc`](https://grpc.io/docs/protoc-installation/)

* (Optional) set path to `protoc` executable: `export PROTOC_PATH=<LOCAL_PATH/bin/protoc>`

* Clone the [google-cloudevents](https://github.com/googleapis/google-cloudevents) source of truth repo in the same parent directory as this repo.

* Set local path to `google-cloudevents`: `export DATA_SOURCE_PATH=<LOCAL_PATH/google-cloudevents>`

* (Optional) Set option for cleanup of temporary files: `export BUILD_LOCALLY=true`

To build, package, and run all unit tests run the command

```sh
./tools/build.sh
```

### Running tests

Tests are run during the project build. To run tests independently:

1. Clone the [google-cloudevents](https://github.com/googleapis/google-cloudevents) source of truth repo in the same parent directory as this repo. Payload test cases are centrally maintained.

2. Optional: Set path to `google-cloudevents` for test case lookup: `export TEST_DATA_PATH=<LOCAL_PATH/google-cloudevents>`. If not set, tests will seek the cloned repository at the path `../../google-cloudevents/testdata/`. (To run tests with this default, change working directory to `tools/` or `google-cloudevent-types/`)

4. Run the tests:

```sh
mvn clean verify
```

### Install locally

To install a local version of the library:

```sh
mvn install
```

### Code Formatting

Code in this repo is formatted with
[google-java-format](https://github.com/google/google-java-format).
To run formatting on your project, you can run:
```
mvn com.spotify.fmt:fmt-maven-plugin:format
```
