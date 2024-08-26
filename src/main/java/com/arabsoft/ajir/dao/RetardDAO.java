package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.arabsoft.ajir.entities.Retard;
import com.arabsoft.ajir.entities.RetardPK;

public interface RetardDAO extends JpaRepository<Retard, RetardPK>{

	@Query(value="select cod_soc,\r\n"
			+ "mat_pers,\r\n"
			+ "dat_point,\r\n"
			+ "num_point,\r\n"
			+ "h_point,\r\n"
			+ "m_point,\r\n"
			+ "h_reg,\r\n"
			+ "m_reg,\r\n"
			+ "type,\r\n"
			+ "duree_h,\r\n"
			+ "duree_m,\r\n"
			+ "duree_tot,\r\n"
			+ "semaine,\r\n"
			+ "cod_serv,\r\n"
			+ "cod_reg,\r\n"
			+ "date_shift,\r\n"
			+ "etat_retard,\r\n"
			+ "dat_sais,\r\n"
			+ "cod_ur,pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)nom_pren\r\n"
			+ " from RETARD_JOURNEE p where (p.mat_pers =:matChef  or p.mat_pers in\r\n"
			+ " (select mat_pers from pers_valideur where mat_resp=:matChef))",nativeQuery=true)
	public List<Retard> getRetard(@Param("matChef")String matChef);
}
