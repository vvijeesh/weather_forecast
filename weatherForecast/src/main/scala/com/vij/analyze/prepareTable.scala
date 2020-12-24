package com.vij.analyze

import com.vij.analyze.dataIntegrity._
import org.apache.spark.sql.SparkSession

object prepareTable {

  def prepareTablefromFile(spark:SparkSession, fileName: String, className: String): Unit = {

    //Read file from spark and assign case class
    var rdd = spark.sparkContext.textFile(fileName)

    import spark.sqlContext.implicits._


    //Trim and prepare the table in DF
    rdd.map( x => x.replaceAll(""" +"""," ")).map(_.trim.split(" ")).map( x => className(x(0).toString,x(1).toString,x(2).toString,x(3).toString,x(4).toString,x(5).toString)).toDF.show(20,false)
  }
}
