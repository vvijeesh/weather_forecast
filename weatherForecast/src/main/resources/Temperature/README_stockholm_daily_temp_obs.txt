README_stockholm_daily_temp_obs.txt

This file describes the contents of a set of files that contain raw daily air 
temperature observation data from the Stockholm Old Astronomical Observatory
(59.35N, 18.05E) 1756-2017.

Contact person:

Anders Moberg
Department of Physical Geography
Stockholm University (SU)
SE-10691 Stockholm, Sweden
anders.moberg@natgeo.su.se

2018-02-06


Reference:

Moberg A, Bergström H, Ruiz Krigsman J, Svanered O. 2002: Daily air temperature 
and pressure series for Stockholm (1756-1998). Climatic Change 53: 171-212

Project:

IMPROVE - Improved Understanding of Past Climatic Variability from Early Daily 
European Instrumental Sources. EU 4th Framework Programme. Contract
ENV4-CT97-0511. 1998-1999. Co-ordinator: Dario Camuffo, Consiglio Nazionale
delle Ricerche, Istituto di Scienze dell'Atmosfera e del Clima, Padova, Italy.
PI at Stockholm University: Anders Moberg

Original data sources:

1756-1858: Archive of the Royal Swedish Academy of Sciences
1859-now:  Swedish Meteorological and Hydrological Institute (SMHI)

Data for 1756-1838 were digitized at the SMHI. Data for 1839-1960 were digitized
within IMPROVE. Data for 1961-2012 were provided digitally by the SMHI.

Data for 2013 and later are archived here both for the manually observed
and for the automatic station. 
These most recent data were obtained by download from SMHI Öppna Data:
http://opendata-download-metobs.smhi.se/explore/#


--- File list ---

stockholm_daily_temp_obs_1756_1858_t1t2t3.txt    
stockholm_daily_temp_obs_1859_1960_t1t2t3txtn.txt
stockholm_daily_temp_obs_1961_2012_t1t2t3txtntm.txt
stockholm_daily_temp_obs_2013_2017_t1t2t3txtntm.txt
stockholmA_daily_temp_obs_2013_2017_t1t2t3txtntm.txt

Each data file is a plain ascii file with one day per row.
Columns 1-3 define the date, starting with 1756 01 01.
Columns 4-6 contain three daily observations (morning, noon, evening).
Columns 7-9 (if existing) contain observed daily tmax and tmin 
                          and estimated tmean.
Missing observations are flagged with 'NaN'.

The observation hours for the morning, noon and evening observations are given
by the file  ~/observation_hours/stockholm_daily_obs_hours_cet_1756_2017.txt

Note! The temperature data in these files have been quality controlled as 
described by Moberg et al. (2002), but are not subject to any homogenization or
correction for known instrumental biases.

stockholm_daily_temp_obs_1756_1858_t1t2t3.txt

	Observed temperatures 1756-1858
	(morning, noon and evening) 
	Unit: degC

stockholm_daily_temp_obs_1859_1960_t1t2t3txtn.txt

	Observed temperatures 1859-1960
	(morning, noon, evening, tmin, tmax)
	Unit: degC

stockholm_daily_temp_obs_1961_2012_t1t2t3txtntm.txt

	Observed temperatures 1961-2012
	(morning, noon, evening, tmin, tmax and estimated diurnal mean)
	Unit: degC

stockholm_daily_temp_obs_2013_2017_t1t2t3txtntm.txt

	Observed temperatures 2013-2017, from the manual station
	(morning, noon, evening, tmin, tmax and estimated diurnal mean)
	Unit: degC

stockholmA_daily_temp_obs_2013_2017_t1t2t3txtntm.txt

	Observed temperatures 2013-2017, from the automatic station
	(morning, noon, evening, tmin, tmax and estimated diurnal mean)
	Unit: degC
