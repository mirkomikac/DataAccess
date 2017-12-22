package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.PredefinisanaVrednost;
import com.sep.tim2.da.insurance.model.TipAtributa;
import com.sep.tim2.da.insurance.repository.PredefinisanaVrednostRepository;
import com.sep.tim2.da.insurance.service.PredefinisanaVrednostService;
import com.sep.tim2.da.insurance.service.TipAtributaService;

@Service
@Transactional
public class PredefinisanaVrednostServiceImpl implements PredefinisanaVrednostService{
	
	private final PredefinisanaVrednostRepository predefinisanaVrednostRepository;
	private final TipAtributaService tipAtributaService;
	
	@Autowired
	public PredefinisanaVrednostServiceImpl(PredefinisanaVrednostRepository predefinisanaVrednostRepository,
											TipAtributaService tipAtributaService) {
		this.predefinisanaVrednostRepository = predefinisanaVrednostRepository;
		this.tipAtributaService = tipAtributaService;
	}

	@Override
	public Collection<PredefinisanaVrednost> getPredefinisaneVrednoste() {
		return predefinisanaVrednostRepository.findAll();
	}
	
	@Override
	public Collection<PredefinisanaVrednost> getPredefinisaneVrednostiZaTipAtributa(Long tipAtributaId) {
		return predefinisanaVrednostRepository.findPredefinisanaVrednostsByTipAtributaId(tipAtributaId);
	}

	@Override
	public PredefinisanaVrednost getPredefinisanaVrednost(Long id) {
		return predefinisanaVrednostRepository.findOne(id);
	}

	@Override
	public PredefinisanaVrednost createPredefinisanaVrednost(PredefinisanaVrednost predefinisanaVrednost, Long tipAtributaId) {
		TipAtributa tipAtributa = tipAtributaService.getTipAtributa(tipAtributaId);
		predefinisanaVrednost.setTipAtributa(tipAtributa);
		return predefinisanaVrednostRepository.save(predefinisanaVrednost);
	}

	@Override
	public PredefinisanaVrednost updatePredefinisanaVrednost(PredefinisanaVrednost updatePredefinisanaVrednost, Long tipAtributaId) {
		PredefinisanaVrednost predefinisanaVrednost = predefinisanaVrednostRepository.findOne(updatePredefinisanaVrednost.getId());
		updatePredefinisanaVrednost.setStavkeCenovnika(predefinisanaVrednost.getStavkeCenovnika());
		return this.createPredefinisanaVrednost(updatePredefinisanaVrednost, tipAtributaId);
	}

	@Override
	public void deletePredefinisanaVrednost(Long id) {
		predefinisanaVrednostRepository.delete(id);
	}

}
