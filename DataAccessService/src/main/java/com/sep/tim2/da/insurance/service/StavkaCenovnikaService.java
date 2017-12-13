package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.StavkaCenovnika;

public interface StavkaCenovnikaService {
	
	Collection<StavkaCenovnika> getStavkeCenovnike();
	StavkaCenovnika getStavkaCenovnika(Long id);
	StavkaCenovnika createStavkaCenovnika(StavkaCenovnika stavkaCenovnika);
	StavkaCenovnika updateStavkaCenovnika(StavkaCenovnika stavkaCenovnika);
	void deleteStavkaCenovnika(Long id);
	
}
