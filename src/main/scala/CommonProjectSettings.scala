package myplugin

import sbt.Keys._

object CommonProjectSettings extends sbt.AutoPlugin {

  import CommonSettings._

  override def projectSettings =
    commonSettings ++ Seq(libraryDependencies ++= commonLibraryDependencies) ++ Seq(resolvers ++= commonResolvers)

}
