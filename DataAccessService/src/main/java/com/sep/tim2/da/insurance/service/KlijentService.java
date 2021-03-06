package com.sep.tim2.da.insurance.service;

import java.util.List;

import com.sep.tim2.da.insurance.model.Klijent;

public interface KlijentService {

	Klijent createKlijent(Klijent klijent);
	Klijent getKlijent(Long klijentId);
	Klijent getKlijentZaEmail(String email);
	List<Klijent> getKlijenti();
	Klijent updateKlijent(Klijent klijent);
	void deleteKlijent(Long klijentId);
	Klijent getKlijetForUplata(Long uplataId);
	
}
