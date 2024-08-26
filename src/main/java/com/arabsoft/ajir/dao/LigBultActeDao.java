package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleLigBultActe;
import com.arabsoft.ajir.entities.LigBultActe;

public interface LigBultActeDao extends JpaRepository<LigBultActe, CleLigBultActe>{
	
	@Query(value="select l.cod_soc,\r\n"
			+ "       l.mat_pers,\r\n"
			+ "       l.num_fam,\r\n"
			+ "       l.dat_soin,\r\n"
			+ "       l.abrv_act,\r\n"
			+ "       l.cod_act,\r\n"
			+ "       l.num_lig,\r\n"
			+ "       l.let_cod,\r\n"
			+ "       l.cot_act,\r\n"
			+ "       l.act_prix,\r\n"
			+ "       l.mnt_honor,\r\n"
			+ "       l.mnt_remb,\r\n"
			+ "       l.accord_act,\r\n"
			+ "       l.mnt_net,\r\n"
			+ "       l.indice,\r\n"
			+ "       l.dat_act,\r\n"
			+ "       l.prf_typ,\r\n"
			+ "       l.prf_cod,\r\n"
			+ "       l.mut_mnt_net,\r\n"
			+ "       l.num_pec_act,\r\n"
			+ "       l.taux_act,\r\n"
			+ "       l.typ_prf,(select lib_act from ref_act where cod_act=l.cod_act)lib_act from lig_bult_act l where cod_soc=:codSoc and mat_pers=:matPers and num_fam=:numFam and dat_soin=to_date(:datSoin,'dd/mm/yyyy')",nativeQuery=true)
	List<LigBultActe> getLigBultAct(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("numFam") Long numFam,@Param("datSoin") String datSoin);


}
