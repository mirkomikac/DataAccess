package com.sep.tim2.da.insurance.controller;

import java.util.List;

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

import com.sep.tim2.da.insurance.model.Osiguranje;
import com.sep.tim2.da.insurance.service.OsiguranjeService;

@RestController
@RequestMapping("/osiguranja")
public class OsiguranjeController {

	private final OsiguranjeService osiguranjeService;
	
	@Autowired
	public OsiguranjeController(OsiguranjeService osiguranjeService) {
		this.osiguranjeService = osiguranjeService;
	}
	
	@PostMapping("/{tipOsiguranjaId}")
	@ResponseBody
	public Osiguranje createOsiguranje(@RequestBody Osiguranje osiguranje,
									   @PathVariable("tipOsiguranjaId")Long tipOsiguranjaId) {
		return osiguranjeService.createOsiguranje(osiguranje, tipOsiguranjaId);
	}
	
	@GetMapping("/{osiguranjeId}")
	@ResponseBody
	public Osiguranje getOsiguranje(@PathVariable("osiguranjeId")Long osiguranjeId) {
		return osiguranjeService.getOsiguranje(osiguranjeId);
	}
	
	@GetMapping
	@ResponseBody
	public List<Osiguranje> getOsiguranja() {
		return osiguranjeService.getOsiguranja();
	}
	
	@PutMapping("/{tipOsiguranjaId}")
	@ResponseBody
	public Osiguranje updateOsiguranje(@RequestBody Osiguranje osiguranje,
									   @PathVariable("tipOsiguranjaId")Long tipOsiguranjaId) {
		return osiguranjeService.updateOsiguranje(osiguranje, tipOsiguranjaId);
	}
	
	@DeleteMapping("/{osiguranjeId}")
	public void deleteOsiguranje(@PathVariable("osiguranjeId")Long osiguranjeId) {
		osiguranjeService.deleteOsigarnje(osiguranjeId);
	}
	
}
