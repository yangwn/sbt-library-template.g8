import sbt._
import Keys._

object Dependencies {

  lazy val VERSION = new {
    val scalaTest = "3.0.0"
    val scalaCheck = "1.13.4"
    val sparkVersion = "2.4.0-cdh6.1.1"
  }

  val commonLibs: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % VERSION.scalaTest % Test,
    "org.scalacheck" %% "scalacheck" % VERSION.scalaCheck % Test,
    "org.scalaz" % "scalaz-core_2.11" % "7.2.27",
    "com.typesafe" % "config" % "1.3.3",
  )

  val sparkLibs : Seq[ModuleID] = Seq(
    "org.apache.spark" % "spark-core_2.11" % VERSION.sparkVersion,
    "org.apache.spark" % "spark-sql_2.11" % VERSION.sparkVersion,
    "org.apache.spark" % "spark-streaming-flume_2.11" % VERSION.sparkVersion,
    "org.apache.spark" % "spark-streaming_2.11" % VERSION.sparkVersion,
  )

  val $appname$Dependencies = commonLibs ++ sparkLibs

}
