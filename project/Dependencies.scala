import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val akka = "com.typesafe.akka" %% "akka-http"   % "10.1.7"
  lazy val akkaStream = "com.typesafe.akka" %% "akka-stream" % "2.5.19" // or whatever the latest version is
  lazy val cats = "org.typelevel" %% "cats-core" % "1.4.0"
  lazy val circe = "io.circe" % "circe-core_2.12" % "0.10.0"
  lazy val circeGen = "io.circe" % "circe-generic_2.12" % "0.10.0"
  lazy val circeJava8 = "io.circe" % "circe-java8_2.12" % "0.10.0"
  lazy val circeJawn = "io.circe" % "circe-jawn_2.12" % "0.10.0"
  lazy val http4s =   "org.http4s" %% "http4s-circe" % "0.19.0"
}
