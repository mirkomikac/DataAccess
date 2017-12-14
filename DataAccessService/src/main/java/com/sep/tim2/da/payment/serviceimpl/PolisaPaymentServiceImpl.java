package com.sep.tim2.da.payment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.payment.model.Polisa;
import com.sep.tim2.da.payment.repository.PolisaPaymentRepository;
import com.sep.tim2.da.payment.service.PolisaService;

@Service
@Transactional
public class PolisaPaymentServiceImpl implements PolisaService{

	private final PolisaPaymentRepository polisaRepository;
	
	@Autowired
	public PolisaPaymentServiceImpl(PolisaPaymentRepository polisaRepository) {
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
		Polisa updatePolisa = polisaRepository.findOne(polisa.getId());
		updatePolisa.setCena(polisa.getCena());
		return this.createPolisa(updatePolisa);
	}

	@Override
	public void deletePolisa(Long polisaId) {
		polisaRepository.delete(polisaId);
	}

}
