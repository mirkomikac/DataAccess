package com.sep.tim2.da.insurance.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.KontekstAtributa;

@Repository
public interface KontekstAtributaRepository extends JpaRepository<KontekstAtributa, Long> {

	Collection<KontekstAtributa> findKontekstAtributasByTipoviOsiguranjaIdOrderByRedniBrojForme(Long tipOsiguranjaId);
	
}
