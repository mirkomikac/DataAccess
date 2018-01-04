package com.sep.tim2.da.insurance.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.StavkaCenovnika;

@Repository
public interface StavkaCenovnikaRepository extends JpaRepository<StavkaCenovnika, Long> {

	Collection<StavkaCenovnika> findStavkaCenovnikasByCenovnikId(Long cenovnikId);
	
	StavkaCenovnika findStavkaCenovnikaByCenovnikIdAndPredefinisanaVrednostId(Long cenovnikId, Long predefinisanaVrednostId);
	
}
