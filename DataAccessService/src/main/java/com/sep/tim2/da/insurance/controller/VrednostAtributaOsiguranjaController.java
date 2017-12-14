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

import com.sep.tim2.da.insurance.model.VrednostAtributaOsiguranja;
import com.sep.tim2.da.insurance.service.VrednostAtributaOsiguranjaService;

@RestController
@RequestMapping("/vrednostiAtributaOsiguranja")
public class VrednostAtributaOsiguranjaController {

	private final VrednostAtributaOsiguranjaService vrednostAtributaOsiguranjaService;
	
	@Autowired
	public VrednostAtributaOsiguranjaController(VrednostAtributaOsiguranjaService vrednostAtributaOsiguranjaService) {
		this.vrednostAtributaOsiguranjaService = vrednostAtributaOsiguranjaService;
	}
	
	@PostMapping("/{osiguranjeId}/{tipAtributaId}")
	@ResponseBody
	public VrednostAtributaOsiguranja createVrednostAtributaOsiguranja(@RequestBody VrednostAtributaOsiguranja vrednostAtributaOsiguranja,
																	   @PathVariable("osiguranjeId")Long osiguranjeId,
																	   @PathVariable("tipAtributaId")Long tipAtributaId) {
		return vrednostAtributaOsiguranjaService.createVrednostAtributaOsiguranja(vrednostAtributaOsiguranja, osiguranjeId, tipAtributaId);
	}
	
	@GetMapping("/{vrednostAtributaOsiguranjaId}")
	@ResponseBody
	public VrednostAtributaOsiguranja getVrednostAtributaOsiguranja(@PathVariable("vrednostAtributaOsiguranjaId")Long id) {
		return vrednostAtributaOsiguranjaService.getVrednostAtributaOsiguranja(id);
	}
	
	@GetMapping("/zaosiguranje/{osiguranjeId}")
	@ResponseBody
	public List<VrednostAtributaOsiguranja> getVrednostAtributaOsiguranjaZaOsiguranje(@PathVariable("osiguranjeId")Long osiguranjeId) {
		return vrednostAtributaOsiguranjaService.getVrednostiAtributaOsiguranjaZaOsiguranje(osiguranjeId);
	}
	
	@PutMapping("/{osiguranjeId}/{tipAtributaId}")
	@ResponseBody
	public VrednostAtributaOsiguranja updateVrednostAtributaOsiguranja(@RequestBody VrednostAtributaOsiguranja vrednostAtributaOsiguranja,
																	   @PathVariable("osiguranjeId")Long osiguranjeId,
																	   @PathVariable("tipAtributaId")Long tipAtributaId) {
		return vrednostAtributaOsiguranjaService.updateVrednostAtributaOsiguranja(vrednostAtributaOsiguranja, osiguranjeId, tipAtributaId);
	}
	
	@DeleteMapping("/{vrednostAtributaOsiguranjaId")
	public void deleteVrednostAtributaOsiguranja(@PathVariable("vrednostAtributaOsiguranjaId")Long id) {
		vrednostAtributaOsiguranjaService.deleteVrednostAtributaOsiguranja(id);
	}
	
}
