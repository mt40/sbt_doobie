lazy val globalSettings = Seq(
  version := "1.0.0",
  scalaVersion := "2.11.12",
  scalacOptions := Seq("-Ylog-classpath")
)

lazy val database = (project in file("database"))
  .settings(globalSettings)
  .settings(
    libraryDependencies ++= Seq(
      "org.tpolecat" %% "doobie-core" % "0.5.2" % "provided"
    )
  )

lazy val server = (project in file("server"))
  .settings(globalSettings)
  .dependsOn(database)




