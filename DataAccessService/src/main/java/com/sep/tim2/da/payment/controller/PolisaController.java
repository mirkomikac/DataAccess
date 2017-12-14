package com.sep.tim2.da.payment.controller;

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

import com.sep.tim2.da.payment.model.Polisa;
import com.sep.tim2.da.payment.service.PolisaService;

@RestController
@RequestMapping("/payment/polise")
public class PolisaController {

	private final PolisaService polisaService;
	
	@Autowired
	public PolisaController(PolisaService polisaService) {
		this.polisaService = polisaService;
	}
	
	@PostMapping
	@ResponseBody
	public Polisa createPolisa(@RequestBody Polisa polisa) {
		return polisaService.createPolisa(polisa);
	}
	
	@GetMapping("/{polisaId}")
	@ResponseBody
	public Polisa getPolisa(@PathVariable("polisaId")Long polisaId) {
		return polisaService.getPolisa(polisaId);
	}
	
	@GetMapping
	@ResponseBody
	public List<Polisa> getPolise() {
		return polisaService.getPolise();
	}
	
	@PutMapping
	@ResponseBody
	public Polisa updatePolisa(@RequestBody Polisa polisa) {
		return polisaService.updatePolisa(polisa);
	}
	
	@DeleteMapping("/{polisaId}")
	public void deletePolisa(@PathVariable("polisaId")Long polisaId) {
		polisaService.deletePolisa(polisaId);
	}
	
}
