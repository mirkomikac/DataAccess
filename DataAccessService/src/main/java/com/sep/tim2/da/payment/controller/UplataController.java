package com.sep.tim2.da.payment.controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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

import com.sep.tim2.da.insurance.service.NotificationService;
import com.sep.tim2.da.payment.model.Uplata;
import com.sep.tim2.da.payment.service.UplataService;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping("/uplate")
public class UplataController {

	private final UplataService uplataService;
	private final NotificationService notificationService;
	
	@Autowired
	public UplataController(UplataService uplataService, NotificationService notificationService) {
		this.uplataService = uplataService;
		this.notificationService = notificationService;
	}
	
	@PostMapping("/{osiguranjeId}")
	@ResponseBody
	public Uplata createUplata(@RequestBody Uplata uplata, @PathVariable("osiguranjeId")Long osiguranjeId) {
		return uplataService.createUplata(uplata, osiguranjeId);
	}
	
	@GetMapping("/{uplataId}")
	@ResponseBody
	public Uplata getUplata(@PathVariable("uplataId")Long uplataId) {
		return uplataService.getUplata(uplataId);
	}
	
	@GetMapping("/zapolisu/{osiguranjeId}")
	@ResponseBody
	public List<Uplata> getUplate(@PathVariable("osiguranjeId")Long osiguranjeId){
		return uplataService.getUplateZaOsiguranje(osiguranjeId);
	}
	
	@PutMapping("/{osiguranjeId}")
	@ResponseBody
	public Uplata updateUplata(@RequestBody Uplata uplata, @PathVariable("osiguranjeId")Long osiguranjeId) {
		return uplataService.updateUplata(uplata, osiguranjeId);
	}
	
	@DeleteMapping("/{uplataId}")
	public void deleteUplata(@PathVariable("uplataId")Long uplataId) {
		uplataService.deleteUplata(uplataId);
	}
	
	@PostMapping("/success")
	public Uplata successUplata(@RequestBody Long uplataId) {
		uplataService.successUplata(uplataId);
		return notificationService.notifyStandardParties(uplataId);
	}

	
	@PostMapping("/cancel")
	public void cancelUplata(@RequestBody Long uplataId) {
		uplataService.cancelUplata(uplataId);
	}
	
	@PostMapping("/error")
	public void errorUplata(@RequestBody Long uplataId) {
		uplataService.errorUplata(uplataId);
	}
	
	@GetMapping("/getIzvestaj/{uplataId}")
	public File generateJasperReport(@PathVariable("uplataId")Long uplataId, HttpServletResponse response) throws JRException, IOException, SQLException {
		return uplataService.generateJasperReport(uplataId, response);
	}

}
