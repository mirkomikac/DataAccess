package com.sep.tim2.da.insurance.service;

import java.util.List;

import com.sep.tim2.da.insurance.model.Osiguranje;

public interface OsiguranjeService {

	Osiguranje createOsiguranje(Osiguranje osiguranje, Long tipOsiguranjaId);
	Osiguranje getOsiguranje(Long osiguranjeId);
	List<Osiguranje> getOsiguranja();
	Osiguranje updateOsiguranje(Osiguranje osiguranje, Long tipOsiguranjaId);
	void deleteOsigarnje(Long osiguranjeId);
	
}
