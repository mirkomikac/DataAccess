package com.sep.tim2.da.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.OsiguravajucaKuca;
import com.sep.tim2.da.insurance.model.TipOsiguranja;
import com.sep.tim2.da.insurance.repository.TipOsiguranjaRepository;
import com.sep.tim2.da.insurance.service.OsiguravajucaKucaService;
import com.sep.tim2.da.insurance.service.TipOsiguranjaService;

@Service
@Transactional
public class TipOsiguranjaServiceImpl implements TipOsiguranjaService{

	private final TipOsiguranjaRepository tipOsiguranjaRepository;
	private final OsiguravajucaKucaService osiguravajucaKucaService;
	
	@Autowired
	public TipOsiguranjaServiceImpl(TipOsiguranjaRepository tipOsiguranjaRepository,
									OsiguravajucaKucaService osiguravajucaKucaService) {
		this.tipOsiguranjaRepository = tipOsiguranjaRepository;
		this.osiguravajucaKucaService = osiguravajucaKucaService;
	}
	
	@Override
	public TipOsiguranja createTipOsiguranja(TipOsiguranja tipOsiguranja, Long osiguravajucaKucaId) {
		OsiguravajucaKuca osiguravajucaKuca = osiguravajucaKucaService.getOsiguravajucaKuca(osiguravajucaKucaId);
		tipOsiguranja.setOsiguravajucaKuca(osiguravajucaKuca);
		return tipOsiguranjaRepository.save(tipOsiguranja);
	}

	@Override
	@Transactional(readOnly = true)
	public TipOsiguranja getTipOsiguranja(Long tipOsiguranjaId) {
		return tipOsiguranjaRepository.findOne(tipOsiguranjaId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TipOsiguranja> getTipoviOsiguranja() {
		return tipOsiguranjaRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<TipOsiguranja> getTipoviOsiguranjaZaOsiguravajucuKucu(Long osiguravajucaKucaId) {
		return tipOsiguranjaRepository.findTipOsiguranjasByOsiguravajucaKucaId(osiguravajucaKucaId);
	}

	@Override
	public TipOsiguranja update(TipOsiguranja tipOsiguranja, Long osiguravajucaKucaId) {
		return this.createTipOsiguranja(tipOsiguranja, osiguravajucaKucaId);
	}

	@Override
	public void deleteTipOsiguranja(Long tipOsiguranjaId) {
		tipOsiguranjaRepository.delete(tipOsiguranjaId);
	}

}
