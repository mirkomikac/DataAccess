package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.OsiguravajucaKuca;
import com.sep.tim2.da.insurance.repository.OsiguravajucaKucaRepository;
import com.sep.tim2.da.insurance.service.OsiguravajucaKucaService;

@Service
@Transactional
public class OsiguravajucaKucaServiceImpl implements OsiguravajucaKucaService{

	private final OsiguravajucaKucaRepository osiguravajucaKucaRepository;

	public OsiguravajucaKucaServiceImpl(OsiguravajucaKucaRepository osiguravajucaKucaRepository) {
		this.osiguravajucaKucaRepository= osiguravajucaKucaRepository;
	}
	
	@Override
	public Collection<OsiguravajucaKuca> getOsiguravajuceKuce() {
		return osiguravajucaKucaRepository.findAll();
	}

	@Override
	public OsiguravajucaKuca getOsiguravajucaKuca(Long id) {
		return osiguravajucaKucaRepository.findOne(id);
	}

	@Override
	public OsiguravajucaKuca createOsiguravajucaKuca(OsiguravajucaKuca osiguravajucaKuca) {
		return osiguravajucaKucaRepository.save(osiguravajucaKuca);
	}

	@Override
	public OsiguravajucaKuca updateOsiguravajucaKuca(OsiguravajucaKuca osiguravajucaKuca) {
		return osiguravajucaKucaRepository.save(osiguravajucaKuca);
	}

	@Override
	public void deleteOsiguravajucaKuca(Long id) {
		osiguravajucaKucaRepository.delete(id);
	}
	
}
