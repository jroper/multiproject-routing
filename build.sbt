name := """multiproject-routing"""

version := "1.0-SNAPSHOT"

lazy val a = (project in file("a"))
  .enablePlugins(PlayScala)
  .settings(settings: _*)

lazy val b = (project in file("b"))
  .enablePlugins(PlayScala)
  .dependsOn(a)
  .settings(settings: _*)

lazy val c = (project in file("c")).enablePlugins(PlayScala)
  .settings(settings: _*)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .dependsOn(b, c)
  .aggregate(a, b, c)
  .settings(settings: _*)

def settings: Seq[Setting[_]] = Seq(
  routesGenerator := InjectedRoutesGenerator,
  scalaVersion := "2.11.1"
)
