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

import com.sep.tim2.da.insurance.model.PredefinisanaVrednost;
import com.sep.tim2.da.insurance.service.PredefinisanaVrednostService;

@RestController
@RequestMapping("/predefinisaneVrednosti")
public class PredefinisanaVrednostController {
	
	private final PredefinisanaVrednostService predefinisanaVrednostService;
	
	@Autowired
	public PredefinisanaVrednostController(PredefinisanaVrednostService predefinisanaVrednostService) {
		this.predefinisanaVrednostService = predefinisanaVrednostService;
	}
	
	@GetMapping
	@ResponseBody
	public Collection<PredefinisanaVrednost> getPredefinisaneVrednosti() {
		return predefinisanaVrednostService.getPredefinisaneVrednoste();
	}
	
	@GetMapping("/zaTipAtributa/{tipAtributaId}")
	@ResponseBody
	public Collection<PredefinisanaVrednost> getPredefinisaneVrednostiZaTipAtributa(@PathVariable("tipAtributaId")Long tipAtributaId) {
		return predefinisanaVrednostService.getPredefinisaneVrednostiZaTipAtributa(tipAtributaId);
	}
	
	@GetMapping("/{id}")
	public PredefinisanaVrednost getPredefinisanaVrednost(@PathVariable("id")Long id) {
		return predefinisanaVrednostService.getPredefinisanaVrednost(id);
	}
	
	@PostMapping("/{tipAtributaId}")
	@ResponseBody
	public PredefinisanaVrednost createPredefinisanaVrednost(@RequestBody PredefinisanaVrednost predefinisanaVrednost,
															 @PathVariable("tipAtributaId")Long tipAtributaId) {
		return predefinisanaVrednostService.createPredefinisanaVrednost(predefinisanaVrednost, tipAtributaId);
	}
	
	@PutMapping("/{tipAtributaId}")
	@ResponseBody
	public PredefinisanaVrednost updatePredefinisanaVrednost(@RequestBody PredefinisanaVrednost predefinisanaVrednost,
															 @PathVariable("tipAtributaId")Long tipAtributaId) {
		return predefinisanaVrednostService.updatePredefinisanaVrednost(predefinisanaVrednost, tipAtributaId);
	}
	
	@DeleteMapping("/{predefinisanaVrednostId}")
	public void deletePredefinisanaVrednost(@PathVariable("predefinisanaVrednostId")Long id) {
		predefinisanaVrednostService.deletePredefinisanaVrednost(id);
	}
		
}
