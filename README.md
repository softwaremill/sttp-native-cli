# Scala Native with scala-cli and sttp example

This example showcases how to use [sttp](https://sttp.softwaremill.com/en/stable/) included in [Scala Toolkit](https://docs.scala-lang.org/toolkit/introduction.html) with [Scala Native](https://github.com/scala-native/scala-native) and [scala-cli](https://scala-cli.virtuslab.org/).
See `sttp.scala` for a simple raw example, or `sttp-ce3.scala` for an eaxmple using Cats Effect 3.

Read the [blog article](https://softwaremill.com) for full information about how co set up and run the examples.

Build with

```sh
scala-cli --cli-version nightly --power package --native sttp.scala -o sttp-curl -f
```

or

```sh
scala-cli --cli-version nightly --power package --native sttp-ce3.scala -o sttp-ce3 -f
```

for the CE3 version.
