package com.vij.analyze

import org.apache.spark.SparkFiles
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, SparkSession}

object utilities {

  //Function to return filename from the given URL
  def getFileName(str: String): String = {
    str.substring(str.lastIndexOf("/") + 1)
  }

  //Function to load the web URL file into Spark and create DF
  def loadWebFileAsDF(load_name: String, spark: SparkSession): DataFrame = {
    spark
      .read
      .format("csv")
      .option("header", "false")
      .option("delimiter", " ")
      .load(SparkFiles.get(getFileName(load_name)))
  }

  def getFileAsRDD(filepath: String, spark: SparkSession) = {
    spark.sparkContext.textFile(filepath)
  }

  def getDFfromArray(rddname:RDD[String],spark: SparkSession) = {

    import spark.sqlContext.implicits._
    rddname.map( x => x.replaceAll(""" +"""," ")).map(_.trim).toDF
  }

  def getFinalDF(dfname:DataFrame, spark:SparkSession) = {
    import spark.implicits._

    //Collect max col size in all of given DF
    val num_cols = dfname.map(_.size).collect.reduce(_ max _)

    //Create cols using the col size value
    val selectCols = (0 until num_cols).map(i => $"value"(i).as(s"col_$i"))

    dfname.select(selectCols:_*)
  }

}
