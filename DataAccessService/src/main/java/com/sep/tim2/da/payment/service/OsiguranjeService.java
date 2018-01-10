package com.sep.tim2.da.payment.service;

import java.util.List;

import com.sep.tim2.da.payment.model.Osiguranje;

public interface OsiguranjeService {

	Osiguranje createOsiguranje(Osiguranje osiguranje);
	Osiguranje getOsiguranje(Long osiguranjeId);
	List<Osiguranje> getOsiguranja();
	Osiguranje updateOsiguranje(Osiguranje osiguranje);
	void deleteOsiguranje(Long osiguranjeId);
	
}
