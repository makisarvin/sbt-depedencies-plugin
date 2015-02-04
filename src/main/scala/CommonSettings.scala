package myplugin

import com.typesafe.sbt.SbtScalariform._
import sbt.Keys._
import sbt._
import spray.revolver.RevolverPlugin.Revolver

import scalariform.formatter.preferences.{PreserveDanglingCloseParenthesis, DoubleIndentClassDeclaration, AlignSingleLineCaseStatements}

object CommonSettings {
  val commonSettings =
    scalariformSettings ++ Revolver.settings ++
      List(
        // Core settings
        organization := "com.hotelier.frontdesk",
        version := Version.projectVersion,
        scalaVersion := Version.scala,
        scalacOptions ++= List(
          "-unchecked",
          "-deprecation",
          "-language:_",
          "-encoding", "UTF-8"
        ),
        // Scalariform settings
        ScalariformKeys.preferences := ScalariformKeys.preferences.value
          .setPreference(AlignSingleLineCaseStatements, true)
          .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
          .setPreference(DoubleIndentClassDeclaration, true)
          .setPreference(PreserveDanglingCloseParenthesis, true)
      )


  import Library._

  val commonLibraryDependencies: Seq[ModuleID] = Seq(
    sprayCan,
    sprayRouting,
    akkaActor,
    akkaSlf4j,
    sprayTestKit % "test",
    akkaTestkit % "test",
    specs2 % "test"
  )

  val commonResolvers: Seq[MavenRepository] = Seq(
    "ReactiveCouchbase Snapshots" at "https://raw.github.com/ReactiveCouchbase/repository/master/snapshots/",
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
  )
}