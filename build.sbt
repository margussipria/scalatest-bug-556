name := "ScalaTest Bug"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

organization := "com.solinor.scalatest"

lazy val root = (project in file(".")).settings(
  fork in Test := true
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.5" % Test,
  "com.typesafe.play" %% "play-json" % "2.4.3" % Test
)
