package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.AFFIL_PERS;
import com.arabsoft.ajir.entities.AfillPersId;

public interface AffilpersDao extends JpaRepository<AFFIL_PERS, AfillPersId> {
	@Query(value="select cod_soc,\r\n"
			+ "		mat_pers,\r\n"
			+"pk_get_lib.GET_TYPE_AFFIL$LIB_AFFIL(typ_affil) type_affiliation,\r\n"
			+"pk_get_lib.GET_CODE_AFFIL$LIB_AFFIL(typ_affil,cod_affil) libaffil,\r\n" 
			+ "		nvl(cod_affil,'no data')cod_affil,\r\n"
			+ "		typ_affil,\r\n"
			+ "		dat_affil,\r\n"
			+ "		id_affil_pers,\r\n"
			+ "		dat_fin,\r\n"
			+ "		num_affil,\r\n"
			+ "		cod_user\r\n"
			+ "from affil_pers\r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery = true)
	public List<AFFIL_PERS> getAFFIL_PERS(@Param("codSoc") String codSoc,@Param("matPers") String matPers);


}