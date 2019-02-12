import org.apache.spark.{SparkConf, SparkContext}

object HelloScala {
  def main(args: Array[String]) {
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("Word Count")
    val sc = new SparkContext(conf)

    val textFile = sc.textFile("/Volumes/dev/workspace/SparkTutScala/input.txt")
    textFile.foreach(println)

    val counts = textFile
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    counts.foreach(println)

    counts.saveAsTextFile("/Volumes/dev/workspace/SparkTutScala/output.txt")
  }
}