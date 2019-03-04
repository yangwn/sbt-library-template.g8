package $package$.$appname;format="word"$.config


import java.io.File

import com.typesafe.config.ConfigFactory

object Settings {

  val config = {
    new File("./application.conf") match {
      case file if (file.exists()) => {
        println("file:" + file.getPath())
        ConfigFactory.parseFile(file)
      }
      case _ => ConfigFactory.load()
    }
  }

  val env = config.getString("env").concat(".")

  def getString(param: String) = {
    config.getString(env + param)
  }

  /**
    * Get Program Name
    *
    * @return
    */
  def getProgName(): String = getString("ProgName")

  /**
    * Get Spark Parameters
    *
    * @return
    */
  def getSparkParams(): Map[String, String] = {
    val sparkMaster = getString("SparkPath.master")
    Map("sparkMaster" -> sparkMaster)
  }

}
