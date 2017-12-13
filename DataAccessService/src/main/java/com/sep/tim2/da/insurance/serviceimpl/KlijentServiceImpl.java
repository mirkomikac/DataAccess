package com.sep.tim2.da.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
}
