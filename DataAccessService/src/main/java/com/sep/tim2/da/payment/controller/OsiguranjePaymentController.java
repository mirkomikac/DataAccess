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

import com.sep.tim2.da.payment.model.Osiguranje;
import com.sep.tim2.da.payment.service.OsiguranjeService;

@RestController
@RequestMapping("/payment/osiguranja")
public class OsiguranjePaymentController {

	private final OsiguranjeService osigranjeService;
	
	@Autowired
	public OsiguranjePaymentController(OsiguranjeService osigranjeService) {
		this.osigranjeService = osigranjeService;
	}
	
	@PostMapping
	@ResponseBody
	public Osiguranje createOsiguranje(@RequestBody Osiguranje osiguranje) {
		return osigranjeService.createOsiguranje(osiguranje);
	}
	
	@GetMapping("/{osiguranjeId}")
	@ResponseBody
	public Osiguranje getOsiguranje(@PathVariable("osiguranjeId")Long osiguranjeId) {
		return osigranjeService.getOsiguranje(osiguranjeId);
	}
	
	@GetMapping
	@ResponseBody
	public List<Osiguranje> getOsiguranja() {
		return osigranjeService.getOsiguranja();
	}
	
	@PutMapping
	@ResponseBody
	public Osiguranje updateOsiguranje(@RequestBody Osiguranje osiguranje) {
		return osigranjeService.updateOsiguranje(osiguranje);
	}
	
	@DeleteMapping("/{osiguranjeId}")
	public void deletePolisa(@PathVariable("osiguranjeId")Long osiguranjeId) {
		osigranjeService.deleteOsiguranje(osiguranjeId);
	}
	
}
