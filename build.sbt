name := """play-java-intro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
  "com.typesafe.play.plugins" %% "play-plugins-mailer" % "2.3.1",
  cache,
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  javaJdbc,
  javaEbean
)    
