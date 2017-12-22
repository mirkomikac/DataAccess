package com.sep.tim2.da.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Osiguranje;
import com.sep.tim2.da.insurance.model.Polisa;
import com.sep.tim2.da.insurance.model.TipOsiguranja;
import com.sep.tim2.da.insurance.repository.OsiguranjeRepository;
import com.sep.tim2.da.insurance.service.OsiguranjeService;
import com.sep.tim2.da.insurance.service.PolisaService;
import com.sep.tim2.da.insurance.service.TipOsiguranjaService;

@Service
@Transactional
public class OsiguranjeServiceImpl implements OsiguranjeService{

	private final OsiguranjeRepository osiguranjeRepository;
	private final PolisaService polisaService;
	private final TipOsiguranjaService tipOsiguranjaService;
	
	@Autowired
	public OsiguranjeServiceImpl(OsiguranjeRepository osiguranjeRepository,
								 PolisaService polisaService,
								 TipOsiguranjaService tipOsiguranjaService) {
		this.osiguranjeRepository = osiguranjeRepository;
		this.polisaService = polisaService;
		this.tipOsiguranjaService = tipOsiguranjaService;
	}
	
	@Override
	public Osiguranje createOsiguranje(Osiguranje osiguranje, Long polisaId, Long tipOsiguranjaId) {
		Polisa polisa = polisaService.getPolisa(polisaId);
		TipOsiguranja tipOsiguranja = tipOsiguranjaService.getTipOsiguranja(tipOsiguranjaId);
		osiguranje.setPolisa(polisa);
		osiguranje.setTipOsiguranja(tipOsiguranja);
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
	@Transactional(readOnly = true)
	public List<Osiguranje> getOsiguranjaZaPolisu(Long polisaId) {
		return osiguranjeRepository.findOsiguranjesByPolisaId(polisaId);
	}

	@Override
	public Osiguranje updateOsiguranje(Osiguranje updateOsiguranje, Long polisaId, Long tipOsiguranjaId) {
		Osiguranje osiguranje = osiguranjeRepository.findOne(updateOsiguranje.getId());
		updateOsiguranje.setVrednostiAtributaOsiguranja(osiguranje.getVrednostiAtributaOsiguranja());
		return this.createOsiguranje(updateOsiguranje, polisaId, tipOsiguranjaId);
	}

	@Override
	public void deleteOsigarnje(Long id) {
		osiguranjeRepository.delete(id);
	}

}
