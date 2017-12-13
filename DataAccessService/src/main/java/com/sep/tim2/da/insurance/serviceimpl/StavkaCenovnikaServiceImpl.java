package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.StavkaCenovnika;
import com.sep.tim2.da.insurance.repository.StavkaCenovnikaRepository;
import com.sep.tim2.da.insurance.service.StavkaCenovnikaService;

@Service
@Transactional
public class StavkaCenovnikaServiceImpl implements StavkaCenovnikaService{

	private final StavkaCenovnikaRepository stavkaCenovnikaRepository;
	
	@Autowired
	public StavkaCenovnikaServiceImpl(StavkaCenovnikaRepository stavkaCenovnikaRepository) {
		this.stavkaCenovnikaRepository = stavkaCenovnikaRepository;
	}

	@Override
	public Collection<StavkaCenovnika> getStavkeCenovnike() {
		return stavkaCenovnikaRepository.findAll();
	}

	@Override
	public StavkaCenovnika getStavkaCenovnika(Long id) {
		return stavkaCenovnikaRepository.findOne(id);
	}

	@Override
	public StavkaCenovnika createStavkaCenovnika(StavkaCenovnika stavkaCenovnika) {
		return stavkaCenovnikaRepository.save(stavkaCenovnika);
	}

	@Override
	public StavkaCenovnika updateStavkaCenovnika(StavkaCenovnika stavkaCenovnika) {
		return stavkaCenovnikaRepository.save(stavkaCenovnika);
	}

	@Override
	public void deleteStavkaCenovnika(Long id) {
		stavkaCenovnikaRepository.delete(id);
	}
	
}
