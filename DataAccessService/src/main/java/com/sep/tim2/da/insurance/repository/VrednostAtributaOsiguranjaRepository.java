package com.sep.tim2.da.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sep.tim2.da.insurance.model.VrednostAtributaOsiguranja;
@Repository
public interface VrednostAtributaOsiguranjaRepository extends JpaRepository<VrednostAtributaOsiguranja, Long> {

}
