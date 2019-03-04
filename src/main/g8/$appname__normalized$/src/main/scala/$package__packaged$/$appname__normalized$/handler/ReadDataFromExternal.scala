package $package$.$appname;format="word"$.handler

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

class ReadDataFromExternal(filePath: String)(@transient spark: SparkSession) {

  def countFileLine(): Int = {
    spark.read.textFile(file).rdd.count()
  }

}


object ReadDataFromExternal {
  def apply(filePath: String)(@transient spark: SparkSession) = new ReadDataFromExternal(filePath)(sparkSession)
}
