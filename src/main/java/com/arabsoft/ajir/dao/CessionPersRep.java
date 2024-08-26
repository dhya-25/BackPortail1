package com.arabsoft.ajir.dao;

import java.util.List;

import org.hibernate.type.descriptor.sql.SqlTypeDescriptorRegistry.ObjectSqlTypeDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CessionPers;
import com.arabsoft.ajir.entities.CleCessionPers;





@Repository
public interface CessionPersRep extends JpaRepository<CessionPers, CleCessionPers>{
	@Query(value="select c.cod_soc ,\r\n"
			+ "  c.mat_pers        ,\r\n"
			+ "  c.cod_pret        ,\r\n"
			+ "  (pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)) npers, \r\n"
			+ "  c.cod_etat_pret   ,\r\n"
			+ "  c.typ_etat        ,\r\n"
			+ "  c.cod_grp_pret    ,\r\n"
			+ "  c.typ_pret        ,\r\n"
			+ "  c.abrv_fixe       ,\r\n"
			+ "  c.org_pret        ,\r\n"
			+ "   pk_get_lib.GET_GROUPE_PRE$LIB_GRP_PRET(cod_soc, cod_grp_pret) lib_groupe    ,\r\n"
			+ "  c.rib_pers        ,\r\n"
			+ "  c.prt_dat_dem     ,\r\n"
			+ "  c.prt_mnt_dem     ,\r\n"
			+ "  c.prt_mnt_glb     ,\r\n"
			+ "  c.prt_dat_deb     ,\r\n"
			+ "  c.prt_dat_fin     ,\r\n"
			+ "  c.prt_ech         ,\r\n"
			+ "  c.rem_men         ,\r\n"
			+ "  c.dern_rem_men    ,\r\n"
			+ "  c.prt_rendu       ,\r\n"
			+ "  c.nbr_retenue     ,\r\n"
			+ "  c.objet_pret      ,\r\n"
			+ "  c.objet_pret_a    ,\r\n"
			+ "  c.dat_saisie      ,\r\n"
			+ "  c.ordonnance      ,\r\n"
			+ "  c.seq_ecrt        ,\r\n"
			+ "  c.ref_pret        ,\r\n"
			+ " pk_get_lib.GET_TYPE_PRET$LIB_PRET(WCOD_SOC      => cod_soc,\r\n"
			+ "                                         WCOD_GRP_PRET => cod_grp_pret,\r\n"
			+ "                                         WTYP_PRET     => typ_pret)lib_pret\r\n"		
			+ " from CESSION_PERS c where c.MAT_PERS=:matPers",nativeQuery = true)
	public List<CessionPers> get(@Param("matPers")String matPers);
	
	
	@Query(value="select c.cod_soc ,\r\n"
			+ "  c.mat_pers        ,\r\n"
			+ "  c.cod_pret        ,\r\n"
			+ "  (pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)) npers, \r\n"
			+ "  c.cod_etat_pret   ,\r\n"
			+ "  c.typ_etat        ,\r\n"
			+ "  c.cod_grp_pret    ,\r\n"
			+ "  c.typ_pret        ,\r\n"
			+ "  c.abrv_fixe       ,\r\n"
			+ "  c.org_pret        ,\r\n"
			+ "  c.rib_pers        ,\r\n"
			+ "  c.prt_dat_dem     ,\r\n"
			+ "  c.prt_mnt_dem     ,\r\n"
			+ "  c.prt_mnt_glb     ,\r\n"
			+ "  c.prt_dat_deb     ,\r\n"
			+ "  c.prt_dat_fin     ,\r\n"
			+ "  c.prt_ech         ,\r\n"
			+ "  c.rem_men         ,\r\n"
			
			+ "   pk_get_lib.GET_GROUPE_PRE$LIB_GRP_PRET(cod_soc, cod_grp_pret) lib_groupe    ,\r\n"
			
			+ "  c.dern_rem_men    ,\r\n"
			+ "  c.prt_rendu       ,\r\n"
			+ "  c.nbr_retenue     ,\r\n"
			+ "  c.objet_pret      ,\r\n"
			+ "  c.objet_pret_a    ,\r\n"
			+ "  c.dat_saisie      ,\r\n"
			+ "  c.ordonnance      ,\r\n"
			+ "  c.seq_ecrt        ,\r\n"
			+ "  c.ref_pret        ,\r\n"		
			+ " pk_get_lib.GET_TYPE_PRET$LIB_PRET(WCOD_SOC      => cod_soc,\r\n"
			+ "                                         WCOD_GRP_PRET => cod_grp_pret,\r\n"
			+ "                                         WTYP_PRET     => typ_pret)lib_pret\r\n"		
			+ "  from cession_pers c\r\n"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery=true)
	public List<CessionPers> getCessionLigCessionPers(@Param("matPers") String matPers,@Param("codSoc") String codSoc);
	
