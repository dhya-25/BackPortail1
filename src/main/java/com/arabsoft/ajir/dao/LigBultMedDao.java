package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleLigBultMed;
import com.arabsoft.ajir.entities.LigBultMed;

public interface LigBultMedDao extends JpaRepository<LigBultMed, CleLigBultMed> {
	
	@Query(value="select t.cod_soc,\r\n"
			+ "       t.mat_pers,\r\n"
			+ "       t.num_fam,\r\n"
			+ "       t.dat_soin,\r\n"
			+ "       t.abrv_act,\r\n"
			+ "       t.cod_med,\r\n"
			+ "       t.num_lig,\r\n"
			+ "       t.indice,\r\n"
			+ "       t.mnt_honor,\r\n"
			+ "       t.mnt_net,\r\n"
			+ "       t.mnt_remb,\r\n"
			+ "       t.accord_med,\r\n"
			+ "       t.dat_act,\r\n"
			+ "       t.prf_typ,\r\n"
			+ "       t.prf_cod,\r\n"
			+ "       t.num_pec_med,\r\n"
			+ "       t.mdc_prix,\r\n"
			+ "       t.med_prix,\r\n"
			+ "       t.prix_remb,\r\n"
			+ "       t.num_lig_med,\r\n"
			+ "       t.mut_mnt_net,\r\n"
			+ "       t.nbr_j ,(select lib_med from ref_med where cod_med = t.cod_med)lib_med"
			+ " from LIG_BULT_MED t where cod_soc=:codSoc and mat_pers=:matPers and num_fam=:numFam and dat_soin=to_date(:datSoin,'dd/mm/yyyy')",nativeQuery=true)
	List<LigBultMed> getMedicaments(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("numFam") String numFam,@Param("datSoin") String datSoin);

}
