package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleLigPhar;
import com.arabsoft.ajir.entities.LigPhar;

public interface LigPharDao extends JpaRepository<LigPhar, CleLigPhar>{

	@Query(value="select l.cod_soc,\r\n"
			+ "       l.mat_pers,\r\n"
			+ "       l.num_fam,\r\n"
			+ "       l.dat_soin,\r\n"
			+ "       l.cod_med,\r\n"
			+ "       l.num_lig,\r\n"
			+ "       l.indice,\r\n"
			+ "       l.dat_act,\r\n"
			+ "       l.prf_typ,\r\n"
			+ "       l.prf_cod,\r\n"
			+ "       l.mnt_honor,\r\n"
			+ "       l.mnt_net,\r\n"
			+ "       l.mnt_remb,\r\n"
			+ "       l.mdc_prix,\r\n"
			+ "       l.med_prix,\r\n"
			+ "       l.prix_remb,\r\n"
			+ "       l.obs,\r\n"
			+ "       l.obs_a,\r\n"
			+ "       l.nbr_piece,\r\n"
			+ "       l.nbr_vign,\r\n"
			+ "       l.abrv_act from lig_phar l where l.cod_soc=:soc and l.mat_pers=:mat and num_fam=:numFam and dat_soin=to_date(:dat,'dd/mm/yyyy')",nativeQuery = true)
	public List<LigPhar> getLigPhar(@Param("soc") String soc,@Param("mat") String mat,@Param("numFam") Long numFam,@Param("dat") String dat);
}
