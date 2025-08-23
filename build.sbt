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
    homepage := Some(
      url(
        "https://github.com/katayama8000/scala-package-sample"
      )
    ),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/katayama8000/scala-package-sample"),
        "https://github.com/katayama8000/scala-package-sample.git"
      )
    ),
    developers += Developer(
      "katayama8000",
      "katayama8000",
      "tattu.0310@gmail.com",
      url("https://personal-website-self-pi.vercel.app/")
    ),
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
