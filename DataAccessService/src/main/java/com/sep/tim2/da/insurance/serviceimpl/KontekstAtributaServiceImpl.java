package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.KontekstAtributa;
import com.sep.tim2.da.insurance.repository.KontekstAtributaRepository;
import com.sep.tim2.da.insurance.service.KontekstAtributaService;

@Service
@Transactional
public class KontekstAtributaServiceImpl implements KontekstAtributaService{

	private final KontekstAtributaRepository kontekstAtributaRepository;
	
	public KontekstAtributaServiceImpl(KontekstAtributaRepository kontekstAtributaRepository) {
		this.kontekstAtributaRepository = kontekstAtributaRepository;
	}

	@Override
	public Collection<KontekstAtributa> getKontekstiAtributa() {
		return kontekstAtributaRepository.findAll();
	}

	@Override
	public KontekstAtributa getKontekstAtributa(Long id) {
		return kontekstAtributaRepository.findOne(id);
	}
	
	@Override
	public Collection<KontekstAtributa> getKontektstiAtributaZaTipOsiguranja(Long tipOsiguranjaId) {
		return kontekstAtributaRepository.findKontekstAtributasByTipoviOsiguranjaIdOrderByRedniBrojForme(tipOsiguranjaId);
	}

	@Override
	public KontekstAtributa createKontekstAtributa(KontekstAtributa kontekstAtributa) {
		return kontekstAtributaRepository.save(kontekstAtributa);
	}

	@Override
	public KontekstAtributa updateKontekstAtributa(KontekstAtributa updateKontekstAtributa) {
		KontekstAtributa kontekstAtributa = kontekstAtributaRepository.findOne(updateKontekstAtributa.getId());
		updateKontekstAtributa.setTipoviAtributa(kontekstAtributa.getTipoviAtributa());
		return kontekstAtributaRepository.save(updateKontekstAtributa);
	}

	@Override
	public void deleteKontekstAtributa(Long id) {
		kontekstAtributaRepository.delete(id);
	}

}
