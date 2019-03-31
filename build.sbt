import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val http4sVersion = "0.19.0"

lazy val root = (project in file("."))
  .settings(
    name := "Scala Seed Project",
    libraryDependencies ++= List(
      akka % Compile,
      akkaStream % Compile,
      cats % Compile,
      circe % Compile,
      circeGen % Compile,
      circeJava8 % Compile,
      circeJawn % Compile,
      http4s % Compile,

      "org.http4s" %% "http4s-dsl" % http4sVersion,
      "org.http4s" %% "http4s-blaze-server" % http4sVersion,
      "org.http4s" %% "http4s-blaze-client" % http4sVersion,


        scalaTest % Test
      
      
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

guardrailTasks in Compile := List(
  ScalaClient(file("swagger.json"), pkg="petstore.client", framework = "http4s"),
  ScalaServer(file("swagger.json"), pkg="petstore.server", framework = "http4s"),
  ScalaModels(file("swagger.json"), pkg="petstore.model", framework = "http4s"),
)
