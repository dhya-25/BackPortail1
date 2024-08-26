package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleLigBultVisit;
import com.arabsoft.ajir.entities.LigBultVisit;

public interface LigBultVisitDao extends JpaRepository<LigBultVisit, CleLigBultVisit>{

	@Query(value="select t. cod_soc,\r\n"
			+ "        t.mat_pers,\r\n"
			+ "        t.num_fam,\r\n"
			+ "        t.dat_soin,\r\n"
			+ "        t.abrv_act,\r\n"
			+ "        t.cod_visit,\r\n"
			+ "        t.num_lig,\r\n"
			+ "        t.mnt_honor,\r\n"
			+ "        t.mnt_remb,\r\n"
			+ "        t.mnt_net,\r\n"
			+ "        t.indice,\r\n"
			+ "        t.dat_act,\r\n"
			+ "        t.prf_typ,\r\n"
			+ "        t.prf_cod,\r\n"
			+ "        t.prix_visit,\r\n"
			+ "        t.taux_remb,\r\n"
			+ "        t.mut_mnt_net,(select lib_visit from ref_visit where cod_visit=t.cod_visit)lib_visit from LIG_BULT_VISIT t where mat_pers=:matPers and cod_soc=:codSoc and dat_soin=to_date(:datSoin,'dd/mm/yyyy') and num_fam=:numFam",nativeQuery = true)
	List<LigBultVisit> getLigBultVisit(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("numFam") String numFam,@Param("datSoin") String datSoin);
}
