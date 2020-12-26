package com.vij.analyze

import com.vij.analyze.dataIntegrity._
import org.apache.spark.sql.SparkSession

object prepareTable {

  //Check Df and prepare table for verification
  def prepareTablefromFile(spark:SparkSession, fileName: String, className: String): Unit = {

    //Read file from spark and assign case class
    var rdd = spark.sparkContext.textFile(fileName)

    import spark.sqlContext.implicits._


    //Trim and prepare the table in DF
    rdd.map( x => x.replaceAll(""" +"""," ")).map(_.trim.split(" ")).toDF.show(20,false)
  }
}
