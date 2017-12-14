package com.sep.tim2.da.insurance.service;

import java.util.Collection;

import com.sep.tim2.da.insurance.model.StavkaCenovnika;

public interface StavkaCenovnikaService {
	
	Collection<StavkaCenovnika> getStavkeCenovnike();
	Collection<StavkaCenovnika> getStavkeCenovnikaZaCenovnik(Long cenovnikId);
	StavkaCenovnika getStavkaCenovnika(Long id);
	StavkaCenovnika createStavkaCenovnika(StavkaCenovnika stavkaCenovnika, Long cenovnikId);
	StavkaCenovnika updateStavkaCenovnika(StavkaCenovnika stavkaCenovnika, Long cenovnikId);
	void deleteStavkaCenovnika(Long id);
	
}
