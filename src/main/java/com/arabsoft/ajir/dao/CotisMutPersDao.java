package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleCotisMutPers;
import com.arabsoft.ajir.entities.CotisMutPers;

public interface CotisMutPersDao extends JpaRepository<CotisMutPers,CleCotisMutPers>{
	@Query(value="select t.cod_soc,\r\n"
			+ "       t.mat_pers,\r\n"
			+ "       t.num_cot,\r\n"
			+ "       decode(t.typ_cot,'M','Manuelle','Transfert')typ_cot,\r\n"
			+ "       t.dat_deb,\r\n"
			+ "       t.dat_fin,\r\n"
			+ "       t.mnt_a_payer,\r\n"
			+ "       t.mnt_payer,\r\n"
			+ "       decode(mod_pay,'V','Virement','C','Chéque','Espèce')mod_pay,\r\n"
			+ "       t.ref_pay,\r\n"
			+ "       t.dat_saisie,\r\n"
			+ "       decode(t.etat_cot,'I','En instance','Validé')etat_cot,\r\n"
			+ "      decode(corps,'C','Cadre commun','S','Sécurité','M','Mediateur administratif','H','HCCAF','I','ITES','P','Minéstère d intérieur','Divers') corps,\r\n"
			+ "       t.cod_typ_depart,\r\n"
			+ "       t.cod_affect,\r\n"
			+ "       t.mnt_param,\r\n"
			+ "       t.num_retr,\r\n"
			+ "       t.seq_ecrt1,\r\n"
			+ "       t.seq_ecrt2,\r\n"
			+ "       t.imput,pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers) nom,\r\n"
			+ "       pk_get_lib.GET_TYPE_DEPAR$LIB_TYP_DEPART(cod_typ_depart) lib_depart ,\r\n"
			+ "       (pk_get_lib.GET_AFFECTATIO$LIB_AFFECT(cod_affect)) lib_affect\r\n"
			+ "        from COTIS_MUT_PERS t where cod_soc=:soc and mat_pers=:pers and etat_cot='V' and dat_saisie between  CASE \r\n"
			+ "          WHEN LENGTH(:moisDeb) = 4 THEN TRUNC(TO_DATE(:moisDeb, 'YYYY'), 'YYYY') \r\n"
			+ "          ELSE TRUNC(TO_DATE(:moisDeb, 'MM/YYYY'), 'MM') \r\n"
			+ "      END \r\n"
			+ "      AND \r\n"
			+ "      CASE \r\n"
			+ "          WHEN LENGTH(:moisFin) = 4 THEN LAST_DAY(ADD_MONTHS(TO_DATE(:moisFin, 'YYYY'), 11)) \r\n"
			+ "          ELSE LAST_DAY(TO_DATE(:moisFin, 'MM/YYYY')) \r\n"
			+ "      END",nativeQuery=true)
	public List<CotisMutPers> getCotis(@Param("soc") String soc,@Param("pers")String pers,@Param("moisDeb")String moisDeb,@Param("moisFin")String moisFin);

}
