package com.sep.tim2.da.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.KontekstAtributa;
import com.sep.tim2.da.insurance.model.KontrolniAtribut;
import com.sep.tim2.da.insurance.model.TipAtributa;
import com.sep.tim2.da.insurance.repository.KontrolniAtributRepository;
import com.sep.tim2.da.insurance.service.KontekstAtributaService;
import com.sep.tim2.da.insurance.service.KontrolniAtributService;
import com.sep.tim2.da.insurance.service.TipAtributaService;

@Service
@Transactional
public class KontrolniAtributServiceImpl implements KontrolniAtributService{

	private final TipAtributaService tipAtributaService;
	private final KontekstAtributaService kontekstAtributaService;
	private final KontrolniAtributRepository atributZaKontekstRepository;
	
	@Autowired
	public KontrolniAtributServiceImpl(TipAtributaService tipAtributaService, 
										KontekstAtributaService kontekstAtributaService,
										KontrolniAtributRepository atributZaKontekstRepository) {
		this.tipAtributaService = tipAtributaService;
		this.kontekstAtributaService = kontekstAtributaService;
		this.atributZaKontekstRepository = atributZaKontekstRepository;
	}
	
	@Override
	public KontrolniAtribut createAtributZaKontekst(KontrolniAtribut atributZaKontekst, Long kontekstAtributaId,Long tipAtributaId) {
		TipAtributa tipAtributa = tipAtributaService.getTipAtributa(tipAtributaId);
		KontekstAtributa kontekstAtributa = kontekstAtributaService.getKontekstAtributa(kontekstAtributaId);
		atributZaKontekst.setKontekstAtributa(kontekstAtributa);
		atributZaKontekst.setTipAtributa(tipAtributa);
		return atributZaKontekstRepository.save(atributZaKontekst);
	}

	@Override
	public KontrolniAtribut getKontrolniAtributZaKontekst(Long kontekstAtributaId) {
		return atributZaKontekstRepository.getKontrolniAtributByKontekstAtributaId(kontekstAtributaId);
	}

	@Override
	public KontrolniAtribut updateAtributZaKontekst(KontrolniAtribut atributZaKontekst, Long kontekstAtributaId,Long tipAtributaId) {
		return this.createAtributZaKontekst(atributZaKontekst, kontekstAtributaId, tipAtributaId);
	}

	@Override
	public void deleteAtributZaKontekts(Long atributZaKontekstId) {
		atributZaKontekstRepository.delete(atributZaKontekstId);
	}

}
