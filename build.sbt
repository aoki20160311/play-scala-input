name := """play-scala-myapp"""
organization := "com.tuyano.play"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.tuyano.play.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.tuyano.play.binders._"

libraryDependencies += "com.h2database" % "h2" % "1.4.197"
libraryDependencies += evolutions
libraryDependencies += jdbc

libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.2"
