package com.sep.tim2.da.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Osiguranje;
import com.sep.tim2.da.insurance.model.TipOsiguranja;
import com.sep.tim2.da.insurance.repository.OsiguranjeRepository;
import com.sep.tim2.da.insurance.service.OsiguranjeService;
import com.sep.tim2.da.insurance.service.TipOsiguranjaService;

@Service
@Transactional
public class OsiguranjeServiceImpl implements OsiguranjeService{

	private final OsiguranjeRepository osiguranjeRepository;
	private final TipOsiguranjaService tipOsiguranjaService;
	
	@Autowired
	public OsiguranjeServiceImpl(OsiguranjeRepository osiguranjeRepository,
								 TipOsiguranjaService tipOsiguranjaService) {
		this.osiguranjeRepository = osiguranjeRepository;
		this.tipOsiguranjaService = tipOsiguranjaService;
	}
	
	@Override
	public Osiguranje createOsiguranje(Osiguranje osiguranje, Long tipOsiguranjaId) {
		TipOsiguranja tipOsiguranja = tipOsiguranjaService.getTipOsiguranja(tipOsiguranjaId);
		osiguranje.setTipOsiguranja(tipOsiguranja);
		osiguranje.getVrednostiAtributaOsiguranja().stream().forEach(v -> v.setOsiguranje(osiguranje));
		return osiguranjeRepository.save(osiguranje);
	}

	@Override
	@Transactional(readOnly = true)
	public Osiguranje getOsiguranje(Long id) {
		return osiguranjeRepository.findOne(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Osiguranje> getOsiguranja() {
		return osiguranjeRepository.findAll();
	}

	@Override
	public Osiguranje updateOsiguranje(Osiguranje updateOsiguranje, Long tipOsiguranjaId) {
		Osiguranje osiguranje = osiguranjeRepository.findOne(updateOsiguranje.getId());
		updateOsiguranje.setVrednostiAtributaOsiguranja(osiguranje.getVrednostiAtributaOsiguranja());
		return this.createOsiguranje(updateOsiguranje, tipOsiguranjaId);
	}

	@Override
	public void deleteOsigarnje(Long id) {
		osiguranjeRepository.delete(id);
	}

}
