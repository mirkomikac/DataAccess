package com.sep.tim2.da.payment.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.sep.tim2.da.payment.model.Uplata;

import net.sf.jasperreports.engine.JRException;

public interface UplataService {

	Uplata createUplata(Uplata uplata, Long osiguranjeId);
	Uplata getUplata(Long uplataId);
	List<Uplata> getUplateZaOsiguranje(Long osiguranjeId);
	Uplata updateUplata(Uplata uplata, Long osiguranjeId);
	void deleteUplata(Long uplataId);
	void successUplata(Long uplataId);
	void cancelUplata(Long uplataId);
	void errorUplata(Long uplataId);
	void generateJasperReport(Long uplataId, HttpServletResponse response) throws JRException, IOException, SQLException;
	
}
