package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.KontekstAtributa;

public interface KontekstAtributaService {
	
	Collection<KontekstAtributa> getKontekstiAtributa();
	KontekstAtributa getKontekstAtributa(Long id);
	KontekstAtributa createKontekstAtributa(KontekstAtributa kontekstAtributa);
	KontekstAtributa updateKontekstAtributa(KontekstAtributa kontekstAtributa);
	void deleteKontekstAtributa(Long id);
	
}
