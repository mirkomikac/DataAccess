package com.sep.tim2.da.payment.service;

import java.util.List;

import com.sep.tim2.da.payment.model.Uplata;

public interface UplataService {

	Uplata createUplata(Uplata uplata, Long polisaId);
	Uplata getUplata(Long uplataId);
	List<Uplata> getUplateZaPolisu(Long polisaId);
	Uplata updateUplata(Uplata uplata, Long polisaId);
	void deleteUplata(Long uplataId);
	
}
