package $package$.$appname;format="word"$

object $appname;format="Camel"$ extends App{

  val appName = "TEST-APP"
  val master = "local[4]"

  val spark = SparkSession.builder.appName(appName).master(master).getOrCreate()

  // read a file
  val lines = spark.read.textFile("classpath:README.md")
  val totalLength = lines.rdd.map(line => line.length).reduce((a, b) => a + b)
  println(totalLength)

}
