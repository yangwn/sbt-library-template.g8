package $package$.$appname;format="word"$.handler

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

class ReadDataFromExternal(kpiL2: String, batchNum: String, execTime: String)(@transient sparkSession: SparkSession) {

}


object ReadDataFromExternal {
  def apply(kpiL2: String, batchNum: String, execTime: String)(@transient sparkSession: SparkSession) = new ReadDataFromExternal(sparkSession)
}
