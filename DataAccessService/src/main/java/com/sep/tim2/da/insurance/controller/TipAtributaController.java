package com.sep.tim2.da.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.service.TipAtributaService;

@RestController
@RequestMapping("/tipoviAtributa")
public class TipAtributaController {
	
	private final TipAtributaService tipAtributaService;
	
	@Autowired
	public TipAtributaController(TipAtributaService tipAtributaService) {
		this.tipAtributaService = tipAtributaService;
	}
	
}
