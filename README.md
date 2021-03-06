# weather_forecast

### Problem Statement
The project prepares the test data from a weather forecast station and cleanse and prepares it for data scientists for business analytics. The code assumes to receive the weather data in HDFS and processes it for downstream usage.

### Given Data and schema
Each data file is a plain ascii file with one day per row.
Columns 1-3 define the date, starting with 1756 01 01.
Columns 4-6 contain three daily observations (morning, noon, evening).
Columns 7-9 (if existing) contain observed daily tmax and tmin and estimated tmean.
Missing observations are flagged with 'NaN'.

stockholm_daily_temp_obs_1961_2012_t1t2t3txtntm.txt

	Observed temperatures 1961-2012
	(morning, noon, evening, tmin, tmax and estimated diurnal mean)
	Unit: degC