package com.vij.analyze

object dataIntegrity {

  //Class for Pressure readings upto 1858
  case class barometer_1858(Year: String, Month: String, Day: String, MorningPressure: String, MorningTemp: String, NoonPressure: String, NoonTemp: String, EvePressure: String, EveTemp: String)


  //Class for Pressure readings from 1859 till 1861
  case class barometer_1859(Year: String, Month: String, Day: String, MorningPressure: String, MorningTemp: String, MornPressureAtZero: String, NoonPressure: String, NoonTemp: String, NoonPressureAtZero: String, EvePressure: String, EveTemp: String, EvePressureAtZero: String)

  //Class for Pressure readings from 1862 upto 1937
  case class barometer_1862(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Class for Pressure readings from 1938 upto 1960
  case class barometer_1938(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Class for Pressure readings from 1961 upto 2012
  case class barometer_1961(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Class for Manual Pressure readings from 2013 upto 2017
  case class barometer_2013(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Class for Automated Pressure readings from 2013 upto 2017
  case class A_barometer_2013(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Check and Assign case class
  def checkAndAssignCaseClass(givenName: String) = {
    var className: String = ""
    if (givenName.contains("barometer_1858")) {
      className = "barometer_1858"
    }
    if (givenName.contains("barometer_1859")) {
      className = "barometer_1859"
    }
    if (givenName.contains("barometer_1862")) {
      className = "barometer_1862"
    }
    if (givenName.contains("barometer_1938")) {
      className = "barometer_1938"
    }
    if (givenName.contains("barometer_1961")) {
      className = "barometer_1961"
    }
    if (givenName.contains("barometer_2013")) {
      className = "barometer_2013"
    }
    className
  }
}