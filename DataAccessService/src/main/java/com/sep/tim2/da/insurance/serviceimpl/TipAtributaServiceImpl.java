package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.TipAtributa;
import com.sep.tim2.da.insurance.repository.TipAtributaRepository;
import com.sep.tim2.da.insurance.service.TipAtributaService;

@Service
@Transactional
public class TipAtributaServiceImpl implements TipAtributaService{
	
	private final TipAtributaRepository tipAtributaRepository;
	
	@Autowired
	public TipAtributaServiceImpl(TipAtributaRepository tipAtributaRepository) {
		this.tipAtributaRepository = tipAtributaRepository;
	}

	@Override
	public Collection<TipAtributa> getTipoviAtributa() {
		return tipAtributaRepository.findAll();
	}

	@Override
	public TipAtributa getTipAtributa(Long id) {
		return tipAtributaRepository.findOne(id);
	}

	@Override
	public TipAtributa createTipAtributa(TipAtributa tipAtributa) {
		return tipAtributaRepository.save(tipAtributa);
	}

	@Override
	public TipAtributa updateTipAtributa(TipAtributa tipAtributa) {
		return tipAtributaRepository.save(tipAtributa);
	}

	@Override
	public void deleteTipAtributa(Long id) {
		
	}
	
	
}
