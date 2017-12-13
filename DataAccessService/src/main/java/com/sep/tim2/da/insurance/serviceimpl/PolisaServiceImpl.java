package com.sep.tim2.da.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Klijent;
import com.sep.tim2.da.insurance.model.Polisa;
import com.sep.tim2.da.insurance.repository.PolisaRepository;
import com.sep.tim2.da.insurance.service.KlijentService;
import com.sep.tim2.da.insurance.service.PolisaService;

@Service
@Transactional
public class PolisaServiceImpl implements PolisaService{

	private final PolisaRepository polisaRepository;
	private final KlijentService klijentService;
	
	@Autowired
	public PolisaServiceImpl(PolisaRepository polisaRepository, KlijentService klijentService) {
		this.polisaRepository = polisaRepository;
		this.klijentService = klijentService;
	}
	
	@Override
	public Polisa createPolisa(Polisa polisa, Long klijentId) {
		Klijent klijent = klijentService.getKlijent(klijentId);
		polisa.setKlijent(klijent);
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
	@Transactional(readOnly = true)
	public List<Polisa> getPoliseZaKlijenta(Long klijentId) {
		return polisaRepository.findPolisasByKlijentId(klijentId);
	}

	@Override
	public Polisa updatePolisa(Polisa polisa, Long klijentId) {
		return this.createPolisa(polisa, klijentId);
	}

	@Override
	public void deletePolisa(Long polisaId) {
		polisaRepository.delete(polisaId);
	}

}
