lazy val commonSettings = Seq(
  name := "sbt-webjars-packager",
  organization := "io.teamscala.sbt",
  scalaVersion := "2.10.5",
  description := "An SBT plugin to Webjars packaging with external resources.",
  licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    sbtPlugin := true,
    resolvers += Classpaths.sbtPluginSnapshots,
    addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.2.2"),
    addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")
  )
