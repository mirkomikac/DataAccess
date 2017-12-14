package com.sep.tim2.da.insurance.controller;

import java.util.Collection;

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

import com.sep.tim2.da.insurance.model.KontekstAtributa;
import com.sep.tim2.da.insurance.service.KontekstAtributaService;

@RestController
@RequestMapping("/kontekstiAtributa")
public class KontekstAtributaController {
	
	private final KontekstAtributaService kontekstAtributaService;
	
	@Autowired
	public KontekstAtributaController(KontekstAtributaService kontekstAtributaService) {
		this.kontekstAtributaService = kontekstAtributaService;
	}
	
	@GetMapping
	@ResponseBody
	public Collection<KontekstAtributa> getKontekstiAtributa() {
		return kontekstAtributaService.getKontekstiAtributa();
	}
	
	@GetMapping("/{kontekstAtributaId}")
	@ResponseBody
	public KontekstAtributa getKontekstAtributa(@PathVariable("kontekstAtributaId")Long kontekstAtributaId) {
		return kontekstAtributaService.getKontekstAtributa(kontekstAtributaId);
	}
	
	@PostMapping
	@ResponseBody
	public KontekstAtributa createKontekstAtributa(@RequestBody KontekstAtributa kontekstAtributa) {
		return kontekstAtributaService.createKontekstAtributa(kontekstAtributa);
	}
	
	@PutMapping
	@ResponseBody
	public KontekstAtributa updateKontektsAtributa(@RequestBody KontekstAtributa kontekstAtributa) {
		return kontekstAtributaService.updateKontekstAtributa(kontekstAtributa);
	}
	
	@DeleteMapping("/{kontektsAtributaId}")
	public void deleteKontektsAtributa(@PathVariable("kontektsAtributaId")Long kontektsAtributaId) {
		kontekstAtributaService.deleteKontekstAtributa(kontektsAtributaId);
	}
	
}
