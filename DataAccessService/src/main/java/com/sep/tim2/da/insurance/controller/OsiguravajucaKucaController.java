package com.sep.tim2.da.insurance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.service.OsiguravajucaKucaService;

@RestController
@RequestMapping("/osiguravajuceKuce")
public class OsiguravajucaKucaController {

	private final OsiguravajucaKucaService osiguravajucaKucaService;
	
	public OsiguravajucaKucaController(OsiguravajucaKucaService osiguravajucaKucaService) {
		this.osiguravajucaKucaService = osiguravajucaKucaService;
	}
	
}
