package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.InterimEntity;

public interface InterimEntityDao extends JpaRepository<InterimEntity, Long>{
	
	@Query(value="select id_libre_demande,\r\n"
			+ "mat_pers_int,\r\n"
			+ "cod_soc,\r\n"
			+ "dat_debut_int,\r\n"
			+ "dat_fin_int,\r\n"
			+ "dat_decision,\r\n"
			+ "num_decision,\r\n"
			+ "nature_int,\r\n"
			+ "ordonance,\r\n"
			+ "mnt_int,\r\n"
			+ "cod_ur,\r\n"
			+ "cod_serv,\r\n"
			+ "cod_motif,\r\n"
			+ "cod_affect,\r\n"
			+ "cod_class,\r\n"
			+ "regime_trav,\r\n"
			+ "(select nom_pers from personnel where mat_pers=mat_pers_int)nom,\r\n"
			+ "(select pren_pers from personnel where mat_pers=mat_pers_int)prenom"
			+ " from INTERIM_LIBRE_DEM where id_libre_demande=:id ",nativeQuery = true)
	public List<InterimEntity> getById_libre_demande(@Param("id")long id);

}
