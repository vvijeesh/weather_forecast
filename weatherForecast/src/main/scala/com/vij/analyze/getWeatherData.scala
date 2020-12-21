package com.vij.analyze

import scala.io.Source
import scala.math.Fractional.Implicits.infixFractionalOps
import org.apache.spark.sql.{Dataset, SparkSession}
import org.apache.spark.SparkFiles

object getWeatherData {
  def main(args: Array[String]) = {
    //    val stourl = "https://bolin.su.se/data/stockholm-thematic/files/stockholm-historical-weather-observations-2017/temperature/daily/raw/stockholm_daily_temp_obs_1961_2012_t1t2t3txtntm.txt"
    /*
    * Args 0 - URL
    * Args 1 - Table name
    * */

    val stourl = args(0)
    val table_name = args(1)

    val spark = SparkSession
      .builder()
      .appName("WeatherForecast")
      .master("yarn")
      .enableHiveSupport()
      .getOrCreate()

    //Add the Web URL file to Spark Session
    spark.sparkContext.addFile(stourl)

    //Get Filename
    var df_FileName = getFileName(stourl)

    //Create DF using Spark API
    var df = loadWebFileasDF(stourl)

    //Check for data integrity and create final DF with data cleaned
    var df2 = df
      .withColumn("Year", coalesce(col("_c0"), col("_c0")))
      .withColumn("Month", coalesce(col("_c1"), col("_c1")))
      .withColumn("Day", coalesce(col("_c2"), col("_c2")))
      .withColumn("Morning", coalesce(col("_c3"), col("_c3")))
      .withColumn("Noon", coalesce(col("_c4"), col("_c4")))
      .withColumn("Evening", coalesce(col("_c5"), col("_c5")))
      .withColumn("Tmax", coalesce(col("_c6"), col("_c6")))
      .withColumn("Tmin", coalesce(col("_c7"), col("_c7")))
      .withColumn("Mean", coalesce(col("_c8"), col("_c8")))


  }

  //Function to return filename from the given URL
  def getFileName(str: String) = {
    str.substring(str.lastIndexOf("/") + 1)
  }

  //Function to load the web URL file into Spark and create DF
  def loadWebFileAsDF(load_name: String) = {
    try {
      spark.read.format("csv").option("header", "false").option("delimiter", "  ").load(SparkFiles.get(load_name))
    }
    catch {
      case e: Exception =>
        println(e.getStackTrace)
        println(e.getMessage)
    }
  }


}
