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

import com.sep.tim2.da.insurance.model.Cenovnik;
import com.sep.tim2.da.insurance.service.CenovnikService;

@RestController
@RequestMapping("/cenovnici")
public class CenovnikController {

	private final CenovnikService cenovnikService;
	
	@Autowired
	public CenovnikController(CenovnikService cenovnikService) {
		this.cenovnikService = cenovnikService;
	}
	
	@GetMapping
	@ResponseBody
	public Collection<Cenovnik> getCenovnici(){
		return cenovnikService.getCenovnici();
	}
	
	@GetMapping("/{cenovnikId}")
	@ResponseBody
	public Cenovnik getCenovnik(@PathVariable("cenovnikId")Long cenovnikId) {
		return cenovnikService.getCenovnik(cenovnikId);
	}
	
	@PostMapping
	@ResponseBody
	public Cenovnik createCenovnik(@RequestBody Cenovnik cenovnik) {
		return cenovnikService.createCenovnik(cenovnik);
	}
	
	@PutMapping
	@ResponseBody
	public Cenovnik updateCenovnik(@RequestBody Cenovnik cenovnik) {
		return cenovnikService.updateCenovnik(cenovnik);
	}
	
	@DeleteMapping("/{cenovnikId}")
	public void deleteCenovnik(@PathVariable("cenovnikId")Long cenovnikId) {
		cenovnikService.deleteCenovnik(cenovnikId);
	}
	
}
