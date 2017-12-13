package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.TipAtributa;

public interface TipAtributaService {

	Collection<TipAtributa> getTipoviAtributa();
	TipAtributa getTipAtributa(Long id);
	TipAtributa createTipAtributa(TipAtributa tipAtributa);
	TipAtributa updateTipAtributa(TipAtributa tipAtributa);
	void deleteTipAtributa(Long id);
	
}
