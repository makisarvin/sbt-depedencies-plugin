version := "1.0"

sbtPlugin := true

organization := "com.example"

name := "myplugin"


resolvers in ThisBuild ++= Seq (
	"ReactiveCouchbase Snapshots" at "https://raw.github.com/ReactiveCouchbase/repository/master/snapshots/",
	"Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.12.0")

