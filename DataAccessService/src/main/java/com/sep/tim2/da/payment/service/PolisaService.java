package com.sep.tim2.da.payment.service;

import java.util.List;

import com.sep.tim2.da.payment.model.Polisa;

public interface PolisaService {

	Polisa createPolisa(Polisa polisa);
	Polisa getPolisa(Long polisaId);
	List<Polisa> getPolise();
	Polisa updatePolisa(Polisa polisa);
	void deletePolisa(Long polisaId);
	
}
