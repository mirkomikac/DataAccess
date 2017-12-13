package com.sep.tim2.da.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.service.PredefinisanaVrednostService;

@RestController
@RequestMapping("/predefinisaneVrednosti")
public class PredefinisanaVrednostController {
	
	
	private final PredefinisanaVrednostService predefinisanaVrednostService;
	
	@Autowired
	public PredefinisanaVrednostController(PredefinisanaVrednostService predefinisanaVrednostService) {
		this.predefinisanaVrednostService = predefinisanaVrednostService;
	}
	
}
