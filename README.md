# A SBT plugin for webjars packaging with external resource [![Build Status](https://travis-ci.org/zenato/sbt-webjars-packager.svg?branch=master)](https://travis-ci.org/zenato/sbt-webjars-packager)

Installation
------------

To use this plugin use the addSbtPlugin command within your project's `plugins.sbt` file:

```scala
addSbtPlugin("io.teamscala.sbt" % "sbt-webjars-packager" % "1.0.0")
```

For example with `build.sbt`:

```scala
lazy val root = (project in file(".")).enablePlugins(SbtWeb)

// Downloadable external resources
WebjarsPackagerKeys.resources in Assets += "jquery" ~ "jquery.js" <~ "http://code.jquery.com/jquery.js"
```

Run the following at the sbt console:
```scala
show webjarsPackager
```
