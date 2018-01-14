package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

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
	public List<Cenovnik> getCenovniciZaOsiguravajucuKucu(Long osiguravajucaKucaId, Date date) {
		return cenovnikRepository.findCenobnikByOsiguravajucaKucaIdAndDate(osiguravajucaKucaId, date);
	}

	@Override
	public List<Cenovnik> getCenovniciZaOsiguravajucuKucu(Long osiguravajucaKucaId) {
		return cenovnikRepository.findCenovniksByOsiguravajucaKucaId(osiguravajucaKucaId);
	}

	@Override
	public Cenovnik getAktuelanCenovnik(Long osiguravajucaKucaId) {
		return cenovnikRepository.findAktuelanCenovnikZaDatum(osiguravajucaKucaId, new Date(), true);
	}

	@Override
	public Cenovnik createCenovnik(Cenovnik cenovnik, Long osiguravajucaKucaId) {
		OsiguravajucaKuca osiguravajucaKuca = osiguravajucaKucaService.getOsiguravajucaKuca(osiguravajucaKucaId);
		cenovnik.getStavkeCenovnika().forEach(stavka -> stavka.setCenovnik(cenovnik));
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
	public Cenovnik setAktuelanCenovnik(Long cenovnikId) {
		Cenovnik noviAktuelniCenovnik = cenovnikRepository.findOne(cenovnikId);
		Date todayDate = new Date();
		if(todayDate.getTime() >= noviAktuelniCenovnik.getDatumOd().getTime() && todayDate.getTime() <= noviAktuelniCenovnik.getDatumDo().getTime()) {
			List<Cenovnik> aktuelniCenovnici = cenovnikRepository.findCenovniksByOsiguravajucaKucaIdAndAktuelan(noviAktuelniCenovnik.getOsiguravajucaKuca().getId(), true);
			aktuelniCenovnici.forEach(cenovnik -> {
				cenovnik.setAktuelan(false);
				cenovnikRepository.save(cenovnik);
			});
			noviAktuelniCenovnik.setAktuelan(true);
			return cenovnikRepository.save(noviAktuelniCenovnik);
		}
		return null;
	}

	@Override
	public void deleteCenovnik(Long id) {
		cenovnikRepository.delete(id);
	}
	
}
