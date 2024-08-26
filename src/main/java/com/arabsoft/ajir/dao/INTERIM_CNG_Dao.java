package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ID_Interim_Cng;
import com.arabsoft.ajir.entities.INTERIM_LIBRE_DEM;

public interface INTERIM_CNG_Dao extends JpaRepository<INTERIM_LIBRE_DEM, ID_Interim_Cng> {

	
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
	public List<INTERIM_LIBRE_DEM> getById_libre_demande(@Param("id")long id);
	
	@Query(value="select * from INTERIM_LIBRE_DEM where id_libre_demande=:id and mat_pers_int=:mat",nativeQuery = true)
	public INTERIM_LIBRE_DEM getByIdAndMat(@Param("id")long id,@Param("mat") String mat);
	
	@Query(value="update interim_libre_dem set mat_pers_int =:mat_change,dat_debut_int=:dat_deb,"
			+ "dat_fin_int=:dat_fin where id_libre_demande =:id and mat_pers_int=:mat_dem",nativeQuery = true)
	public INTERIM_LIBRE_DEM updateInter(@Param("mat_change")String mat_change,@Param("dat_deb")Date dat_deb,
			@Param("dat_fin")Date dat_fin,@Param("id")Long id,@Param("mat_dem")String mat_dem);
	@Query(value="commit",nativeQuery = true)
	public void commit();
	
	@Query(value="delete from interim_libre_dem where mat_pers_int =:mat and id_libre_demande =:id ",nativeQuery = true)
	
	public void  DeleteByIdAndMat(@Param ("mat") String mat,@Param("id") Long id);
	
	@Query(value="delete from libre_demande where id_libre_demande =:id ",nativeQuery = true)
	public void  DeleteDemande(@Param("id") Long id);
	
	@Query(value="delete from interim_libre_dem where id_libre_demande =:id ",nativeQuery = true)
	public void  DeleteInterimById(@Param("id") Long id);
	
	@Query(value="       insert\r\n"
			+ "  into interim_libre_dem(id_libre_demande, mat_pers_int,\r\n"
			+ "                         dat_debut_int, dat_fin_int) values(:id,:mat:dat_deb,:dat_fin)",nativeQuery = true)
	public void addInterim(@Param("id") Long id,@Param("mat") String mat,@Param("dat_deb") Date dat_deb,@Param("dat_fin") Date dat_fin);
}
