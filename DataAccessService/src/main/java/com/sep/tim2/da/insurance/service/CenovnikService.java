package com.sep.tim2.da.insurance.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.sep.tim2.da.insurance.model.Cenovnik;

public interface CenovnikService {
	
	Collection<Cenovnik> getCenovnici();
	Cenovnik getCenovnik(Long id);
	List<Cenovnik> getCenovniciZaOsiguravajucuKucu(Long osiguravajucaKucaId, Date date);
	List<Cenovnik> getCenovniciZaOsiguravajucuKucu(Long osiguravajucaKucaId);
	Cenovnik getAktuelanCenovnik(Long osiguravajucaKucaId);
	Cenovnik createCenovnik(Cenovnik cenovnik, Long osiguravajucaKucaId);
	Cenovnik updateCenovnik(Cenovnik cenovnik, Long osiguravajucaKucaId);
	Cenovnik setAktuelanCenovnik(Long cenovnikId);
	void deleteCenovnik(Long id);
	
}
