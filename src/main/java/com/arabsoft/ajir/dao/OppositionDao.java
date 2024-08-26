package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Opposition;

public interface OppositionDao extends JpaRepository<Opposition, Integer> {
	@Query(value="select t.lib_pret libpret,c.cod_pret cod_pret\r\n"
			+ "from cession_pers c , type_pret t \r\n"
			+ "where c.cod_soc = t.cod_soc\r\n"
			+ "and c.cod_grp_pret = t.cod_grp_pret\r\n"
			+ "and c.typ_pret = t.typ_pret\r\n"
			+ "and c.cod_soc = :codSoc and c.mat_pers = :matPers ",nativeQuery=true)
	public List<Opposition> getCessionPersCode(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

}
