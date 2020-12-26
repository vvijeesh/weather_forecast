package com.vij.analyze

import scala.io.Source
import scala.math.Fractional.Implicits.infixFractionalOps
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.SparkFiles
import com.vij.analyze.utilities._
import com.vij.analyze.prepareTable._
import com.vij.analyze.dataIntegrity._

object getWeatherData {
  def main(args: Array[String]): Unit = {

    /*
    * Args 0 - URL
    * Args 1 - Table name
    * */

    val fileFullPath = args(0)

    val spark = SparkSession
      .builder()
      .appName("WeatherForecast")
      .master("yarn")
      .enableHiveSupport()
      .getOrCreate()


    //Read files from given list and process and create DF
    val fileAsRDD = getFileAsRDD(fileFullPath, spark)

    //Prepare DF from processed array
    val fileAsDF = getDFfromArray(fileAsRDD, spark)

    //Split and prepare final DF from given DF
    val finalFileDF = getFinalDF(fileAsDF, spark)
    finalFileDF.printSchema()

    //Check integrity in DF values
    val data_check_df = checkDfIntegrity(finalFileDF,spark)

    println("Dataframe is created as data_check_df")

  }


}
