package com.sep.tim2.da.insurance.service;

import java.util.List;

import com.sep.tim2.da.insurance.model.TipOsiguranja;

public interface TipOsiguranjaService {

	TipOsiguranja createTipOsiguranja(TipOsiguranja tipOsiguranja, Long osiguravajucaKucaId);
	TipOsiguranja getTipOsiguranja(Long tipOsiguranjaId);
	List<TipOsiguranja> getTipoviOsiguranja();
	List<TipOsiguranja> getTipoviOsiguranjaZaOsiguravajucuKucu(Long osiguravajucaKucaId);
	TipOsiguranja update(TipOsiguranja tipOsiguranja, Long osiguravajucaKucaId);
	void deleteTipOsiguranja(Long tipOsiguranjaId);
	
}
