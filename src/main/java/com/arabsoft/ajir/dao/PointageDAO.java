package com.arabsoft.ajir.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.arabsoft.ajir.entities.PointagePK;
import com.arabsoft.ajir.entities.Pointer;

public interface PointageDAO extends JpaRepository<Pointer, PointagePK> {
//	@Query(value= "select * from pointer WHERE date_point BETWEEN to_date(:date_debut, 'DD/MM/YYYY') AND to_date(:date_fin, 'DD/MM/YYYY') AND cod_soc =: 'codSoc' AND mat_pers =: 'mat_pers'",nativeQuery = true)
//	public List<Pointage> GetPointage(@Param("codSoc") String codSoc,@Param("mat_pers") String mat_pers,@Param("date_debut")Date date_debut,@Param("date_fin") Date date_fin );
	
	//@Query("select p from Pointer p where p.id.cod_soc=:x and p.id.mat_pers=:y")
	
	@Query(value="select cod_soc,\r\n"
			+ "mat_pers,\r\n"
			+ "typ_point,\r\n"
			+ "h_point,\r\n"
			+ "min_point,\r\n"
			+ "date_point,\r\n"
			+ "n_carte,\r\n"
			+ "num_point,\r\n"
			+ "type,\r\n"
			+ "num_pointeuse,\r\n"
			+ "semaine,\r\n"
			+ "typ_reg,\r\n"
			+ "cod_reg,\r\n"
			+ "h_reg,\r\n"
			+ "m_reg,\r\n"
			+ "cod_m,\r\n"
			+ "date_j_point,\r\n"
			+ "typ_valid,\r\n"
			+ "cod_auto,pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)nom_Pren\r\n"
			+ " from Pointer p where (p.mat_pers =:matChef  or p.mat_pers in "
			+ "(select mat_pers from pers_valideur where mat_resp=:matChef))",nativeQuery=true)
	public List<Pointer> getPointage(@Param("matChef")String matChef);
	
	
}
