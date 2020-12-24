package com.vij.analyze

import scala.io.Source
import scala.math.Fractional.Implicits.infixFractionalOps
import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkFiles
import com.vij.analyze.utilities._
import com.vij.analyze.dataCleansing
import com.vij.analyze.dataIntegrity
import com.vij.analyze.prepareTable._

object getWeatherData {
  def main(args: Array[String]): Unit = {

    /*
    * Args 0 - URL
    * Args 1 - Table name
    * */

    val fileList = args(0)
    val table_name = args(1)
    val className = args(2)

    val spark = SparkSession
      .builder()
      .appName("WeatherForecast")
      .master("yarn")
      .enableHiveSupport()
      .getOrCreate()


    //Read files from given list and process and create DF
    for ( flist <- fileList) {
      prepareTablefromFile(spark,flist.toString, className)
    }


  }




}
