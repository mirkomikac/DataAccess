package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.KontekstAtributa;
import com.sep.tim2.da.insurance.model.TipAtributa;
import com.sep.tim2.da.insurance.repository.TipAtributaRepository;
import com.sep.tim2.da.insurance.service.KontekstAtributaService;
import com.sep.tim2.da.insurance.service.TipAtributaService;

@Service
@Transactional
public class TipAtributaServiceImpl implements TipAtributaService{
	
	private final TipAtributaRepository tipAtributaRepository;
	private final KontekstAtributaService kontekstAtributaService;
	
	@Autowired
	public TipAtributaServiceImpl(TipAtributaRepository tipAtributaRepository, KontekstAtributaService kontekstAtributaService) {
		this.tipAtributaRepository = tipAtributaRepository;
		this.kontekstAtributaService = kontekstAtributaService;
	}

	@Override
	public Collection<TipAtributa> getTipoviAtributa() {
		return tipAtributaRepository.findAll();
	}
	
	@Override
	public Collection<TipAtributa> getTipoviAtributaZaKontekts(Long kontektsId) {
		return tipAtributaRepository.findTipAtributasByKontekstId(kontektsId);
	}

	@Override
	public TipAtributa getTipAtributa(Long id) {
		return tipAtributaRepository.findOne(id);
	}

	@Override
	public TipAtributa createTipAtributa(TipAtributa tipAtributa, Long kontektsAtributaId) {
		KontekstAtributa kontekstAtributa = kontekstAtributaService.getKontekstAtributa(kontektsAtributaId);
		tipAtributa.setKontekst(kontekstAtributa);
		return tipAtributaRepository.save(tipAtributa);
	}

	@Override
	public TipAtributa updateTipAtributa(TipAtributa updateTipAtributa, Long kontektsAtributaId) {
		TipAtributa tipAtributa = tipAtributaRepository.findOne(updateTipAtributa.getId());
		updateTipAtributa.setPredefinisaneVrednosti(tipAtributa.getPredefinisaneVrednosti());
		updateTipAtributa.setVrednostiAtributa(tipAtributa.getVrednostiAtributa());
		updateTipAtributa.setTipoviOsiguranja(tipAtributa.getTipoviOsiguranja());
		return this.createTipAtributa(updateTipAtributa, kontektsAtributaId);
	}

	@Override
	public void deleteTipAtributa(Long id) {
		tipAtributaRepository.delete(id);
	}

}
