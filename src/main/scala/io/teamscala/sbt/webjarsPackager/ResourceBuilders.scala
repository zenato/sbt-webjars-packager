package io.teamscala.sbt.webjarsPackager

import java.net.URL

import sbt.StringUtilities.nonEmpty

import scala.languageFeature.implicitConversions

trait ResourceBuilders {
  final implicit def toResourceGroup(group: String): Resource.Group = {
    nonEmpty(group, "Resource group")
    Resource.Group(group)
  }
  final implicit def toResourcePath(path: String): Resource.Path = {
    nonEmpty(path, "Resource path")
    Resource.Path(path)
  }
}

object Resource {
  final case class Group(group: String) {
    def ~(path: String) = GroupWithPath(group, path)
  }
  final case class Path(path: String) {
    def <~(url: String) = Resource(None, path, sbt.url(url))
  }
  final case class GroupWithPath(group: String, path: String) {
    def <~(url: String) = Resource(Option(group).filter(_.nonEmpty), path, sbt.url(url))
  }
}

final case class Resource(group: Option[String], path: String, url: URL)