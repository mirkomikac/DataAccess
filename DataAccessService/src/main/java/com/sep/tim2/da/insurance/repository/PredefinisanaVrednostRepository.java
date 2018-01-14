package com.sep.tim2.da.insurance.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.PredefinisanaVrednost;

@Repository
public interface PredefinisanaVrednostRepository extends JpaRepository<PredefinisanaVrednost, Long>{

	Collection<PredefinisanaVrednost> findPredefinisanaVrednostsByTipAtributaId(Long tipAtributaId);
	
	Collection<PredefinisanaVrednost> findPredefinisanaVrednostsByTipAtributaKontekstTipoviOsiguranjaOsiguravajucaKucaId(Long osiguravajucaKucaId);
	
}
