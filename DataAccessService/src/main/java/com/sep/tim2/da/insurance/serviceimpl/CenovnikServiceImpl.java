package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Cenovnik;
import com.sep.tim2.da.insurance.model.OsiguravajucaKuca;
import com.sep.tim2.da.insurance.repository.CenovnikRepository;
import com.sep.tim2.da.insurance.service.CenovnikService;
import com.sep.tim2.da.insurance.service.OsiguravajucaKucaService;

@Service
@Transactional
public class CenovnikServiceImpl implements CenovnikService{
	
	private final CenovnikRepository cenovnikRepository;
	private final OsiguravajucaKucaService osiguravajucaKucaService;
	
	@Autowired
	public CenovnikServiceImpl(CenovnikRepository cenovnikRepository, OsiguravajucaKucaService osiguravajucaKucaService) {
		this.cenovnikRepository = cenovnikRepository;
		this.osiguravajucaKucaService = osiguravajucaKucaService;
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
	public Cenovnik getCenovnikZaOsiguravajucuKucu(Long osiguravajucaKucaId, Date date) {
		return cenovnikRepository.findCenobnikByOsiguravajucaKucaIdAndDate(osiguravajucaKucaId, date);
	}

	@Override
	public Cenovnik createCenovnik(Cenovnik cenovnik, Long osiguravajucaKucaId) {
		OsiguravajucaKuca osiguravajucaKuca = osiguravajucaKucaService.getOsiguravajucaKuca(osiguravajucaKucaId);
		cenovnik.setOsiguravajucaKuca(osiguravajucaKuca);
		return cenovnikRepository.save(cenovnik);
	}

	@Override
	public Cenovnik updateCenovnik(Cenovnik updateCenovnik, Long osiguravajucaKucaId) {
		Cenovnik cenovnik = cenovnikRepository.findOne(updateCenovnik.getId());
		updateCenovnik.setStavkeCenovnika(cenovnik.getStavkeCenovnika());
		return this.createCenovnik(updateCenovnik, osiguravajucaKucaId);
	}

	@Override
	public void deleteCenovnik(Long id) {
		cenovnikRepository.delete(id);
	}
	
}
