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

import com.sep.tim2.da.insurance.model.StavkaCenovnika;
import com.sep.tim2.da.insurance.service.StavkaCenovnikaService;

@RestController
@RequestMapping("/stavkeCenovnika")
public class StavkaCenovnikaController {

	private final StavkaCenovnikaService stavkaCenovnikaService;
		
	public StavkaCenovnikaController(StavkaCenovnikaService stavkaCenovnikaService) {
		this.stavkaCenovnikaService = stavkaCenovnikaService;
	}
	
	@GetMapping
	@ResponseBody
	public Collection<StavkaCenovnika> getStavkeCenovnika()	{
		return stavkaCenovnikaService.getStavkeCenovnike();
	}
	
	@GetMapping("/zaCenovnik/{cenovnikId}")
	@ResponseBody
	public Collection<StavkaCenovnika> getStavkeCenovnikaZaCenovnik(@PathVariable("cenovnikId")Long cenovnikId){
		return stavkaCenovnikaService.getStavkeCenovnikaZaCenovnik(cenovnikId);
	}
		
	@GetMapping("/{id}")
	@ResponseBody
	public StavkaCenovnika getStavkaCenovnika(@PathVariable("id")Long id) {
		return stavkaCenovnikaService.getStavkaCenovnika(id);
	}
	
	@PostMapping("/{cenovnikId}")
	@ResponseBody
	public StavkaCenovnika createStavkaCenovnika(@RequestBody StavkaCenovnika stavkaCenovnika, @PathVariable("cenovnikId")Long id) {
		return stavkaCenovnikaService.createStavkaCenovnika(stavkaCenovnika, id);
	}
	
	@PutMapping("/{cenovnikId}")
	@ResponseBody
	public StavkaCenovnika updateStavkaCenovnika(@RequestBody StavkaCenovnika stavkaCenovnika, @PathVariable("cenovnikId")Long id) {
		return stavkaCenovnikaService.updateStavkaCenovnika(stavkaCenovnika, id);
	}
	
	@DeleteMapping("/{stavkaCenovnikaId}")
	public void deleteStavkaCenovnika(@PathVariable("stavkaCenovnikaId")Long id) {
		stavkaCenovnikaService.deleteStavkaCenovnika(id);
	}
	
}
