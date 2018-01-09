package com.sep.tim2.da.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.model.KontrolniAtribut;
import com.sep.tim2.da.insurance.service.KontrolniAtributService;

@RestController
@RequestMapping("/kontrolniAtributi")
public class KontrolniAtributController {

	private final KontrolniAtributService atributZaKontekstService;
	
	@Autowired
	public KontrolniAtributController(KontrolniAtributService atributZaKontekstService) {
		this.atributZaKontekstService = atributZaKontekstService;
	}
	
	@PostMapping("/{tipAtributaId}/{kontekstAtributaId}")
	@ResponseBody
	public KontrolniAtribut createAtributZaKontekst(@RequestBody KontrolniAtribut atributZaKontekst,
													 @PathVariable("tipAtributaId")Long tipAtributaId,
													 @PathVariable("kontekstAtributaId")Long kontekstAtributaId) {
		return atributZaKontekstService.createAtributZaKontekst(atributZaKontekst, kontekstAtributaId, tipAtributaId);
	}
	
	@GetMapping("/zaKontekstAtributa/{kontekstAtributaId}")
	@ResponseBody
	public KontrolniAtribut getKontrolniAtributZaKontekst(@PathVariable("kontekstAtributaId")Long kontekstAtributaId) {
		return atributZaKontekstService.getKontrolniAtributZaKontekst(kontekstAtributaId);
	}
	
	@PutMapping("/{tipAtributaId}/{kontekstAtributaId}")
	@ResponseBody
	public KontrolniAtribut updateAtributZaKontekst(@RequestBody KontrolniAtribut atributZaKontekst,
													 @PathVariable("tipAtributaId")Long tipAtributaId,
													 @PathVariable("kontekstAtributaId")Long kontekstAtributaId) {
		return atributZaKontekstService.updateAtributZaKontekst(atributZaKontekst, kontekstAtributaId, tipAtributaId);
	}
	
	@DeleteMapping("/{atributZaKontekstId}")
	public void deleteatributZaKontekst(@PathVariable("atributZaKontekstId")Long atributZaKontekstId) {
		atributZaKontekstService.deleteAtributZaKontekts(atributZaKontekstId);
	}
	
}
