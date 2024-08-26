package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Lig_mess_star;
import com.arabsoft.ajir.entities.Lig_reclam_bct;


public interface Lig_reclam_bct_DAO extends JpaRepository<Lig_reclam_bct, String>{

	@Query(value="  select * from lig_reclam_bct\r\n"
			+ "      where   cod_soc  =:soc\r\n"
			+ "     and mat_pers =:mat \r\n"
			+ "     and num_bult =:num_bult",nativeQuery = true)
	public List<Lig_reclam_bct> getReclam(@Param("soc") String soc,@Param("mat") String mat,@Param("num_bult") Long num_bult);
	

}
