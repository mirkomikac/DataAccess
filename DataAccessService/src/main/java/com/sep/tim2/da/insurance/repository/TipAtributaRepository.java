package com.sep.tim2.da.insurance.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.TipAtributa;

@Repository
public interface TipAtributaRepository extends JpaRepository<TipAtributa, Long> {

	Collection<TipAtributa> findTipAtributasByKontekstId(Long kontekstId);
	
}
