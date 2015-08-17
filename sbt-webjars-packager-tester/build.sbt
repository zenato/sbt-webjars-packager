lazy val root = (project in file(".")).settings(
  name := "packager-example",
  organization := "io.teamscala.sbt",
  version := "0.0.1"
).enablePlugins(SbtWeb)

WebjarsPackagerKeys.resources in Assets += "jquery" ~ "jquery.js" <~ "http://code.jquery.com/jquery.js"

WebjarsPackagerKeys.resources in TestAssets += "jquery-test" ~ "jquery.js" <~ "http://code.jquery.com/jquery.js"
