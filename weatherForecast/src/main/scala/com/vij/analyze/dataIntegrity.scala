package com.vij.analyze

import org.apache.spark.sql.{DataFrame, SparkSession}

import java.text.SimpleDateFormat
import java.util.Calendar

object dataIntegrity {

  def checkDfIntegrity(given_df: DataFrame, spark: SparkSession) = {
    //Get YY format for today : 2020
    val yy_format = new SimpleDateFormat("yyyy")
    val yy_date = yy_format.format(Calendar.getInstance().getTime())

    val year_check_df = year_check(given_df, yy_date)
    val month_check_df = month_check(year_check_df)
    val dd_check_df = day_check(month_check_df)

    //Return data checked DF
    dd_check_df
  }

  def year_check(df: DataFrame, ydate: String) = {
    //Validate Col 0
    df.select("*").filter(df("col_0") <= ydate).toDF
  }

  def month_check(df: DataFrame) = {
    //Validate Col 1 for months lesser than 12
    df.select("*").filter(df("col_1") <= 12).toDF
  }

  def day_check(df: DataFrame) = {
    //Validate Col 2 for days lesser than 31
    df.select("*").filter(df("col_2") <= 31).toDF
  }
}