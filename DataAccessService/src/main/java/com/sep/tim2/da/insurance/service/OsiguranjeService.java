package com.sep.tim2.da.insurance.service;

import java.util.List;

import com.sep.tim2.da.insurance.model.Osiguranje;

public interface OsiguranjeService {

	Osiguranje createOsiguranje(Osiguranje osiguranje, Long polisaId, Long tipOsiguranjaId);
	Osiguranje getOsiguranje(Long osiguranjeId);
	List<Osiguranje> getOsiguranja();
	List<Osiguranje> getOsiguranjaZaPolisu(Long polisaId);
	Osiguranje updateOsiguranje(Osiguranje osiguranje, Long polisaId, Long tipOsiguranjaId);
	void deleteOsigarnje(Long osiguranjeId);
	
}
