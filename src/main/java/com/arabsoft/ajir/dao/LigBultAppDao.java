package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.arabsoft.ajir.entities.LibBultApp;

import com.arabsoft.ajir.entities.CleLigBultApp;
 
public interface LigBultAppDao extends JpaRepository<LibBultApp, CleLigBultApp>{
	
	@Query(value="select t.cod_soc,\r\n"
			+ "       t.mat_pers,\r\n"
			+ "       t.num_fam,\r\n"
			+ "       t.dat_soin,\r\n"
			+ "       t.abrv_act,\r\n"
			+ "       t.cod_app,\r\n"
			+ "       t.num_lig,\r\n"
			+ "       t.mnt_honor,\r\n"
			+ "       t.mnt_net,\r\n"
			+ "       t.mnt_remb,\r\n"
			+ "       t.accord_app,\r\n"
			+ "       t.indice,\r\n"
			+ "       t.dat_act,\r\n"
			+ "       t.prf_typ,\r\n"
			+ "       t.prf_cod,\r\n"
			+ "       t.num_pec_app,\r\n"
			+ "       t.num_lig_app,\r\n"
			+ "       t.mut_mnt_net,(select lib_app from ref_appareil where t.cod_app=cod_app)lib_app from lig_bult_app t  where cod_soc=:codSoc and mat_pers=:matPers "
			+ "and num_fam=:numFam and dat_soin=to_date(:datSoin,'dd/mm/yyyy')",nativeQuery=true)
	List<LibBultApp> getLigBultApp(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("numFam") Long numFam,@Param("datSoin") String datSoin);


}
