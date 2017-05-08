name := "ScalaTest Bug"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

organization := "com.solinor.scalatest"

lazy val root = (project in file(".")).settings(
  fork in Test := true
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % Test
)
