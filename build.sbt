name := "Play Framework Bug"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

organization := "com.solinor.scalatest"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.5" % Test,
  "com.typesafe.play" %% "play-json" % play.core.PlayVersion.current % Test
)
