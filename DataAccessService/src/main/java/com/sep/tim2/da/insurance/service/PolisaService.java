package com.sep.tim2.da.insurance.service;

import java.util.List;

import com.sep.tim2.da.insurance.model.Polisa;

public interface PolisaService {

	Polisa createPolisa(Polisa polisa, Long klijentId);
	Polisa getPolisa(Long polisaId);
	List<Polisa> getPolise();
	List<Polisa> getPoliseZaKlijenta(Long klijentId);
	Polisa updatePolisa(Polisa polisa, Long klijentId);
	void deletePolisa(Long polisaId);
	
}
