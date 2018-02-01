import Dependencies._

lazy val root = (project in file("."))
    .settings(
        inThisBuild(List(
            organization := "com.artenc",
            scalaVersion := "2.12.4",
            version      := "0.1.0-SNAPSHOT"
        )),
        name := "Scala Utility",
        libraryDependencies += scalaTest % Test
    )
