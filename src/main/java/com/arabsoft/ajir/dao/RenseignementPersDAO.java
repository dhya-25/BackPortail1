package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.RenseignementPers;
import com.arabsoft.ajir.entities.RenseignementPersID;

public interface RenseignementPersDAO extends JpaRepository<RenseignementPers, RenseignementPersID>{
	
	@Query(value="select cod_soc,\r\n"
			+ "mat_pers,\r\n"
			+ "reg_cng,\r\n"
			+ "cod_cycl,\r\n"
			+ "sal_neg,\r\n"
			+ "taux_imp,\r\n"
			+ "regime_trav,\r\n"
			+ "droit_lait,\r\n"
			+ "cod_reg,\r\n"
			+ "nat_reg,\r\n"
			+ "comp_cng,\r\n"
			+ "code_comp_cng,\r\n"
			+ "reg_post,\r\n"
			+ "cod_equip,\r\n"
			+ "pointe,\r\n"
			+ "anc_pers,\r\n"
			+ "regime_heur,\r\n"
			+ "pers_clog,\r\n"
			+ "pers_celec,\r\n"
			+ "pers_cvoit,\r\n"
			+ "pers_ceau,\r\n"
			+ "code_cchauf,\r\n"
			+ "code_residence,\r\n"
			+ "prim_adm_para,\r\n"
			+ "code_pelerinage,\r\n"
			+ "coef_ptrim,\r\n"
			+ "taux_imp_ptrim,\r\n"
			+ "art40,\r\n"
			+ "cod_grp,\r\n"
			+ "cod_sgrp,\r\n"
			+ "ind_domest,\r\n"
			+ "dat_art40,\r\n"
			+ "uniform,\r\n"
			+ "anc_pers_tit,\r\n"
			+ "cod_group,\r\n"
			+ "num_pointeuse,\r\n"
			+ "pointe_libre,\r\n"
			+ "cod_grp_point,\r\n"
			+ "signature,\r\n"
			+ "cod_bareme,\r\n"
			+ "dat_deb_assur,\r\n"
			+ "dat_fin_assur,\r\n"
			+ "f_mojhd_chehid,\r\n"
			+ "iep_mojhd_chehid,\r\n"
			+ "iep_hors_bea,\r\n"
			+ "contrat_fidelite,\r\n"

			+ "cod_memb,\r\n"
			+ "mnt_param,\r\n"
			+ "bon_rest,\r\n"
			+ "compte_proced_judic,\r\n"
			+ "benef_proced_judic,\r\n"
			+ "benef,\r\n"
			+ "compte_herit,\r\n"

			
			
			+ "(pk_get_lib.GET_REGIME$LIB_REGIME(cod_reg,cod_soc)) lib_regime,\r\n"
			+ "(pk_get_lib.GET_REGIME_CON$LIB_REG_CNG(reg_cng)) lib_regimecng, \r\n"
			+ "(select c.dat_debut_cycl from CYCLE_CONGE c  where c.cod_cycl =cod_cycl) deb_cycle,\r\n"
			+ "(select c.dat_fin_cycl from CYCLE_CONGE c  where c.cod_cycl =cod_cycl) fin_cycle,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =code_residence and p.cod_ind='CODE_RESIDENCE') lib_residence,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =droit_lait and p.cod_ind='DROIT_LAIT') lib_lait,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =code_cchauf and p.cod_ind='CODE_CCHAUF') lib_CCHAUF,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =pers_ceau and p.cod_ind='PERS_CEAU') lib_eau,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =pers_cvoit and p.cod_ind='PERS_CVOIT') lib_cvoit,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =pers_clog and p.cod_ind='PERS_CLOG') lib_clog,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =pers_celec and p.cod_ind='PERS_CELEC') lib_celec,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =ind_domest and p.cod_ind='IND_DOMEST') lib_dom,\r\n"
			+ "(select p.lib_valeur from prm_ind_prime p  where p.valeur_ind =uniform and p.cod_ind='UNIFORM') lib_uniform\r\n"
			+ "from renseignement_pers\r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery = true)
	public List<RenseignementPers> getRensPers(@Param("codSoc") String codSoc,@Param("matPers") String matPers);
}
