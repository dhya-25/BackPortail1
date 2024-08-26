package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.pret_pers;

public interface pretPersDao extends JpaRepository<pret_pers, Long> {
	@Query(value="select cod_soc,mat_pers,cod_pret,cod_serv,cod_categ,cod_cat,"
			+ "cod_grad,adm_tech,cod_fonct,cod_affect,cod_motif,num_dem_pret,"
			+ "cod_etat_pret,typ_etat,cod_grp_pret,typ_pret,abrv_fixe,"
			+ "org_pret,prt_dat_acc,prt_mnt_glb,prt_taux,prt_ech,delai_grace,nbr_tranche,"
			+ "mod_remb,prt_dat_deb,prt_dat_fin,prt_interet,prt_mnt_rem,"
			+ "rem_men,dern_rem_men,prt_rendu,nbr_retenue,app_int_franch,"
			+ "int_franch,dat_deblocage,prt_mnt_debloque,objet_pret,ass_pret,cod_pret_ref"
			+ ",annee_fond,cod_fond,dat_saisie,cod_user,mnt_achat,obs_litige"
			+ ",derogation,sal_ref,ordonnance,seq_ecrt,ref_pret,int_grace,"
			+"pk_get_lib.GET_GROUPE_PRE$LIB_GRP_PRET(cod_soc,cod_grp_pret) lib_groupe,\n\r"
			+"pk_get_lib.GET_TYPE_PRET$LIB_PRET(WCOD_SOC => cod_soc,WCOD_GRP_PRET => cod_grp_pret,WTYP_PRET => typ_pret) lib_pret ,\n\r"

			+ "cod_alert,seq_alert,dat_validite,bonification,tmmplus,prt_log from pret_pers a  where a.cod_soc=:x and a.mat_pers=:y ",nativeQuery=true)
	public List<pret_pers> GetPretByMat(@Param("x")String codSoc,@Param("y")String mat);

}
