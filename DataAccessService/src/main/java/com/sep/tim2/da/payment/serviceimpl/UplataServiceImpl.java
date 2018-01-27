package com.sep.tim2.da.payment.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.payment.model.Osiguranje;
import com.sep.tim2.da.payment.model.StatusUplate;
import com.sep.tim2.da.payment.model.Uplata;
import com.sep.tim2.da.payment.repository.UplataRepository;
import com.sep.tim2.da.payment.service.OsiguranjeService;
import com.sep.tim2.da.payment.service.UplataService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

@Service
@Transactional
public class UplataServiceImpl implements UplataService{

	private final UplataRepository uplataRepository;
	private final OsiguranjeService osiguranjeService;
	private final DataSource dataSource;
	
	@Autowired
	public UplataServiceImpl(UplataRepository uplataRepository, OsiguranjeService osiguranjeService, DataSource dataSource) {
		this.uplataRepository = uplataRepository;
		this.osiguranjeService = osiguranjeService;
		this.dataSource = dataSource;
	}
	
	@Override
	public Uplata createUplata(Uplata uplata, Long osiguranjeId) {
		Osiguranje osiguranje = osiguranjeService.getOsiguranje(osiguranjeId);
		uplata.setOsiguranje(osiguranje);
		uplata.setStatus(StatusUplate.NA_OBRADI);
		return uplataRepository.save(uplata);
	}

	@Override
	@Transactional(readOnly = true)
	public Uplata getUplata(Long uplataId) {
		return uplataRepository.findOne(uplataId);
	}

	@Override
	@Transactional
	public List<Uplata> getUplateZaOsiguranje(Long osiguranjeId) {
		return uplataRepository.findUplatasByOsiguranjeId(osiguranjeId);
	}

	@Override
	public Uplata updateUplata(Uplata uplata, Long osiguranjeId) {
		return this.createUplata(uplata, osiguranjeId);
	}

	@Override
	public void deleteUplata(Long uplataId) {
		uplataRepository.delete(uplataId);
	}

	@Override
	public void successUplata(Long uplataId) {
		Uplata uplata = uplataRepository.findOne(uplataId);
		uplata.setStatus(StatusUplate.UPLACENO);
		uplataRepository.save(uplata);
	}

	@Override
	public void cancelUplata(Long uplataId) {
		Uplata uplata = uplataRepository.findOne(uplataId);
		uplata.setStatus(StatusUplate.ODBIJENO);
		uplataRepository.save(uplata);
	}

	@Override
	public void errorUplata(Long uplataId) {
		Uplata uplata = uplataRepository.findOne(uplataId);
		uplata.setStatus(StatusUplate.ODBIJENO);
		uplataRepository.save(uplata);
	}
	
	@Override
	public void generateJasperReport(Long uplataId, HttpServletResponse response) throws JRException, IOException, SQLException {
		Osiguranje osiguranje = uplataRepository.findOne(uplataId).getOsiguranje();
	    Map<String,Object> params = new HashMap<>();
	    params.put("osiguranjeId", osiguranje.getId());
	    
		JasperPrint jasperPrint  = JasperFillManager.fillReport(getClass().getResource("/jasper/osiguranjeIzvestaj.jasper").openStream(),params, dataSource.getConnection());
	    File pdfReport = new File(System.getProperty("user.home") + "/Downloads/" + "osiguranjeIzvestaj.pdf");
		
	    FileOutputStream fileOutputStream = new FileOutputStream(pdfReport);
		JasperExportManager.exportReportToPdfStream(jasperPrint, fileOutputStream);
		FileInputStream fileInputStream = new FileInputStream(pdfReport);
		
		IOUtils.copy(fileInputStream, response.getOutputStream());
		fileInputStream.close();
		fileOutputStream.close();
		response.flushBuffer();
	}

}
