package $package$.$appname;format="word"$

import $package$.$appname;format="word"$.config.Settings
import $package$.$appname;format="word"$.handler.ReadDataFromExternal
import org.apache.spark.sql.SparkSession

/**
  * Spark2 普通性任务
  *
  * 任务运行一次后终止,由外部调度器管理任务调度
  *
  * 全部参数需在application.conf中配置
  *
  * @wunyang
  */

object $appname;format="Camel"$ extends App{

  val appName = Settings.getProgName // 设置任务名
  val master = Settings.getSparkParams()("sparkMaster") //设置sparkMaster
  val spark = SparkSession.builder.appName(appName).master(master).getOrCreate()

  val file = args(0)
  val countLines = ReadDataFromExternal(file)(spark)

  println(s"CountLines with a: \$countLines")
  spark.stop()

}
