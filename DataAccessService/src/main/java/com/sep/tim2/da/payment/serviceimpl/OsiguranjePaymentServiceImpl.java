package com.sep.tim2.da.payment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.payment.model.Osiguranje;
import com.sep.tim2.da.payment.repository.OsiguranjePaymentRepository;
import com.sep.tim2.da.payment.service.OsiguranjeService;

@Service
@Transactional
public class OsiguranjePaymentServiceImpl implements OsiguranjeService{

	private final OsiguranjePaymentRepository osiguranjeRepository;
	
	@Autowired
	public OsiguranjePaymentServiceImpl(OsiguranjePaymentRepository osiguranjeRepository) {
		this.osiguranjeRepository = osiguranjeRepository;
	}
	
	@Override
	public Osiguranje createOsiguranje(Osiguranje osiguranje) {
		return osiguranjeRepository.save(osiguranje);
	}

	@Override
	@Transactional(readOnly = true)
	public Osiguranje getOsiguranje(Long osiguranjeId) {
		return osiguranjeRepository.findOne(osiguranjeId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Osiguranje> getOsiguranja() {
		return osiguranjeRepository.findAll();
	}

	@Override
	public Osiguranje updateOsiguranje(Osiguranje osiguranje) {
		Osiguranje updateOsiguranje = osiguranjeRepository.findOne(osiguranje.getId());
		osiguranje.setUplate(updateOsiguranje.getUplate());
		return this.createOsiguranje(osiguranje);
	}

	@Override
	public void deleteOsiguranje(Long osiguranjeId) {
		osiguranjeRepository.delete(osiguranjeId);
	}

}
