package com.sep.tim2.da.insurance.service;

import java.util.List;

import com.sep.tim2.da.insurance.model.VrednostAtributaOsiguranja;

public interface VrednostAtributaOsiguranjaService {

	VrednostAtributaOsiguranja createVrednostAtributaOsiguranja(VrednostAtributaOsiguranja vrednostAtributaOsiguranja, Long osiguranjeId, Long tipAtributaId);
	VrednostAtributaOsiguranja getVrednostAtributaOsiguranja(Long vrednostAtributaOsiguranjaId);
	List<VrednostAtributaOsiguranja> getVrednostiAtributaOsiguranjaZaOsiguranje(Long osiguranjeId);
	VrednostAtributaOsiguranja updateVrednostAtributaOsiguranja(VrednostAtributaOsiguranja vrednostAtributaOsiguranja, Long osiguranjeId, Long tipAtributaId);
	void deleteVrednostAtributaOsiguranja(Long vrednostAtributaOsiguranjaId);
	
}
