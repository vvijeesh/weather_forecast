README_stockholm_pressure.txt

This file describes the contents of a directory with files containing raw and 
processed daily air pressure observation data from the Stockholm Old
Astronomical Observatory (59.35N, 18.05E) 1756-2017.

Contact person:

Anders Moberg
Department of Physical Geography
Stockholm University
SE-10691 Stockholm, Sweden
anders.moberg@natgeo.su.se

2017-02-06


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
within IMPROVE. Data for 1961-onwards were provided digitally by the SMHI. 


--- Directory contents ---

README_stockholm_press_obs.txt ( = this file )
stockholm_SLP_1756_2012_hPa_nonhom.txt
stockholm_SLP_1756_2012_hPa_hom.txt
raw/stockholm_barometer_1756_1858.txt
raw/stockholm_barometer_1859_1861.txt
raw/stockholm_barometer_1862_1937.txt
raw/stockholm_barometer_1938_1960.txt
raw/stockholm_barometer_1961_2012.txt
raw/stockholm_barometer_2013_2017.txt
raw/stockholmA_barometer_2013_2017.txt

Each data file is a plain ascii file with one day per row.
Columns 1-3 define the date, starting with 1756 01 01.
Columns 4,5,6,... contain the individual observations each day

Missing observations are flagged with 'NaN'.

The observation hours are given by the file  
~/observation_hours/stockholm_daily_obs_hours_cet_1756_2017.txt


--- Homogenized SLP series ---

stockholm_SLP_1756_2012_hPa_hom.txt

	Homogenized Sea Level Pressure 1756-2012, i.e. observed air pressure
	reduced to 0 degC, normal gravity and sea level. Additionally 
	corrected for known and supposed biased barometers and also homogenized 
	against reference stations.
	Unit: hPa

	The corrections and homogeneity adjustments are given in Table VI in 
	Moberg et al. (2002). The last correction of +0.5 hPa given there, that
	starts on 1996.09.09 (noon), is here applied until 2000.02.06 (morning).
	A new barometer was installed this day, according to Hans Alexandersson,
	SMHI (personal communication). No correction is applied for the period 
	after this installation.

	Typical number of observations per day:
	1756-1784	2
	1785-present	3

--- Non-homogenized SLP series ---

stockholm_SLP_1756_2012_hPa_nonhom.txt

	As above, but without the corrections given in Table VI in 
	Moberg et al. (2002).

--- Raw data files used to create the homogenized SLP data ---
    NOTE: raw data files exist after 2012, although
    the two files mentioned above are not updated after 2012.
  

raw/stockholm_barometer_1756_1858.txt

	Observed barometer readings 1756-1858
	2 daily obs 1756-1784.05.31 (morning & evening)
	3 daily obs 1784.06.01-1861 (morning, noon, evening)
	Columns 4, 6, 8: barometer observations
	Unit: Swedish inches (29.69 mm)
	Columns 5, 7, 9: barometer temperature observations
	Unit: degC
	
raw/stockholm_barometer_1859_1861.txt

	Observed barometer readings 1859-1861
	3 daily obs
	Columns 4, 7, 10: barometer observations
	Unit: 0.1*Swedish inches (2.969 mm)
	Columns 5, 8, 11: thermometer observations
	Unit: degC
	Columns 6, 9, 12: air pressure reduced to 0 degC
	Unit: 0.1*Swedish inches (2.969 mm)

raw/stockholm_barometer_1862_1937.txt

	Air pressure from printed year-books 1862-1937
	3 daily obs
	Columns 4-6: air pressure
	Unit: mm Hg

raw/stockholm_barometer_1938_1960.txt

	Air pressure from printed year-books 1938-1960
	3 daily obs
	Columns 4-6: air pressure
	Unit: hPa

raw/stockholm_barometer_1961_2012.txt

	Air pressure provided digitally by SMHI
	3 daily obs
	Columns 4-6: air pressure
	Unit: hPa

raw/stockholm_barometer_2013_2017.txt

	Air pressure for the manual station, as downloaded from SMHI Öppna Data;
	http://opendata-download-metobs.smhi.se/explore/#
	3 daily obs
	Columns 4-6: air pressure
	Unit: hPa

raw/stockholmA_barometer_2013_2017.txt

	Air pressure for the automatic station, as downloaded from SMHI Öppna Data;
	http://opendata-download-metobs.smhi.se/explore/#
	3 daily obs
	Columns 4-6: air pressure
	Unit: hPa
