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

import com.sep.tim2.da.insurance.model.TipOsiguranja;
import com.sep.tim2.da.insurance.service.TipOsiguranjaService;

@RestController
@RequestMapping("/tipoviOsiguranja")
public class TipOsiguranjaController {

	private final TipOsiguranjaService tipOsiguranjaService;
	
	@Autowired
	public TipOsiguranjaController(TipOsiguranjaService tipOsiguranjaService) {
		this.tipOsiguranjaService = tipOsiguranjaService;
	}
	
	@PostMapping("/{osiguravajucaKucaId}")
	@ResponseBody
	public TipOsiguranja createTipOsiguranja(@RequestBody TipOsiguranja tipOsiguranja, 
											 @PathVariable("osiguravajucaKucaId")Long osiguravajucaKucaId) {
		return tipOsiguranjaService.createTipOsiguranja(tipOsiguranja, osiguravajucaKucaId);
	}
	
	@GetMapping("/{tipOsiguranjaId}")
	@ResponseBody
	public TipOsiguranja getTipOsiguranja(@PathVariable("tipOsiguranjaId")Long tipOsiguranjaId) {
		return tipOsiguranjaService.getTipOsiguranja(tipOsiguranjaId);
	}
	
	@GetMapping
	@ResponseBody
	public List<TipOsiguranja> getTipoviOsiguranja() {
		return tipOsiguranjaService.getTipoviOsiguranja();
	}
	
	@GetMapping("/zaOsiguravajucuKucu/{id}")
	@ResponseBody
	public List<TipOsiguranja> getTipoviOsiguranjaZaOsiguravajucuKucu(@PathVariable("id")Long osiguravajucaKucaId) {
		return tipOsiguranjaService.getTipoviOsiguranjaZaOsiguravajucuKucu(osiguravajucaKucaId);
	}
	
	@PutMapping("/{osiguravajucaKucaId}")
	@ResponseBody
	public TipOsiguranja updateTipOsiguranja(@RequestBody TipOsiguranja tipOsiguranja, 
											 @PathVariable("osiguravajucaKucaId")Long osiguravajucaKucaId) {
		return tipOsiguranjaService.updateTipOsiguranja(tipOsiguranja, osiguravajucaKucaId);
	}
	
	@DeleteMapping("/{tipOsiguranjaId")
	public void delteTipOsiguranja(@PathVariable("tipOsiguranjaId")Long tipOsiguranjaId) {
		tipOsiguranjaService.deleteTipOsiguranja(tipOsiguranjaId);
	}
	
}
