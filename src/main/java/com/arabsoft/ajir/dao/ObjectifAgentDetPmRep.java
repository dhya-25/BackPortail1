package com.arabsoft.ajir.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ObjectifAgentDetPm;

public interface ObjectifAgentDetPmRep  extends JpaRepository<ObjectifAgentDetPm, String>{
	
	
	
	@Query(value="select DISTINCT  o.COD_SOC,o.mat_pers,annee,num_objectif,lib_objectif,appreciation,comment_recom, \r\n"
			+ " (SELECT u.nom_pers||' '||u.pren_pers from personnel u where u.cod_soc=o.cod_soc and \r\n"
			+ " u.mat_pers=o.mat_pers) nom_pren ,p.cod_serv \r\n"
			+ "from OBJECTIF_AGENT o, PERSONNEL p \r\n"
			+ "where o.mat_pers=p.mat_pers and  p.mat_pers =:matChef  ",nativeQuery=true)
	public List<ObjectifAgentDetPm> getListObjectif(@Param("matChef") String matChef);

	
	@Query(value="select DISTINCT  o.COD_SOC,o.mat_pers,o.annee ,o.num_objectif ,o.lib_objectif,o.appreciation,o.comment_recom, \r\n"
			+ " (SELECT u.nom_pers||' '||u.pren_pers from personnel u where u.cod_soc=o.cod_soc and \r\n"
			+ " u.mat_pers=o.mat_pers) nom_pren ,t.cod_serv \r\n"
			+ "from OBJECTIF_AGENT o, PERSONNEL t \r\n"
			+ "where t.mat_pers=o.mat_pers and  o.mat_pers = :matPers and o.cod_soc=:codSoc",nativeQuery=true)
	public List<ObjectifAgentDetPm> getListObjectifAgent(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

  

}
