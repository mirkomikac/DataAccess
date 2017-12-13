package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.PredefinisanaVrednost;

public interface PredefinisanaVrednostService {
	
	Collection<PredefinisanaVrednost> getPredefinisaneVrednoste();
	PredefinisanaVrednost getPredefinisanaVrednost(Long id);
	PredefinisanaVrednost createPredefinisanaVrednost(PredefinisanaVrednost predefinisanaVrednost);
	PredefinisanaVrednost updatePredefinisanaVrednost(PredefinisanaVrednost predefinisanaVrednost);
	void deletePredefinisanaVrednost(Long id);
	
}
