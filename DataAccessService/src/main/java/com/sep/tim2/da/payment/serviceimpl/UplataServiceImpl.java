package com.sep.tim2.da.payment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.payment.model.Osiguranje;
import com.sep.tim2.da.payment.model.StatusUplate;
import com.sep.tim2.da.payment.model.Uplata;
import com.sep.tim2.da.payment.repository.UplataRepository;
import com.sep.tim2.da.payment.service.OsiguranjeService;
import com.sep.tim2.da.payment.service.UplataService;

@Service
@Transactional
public class UplataServiceImpl implements UplataService{

	private final UplataRepository uplataRepository;
	private final OsiguranjeService polisaService;
	
	@Autowired
	public UplataServiceImpl(UplataRepository uplataRepository, OsiguranjeService polisaService) {
		this.uplataRepository = uplataRepository;
		this.polisaService = polisaService;
	}
	
	@Override
	public Uplata createUplata(Uplata uplata, Long osiguranjeId) {
		Osiguranje osiguranje = polisaService.getOsiguranje(osiguranjeId);
		uplata.setOsiguranje(osiguranje);
		uplata.setStatus(StatusUplate.NA_OBRADI);
		return uplataRepository.save(uplata);
	}

	@Override
	@Transactional(readOnly = true)
	public Uplata getUplata(Long uplataId) {
		return uplataRepository.findOne(uplataId);
	}

	@Override
	@Transactional
	public List<Uplata> getUplateZaOsiguranje(Long osiguranjeId) {
		return uplataRepository.findUplatasByOsiguranjeId(osiguranjeId);
	}

	@Override
	public Uplata updateUplata(Uplata uplata, Long osiguranjeId) {
		return this.createUplata(uplata, osiguranjeId);
	}

	@Override
	public void deleteUplata(Long uplataId) {
		uplataRepository.delete(uplataId);
	}

}
