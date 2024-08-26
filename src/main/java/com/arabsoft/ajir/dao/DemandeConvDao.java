package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

import com.arabsoft.ajir.entities.CleDemandeConv;
import com.arabsoft.ajir.entities.DemandeConv;

public interface DemandeConvDao extends JpaRepository<DemandeConv, CleDemandeConv>{
	
	@Query(value="select t.cod_conv,\r\n"
			+ "       t.cod_soc,\r\n"
			+ "       t.mat_pers,\r\n"
			+ "      t.dat_dem_conv,\r\n"
			+ "       decode(t.etat_dem,'I','En instance','V','Valide','Suspendu')etat_dem,\r\n"
			+ "       t.dat_saisie,\r\n"
			+ "       t.cod_user,\r\n"
			+ "       t.dat_min_fin,\r\n"
			+ "       t.obs,\r\n"
			+ "       t.cod_lieu_geog,\r\n"
			+ "       t.cod_typ_depart,\r\n"
			+ "       t.cod_affect,\r\n"
			+ "       t.dat_susp,\r\n"
			+ "       t.cin,\r\n"
			+ "       (select LIB_CONV from convention where cod_conv=t.cod_conv)libelle_conv from demande_conv t where t.cod_soc=:soc and t.mat_pers=:mat \r\n"
			+ "and dat_dem_conv between  CASE \r\n"
			+ "          WHEN LENGTH(:moisDeb) = 4 THEN TRUNC(TO_DATE(:moisDeb, 'YYYY'), 'YYYY') \r\n"
			+ "          ELSE TRUNC(TO_DATE(:moisDeb, 'MM/YYYY'), 'MM') \r\n"
			+ "      END \r\n"
			+ "      AND \r\n"
			+ "      CASE \r\n"
			+ "          WHEN LENGTH(:moisFin) = 4 THEN LAST_DAY(ADD_MONTHS(TO_DATE(:moisFin, 'YYYY'), 11)) \r\n"
			+ "          ELSE LAST_DAY(TO_DATE(:moisFin, 'MM/YYYY')) \r\n"
			+ "      END ",nativeQuery=true)
	List<DemandeConv> getAllDemandeConv(@Param("soc")String soc,@Param("mat") String mat,@Param("moisDeb")String moisDeb,@Param("moisFin")String moisFin);

}