	@Query(value="select c.cod_soc ,\r\n"
			+ "  c.mat_pers        ,\r\n"
			+ "  c.cod_pret        ,\r\n"
			+ "  (pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)) npers, \r\n"
			+ "  c.cod_etat_pret   ,\r\n"
			+ "  c.typ_etat        ,\r\n"
			+ "  c.cod_grp_pret    ,\r\n"
			+ "  c.typ_pret        ,\r\n"
			+ "  c.abrv_fixe       ,\r\n"
			+ "   pk_get_lib.GET_GROUPE_PRE$LIB_GRP_PRET(cod_soc, cod_grp_pret) lib_groupe    ,\r\n"
			+ "  c.org_pret        ,\r\n"
			+ "  c.rib_pers        ,\r\n"
			+ "  c.prt_dat_dem     ,\r\n"
			+ "  c.prt_mnt_dem     ,\r\n"
			+ "  c.prt_mnt_glb     ,\r\n"
			+ "  c.prt_dat_deb     ,\r\n"
			+ "  c.prt_dat_fin     ,\r\n"
			+ "  c.prt_ech         ,\r\n"
			+ "  c.rem_men         ,\r\n"
			+ "  c.dern_rem_men    ,\r\n"
			+ "  c.prt_rendu       ,\r\n"
			+ "  c.nbr_retenue     ,\r\n"
			+ "  c.objet_pret      ,\r\n"
			+ "  c.objet_pret_a    ,\r\n"
			+ "  c.dat_saisie      ,\r\n"
			+ "  c.ordonnance      ,\r\n"
			+ "  c.seq_ecrt        ,\r\n"
			+ "  c.ref_pret        ,\r\n"
			+ " pk_get_lib.GET_TYPE_PRET$LIB_PRET(WCOD_SOC      => cod_soc,\r\n"
			+ "                                         WCOD_GRP_PRET => cod_grp_pret,\r\n"
			+ "                                         WTYP_PRET     => typ_pret)lib_pret\r\n"					+ "  from cession_pers c",nativeQuery=true)
	public List<CessionPers> getAll();
	
	@Query(value="select cod_soc,\r\n"
			+ "       mat_pers,\r\n"
			+ "       cod_pret,\r\n"
			+ "       cod_grp_pret,\r\n"
			+ "       pk_get_lib.GET_GROUPE_PRE$LIB_GRP_PRET(cod_soc, cod_grp_pret) lib_groupe,\r\n"
			+ "       typ_pret,\r\n"
			+ "       pk_get_lib.GET_TYPE_PRET$LIB_PRET(WCOD_SOC      => cod_soc,\r\n"
			+ "                                         WCOD_GRP_PRET => cod_grp_pret,\r\n"
			+ "                                         WTYP_PRET     => typ_pret) lib_pret,\r\n"
			+ "       prt_mnt_glb mnt_accorde,\r\n"
			+ "       prt_dat_deb mois_debut,\r\n"
			+ "       prt_dat_fin mois_fin,\r\n"
			+ "       prt_ech nombre_echeance,\r\n"
			+ "       rem_men rem_mens\r\n"
			+ "  from cession_pers where cod_soc=:soc and mat_pers=:mat",nativeQuery=true)
	public List<Object> getCessPers(@Param("soc") String soc,@Param("mat") String matPers);
	
	@Query(value="select cod_soc ,\r\n"
			+ "  c.mat_pers        ,\r\n"
			+ "  c.cod_pret        ,\r\n"
			+ "  (pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)) npers, \r\n"
			+ "  c.cod_etat_pret   ,\r\n"
			+ "  c.typ_etat        ,\r\n"
			+ "  c.cod_grp_pret    ,\r\n"
			+ "  c.typ_pret        ,\r\n"
			+ "  c.abrv_fixe       ,\r\n"
			+ "  c.org_pret        ,\r\n"
			+ "  c.rib_pers        ,\r\n"
			+ "  c.prt_dat_dem     ,\r\n"
			+ "  c.prt_mnt_dem     ,\r\n"
			+ "  c.prt_mnt_glb     ,\r\n"
			+ "  c.prt_dat_deb     ,\r\n"
			+ "  c.prt_dat_fin     ,\r\n"
			+ "  c.prt_ech         ,\r\n"
			+ "  c.rem_men         ,\r\n"
			+ "  c.dern_rem_men    ,\r\n"
			+ "  c.prt_rendu       ,\r\n"
			+ "  c.nbr_retenue     ,\r\n"
			+ "   pk_get_lib.GET_GROUPE_PRE$LIB_GRP_PRET(cod_soc, cod_grp_pret) lib_groupe    ,\r\n"
			+ "  c.objet_pret      ,\r\n"
			+ "  c.objet_pret_a    ,\r\n"
			+ "  c.dat_saisie      ,\r\n"
			+ "  c.ordonnance      ,\r\n"
			+ "  c.seq_ecrt        ,\r\n"
			+ "  c.ref_pret        ,\r\n"
			
	+ " pk_get_lib.GET_TYPE_PRET$LIB_PRET(WCOD_SOC      => cod_soc,\r\n"
	+ "                                         WCOD_GRP_PRET => cod_grp_pret,\r\n"
	+ "                                         WTYP_PRET     => typ_pret)lib_pret\r\n"					+ "  from cession_pers c\r\n"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers and cod_pret = :codPret",nativeQuery=true)
	public List<CessionPers> getCessionLigCessionPersPret(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") Integer codPret);
	@Query(value="select cod_pret from cession_pers \r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers ",nativeQuery=true)
	public List<String> getCessionPersCode(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

	
	
	
}
