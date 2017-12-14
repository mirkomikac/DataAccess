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

import com.sep.tim2.da.insurance.model.TipAtributa;
import com.sep.tim2.da.insurance.service.TipAtributaService;

@RestController
@RequestMapping("/tipoviAtributa")
public class TipAtributaController {
	
	private final TipAtributaService tipAtributaService;
	
	@Autowired
	public TipAtributaController(TipAtributaService tipAtributaService) {
		this.tipAtributaService = tipAtributaService;
	}
	
	@GetMapping
	@ResponseBody
	public Collection<TipAtributa> getTipoviAtributa()	{
		return tipAtributaService.getTipoviAtributa();
	}
	
	@GetMapping("zakontekts/{kontektsId}")
	@ResponseBody
	public Collection<TipAtributa> getTipoviAtributaZaKontekts(@PathVariable("kontektsId")Long kontektsId) {
		return tipAtributaService.getTipoviAtributaZaKontekts(kontektsId);
	}
	
	@GetMapping("/{tipAtributaId}")
	@ResponseBody
	public TipAtributa getTipAtributa(@PathVariable("tipAtributaId")Long tipAtributaId) {
		return tipAtributaService.getTipAtributa(tipAtributaId);
	}
	
	@PostMapping("/{kontekstAtributaId}")
	@ResponseBody
	public TipAtributa createTipAtributa(@RequestBody TipAtributa tipAtributa,@PathVariable("kontektsAtributaId") Long kontektsAtributaId) {
		return tipAtributaService.createTipAtributa(tipAtributa, kontektsAtributaId);
	}
	
	@PutMapping("/{kontekstAtributaId}")
	@ResponseBody
	public TipAtributa updateTipAtributa(@RequestBody TipAtributa tipAtributa,@PathVariable("kontektsAtributaId") Long kontektsAtributaId) {
		return tipAtributaService.updateTipAtributa(tipAtributa, kontektsAtributaId);
	}
	
	@DeleteMapping("/{tipAtributaId}")
	public void deleteTipAtributa(@PathVariable("tipAtributaId")Long tipAtributaId) {
		tipAtributaService.deleteTipAtributa(tipAtributaId);
	}
	
}
