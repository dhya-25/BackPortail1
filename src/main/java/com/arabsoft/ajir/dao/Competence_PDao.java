package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Competence_P;

public interface Competence_PDao extends JpaRepository<Competence_P, String> {
	
	@Query(value="select a.cod_comp,a.lib_comp,c.coef_pond,c.cod_niv ,emploi_competence.get_ponderation(c.cod_nat_comp,c.cod_comp,c.cod_post)pourcentage,pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(c.cod_niv)libnivcmp\r\n"
			+ "from competence_poste c ,competence a,personnel p\r\n"
			+ "  where c.cod_nat_comp = a.cod_nat_comp\r\n"
			+ "    and c.cod_comp = a.cod_comp\r\n"
			+ "    and c.cod_post=p.poste_trav\r\n"
			+ "    and c.cod_metier=p.cod_metier   \r\n"
			+ "    and p.mat_pers=:Mat and p.cod_soc=:soc",nativeQuery=true)
	
	List<Competence_P> getCompetP (@Param("soc") String soc,@Param("Mat") String mat);
	
	
	@Query(value="select emploi_competence.get_capacite(:soc,:Mat,:metier,:post) from dual",nativeQuery=true)
	
	Object getTauxComp (@Param("soc") String soc,@Param("Mat")String mat,@Param("metier") String metier,@Param("post") String post);


}
