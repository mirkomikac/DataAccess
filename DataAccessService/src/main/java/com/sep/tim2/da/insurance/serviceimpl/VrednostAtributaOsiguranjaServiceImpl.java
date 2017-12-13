package com.sep.tim2.da.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Osiguranje;
import com.sep.tim2.da.insurance.model.TipAtributa;
import com.sep.tim2.da.insurance.model.VrednostAtributaOsiguranja;
import com.sep.tim2.da.insurance.repository.VrednostAtributaOsiguranjaRepository;
import com.sep.tim2.da.insurance.service.OsiguranjeService;
import com.sep.tim2.da.insurance.service.TipAtributaService;
import com.sep.tim2.da.insurance.service.VrednostAtributaOsiguranjaService;

@Service
@Transactional
public class VrednostAtributaOsiguranjaServiceImpl implements VrednostAtributaOsiguranjaService{

	private final VrednostAtributaOsiguranjaRepository vrednostAtributaOsiguranjaRepository;
	private final OsiguranjeService osiguranjeService;
	private final TipAtributaService tipAtributaService;
	
	@Autowired
	public VrednostAtributaOsiguranjaServiceImpl(VrednostAtributaOsiguranjaRepository vrednostAtributaOsiguranjaRepository,
												 OsiguranjeService osiguranjeService,
												 TipAtributaService tipAtributaService) {
		this.vrednostAtributaOsiguranjaRepository = vrednostAtributaOsiguranjaRepository;
		this.osiguranjeService = osiguranjeService;
		this.tipAtributaService = tipAtributaService;
	}
	
	@Override
	public VrednostAtributaOsiguranja createVrednostAtributaOsiguranja(
			VrednostAtributaOsiguranja vrednostAtributaOsiguranja, Long osiguranjeId, Long tipAtributaId) {
		Osiguranje osiguranje = osiguranjeService.getOsiguranje(osiguranjeId);
		TipAtributa tipAtributa = tipAtributaService.getTipAtributa(tipAtributaId);
		vrednostAtributaOsiguranja.setOsiguranje(osiguranje);
		vrednostAtributaOsiguranja.setTipAtributa(tipAtributa);
		return vrednostAtributaOsiguranjaRepository.save(vrednostAtributaOsiguranja);
	}

	@Override
	@Transactional(readOnly = true)
	public VrednostAtributaOsiguranja getVrednostAtributaOsiguranja(Long vrednostAtributaOsiguranjaId) {
		return vrednostAtributaOsiguranjaRepository.findOne(vrednostAtributaOsiguranjaId);
	}

	@Override
	@Transactional(readOnly = true)
	public List<VrednostAtributaOsiguranja> getVrednostiAtributaOsiguranjaZaOsiguranje(Long osiguranjeId) {
		return vrednostAtributaOsiguranjaRepository.findVrednostAtributaOsiguranjasByOsiguranjeId(osiguranjeId);
	}

	@Override
	public VrednostAtributaOsiguranja updateVrednostAtributaOsiguranja(
			VrednostAtributaOsiguranja vrednostAtributaOsiguranja, Long osiguranjeId, Long tipAtributaId) {
		return this.createVrednostAtributaOsiguranja(vrednostAtributaOsiguranja, osiguranjeId, tipAtributaId);
	}

	@Override
	public void deleteVrednostAtributaOsiguranja(Long vrednostAtributaOsiguranjaId) {
		vrednostAtributaOsiguranjaRepository.delete(vrednostAtributaOsiguranjaId);
	}

}
