package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleOffDemandeConv;
import com.arabsoft.ajir.entities.OffDemandeConv;

public interface OffDemandeConvDao extends JpaRepository<OffDemandeConv, CleOffDemandeConv>{
	
	
@Query(value="select t.cod_conv,\r\n"
		+ "       t.cod_soc,\r\n"
		+ "       t.mat_pers,\r\n"
		+ "       t.cod_off,\r\n"
		+ "       t.dat_off_dem,\r\n"
		+ "       t.dat_fin_off,\r\n"
		+ "       t.mnt_off,\r\n"
		+ "      decode(t.etat_off_dem,'I','En instance','V','Valide','Suspendu')etat_off_dem  ,\r\n"
		+ "       t.cod_user,\r\n"
		+ "       t.dat_saisie,\r\n"
		+ "       t.seq,\r\n"
		+ "       t.dat_susp,\r\n"
		+ "       t.num_tel,\r\n"
		+ "       t.cod_mot_susp,\r\n"
		+ "       decode(t.renouv,'O','Oui','Non')renouv,\r\n"
		+ "       t.dat_renouv,\r\n"
		+ "       t.obs_off,\r\n"
		+ "       (select lib_off from off_conv where t.cod_off=cod_off and t.cod_conv=cod_conv) lib_off from off_demande_conv t where t.cod_soc=:soc and mat_pers=:mat "
		+ "and  cod_conv=:conv",nativeQuery = true)
public List<OffDemandeConv> getOffDemandeConv(@Param("soc")String codSoc,@Param("mat") String matpers, @Param("conv") String conv);
}
