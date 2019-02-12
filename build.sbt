name := "SparkTutScala"

version := "0.1"

//scalaVersion := "2.12.4"
//
//// https://mvnrepository.com/artifact/org.apache.spark/spark-core
//libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"

scalaVersion := "2.12.4"

val sparkVersion = "2.0.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion
)