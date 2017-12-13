package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Cenovnik;
import com.sep.tim2.da.insurance.repository.CenovnikRepository;
import com.sep.tim2.da.insurance.service.CenovnikService;

@Service
@Transactional
public class CenovnikServiceImpl implements CenovnikService{
	
	private final CenovnikRepository cenovnikRepository;
	
	@Autowired
	public CenovnikServiceImpl(CenovnikRepository cenovnikRepository) {
		this.cenovnikRepository = cenovnikRepository;
	}

	@Override
	public Collection<Cenovnik> getCenovnici() {
		return cenovnikRepository.findAll();
	}

	@Override
	public Cenovnik getCenovnik(Long id) {
		return cenovnikRepository.findOne(id);
	}

	@Override
	public Cenovnik createCenovnik(Cenovnik cenovnik) {
		return cenovnikRepository.save(cenovnik);
	}

	@Override
	public Cenovnik updateCenovnik(Cenovnik cenovnik) {
		return cenovnikRepository.save(cenovnik);
	}

	@Override
	public void deleteCenovnik(Long id) {
		cenovnikRepository.delete(id);
	}
}
