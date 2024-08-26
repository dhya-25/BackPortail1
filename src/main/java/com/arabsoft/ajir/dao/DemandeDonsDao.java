package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleDemandeDons;
import com.arabsoft.ajir.entities.DemandeDons;

public interface DemandeDonsDao extends JpaRepository<DemandeDons, CleDemandeDons>{
	
	@Query(value="select d.typ_don,\r\n"
			+ "       d.cod_soc,\r\n"
			+ "       d.mat_pers,\r\n"
			+ "       d.num_fam,\r\n"
			+ "       d.dat_dem_don,\r\n"
			+ "       d.nat_don,\r\n"
			+ "       d.mnt_dem_don,\r\n"
			+ "       d.raison,\r\n"
			+ "       decode(d.etat_dem,'I','En instance','V','Validée','R','Rejetée','A','Accordée','Débloquée')etat_dem,\r\n"
			+ "       d.mnt_acc_don,\r\n"
			+ "       d.etat_act,\r\n"
			+ "       d.cod_lieu_geog,\r\n"
			+ "       decode(d.corps,'C','Cadre commun','S','Sécurité','M','Mediateur administratif','H','HCCAF','I','ITES','P','Minéstère d intérieur','Divers') corps  ,\r\n"
			+ "       d.cod_typ_depart,\r\n"
			+ "       d.cod_affect,\r\n"
			+ "       d.dat_debut,\r\n"
			+ "       d.cod_dest,\r\n"
			+ "       d.cod_fond,\r\n"
			+ "       d.dat_deblocage,\r\n"
			+ "        decode(d.mode_payement,'V','Virement','C','Chéque','Espèce')mode_payement,\r\n"
			+ "       d.ref_payement,\r\n"
			+ "       d.num_piece,\r\n"
			+ "       d.rib,\r\n"
			+ "       d.cod_user,\r\n"
			+ "       d.dat_saisie,\r\n"
			+ "       decode(d.typ_benificiaire,'A','Agent','C','Conjointe','E','Enfants','Parents')typ_benificiaire,\r\n"
			+ "       d.mnt_livre,\r\n"
			+ "       d.seq_ecrt,\r\n"
			+ "       d.imput_cpt,\r\n"
			+ "       d.ref_metier,\r\n"
			+ "       d.num_vir,\r\n"
			+ "      pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers) nom,\r\n"
			+ "      pk_get_lib.GET_TYPE_DEPAR$LIB_TYP_DEPART(cod_typ_depart) lib_depart ,\r\n"
			+ "      pk_get_lib.GET_PRM_LIEU_G$LIB_LIEU(d.cod_lieu_geog)lib_lieu,\r\n"
			+ "      pk_get_lib.GET_NATURE_DON$LIB_NAT_DON(d.nat_don) lib_don,\r\n"
			+ "      pk_get_lib.GET_AFFECTATIO$LIB_AFFECT(cod_affect) lib_affect from demande_dons d where d.mat_pers=:mat and cod_soc=:soc\r\n"
			+ " AND d.dat_deblocage BETWEEN \r\n"
			+ "      CASE \r\n"
			+ "          WHEN LENGTH(:moisDeb) = 4 THEN TRUNC(TO_DATE(:moisDeb, 'YYYY'), 'YYYY') \r\n"
			+ "          ELSE TRUNC(TO_DATE(:moisDeb, 'MM/YYYY'), 'MM') \r\n"
			+ "      END \r\n"
			+ "      AND \r\n"
			+ "      CASE \r\n"
			+ "          WHEN LENGTH(:moisFin) = 4 THEN LAST_DAY(ADD_MONTHS(TO_DATE(:moisFin, 'YYYY'), 11)) \r\n"
			+ "          ELSE LAST_DAY(TO_DATE(:moisFin, 'MM/YYYY')) \r\n"
			+ "      END ",nativeQuery = true)
	List<DemandeDons> getDemandeDons(@Param("soc") String soc,@Param("mat")String pers,@Param("moisDeb")String moisDeb,@Param("moisFin")String moisFin);

}
