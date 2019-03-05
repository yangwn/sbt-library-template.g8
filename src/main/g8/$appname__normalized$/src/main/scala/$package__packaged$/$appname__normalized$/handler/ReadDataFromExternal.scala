package $package$.$appname;format="word"$.handler

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

class ReadDataFromExternal(file: String)(@transient spark: SparkSession) {

  def countFileLine(): Long = {
    spark.read.textFile(file).rdd.count()
  }

}


object ReadDataFromExternal {
  def apply(file: String)(@transient spark: SparkSession) = new ReadDataFromExternal(file)(spark)
}
