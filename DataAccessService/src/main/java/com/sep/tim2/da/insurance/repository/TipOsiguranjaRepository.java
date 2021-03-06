package com.sep.tim2.da.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.TipOsiguranja;

@Repository
public interface TipOsiguranjaRepository extends JpaRepository<TipOsiguranja, Long> {

	List<TipOsiguranja> findTipOsiguranjasByOsiguravajucaKucaId(Long osiguravajucaKucaId);
	
}
