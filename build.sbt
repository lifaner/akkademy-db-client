name := """akkademy-db-client"""
version := "1.0"
organization := "com.akkademy-db-client"
scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.3",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.6" % "test",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test",
  "com.typesafe.akka" %% "akka-remote" % "2.3.6",
  "com.akkademy-db" %% "akkademy-db" % "0.0.1-SNAPSHOT")


fork in run := true