package com.sep.tim2.da.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Klijent;
import com.sep.tim2.da.insurance.model.Osiguranje;
import com.sep.tim2.da.insurance.repository.KlijentRepository;
import com.sep.tim2.da.insurance.repository.OsiguranjeRepository;
import com.sep.tim2.da.insurance.service.KlijentService;
import com.sep.tim2.da.payment.model.Uplata;
import com.sep.tim2.da.payment.repository.UplataRepository;

@Service
@Transactional
public class KlijentServiceImpl implements KlijentService {

	private final KlijentRepository klijentRepository;
	private final UplataRepository uplataRepository;
	private final OsiguranjeRepository osiguranjeRepository;
	
	@Autowired
	public KlijentServiceImpl(KlijentRepository klijentRepository, UplataRepository uplataRepository, OsiguranjeRepository osiguranjeRepository) {
		this.klijentRepository = klijentRepository;
		this.uplataRepository = uplataRepository;
		this.osiguranjeRepository = osiguranjeRepository;
	}

	@Override
	public Klijent createKlijent(Klijent klijent) {
		return klijentRepository.save(klijent);
	}

	@Override
	@Transactional(readOnly = true)
	public Klijent getKlijent(Long klijentId) {
		return klijentRepository.findOne(klijentId);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Klijent getKlijentZaEmail(String email) {
		return klijentRepository.findKlijentByEmail(email);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Klijent> getKlijenti() {
		return klijentRepository.findAll();
	}

	@Override
	public Klijent updateKlijent(Klijent updateKlijent) {
		Klijent klijent = klijentRepository.findOne(updateKlijent.getId());
		updateKlijent.setOsiguranja(klijent.getOsiguranja());
		return this.createKlijent(updateKlijent);
	}

	@Override
	public void deleteKlijent(Long klijentId) {
		klijentRepository.delete(klijentId);
	}

	@Override
	public Klijent getKlijetForUplata(Long uplataId) {
		Uplata uplata = uplataRepository.findOne(uplataId);
		
		Osiguranje osiguranje = osiguranjeRepository.findOne(uplata.getOsiguranje().getId());
		return osiguranje.getKlijent();
	}
	
}
