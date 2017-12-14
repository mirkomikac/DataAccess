package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.PredefinisanaVrednost;

public interface PredefinisanaVrednostService {
	
	Collection<PredefinisanaVrednost> getPredefinisaneVrednoste();
	Collection<PredefinisanaVrednost> getPredefinisaneVrednostiZaTipAtributa(Long tipAtributaId);
	PredefinisanaVrednost getPredefinisanaVrednost(Long id);
	PredefinisanaVrednost createPredefinisanaVrednost(PredefinisanaVrednost predefinisanaVrednost, Long tipAtributaId);
	PredefinisanaVrednost updatePredefinisanaVrednost(PredefinisanaVrednost predefinisanaVrednost, Long tipAtributaId);
	void deletePredefinisanaVrednost(Long id);
	
}
