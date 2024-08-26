package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.TestCongee;
@Repository
public interface TestCongeeDao extends JpaRepository<TestCongee, String> {
	@Procedure(name="Testcng")
	Object  getaaaaaaaaa(String soc_, String mat_pers_,String dat_debut_,String dat_fin_,  String cng_temps_debut_, String cng_temps_fin_);
//	@Procedure(name="Testcng")
//	Object  GetJour(String soc_, String mat_pers_,Date dat_debut_,Date dat_fin_,Date dat_reprise_prev_,String cng_temps_debut_,
//			String cng_temps_fin_, String nat_cng_,String bonus_cng_, Long sold_cng_,Long nbr_jours_, Long nbr_jours_cal_, Long nbr_jours_fer_, String message_);
}
