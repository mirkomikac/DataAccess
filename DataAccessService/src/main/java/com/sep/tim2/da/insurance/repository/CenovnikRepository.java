package com.sep.tim2.da.insurance.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.Cenovnik;

@Repository
public interface CenovnikRepository extends JpaRepository<Cenovnik, Long> {

	@Query("select cen from Cenovnik cen where cen.osiguravajucaKuca.id = ?1 and ?2 between cen.datumOd and cen.datumDo")
	Cenovnik findCenobnikByOsiguravajucaKucaIdAndDate(Long osiguravajucaKucaId, Date date);
	
}
