package com.sep.tim2.da.payment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.payment.model.Uplata;

@Repository
public interface UplataRepository extends JpaRepository<Uplata, Long>{

	List<Uplata> findUplatasByPolisaId(Long polisaId);
	
}
