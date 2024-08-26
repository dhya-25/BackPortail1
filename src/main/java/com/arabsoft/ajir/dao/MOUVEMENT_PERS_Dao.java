package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Contrat;
import com.arabsoft.ajir.entities.Id_MOUVEMENT_PERS;
import com.arabsoft.ajir.entities.MOUVEMENT_PERS;

public interface MOUVEMENT_PERS_Dao extends JpaRepository<MOUVEMENT_PERS, Id_MOUVEMENT_PERS> {
	@Query(value="select cod_soc, \r\n"
			+ "mat_pers, \r\n"
			+ "num_mvt, \r\n"
			+ "dat_mvt, \r\n"
			+ "dat_effet, \r\n"
			+ "dat_decision, \r\n"
			+ "num_decision, \r\n"
			+ "etat_mvt, \r\n"
			+ "cod_mvt, \r\n"
			+ "cod_dept, \r\n"
			+ "cod_serv, \r\n"
			+ "org_serv, \r\n"
			+ "cod_lieu_geog, \r\n"
			+ "qualf, \r\n"
			+ "adm_tech, \r\n"
			+ "cod_class, \r\n"
			+ "cod_fil, \r\n"
			+ "cod_categ, \r\n"
			+ "cod_cat, \r\n"
			+ "cod_grad, \r\n"
			+ "cod_ech, \r\n"
			+ "cod_fonct, \r\n"
			+ "cod_affect, \r\n"
			+ "cod_motif, \r\n"
			+ "cod_typ_depart, \r\n"
			+ "cod_metier, \r\n"
			+ "cod_post, \r\n"
			+ "niv_sal, \r\n"
			+ "ncod_dept, \r\n"
			+ "ncod_serv, \r\n"
			+ "norg_serv, \r\n"
			+ "ncod_lieu_geog, \r\n"
			+ "nqualf, \r\n"
			+ "nadm_tech, \r\n"
			+ "ncod_class, \r\n"
			+ "ncod_fil, \r\n"
			+ "ncod_categ, \r\n"
			+ "ncod_cat, \r\n"
			+ "ncod_grad, \r\n"
			+ "ncod_ech, \r\n"
			+ "ncod_fonct, \r\n"
			+ "ncod_affect, \r\n"
			+ "ncod_motif, \r\n"
			+ "ncod_typ_depart, \r\n"
			+ "ncod_metier, \r\n"
			+ "ncod_post, \r\n"
			+ "nniv_sal, \r\n"
			+ "ref_mvt, \r\n"
			+ "ordonnance, \r\n"
			+ "etat_act, \r\n"
			+ "val_pers,\r\n"
			+ "reg_post,\r\n"
			+ "nreg_post, \r\n"
			+ "(pk_get_lib.GET_PARAM_MVT$LIB_MVT(cod_mvt)) libmvt, \r\n"
			+ "(pk_get_lib.GET_CATEG$LIB_CATEG (cod_categ)) libcaeg, \r\n"
			+ "(pk_get_lib.GET_GRADE$LIB_GRAD(cod_categ,cod_cat,cod_grad))libgrade, \r\n"
			+"pk_get_lib.GET_CATEGORIE$LIB_CAT(ncod_categ,ncod_cat)nLibcat,"
			
			+"(pk_get_lib.GET_AFFECTATIO$LIB_AFFECT(cod_affect)) lib_affect,\r\n"
			+"(pk_get_lib.GET_ETAT_PAIE$LIB_ETAT(etat_act)) lib_etat_act,\r\n"
			+ "(pk_get_lib.GET_SERVICE$LIB_SERV(cod_soc,cod_serv)) lib_serv,\r\n"
			+ "(pk_get_lib.GET_TYP_ADM_TE$LIB_ADM_TECH(adm_tech)) lib_adm_tech,\r\n"
			+ "(pk_get_lib.GET_CATEG$LIB_CATEG (ncod_categ)) nlibcaeg,\r\n"
			+ "(pk_get_lib.GET_GRADE$LIB_GRAD(cod_categ,ncod_cat,ncod_grad))nlibgrade,\r\n"
			
			+"(pk_get_lib.GET_AFFECTATIO$LIB_AFFECT(ncod_affect)) nlib_affect,\r\n"
			+ "(pk_get_lib.GET_SERVICE$LIB_SERV(cod_soc,ncod_serv)) nlib_serv,\r\n"
			+ "(pk_get_lib.GET_FILLIERE$LIB_FIL(cod_fil)) lib_fil,\r\n"
			+ "(pk_get_lib.GET_FILLIERE$LIB_FIL(ncod_fil)) nlib_fil,\r\n"
			+ "(pk_get_lib.GET_TYP_ADM_TE$LIB_ADM_TECH(nadm_tech)) nlib_adm_tech,"
			+ "(pk_get_lib.GET_PRM_LIEU_G$LIB_LIEU(cod_lieu_geog)) lib_lieu_geog,\r\n"
			+ "(pk_get_lib.GET_PRM_LIEU_G$LIB_LIEU(ncod_lieu_geog)) nlib_lieu_geog\r\n"

			+ "from MOUVEMENT_PERS c\r\n"
			+ "where cod_soc=:cod and mat_pers=:mat  ",nativeQuery=true)
	public List<MOUVEMENT_PERS> getContrat(@Param("cod")String cod,@Param("mat")String ma);

}
