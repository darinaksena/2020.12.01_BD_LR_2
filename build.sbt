name := "2020.12.01_BD_LR_2.4"

version := "0.1"

scalaVersion := "2.12.9"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.0"
)
libraryDependencies ++= Seq("org.apache.spark" %% "spark-sql" % "2.4.0")