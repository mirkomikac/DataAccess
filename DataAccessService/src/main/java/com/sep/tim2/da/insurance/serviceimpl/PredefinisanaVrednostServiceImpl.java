package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.PredefinisanaVrednost;
import com.sep.tim2.da.insurance.repository.PredefinisanaVrednostRepository;
import com.sep.tim2.da.insurance.service.PredefinisanaVrednostService;

@Service
@Transactional
public class PredefinisanaVrednostServiceImpl implements PredefinisanaVrednostService{
	
	private final PredefinisanaVrednostRepository predefinisanaVrednostRepository;
	
	@Autowired
	public PredefinisanaVrednostServiceImpl(PredefinisanaVrednostRepository predefinisanaVrednostRepository) {
		this.predefinisanaVrednostRepository = predefinisanaVrednostRepository;
	}

	@Override
	public Collection<PredefinisanaVrednost> getPredefinisaneVrednoste() {
		return predefinisanaVrednostRepository.findAll();
	}

	@Override
	public PredefinisanaVrednost getPredefinisanaVrednost(Long id) {
		return predefinisanaVrednostRepository.findOne(id);
	}

	@Override
	public PredefinisanaVrednost createPredefinisanaVrednost(PredefinisanaVrednost predefinisanaVrednost) {
		return predefinisanaVrednostRepository.save(predefinisanaVrednost);
	}

	@Override
	public PredefinisanaVrednost updatePredefinisanaVrednost(PredefinisanaVrednost predefinisanaVrednost) {
		return predefinisanaVrednostRepository.save(predefinisanaVrednost);
	}

	@Override
	public void deletePredefinisanaVrednost(Long id) {
		predefinisanaVrednostRepository.delete(id);
	}
}
