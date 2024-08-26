package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Motif_j;
import com.arabsoft.ajir.entities.Type_pret;
import com.arabsoft.ajir.entities.Type_pretPK;

public interface TypePretDao extends JpaRepository<Type_pret,Type_pretPK>{
	
	@Query(value="select COD_SOC,COD_GRP_PRET,TYP_PRET,ABRV_FIXE,LIB_PRET,LIB_PRET_A,TAUX_INT,"
			+ "DUREE_REMB,DELAI_GRACE,NBR_TRANCHE,ANCIENNETE,TYP_FOND,TYP_PLAFOND,"
			+ "INDICE,TAUX_COOP,NBR_CARIERE,DELAI_APRES_RET,TYP_ASS_PRET,INT_FIXE,"
			+ "ABREVIATION,NAT_TYP,ASS_PRET,RENOUV,ABRV_COMPTA,LIBRE_SERV,TYP_INT,PLAFOND"
			+ ",TYP_TAUX,POURCENT,DURE_RENOUV,COMMISSION,CHAP_DEBIT,CHAP_LIAIS"
			+ ",CHAP_CRED,COD_OPER,ABRV_FIXE_INT,COD_FOND,AUTO_FIN"
			+ ",ENDETTEMENT1,END_TAUX1,ENDETTEMENT2,END_TAUX2,PRT_LOG"
			+ " from TYPE_PRET where COD_GRP_PRET=:codpret",nativeQuery = true)
	public List<Type_pret> getTypePret(@Param("codpret") String codpret);
	
	
	@Query(value="select * from type_pret where cod_grp_pret =:cod_grp_pret and typ_pret=:typ_pret" ,nativeQuery = true)
	public Type_pret GetPlafond(@Param("cod_grp_pret") String cod_grp_pret,@Param("typ_pret") String typ_pret);
}
