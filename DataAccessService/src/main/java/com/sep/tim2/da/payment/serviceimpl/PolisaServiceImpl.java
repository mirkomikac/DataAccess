package com.sep.tim2.da.payment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.payment.model.Polisa;
import com.sep.tim2.da.payment.repository.PolisaRepository;
import com.sep.tim2.da.payment.service.PolisaService;

@Service
@Transactional
public class PolisaServiceImpl implements PolisaService{

	private final PolisaRepository polisaRepository;
	
	@Autowired
	public PolisaServiceImpl(PolisaRepository polisaRepository) {
		this.polisaRepository = polisaRepository;
	}
	
	@Override
	public Polisa createPolisa(Polisa polisa) {
		return polisaRepository.save(polisa);
	}

	@Override
	@Transactional(readOnly = true)
	public Polisa getPolisa(Long polisaId) {
		return polisaRepository.findOne(polisaId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Polisa> getPolise() {
		return polisaRepository.findAll();
	}

	@Override
	public Polisa updatePolisa(Polisa polisa) {
		return this.createPolisa(polisa);
	}

	@Override
	public void deletePolisa(Long polisaId) {
		polisaRepository.delete(polisaId);
	}

}
