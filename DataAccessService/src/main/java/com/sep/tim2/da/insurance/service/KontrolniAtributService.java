package com.sep.tim2.da.insurance.service;

import com.sep.tim2.da.insurance.model.KontrolniAtribut;

public interface KontrolniAtributService {

	KontrolniAtribut createAtributZaKontekst(KontrolniAtribut atributZaKontekst, Long kontekstAtributaId, Long tipAtributaId);
	KontrolniAtribut getKontrolniAtributZaKontekst(Long kontekstAtributaId);
	KontrolniAtribut updateAtributZaKontekst(KontrolniAtribut atributZaKontekst, Long kontekstAtributaId, Long tipAtributaId);
	void deleteAtributZaKontekts(Long atributZaKontekstId);
	
}
