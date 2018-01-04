package com.sep.tim2.da.insurance.service;

import java.util.Collection;
import java.util.Date;

import com.sep.tim2.da.insurance.model.Cenovnik;

public interface CenovnikService {
	
	Collection<Cenovnik> getCenovnici();
	Cenovnik getCenovnik(Long id);
	Cenovnik getCenovnikZaOsiguravajucuKucu(Long osiguravajucaKucaId, Date date);
	Cenovnik createCenovnik(Cenovnik cenovnik, Long osiguravajucaKucaId);
	Cenovnik updateCenovnik(Cenovnik cenovnik, Long osiguravajucaKucaId);
	void deleteCenovnik(Long id);
	
}
