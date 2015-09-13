name := """play-scala-spring"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

resolvers += "Spring Snapshots" at "http://maven.springframework.org/snapshot"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.springframework" % "spring-context" % "4.2.0.RELEASE",
  "org.springframework.guice" % "spring-guice" % "1.0.0.BUILD-SNAPSHOT",
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

