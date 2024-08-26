package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Libre_demande;
import com.arabsoft.ajir.entities.libreDemandek;

public interface LibreDemandeKDao extends JpaRepository<libreDemandek, Long>{
	@Query("select p from  libreDemandek p where p.codSoc=:x and p.matPers=:y and p.typDemande='C' and p.id_libre_demande=:z")
	public  libreDemandek getlibreDemandeC(@Param("x")String x,@Param("y")String y, @Param("z")long z);
	@Query("select p from  libreDemandek p where p.codSoc=:x and p.matPers=:y and p.typDemande='E' and p.id_libre_demande=:z")
	public  libreDemandek getlibreDemandeE(@Param("x")String x,@Param("y")String y, @Param("z")long z);
	@Query("select p from  libreDemandek p where p.codSoc=:x and p.matPers=:y and p.typDemande='P' and p.id_libre_demande=:z")
	public  libreDemandek getlibreDemandekPret(@Param("x")String x,@Param("y")String y, @Param("z")long z);
	@Query("select p from  libreDemandek p where p.codSoc=:x and p.matPers=:y and p.typDemande='S' and p.id_libre_demande=:z")
	public  libreDemandek getlibreDemandekSituation(@Param("x")String x,@Param("y")String y, @Param("z")long z);
	@Query("select p from  libreDemandek p where p.codSoc=:x and p.matPers=:y and p.typDemande='A' and p.id_libre_demande=:z")
	public  libreDemandek getlibreDemandeAutourisation(@Param("x")String x,@Param("y")String y, @Param("z")long z);
	@Query("select p from  libreDemandek p where p.codSoc=:x and p.matPers=:y and p.typDemande='F' and p.id_libre_demande=:z")
	public  libreDemandek getlibreDemandeFormation(@Param("x")String x,@Param("y")String y, @Param("z")long z);
	@Query("select p from  libreDemandek p where p.codSoc=:x and p.matPers=:y and p.typDemande='D' and p.id_libre_demande=:z")
	public  libreDemandek getlibreDemandeDocument(@Param("x")String x,@Param("y")String y, @Param("z")long z);

	
}
