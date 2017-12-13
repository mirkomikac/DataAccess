package com.sep.tim2.da.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.service.KlijentService;

@RestController
@RequestMapping("/klijenti")
public class KlijentController {

	private final KlijentService klijentService;
	
	@Autowired
	public KlijentController(KlijentService klijentService) {
		this.klijentService = klijentService;
	}
	
}
