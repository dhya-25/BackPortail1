package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.arabsoft.ajir.entities.Acte_LigBultStar;

public interface Acte_LigBultStarDAO extends JpaRepository<Acte_LigBultStar, String>{

	@Query(value="select l.abrv_act_bct,t.lib_act,l.tot_remb_star,l.num_bord_assur,l.annee_bord,l.num_bult\r\n"
			+ " from lig_bult_star l ,acte t\r\n"
			+ " where l.abrv_act_bct = t.abrv_act\r\n"
			+ " and cod_soc  =:soc\r\n"
			+ " and mat_pers =:mat\r\n"
			+ " and l.num_bult=:num_bult",nativeQuery = true)
	public List<Acte_LigBultStar> GetActe_BuldStar(@Param("soc") String soc,@Param("mat") String mat,@Param("num_bult") Long num_bult);
}
