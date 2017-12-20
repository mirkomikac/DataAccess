package com.sep.tim2.da.insurance.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.model.OsiguravajucaKuca;
import com.sep.tim2.da.insurance.service.OsiguravajucaKucaService;

@RestController
@RequestMapping("/osiguravajuceKuce")
public class OsiguravajucaKucaController {

	private final OsiguravajucaKucaService osiguravajucaKucaService;
	
	public OsiguravajucaKucaController(OsiguravajucaKucaService osiguravajucaKucaService) {
		this.osiguravajucaKucaService = osiguravajucaKucaService;
	}
	
	@GetMapping
	@ResponseBody
	public Collection<OsiguravajucaKuca> getOsiguravajuceKuce() {
		return osiguravajucaKucaService.getOsiguravajuceKuce();
	}
	
	@GetMapping("/{osiguravajucaKucaId}")
	@ResponseBody
	public OsiguravajucaKuca getOsiguravajucaKuca(@PathVariable("osiguravajucaKucaId")Long osiguravajucaKucaId) {
		System.out.println("vracena");
		return osiguravajucaKucaService.getOsiguravajucaKuca(osiguravajucaKucaId);
	}
	
	@PostMapping
	@ResponseBody
	public OsiguravajucaKuca createOsiguravajucaKuca(@RequestBody OsiguravajucaKuca osiguravajucaKuca) {
		return osiguravajucaKucaService.createOsiguravajucaKuca(osiguravajucaKuca);
	}
	
	@PutMapping
	@ResponseBody
	public OsiguravajucaKuca updateOsiguravajucaKuca(@RequestBody OsiguravajucaKuca osiguravajucaKuca) {
		return osiguravajucaKucaService.updateOsiguravajucaKuca(osiguravajucaKuca);
	}
	
	@DeleteMapping("/{osiguravajucaKucaId}")
	public void deleteOsiguravajucaKuca(@PathVariable("osiguravajucaKucaId")Long osiguravajucaKucaId) {
		osiguravajucaKucaService.deleteOsiguravajucaKuca(osiguravajucaKucaId);
	}
	
}
