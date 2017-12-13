package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.OsiguravajucaKuca;

public interface OsiguravajucaKucaService {
	
	Collection<OsiguravajucaKuca> getOsiguravajuceKuce();
	OsiguravajucaKuca getOsiguravajucaKuca(Long id);
	OsiguravajucaKuca createOsiguravajucaKuca(OsiguravajucaKuca osiguravajucaKuca);
	OsiguravajucaKuca updateOsiguravajucaKuca(OsiguravajucaKuca osiguravajucaKuca);
	void deleteOsiguravajucaKuca(Long id);
}
