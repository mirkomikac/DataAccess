package com.sep.tim2.da.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Klijent;
import com.sep.tim2.da.insurance.repository.KlijentRepository;
import com.sep.tim2.da.insurance.service.KlijentService;

@Service
@Transactional
public class KlijentServiceImpl implements KlijentService {

	private final KlijentRepository klijentRepository;
	
	@Autowired
	public KlijentServiceImpl(KlijentRepository klijentRepository) {
		this.klijentRepository = klijentRepository;
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
	public List<Klijent> getKlijenti() {
		return klijentRepository.findAll();
	}

	@Override
	public Klijent updateKlijent(Klijent updateKlijent) {
		Klijent klijent = klijentRepository.findOne(updateKlijent.getId());
		updateKlijent.setPolise(klijent.getPolise());
		return this.createKlijent(updateKlijent);
	}

	@Override
	public void deleteKlijent(Long klijentId) {
		klijentRepository.delete(klijentId);
	}
	
}
