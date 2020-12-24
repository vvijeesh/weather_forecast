package com.vij.analyze

import org.apache.spark.SparkFiles
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

  //val stourl = "https://bolin.su.se/data/stockholm-thematic/files/stockholm-historical-weather-observations-2017/temperature/daily/raw/stockholm_daily_temp_obs_1961_2012_t1t2t3txtntm.txt"
  // val weather_file = "F:\Weather Forecast\weatherForecast\src\main\resources\stockholm_daily_temp_obs_1961_2012_t1t2t3txtntm.txt"
}
