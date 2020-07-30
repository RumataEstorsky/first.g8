name := "$name$"
scalaVersion := "2.13.3"

val circeVersion = "0.13.0"
val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
).map(_ % circeVersion)

val akkaVersion = "2.6.8"
val akka = Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaVersion
)

val logging = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "ch.qos.logback" % "logback-classic" % "1.2.3"
)

val slickVersion = "3.3.2"
val slickPgVersion = "0.19.1"
val db = Seq(
    "org.flywaydb"                % "flyway-core"                 % "6.5.3",
    "org.postgresql"              % "postgresql"                  % "42.2.14",
    "com.typesafe.slick"          %% "slick"                      % slickVersion,
    "com.typesafe.slick"          %% "slick-hikaricp"             % slickVersion,
    "com.github.tminglei"         %% "slick-pg"                   % slickPgVersion,
)

val specs2Version = "4.10.1"
val specs2= Seq(
    "org.specs2" %% "specs2-core" % specs2Version % "test"
)

libraryDependencies ++= circe ++ akka ++ logging ++ db ++ specs2

scalacOptions in Test ++= Seq("-Yrangepos")
