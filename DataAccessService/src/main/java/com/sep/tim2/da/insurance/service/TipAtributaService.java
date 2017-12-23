package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.TipAtributa;

public interface TipAtributaService {

	Collection<TipAtributa> getTipoviAtributa();
	Collection<TipAtributa> getTipoviAtributaZaKontekts(Long kontektsId);
	Collection<TipAtributa> getTipoviAtributaZaTiposiguranja(Long tipOsiguranjaId);
	TipAtributa getTipAtributa(Long id);
	TipAtributa createTipAtributa(TipAtributa tipAtributa, Long kontektsAtributaId);
	TipAtributa updateTipAtributa(TipAtributa tipAtributa, Long kontektsAtributaId);
	void deleteTipAtributa(Long id);
	
}
