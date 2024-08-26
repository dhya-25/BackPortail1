package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CompetenceDet;
import com.arabsoft.ajir.entities.CompetencesReq;


@Repository
public interface CompetenceDetRep extends JpaRepository<CompetenceDet, String>{
	

	
	@Query(value="select t.cod_soc,\r\n"
			+ "cod_candidat,\r\n"
			+ "typ_candidat,\r\n"
			+ "cod_nat_comp,\r\n"
			+ "cod_comp,\r\n"
			+ "cod_crit_comp,\r\n"
			+ "val_crit_comp,\r\n"
			+ "dat_valid,\r\n"
			+ "appreciation,\r\n"
			+ "cod_niv_comp,\r\n"
			+ "denom,\r\n"
			+ "div,\r\n"
		
			+ "l.cod_serv,\r\n"
			+ "pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(t.cod_niv_comp)  lib_niv_comp,\r\n"
			+ "pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) lib_comp,\r\n"
			+ "l.nom_pers||' '||l.pren_pers nom_pers,\r\n"
	+ "Pk_Get_Lib.GET_SERVICE$LIB_SERV(l.cod_soc,l.cod_serv) lib_serv,\r\n"
	+ "pk_get_lib.GET_NAT_COMPET$LIB_NAT_COMP(cod_nat_comp) lib_nat_comp \r\n"

			+ "from COMPETENCE_PERS t ,personnel l\r\n"
			+ "where t.cod_soc = l.cod_soc\r\n"
			+ "and t.cod_candidat = l.mat_pers\r\n"
			+ " (l.mat_pers =:matChef  or l.mat_pers in (select mat_pers from pers_valideur where mat_resp=:matChef))",nativeQuery=true)
	public List<CompetenceDet> getCompetenceServ(@Param("matChef") String matChef);
	
	@Query(value="select t.cod_soc,\r\n"
			+ "cod_candidat,\r\n"
			+ "typ_candidat,\r\n"
			+ "cod_nat_comp,\r\n"
			+ "cod_comp,\r\n"
			+ "cod_crit_comp,\r\n"
			+ "val_crit_comp,\r\n"
			+ "dat_valid,\r\n"
			+ "decode(appreciation,'V','Validé','E','En Instance','A','Annulé') appreciation ,\r\n"
			+ "cod_niv_comp,\r\n"
			+ "denom,\r\n"
			+ "div,\r\n"
			+ "l.cod_serv,\r\n"
			+ "\r\n"
			+ "pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(t.cod_niv_comp)  lib_niv_comp,\r\n"
			+ "pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) lib_comp,\r\n"
			+ "l.nom_pers||' '||l.pren_pers nom_pers,\r\n"
	+ "Pk_Get_Lib.GET_SERVICE$LIB_SERV(l.cod_soc,l.cod_serv) lib_serv,\r\n"
	+ "pk_get_lib.GET_NAT_COMPET$LIB_NAT_COMP(cod_nat_comp) lib_nat_comp \r\n"

			+ "from COMPETENCE_PERS t ,personnel l\r\n"
			+ "where t.cod_soc = l.cod_soc\r\n"
			+ "and t.cod_candidat = l.mat_pers\r\n"
			+ "and (l.mat_pers =:matChef  or l.mat_pers in (select mat_pers from pers_valideur where mat_resp=:matChef))"
			+ "and l.mat_pers= :matPersAgent",nativeQuery=true)
	public List<CompetenceDet> getCompetenceRequise(@Param("matChef") String matChef,@Param("matPersAgent") String matPersAgent);


	  @Modifying
		@Query(value="insert into COMPETENCE (cod_nat_comp, \r\n"
				+ "cod_comp, \r\n"
				+ "lib_comp \r\n"
				+ ") values(:codNatComp,:codComp,:LibComp ) \r\n", nativeQuery = true)
	    @Transactional
		public void addCompetense(@Param("codNatComp") String codNatComp,@Param("codComp") String codComp,@Param("LibComp") String LibComp);
	  @Modifying

		@Query(value="insert into COMPETENCE_PERS (cod_soc, \r\n"
				+ "cod_candidat, \r\n"
				+ "typ_candidat, \r\n"
				+ "cod_nat_comp, \r\n"
				+ "cod_comp, \r\n"
				+ "dat_valid, \r\n"
				+ "appreciation, \r\n"
				+ "cod_niv_comp \r\n"
				+ ") values(:codSoc,:matPers,'I',:codNatComp,:codComp,:dateSaisie,:appreciation,"
				+ ":nivCompet ) \r\n", nativeQuery = true)
	    @Transactional
		public void addCompetensePers(@Param("codSoc") String codSoc,@Param("matPers") String matPers,
				@Param("codNatComp") String codNatComp,@Param("codComp") String codComp,@Param("dateSaisie") Date dateSaisie,@Param("appreciation") String appreciation,@Param("nivCompet") String nivCompet);
		
}
