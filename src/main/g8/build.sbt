
import sbt._
import sbt.Keys._

lazy val root =  (project in file("."))
  $if(enableAkkaStreams.truthy)$
  .enablePlugins(CloudflowAkkaStreamsApplicationPlugin)
  $endif$
  $if(enableFlink.truthy)$
  .enablePlugins(CloudflowAkkaStreamsApplicationPlugin)
  $endif$
  $if(enableSpark.truthy)$
  .enablePlugins(CloudflowAkkaStreamsApplicationPlugin)
  $endif$

  .settings(
    libraryDependencies ++= Seq(
      "com.lightbend.akka"     %% "akka-stream-alpakka-file"  % "1.1.2",
      "com.typesafe.akka"      %% "akka-http-spray-json"      % "10.1.11",
      "ch.qos.logback"         %  "logback-classic"           % "1.2.3",
      "com.typesafe.akka"      %% "akka-http-testkit"         % "10.1.11" % "test"
    ),
    name := "$project$",
    organization := "$package$",
    scalaVersion := "$scalaVersion$",
    crossScalaVersions := Vector(scalaVersion.value)
  )
