package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.Cenovnik;

public interface CenovnikService {
	
	Collection<Cenovnik> getCenovnici();
	Cenovnik getCenovnik(Long id);
	Cenovnik createCenovnik(Cenovnik cenovnik);
	Cenovnik updateCenovnik(Cenovnik cenovnik);
	void deleteCenovnik(Long id);
	
}
