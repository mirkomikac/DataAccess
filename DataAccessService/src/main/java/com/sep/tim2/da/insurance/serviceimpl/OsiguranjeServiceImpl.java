package com.sep.tim2.da.insurance.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sep.tim2.da.insurance.model.Klijent;
import com.sep.tim2.da.insurance.model.Osiguranje;
import com.sep.tim2.da.insurance.model.TipAtributa;
import com.sep.tim2.da.insurance.model.TipOsiguranja;
import com.sep.tim2.da.insurance.model.VrednostAtributaOsiguranja;
import com.sep.tim2.da.insurance.repository.OsiguranjeRepository;
import com.sep.tim2.da.insurance.service.KlijentService;
import com.sep.tim2.da.insurance.service.OsiguranjeService;
import com.sep.tim2.da.insurance.service.TipOsiguranjaService;

@Service
@Transactional
public class OsiguranjeServiceImpl implements OsiguranjeService{

	private final OsiguranjeRepository osiguranjeRepository;
	private final TipOsiguranjaService tipOsiguranjaService;
	private final KlijentService klijentService;
	
	@Autowired
	public OsiguranjeServiceImpl(OsiguranjeRepository osiguranjeRepository,
								 TipOsiguranjaService tipOsiguranjaService,
								 KlijentService klijentService) {
		this.osiguranjeRepository = osiguranjeRepository;
		this.tipOsiguranjaService = tipOsiguranjaService;
		this.klijentService = klijentService;
	}
	
	@Override
	public Osiguranje createOsiguranje(Osiguranje osiguranje, Long tipOsiguranjaId) {
		TipOsiguranja tipOsiguranja = tipOsiguranjaService.getTipOsiguranja(tipOsiguranjaId);
		osiguranje.setTipOsiguranja(tipOsiguranja);
		osiguranje.getVrednostiAtributaOsiguranja().forEach(v -> v.setOsiguranje(osiguranje));
		osiguranje.setDatumSklapanja(new Date());
		osiguranje.setKlijent(this.getKlijent(osiguranje));
		return osiguranjeRepository.save(osiguranje);
	}

	@Override
	@Transactional(readOnly = true)
	public Osiguranje getOsiguranje(Long id) {
		return osiguranjeRepository.findOne(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Osiguranje> getOsiguranja() {
		return osiguranjeRepository.findAll();
	}

	@Override
	public Osiguranje updateOsiguranje(Osiguranje updateOsiguranje, Long tipOsiguranjaId) {
		Osiguranje osiguranje = osiguranjeRepository.findOne(updateOsiguranje.getId());
		updateOsiguranje.setVrednostiAtributaOsiguranja(osiguranje.getVrednostiAtributaOsiguranja());
		return this.createOsiguranje(updateOsiguranje, tipOsiguranjaId);
	}

	@Override
	public void deleteOsigarnje(Long id) {
		osiguranjeRepository.delete(id);
	}
	
	private Klijent getKlijent(Osiguranje osiguranje) {
		Klijent newKlijent = new Klijent();
		for(VrednostAtributaOsiguranja vrednost: osiguranje.getVrednostiAtributaOsiguranja()) {
			TipAtributa tipAtributa = vrednost.getTipAtributa();
			if(tipAtributa.getKontekst().getNaziv().equals("Osiguravac")) {
				String nazivAtributa = tipAtributa.getNaziv();
				String vrednostAtributa = vrednost.getVrednost();
				switch(nazivAtributa) {
					case "Ime": 
								newKlijent.setIme(vrednostAtributa);
								break;
					case "Prezime": 
								newKlijent.setPrezime(vrednostAtributa);
								break;
					case "JMBG": 
								newKlijent.setJmbg(vrednostAtributa);
								break;
					case "Broj pasosa": 
								newKlijent.setBrojPasosa(vrednostAtributa);
								break;
					case "Adresa": 
								newKlijent.setAdresa(vrednostAtributa);
								break;
					case "Broj telefona": 
								newKlijent.setBrojTelefona(vrednostAtributa);
								break;
					case "Email": 
								newKlijent.setEmail(vrednostAtributa);
								break;
				}
			}
		}
		Klijent oldKlijent = klijentService.getKlijentZaEmail(newKlijent.getEmail());
		if(oldKlijent != null) {
			return oldKlijent;
		}else {
			newKlijent = klijentService.createKlijent(newKlijent);
			return newKlijent;
		}
	}

}
