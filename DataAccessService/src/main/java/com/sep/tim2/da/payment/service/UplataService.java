package com.sep.tim2.da.payment.service;

import java.util.List;

import com.sep.tim2.da.payment.model.Uplata;

public interface UplataService {

	Uplata createUplata(Uplata uplata, Long osiguranjeId);
	Uplata getUplata(Long uplataId);
	List<Uplata> getUplateZaOsiguranje(Long osiguranjeId);
	Uplata updateUplata(Uplata uplata, Long osiguranjeId);
	void deleteUplata(Long uplataId);
	void successUplata(Long uplataId);
	void cancelUplata(Long uplataId);
	void errorUplata(Long uplataId);
	
}
