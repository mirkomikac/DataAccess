package com.sep.tim2.da.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.sep.tim2.da.insurance.service.KontekstAtributaService;

public class KontekstAtributaController {
	
	private final KontekstAtributaService kontekstAtributaService;
	
	@Autowired
	public KontekstAtributaController(KontekstAtributaService kontekstAtributaService) {
		this.kontekstAtributaService = kontekstAtributaService;
	}
}
