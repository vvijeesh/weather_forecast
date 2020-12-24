README_stockholm_obs_hours.txt

This file describes the contents of the file 
stockholm_daily_obs_hours_cet_1756_2017.txt, which contains the observation
hours when air temperature, air pressure and cloudiness observations were made
at the Stockholm Old Astronomical Observatory (59.35N, 18.05E) 1756-2017.

Contact person:

Anders Moberg
Department of Physical Geography
Stockholm University
SE-10691 Stockholm, Sweden
anders.moberg@natgeo.su.se

2018-02-06


References:

Moberg A, Bergström H, Ruiz Krigsman J, Svanered O. 2002a: 
Daily air temperature and pressure series for Stockholm (1756-1998). 
Climatic Change 53: 171-212

Moberg A, Bergström H, Ruiz Krigsman J, Svanered O. 2002b: Erratum. 
Climatic Change 54: 249-250

Project:

IMPROVE - Improved Understanding of Past Climatic Variability from Early Daily 
European Instrumental Sources. EU 4th Framework Programme. Contract
ENV4-CT97-0511. 1998-1999. Co-ordinator: Dario Camuffo, Consiglio Nazionale
delle Ricerche, Istituto di Scienze dell'Atmosfera e del Clima, Padova, Italy.
PI at Stockholm University: Anders Moberg

Original data sources:

1756-1858: Archive of the Royal Swedish Academy of Sciences
1859-now:  Swedish Meteorological and Hydrological Institute (SMHI)


--- Directory contents ---

README_stockholm_obs_hours.txt ( = this file )

stockholm_daily_obs_hours_cet_1756_2017.txt

The data file is a plain ascii file with one day per row.
Columns 1-3 define the date, starting with 1756 01 01.
Columns 4-6 contain the known or estimated hour for each of three daily
observations (morning, noon, evening), given in Central European Time (CET).

Missing observations are flagged with 'NaN'.

An discussion of the various observation hours used, and explanation of how they
were converted to CET is described in section 2.4 in Moberg et al. (2002a). 
A monthly overview is given in Table I in Moberg et al. (2002b).

Note: When an automatic station was installed on 1996-10-01, hourly observations 
started to be made. However, even though data from the automatic station are
available here from 2013-01-01 onward, the observation hours used here are a subset
consisting of three daily observation hours to follow the same procedures as before.
