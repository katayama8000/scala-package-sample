val scala3Version = "3.7.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-package-sample",
    version := "0.1.0-SNAPSHOT",
    organization := "io.github.katayama8000",
    organizationName := "katayama8000",
    startYear := Some(2025),
    licenses += License.MIT,
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
