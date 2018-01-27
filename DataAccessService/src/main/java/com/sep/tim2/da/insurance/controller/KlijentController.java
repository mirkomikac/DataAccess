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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sep.tim2.da.insurance.model.Klijent;
import com.sep.tim2.da.insurance.service.KlijentService;

@RestController
@RequestMapping("/klijenti")
public class KlijentController {

	private final KlijentService klijentService;
	
	@Autowired
	public KlijentController(KlijentService klijentService) {
		this.klijentService = klijentService;
	}
	
	@PostMapping
	@ResponseBody
	public Klijent createKlijent(@RequestBody Klijent klijent) {
		return klijentService.createKlijent(klijent);
	}
	
	@GetMapping("/{klijentId}")
	@ResponseBody
	public Klijent getKlijent(@PathVariable("klijentId")Long klijentId) {
		return klijentService.getKlijent(klijentId);
	}
	
	@GetMapping("/getKlijentForUplata")
	@ResponseBody
	public Klijent getKlijentForUplata(@RequestParam(value="uplataId", required=true) Long uplataId) {
		return klijentService.getKlijetForUplata(uplataId);
	}
	
	@GetMapping
	@ResponseBody
	public List<Klijent> getKlijenti(){
		return klijentService.getKlijenti();
	}
	
	@PutMapping
	@ResponseBody
	public Klijent updateKlijent(@RequestBody Klijent klijent) {
		return klijentService.updateKlijent(klijent);
	}
	
	@DeleteMapping("/{klijentId}")
	public void deleteKlijent(@PathVariable("klijentId")Long klijentId) {
		klijentService.deleteKlijent(klijentId);
	}
	
}
