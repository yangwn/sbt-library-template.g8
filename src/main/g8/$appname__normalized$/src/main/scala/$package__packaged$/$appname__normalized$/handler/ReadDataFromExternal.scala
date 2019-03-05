package $package$.$appname;format="word"$.handler

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

class ReadDataFromExternal(file: String)(@transient sparkSession: SparkSession) {

  def countFileLine(): Long = {
    sparkSession.read.textFile(file).rdd.count()
  }

}


object ReadDataFromExternal {
  def apply(file: String)(@transient sparkSession: SparkSession) = new ReadDataFromExternal(file)(sparkSession)
}
