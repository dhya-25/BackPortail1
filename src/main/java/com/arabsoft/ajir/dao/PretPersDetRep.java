package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.PretPersDet;
import com.arabsoft.ajir.entities.SoldConge;
import com.arabsoft.ajir.entities.pret_pers;


public interface PretPersDetRep  extends JpaRepository<PretPersDet, String>{
	
	@Query(value="select t.cod_soc, t.mat_pers, t.cod_pret, t.cod_serv,pk_get_lib.GET_SERVICE$LIB_SERV(t.cod_soc,t.cod_serv) lib_serv\r\n"
			+ "\r\n"
			+ ", t.cod_categ,pk_get_lib.GET_CATEG$LIB_CATEG(t.cod_categ) college, t.cod_cat,pk_get_lib.GET_CATEGORIE$LIB_CAT(t.cod_categ,t.cod_cat)  categorie\r\n"
			+ "\r\n"
			+ ", t.cod_grad,pk_get_lib.GET_GRADE$LIB_GRAD(t.cod_categ,t.cod_cat,t.cod_grad) lib_grad, t.adm_tech,pk_get_lib.GET_TYP_ADM_TE$LIB_ADM_TECH(t.adm_tech) lib_poste\r\n"
			+ "\r\n"
			+ ", t.cod_fonct,pk_get_lib.GET_FONCTIONS$LIB_FONCT('F',t.cod_fonct) lib_fonct, t.cod_affect, pk_get_lib.GET_AFFECTATIO$LIB_AFFECT(t.cod_affect) lib_statut\r\n"
			+ "\r\n"
			+ ",t.cod_motif,pk_get_lib.GET_MOTIF_SORT$LIB_MOTIF(t.cod_motif) position, num_dem_pret, cod_etat_pret, typ_etat, cod_grp_pret, typ_pret, abrv_fixe, org_pret, prt_dat_acc,\r\n"
			+ "\r\n"
			+ "prt_mnt_glb,prt_taux, prt_ech, delai_grace, nbr_tranche, mod_remb, prt_dat_deb, prt_dat_fin, prt_interet,\r\n"
			+ "\r\n"
			+ "prt_mnt_rem,rem_men, dern_rem_men, prt_rendu, nbr_retenue, app_int_franch, int_franch, dat_deblocage, prt_mnt_debloque,\r\n"
			+ "\r\n"
			+ "objet_pret,ass_pret, cod_pret_ref, annee_fond, cod_fond, dat_saisie,  mnt_achat, obs_litige, derogation,\r\n"
			+ "\r\n"
			+ "sal_ref, ordonnance, seq_ecrt, ref_pret, int_grace, cod_alert, seq_alert, dat_validite, bonification, tmmplus, prt_log,\r\n"
			+" pk_get_lib.GET_TYPE_PRET$LIB_PRET(t.COD_GRP_PRET,:typePret,t.COD_SOC) lib_pret \r\n"
			+ "from pret_pers t ,personnel p \r\n"
			+ "\r\n"
			+ "where t.cod_soc = p.cod_soc\r\n"
			+ "\r\n"
			+ "   and t.mat_pers=p.mat_pers\r\n"
			+ "\r\n"
			+ " and t.cod_soc = :codSoc and t.mat_pers= :matPers and t.cod_pret = :codPret  and prt_dat_deb= :prtDatDeb and typ_pret= :typePret",nativeQuery=true)
	public PretPersDet getPret(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") Long codPret,@Param("prtDatDeb") String dateDeb,@Param("typePret") String typePret);

	

	@Query(value="select t.cod_soc, t.mat_pers, t.cod_pret, t.cod_serv,pk_get_lib.GET_SERVICE$LIB_SERV(t.cod_soc,t.cod_serv) lib_serv\r\n"
			+ "\r\n"
			+ ", t.cod_categ,pk_get_lib.GET_CATEG$LIB_CATEG(t.cod_categ) college, t.cod_cat,pk_get_lib.GET_CATEGORIE$LIB_CAT(t.cod_categ,t.cod_cat)  categorie\r\n"
			+ "\r\n"
			+ ", t.cod_grad,pk_get_lib.GET_GRADE$LIB_GRAD(t.cod_categ,t.cod_cat,t.cod_grad) lib_grad, t.adm_tech,pk_get_lib.GET_TYP_ADM_TE$LIB_ADM_TECH(t.adm_tech) lib_poste\r\n"
			+ "\r\n"
			+ ", t.cod_fonct,pk_get_lib.GET_FONCTIONS$LIB_FONCT('F',t.cod_fonct) lib_fonct, t.cod_affect, pk_get_lib.GET_AFFECTATIO$LIB_AFFECT(t.cod_affect) lib_statut\r\n"
			+ "\r\n"
			+ ",t.cod_motif,pk_get_lib.GET_MOTIF_SORT$LIB_MOTIF(t.cod_motif) position, num_dem_pret, cod_etat_pret, typ_etat, cod_grp_pret, typ_pret, abrv_fixe, org_pret, prt_dat_acc,\r\n"
			+ "\r\n"
			+ "prt_mnt_glb,prt_taux, prt_ech, delai_grace, nbr_tranche, mod_remb, prt_dat_deb, prt_dat_fin, prt_interet,\r\n"
			+ "\r\n"
			+ "prt_mnt_rem,rem_men, dern_rem_men, prt_rendu, nbr_retenue, app_int_franch, int_franch, dat_deblocage, prt_mnt_debloque,\r\n"
			+ "\r\n"
			+ "objet_pret,ass_pret, cod_pret_ref, annee_fond, cod_fond, dat_saisie,  mnt_achat, obs_litige, derogation,\r\n"
			+ "\r\n"
			+ "sal_ref, ordonnance, seq_ecrt, ref_pret, int_grace, cod_alert, seq_alert, dat_validite, bonification, tmmplus, prt_log,\r\n"
			+" pk_get_lib.GET_TYPE_PRET$LIB_PRET(t.COD_GRP_PRET,t.TYP_PRET,t.COD_SOC) lib_pret \r\n"
			+ "from pret_pers t ,personnel p \r\n"
			+ "\r\n"
			+ "where t.cod_soc = p.cod_soc\r\n"
			+ "\r\n"
			+ "   and t.mat_pers=p.mat_pers\r\n"
			+ "\r\n"
			+ " and t.cod_soc = :codSoc and t.mat_pers= :matPers and t.cod_pret = :codPret",nativeQuery=true)
	public PretPersDet getPretCession(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") Long codPret);

	@Query(value="select cod_pret from pret_pers  where cod_soc = :codSoc and mat_pers= :matPers ",nativeQuery=true)
	public List<Long> getListCodPret(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

	@Query(value="select cod_pret,mat_pers  from pret_pers  where cod_soc = :codSoc and mat_pers= :matPers ",nativeQuery=true)
	public List<Integer> getListCodPret2(@Param("codSoc") String codSoc,@Param("matPers") String matPers);
	
	
	@Query("select a from pret_pers a where a.cod_soc=:x and a.mat_pers=:y ")
	public List<pret_pers> GetPretById(@Param("x")String codSoc,@Param("y")String mat);

	@Query(value="select cod_soc,mat_pers,cod_pret,cod_serv,cod_categ,cod_cat,"
			+ "cod_grad,adm_tech,cod_fonct,cod_affect,cod_motif,num_dem_pret,"
			+ "cod_etat_pret,typ_etat,cod_grp_pret,typ_pret,abrv_fixe,"
			+ "org_pret,prt_dat_acc,prt_mnt_glb,prt_taux,prt_ech,delai_grace,nbr_tranche,"
			+ "mod_remb,prt_dat_deb,prt_dat_fin,prt_interet,prt_mnt_rem,"
			+ "rem_men,dern_rem_men,prt_rendu,nbr_retenue,app_int_franch,"
			+ "int_franch,dat_deblocage,prt_mnt_debloque,objet_pret,ass_pret,cod_pret_ref"
			+ ",annee_fond,cod_fond,dat_saisie,cod_user,mnt_achat,obs_litige"
			+ ",derogation,sal_ref,ordonnance,seq_ecrt,ref_pret,int_grace,"
			+ "cod_alert,seq_alert,dat_validite,bonification,tmmplus,prt_log from pret_pers a  where a.cod_soc=:x and a.mat_pers=:y ",nativeQuery=true)
	public List<pret_pers> GetPretByMat(@Param("x")String codSoc,@Param("y")String mat);

}
