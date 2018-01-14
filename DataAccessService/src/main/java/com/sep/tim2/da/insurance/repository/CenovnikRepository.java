package com.sep.tim2.da.insurance.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.Cenovnik;

@Repository
public interface CenovnikRepository extends JpaRepository<Cenovnik, Long> {

	@Query("select cen from Cenovnik cen where cen.osiguravajucaKuca.id = ?1 and ?2 between cen.datumOd and cen.datumDo")
	List<Cenovnik> findCenobnikByOsiguravajucaKucaIdAndDate(Long osiguravajucaKucaId, Date date);
	
	@Query("select cen from Cenovnik cen where cen.osiguravajucaKuca.id = ?1 and ?2 between cen.datumOd and cen.datumDo and cen.aktuelan = ?3")
	Cenovnik findAktuelanCenovnikZaDatum(Long osiguravajucaKucaId, Date date, Boolean aktuelan);
	
	List<Cenovnik> findCenovniksByOsiguravajucaKucaIdAndAktuelan(Long osiguravajucaKucaId, Boolean aktuelan);
	
	List<Cenovnik> findCenovniksByOsiguravajucaKucaId(Long osiguravajucaKucaId);
	
}
