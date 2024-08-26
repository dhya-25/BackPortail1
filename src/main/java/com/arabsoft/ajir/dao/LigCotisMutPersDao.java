package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CleLigCotisMutPers;
import com.arabsoft.ajir.entities.LigCotisMut_Pers;

@Repository
public interface LigCotisMutPersDao extends JpaRepository<LigCotisMut_Pers, CleLigCotisMutPers>{
	
	@Query(value="select cod_soc,\r\n"
			+ "mat_pers,\r\n"
			+ "num_cot,\r\n"
			+ "dat_mut,\r\n"
			+ "mnt_payer,\r\n"
			+ "dat_cot\r\n"
			+ " from lig_cotis_mut_pers where cod_soc=:soc and mat_pers=:mat and num_cot=:cot",nativeQuery = true)
	public List<LigCotisMut_Pers> getLigCotis(@Param("soc")String soc,@Param("mat")String mat,@Param("cot")String cot);

}
