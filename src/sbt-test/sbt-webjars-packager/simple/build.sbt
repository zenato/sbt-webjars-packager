lazy val root = (project in file(".")).enablePlugins(SbtWeb)

WebjarsPackagerKeys.resources in Assets += "jquery" ~ "jquery.js" <~ "http://code.jquery.com/jquery.js"
