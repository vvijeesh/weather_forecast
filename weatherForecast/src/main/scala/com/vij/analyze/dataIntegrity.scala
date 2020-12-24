package com.vij.analyze

object dataIntegrity {

  //Class for Pressure readings upto 1858
  case class pressure_1858(Year: String, Month: String, Day: String, MorningPressure: String, MorningTemp: String, NoonPressure: String, NoonTemp: String, EvePressure: String, EveTemp: String)


  //Class for Pressure readings from 1859 till 1861
  case class pressure_1859(Year: String, Month: String, Day: String, MorningPressure: String, MorningTemp: String, MornPressureAtZero: String, NoonPressure: String, NoonTemp: String, NoonPressureAtZero: String, EvePressure: String, EveTemp: String, EvePressureAtZero: String)

  //Class for Pressure readings from 1862 upto 1937
  case class pressure_1862(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Class for Pressure readings from 1938 upto 1960
  case class pressure_1938(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Class for Pressure readings from 1961 upto 2012
  case class pressure_1961(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Class for Manual Pressure readings from 2013 upto 2017
  case class pressure_2013(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

  //Class for Automated Pressure readings from 2013 upto 2017
  case class pressureA_2013(Year: String, Month: String, Day: String, MorningPressure: String, NoonPressure: String, EvePressure: String)

}