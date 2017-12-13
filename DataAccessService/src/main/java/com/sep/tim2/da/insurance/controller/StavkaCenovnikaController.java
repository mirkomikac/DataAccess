package com.sep.tim2.da.insurance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.service.StavkaCenovnikaService;

@RestController
@RequestMapping("/stavkeCenovnika")
public class StavkaCenovnikaController {

		private final StavkaCenovnikaService stavkaCenovnikaService;
		
		public StavkaCenovnikaController(StavkaCenovnikaService stavkaCenovnikaService) {
			this.stavkaCenovnikaService = stavkaCenovnikaService;
		}
}
