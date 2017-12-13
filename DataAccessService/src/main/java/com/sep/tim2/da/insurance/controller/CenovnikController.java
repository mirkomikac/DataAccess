package com.sep.tim2.da.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.service.CenovnikService;

@RestController
@RequestMapping("/cenovnici")
public class CenovnikController {

	private final CenovnikService cenovnikService;
	
	@Autowired
	public CenovnikController(CenovnikService cenovnikService) {
		this.cenovnikService = cenovnikService;
	}
	
	
}
