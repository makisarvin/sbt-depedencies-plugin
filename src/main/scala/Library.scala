package myplugin

import sbt._

object Version {

  val projectVersion = "1.0.0"

  val akka = "2.3.8"
  val logback = "1.1.2"
  val scala = "2.11.4"
  val scalaParsers = "1.0.1"
  val spray = "1.3.2"
  val scalaLogging = "3.1.0"
  val scalaTest = "2.2.0"
  val specs2 = "2.3.11"

}

object Library {
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % Version.akka
  val akkaCluster = "com.typesafe.akka" %% "akka-cluster" % Version.akka
  val akkaContrib = "com.typesafe.akka" %% "akka-contrib" % Version.akka
  val akkaPersistence = "com.typesafe.akka" %% "akka-persistence-experimental" % Version.akka
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % Version.akka
  val sprayRouting = "io.spray" %% "spray-routing" % Version.spray
  val sprayCan = "io.spray" %% "spray-can" % Version.spray
  val sprayTestKit = "io.spray" %% "spray-testkit" % Version.spray
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % Version.akka
  val logbackClassic = "ch.qos.logback" % "logback-classic" % Version.logback
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % Version.scalaLogging
  val scalaParsers = "org.scala-lang.modules" %% "scala-parser-combinators" % Version.scalaParsers
  val scalaTest = "org.scalatest" %% "scalatest" % Version.scalaTest
  val specs2 = "org.specs2" %% "specs2-core" % Version.specs2

}