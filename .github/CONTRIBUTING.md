# Contributing

This library's source code is mainly generated from JSON schema in the [Google CloudEvents repo](https://github.com/googleapis/google-cloudevents).

Specifically, the `google-cloudevents-types/src` directory is generated and should not be modified as changes will be overwritten when the library is re-generated. Rather, the upstream CloudEvents repo should be modified.

## Generate API types

Before generating the library, you must set up your environment like such:
- Have Java 11+ and Node (for generation) installed.
- Install the [quicktype wrapper CLI](https://github.com/googleapis/google-cloudevents/tree/master/tools/quicktype-wrapper) using npm.
- Clone the [google-cloudevents](https://github.com/googleapis/google-cloudevents) source of truth repo in the same directory as this repo.

Then, to generate, run the ./gen.sh file in the java repo. This will generate the whole library with the source of truth JSON schemas.

```sh
./gen.sh
```

Observe the new files in `google-cloudevent-types/src/`.

## Test

Run tests in the `google-cloudevent-types` :

```sh
cd google-cloudevent-types
mvn install
mvn test
```

## Generate a New Artifact

A new artifact is unlikely. Here is a generic script to generate a new artifact:

```sh
mvn -B archetype:generate \
-DgroupId=google.events \
-DartifactId=google-cloudevent-types \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DarchetypeVersion=1.4
```

## How to Contribute

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

This project follows [Google's Open Source Community
Guidelines](https://opensource.google/conduct/).
