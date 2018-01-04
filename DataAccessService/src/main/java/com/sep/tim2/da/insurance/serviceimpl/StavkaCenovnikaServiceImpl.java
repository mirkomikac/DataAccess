package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Cenovnik;
import com.sep.tim2.da.insurance.model.StavkaCenovnika;
import com.sep.tim2.da.insurance.repository.StavkaCenovnikaRepository;
import com.sep.tim2.da.insurance.service.CenovnikService;
import com.sep.tim2.da.insurance.service.StavkaCenovnikaService;

@Service
@Transactional
public class StavkaCenovnikaServiceImpl implements StavkaCenovnikaService{

	private final StavkaCenovnikaRepository stavkaCenovnikaRepository;
	private final CenovnikService cenovnikService;
	
	@Autowired
	public StavkaCenovnikaServiceImpl(StavkaCenovnikaRepository stavkaCenovnikaRepository,
									  CenovnikService cenovnikService) {
		this.stavkaCenovnikaRepository = stavkaCenovnikaRepository;
		this.cenovnikService = cenovnikService;
	}

	@Override
	public Collection<StavkaCenovnika> getStavkeCenovnike() {
		return stavkaCenovnikaRepository.findAll();
	}
	
	@Override
	public Collection<StavkaCenovnika> getStavkeCenovnikaZaCenovnik(Long cenovnikId) {
		return stavkaCenovnikaRepository.findStavkaCenovnikasByCenovnikId(cenovnikId);
	}

	@Override
	public StavkaCenovnika getStavkaCenovnika(Long id) {
		return stavkaCenovnikaRepository.findOne(id);
	}
	
	@Override
	public StavkaCenovnika getStavkaCenovnikaZaCenovnikAndPredefinisanuVrednost(Long cenovnikId, Long predefinisanaVrednostId) {
		return stavkaCenovnikaRepository.findStavkaCenovnikaByCenovnikIdAndPredefinisanaVrednostId(cenovnikId, predefinisanaVrednostId);
	}

	@Override
	public StavkaCenovnika createStavkaCenovnika(StavkaCenovnika stavkaCenovnika, Long cenovnikId) {
		Cenovnik cenovnik = cenovnikService.getCenovnik(cenovnikId);
		stavkaCenovnika.setCenovnik(cenovnik);
		return stavkaCenovnikaRepository.save(stavkaCenovnika);
	}

	@Override
	public StavkaCenovnika updateStavkaCenovnika(StavkaCenovnika stavkaCenovnika, Long cenovnikId) {
		return this.createStavkaCenovnika(stavkaCenovnika, cenovnikId);
	}

	@Override
	public void deleteStavkaCenovnika(Long id) {
		stavkaCenovnikaRepository.delete(id);
	}
	
}
