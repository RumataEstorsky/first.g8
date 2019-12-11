name := "$name$"
scalaVersion := "2.13.1"

val circeVersion = "0.12.3"
val circe = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
).map(_ % circeVersion)

val akkaVersion = "2.6.1"
val akka = Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaVersion
)

val logging = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "ch.qos.logback" % "logback-classic" % "1.2.3"
)

val slickVersion = "3.3.2"
val slickPgVersion = "0.18.1"
val db = Seq(
    "org.flywaydb"                % "flyway-core"                 % "6.1.1",
    "org.postgresql"              % "postgresql"                  % "42.2.9",
    "com.typesafe.slick"          %% "slick"                      % slickVersion,
    "com.typesafe.slick"          %% "slick-hikaricp"             % slickVersion,
    "com.github.tminglei"         %% "slick-pg"                   % slickPgVersion,
)

val specs2Version = "4.8.1"
val specs2= Seq(
    "org.specs2" %% "specs2-core" % specs2Version % "test"
)

libraryDependencies ++= circe ++ akka ++ logging ++ db ++ specs2

scalacOptions in Test ++= Seq("-Yrangepos")

