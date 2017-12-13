package com.sep.tim2.da.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.Polisa;

@Repository
public interface PolisaRepository extends JpaRepository<Polisa, Long>{

	List<Polisa> findPolisasByKlijentId(Long klijentId);
	
}
