package com.sep.tim2.da.payment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.payment.model.Polisa;
import com.sep.tim2.da.payment.model.Uplata;
import com.sep.tim2.da.payment.repository.UplataRepository;
import com.sep.tim2.da.payment.service.PolisaService;
import com.sep.tim2.da.payment.service.UplataService;

@Service
@Transactional
public class UplataServiceImpl implements UplataService{

	private final UplataRepository uplataRepository;
	private final PolisaService polisaService;
	
	@Autowired
	public UplataServiceImpl(UplataRepository uplataRepository, PolisaService polisaService) {
		this.uplataRepository = uplataRepository;
		this.polisaService = polisaService;
	}
	
	@Override
	public Uplata createUplata(Uplata uplata, Long polisaId) {
		Polisa polisa = polisaService.getPolisa(polisaId);
		uplata.setPolisa(polisa);
		return uplataRepository.save(uplata);
	}

	@Override
	@Transactional(readOnly = true)
	public Uplata getUplata(Long uplataId) {
		return uplataRepository.findOne(uplataId);
	}

	@Override
	@Transactional
	public List<Uplata> getUplateZaPolisu(Long polisaId) {
		return uplataRepository.findUplatasByPolisaId(polisaId);
	}

	@Override
	public Uplata updateUplata(Uplata uplata, Long polisaId) {
		return this.createUplata(uplata, polisaId);
	}

	@Override
	public void deleteUplata(Long uplataId) {
		uplataRepository.delete(uplataId);
	}

}
