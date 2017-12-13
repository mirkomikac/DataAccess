package com.sep.tim2.da.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.Osiguranje;

@Repository
public interface OsiguranjeRepository extends JpaRepository<Osiguranje, Long>{

	List<Osiguranje> findOsiguranjesByPolisaId(Long polisaId);
	
}
