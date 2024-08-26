package com.arabsoft.ajir.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "pret_pers")
public class pret_pers {


	private String cod_soc;	
	private String  mat_pers;
	@Id
	private Long  cod_pret;
	private String   cod_serv;
	private String   cod_categ ;
	private String   cod_cat   ;
	private String   cod_grad ;
	private String   adm_tech ;
	private String   cod_fonct ;
	private String   cod_affect  ;
	private String   cod_motif ;
	private Long   num_dem_pret;
	private String   cod_etat_pret;
	private String   typ_etat  ;
	private String   cod_grp_pret ;
	private String   typ_pret ;
	private String   abrv_fixe ;
	private String   org_pret ;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate   prt_dat_acc ;
	private Long   prt_mnt_glb ;
	private Long   prt_taux  ;
	private Long   prt_ech ;
	private Long  delai_grace ;
	private Long  nbr_tranche ;
	private String  mod_remb;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate  prt_dat_deb;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate  prt_dat_fin ;
	private Long  prt_interet ;
	private Long  prt_mnt_rem;
	private Long  rem_men  ;
	private Long  dern_rem_men ;
	private Long  prt_rendu  ;
	private Long  nbr_retenue  ;
	private String  app_int_franch  ;
	private Long  int_franch;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate  dat_deblocage;
	private Long  prt_mnt_debloque ;
	private String  objet_pret  ;
	private String  ass_pret ;
	private String  cod_pret_ref ;
	private Long  annee_fond ;
	private String  cod_fond ;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate  dat_saisie ;
	private String  cod_user ;
	private Long  mnt_achat ;
	private String  obs_litige ;
	private String  derogation;
	private Long  sal_ref ;
	private String  ordonnance;
	private Long  seq_ecrt ;
	private String  ref_pret  ;
	private Long  int_grace ;
	private String  cod_alert ;
	private Long  seq_alert;
	private LocalDate  dat_validite ;
	private String  bonification  ;
	private Long  tmmplus   ;
	private String  prt_log   ;
	@Column(insertable = false, updatable = false)
	private String lib_groupe;
	@Column(insertable = false, updatable = false)
	private String lib_pret ;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public Long getCod_pret() {
		return cod_pret;
	}
	public void setCod_pret(Long cod_pret) {
		this.cod_pret = cod_pret;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getCod_categ() {
		return cod_categ;
	}
	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getCod_grad() {
		return cod_grad;
	}
	public void setCod_grad(String cod_grad) {
		this.cod_grad = cod_grad;
	}
	public String getAdm_tech() {
		return adm_tech;
	}
	public void setAdm_tech(String adm_tech) {
		this.adm_tech = adm_tech;
	}
	public String getCod_fonct() {
		return cod_fonct;
	}
	public void setCod_fonct(String cod_fonct) {
		this.cod_fonct = cod_fonct;
	}
	public String getCod_affect() {
		return cod_affect;
	}
	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}
	public String getCod_motif() {
		return cod_motif;
	}
	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}
	public Long getNum_dem_pret() {
		return num_dem_pret;
	}
	public void setNum_dem_pret(Long num_dem_pret) {
		this.num_dem_pret = num_dem_pret;
	}
	public String getCod_etat_pret() {
		return cod_etat_pret;
	}
	public void setCod_etat_pret(String cod_etat_pret) {
		this.cod_etat_pret = cod_etat_pret;
	}
	public String getTyp_etat() {
		return typ_etat;
	}
	public void setTyp_etat(String typ_etat) {
		this.typ_etat = typ_etat;
	}
	public String getCod_grp_pret() {
		return cod_grp_pret;
	}
	public void setCod_grp_pret(String cod_grp_pret) {
		this.cod_grp_pret = cod_grp_pret;
	}
	public String getTyp_pret() {
		return typ_pret;
	}
	public void setTyp_pret(String typ_pret) {
		this.typ_pret = typ_pret;
	}
	public String getAbrv_fixe() {
		return abrv_fixe;
	}
	public void setAbrv_fixe(String abrv_fixe) {
		this.abrv_fixe = abrv_fixe;
	}
	public String getOrg_pret() {
		return org_pret;
	}
	public void setOrg_pret(String org_pret) {
		this.org_pret = org_pret;
	}
	public LocalDate getPrt_dat_acc() {
		return prt_dat_acc;
	}
	public void setPrt_dat_acc(LocalDate prt_dat_acc) {
		this.prt_dat_acc = prt_dat_acc;
	}
	public Long getPrt_mnt_glb() {
		return prt_mnt_glb;
	}
	public void setPrt_mnt_glb(Long prt_mnt_glb) {
		this.prt_mnt_glb = prt_mnt_glb;
	}
	public Long getPrt_taux() {
		return prt_taux;
	}
	public void setPrt_taux(Long prt_taux) {
		this.prt_taux = prt_taux;
	}
	public Long getPrt_ech() {
		return prt_ech;
	}
	public void setPrt_ech(Long prt_ech) {
		this.prt_ech = prt_ech;
	}
	public Long getDelai_grace() {
		return delai_grace;
	}
	public void setDelai_grace(Long delai_grace) {
		this.delai_grace = delai_grace;
	}
	public Long getNbr_tranche() {
		return nbr_tranche;
	}
	public void setNbr_tranche(Long nbr_tranche) {
		this.nbr_tranche = nbr_tranche;
	}
	public String getMod_remb() {
		return mod_remb;
	}
	public void setMod_remb(String mod_remb) {
		this.mod_remb = mod_remb;
	}
	public LocalDate getPrt_dat_deb() {
		return prt_dat_deb;
	}
	public void setPrt_dat_deb(LocalDate prt_dat_deb) {
		this.prt_dat_deb = prt_dat_deb;
	}
	public LocalDate getPrt_dat_fin() {
		return prt_dat_fin;
	}
	public void setPrt_dat_fin(LocalDate prt_dat_fin) {
		this.prt_dat_fin = prt_dat_fin;
	}
	public Long getPrt_interet() {
		return prt_interet;
	}
	public void setPrt_interet(Long prt_interet) {
		this.prt_interet = prt_interet;
	}
	public Long getPrt_mnt_rem() {
		return prt_mnt_rem;
	}
	public void setPrt_mnt_rem(Long prt_mnt_rem) {
		this.prt_mnt_rem = prt_mnt_rem;
	}
	public Long getRem_men() {
		return rem_men;
	}
	public void setRem_men(Long rem_men) {
		this.rem_men = rem_men;
	}
	public Long getDern_rem_men() {
		return dern_rem_men;
	}
	public void setDern_rem_men(Long dern_rem_men) {
		this.dern_rem_men = dern_rem_men;
	}
	public Long getPrt_rendu() {
		return prt_rendu;
	}
	public void setPrt_rendu(Long prt_rendu) {
		this.prt_rendu = prt_rendu;
	}
	public Long getNbr_retenue() {
		return nbr_retenue;
	}
	public void setNbr_retenue(Long nbr_retenue) {
		this.nbr_retenue = nbr_retenue;
	}
	public String getApp_int_franch() {
		return app_int_franch;
	}
	public void setApp_int_franch(String app_int_franch) {
		this.app_int_franch = app_int_franch;
	}
	public Long getInt_franch() {
		return int_franch;
	}
	public void setInt_franch(Long int_franch) {
		this.int_franch = int_franch;
	}
	public LocalDate getDat_deblocage() {
		return dat_deblocage;
	}
	public void setDat_deblocage(LocalDate dat_deblocage) {
		this.dat_deblocage = dat_deblocage;
	}
	public Long getPrt_mnt_debloque() {
		return prt_mnt_debloque;
	}
	public void setPrt_mnt_debloque(Long prt_mnt_debloque) {
		this.prt_mnt_debloque = prt_mnt_debloque;
	}
	public String getObjet_pret() {
		return objet_pret;
	}
	public void setObjet_pret(String objet_pret) {
		this.objet_pret = objet_pret;
	}
	public String getAss_pret() {
		return ass_pret;
	}
	public void setAss_pret(String ass_pret) {
		this.ass_pret = ass_pret;
	}
	public String getCod_pret_ref() {
		return cod_pret_ref;
	}
	public void setCod_pret_ref(String cod_pret_ref) {
		this.cod_pret_ref = cod_pret_ref;
	}
	public Long getAnnee_fond() {
		return annee_fond;
	}
	public void setAnnee_fond(Long annee_fond) {
		this.annee_fond = annee_fond;
	}
	public String getCod_fond() {
		return cod_fond;
	}
	public void setCod_fond(String cod_fond) {
		this.cod_fond = cod_fond;
	}
	public LocalDate getDat_saisie() {
		return dat_saisie;
	}
	public void setDat_saisie(LocalDate dat_saisie) {
		this.dat_saisie = dat_saisie;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public Long getMnt_achat() {
		return mnt_achat;
	}
	public void setMnt_achat(Long mnt_achat) {
		this.mnt_achat = mnt_achat;
	}
	public String getObs_litige() {
		return obs_litige;
	}
	public void setObs_litige(String obs_litige) {
		this.obs_litige = obs_litige;
	}
	public String getDerogation() {
		return derogation;
	}
	public void setDerogation(String derogation) {
		this.derogation = derogation;
	}
	public Long getSal_ref() {
		return sal_ref;
	}
	public void setSal_ref(Long sal_ref) {
		this.sal_ref = sal_ref;
	}
	public String getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}
	public Long getSeq_ecrt() {
		return seq_ecrt;
	}
	public void setSeq_ecrt(Long seq_ecrt) {
		this.seq_ecrt = seq_ecrt;
	}
	public String getRef_pret() {
		return ref_pret;
	}
	public void setRef_pret(String ref_pret) {
		this.ref_pret = ref_pret;
	}
	public Long getInt_grace() {
		return int_grace;
	}
	public void setInt_grace(Long int_grace) {
		this.int_grace = int_grace;
	}
	public String getCod_alert() {
		return cod_alert;
	}
	public void setCod_alert(String cod_alert) {
		this.cod_alert = cod_alert;
	}
	public Long getSeq_alert() {
		return seq_alert;
	}
	public void setSeq_alert(Long seq_alert) {
		this.seq_alert = seq_alert;
	}
	public LocalDate getDat_validite() {
		return dat_validite;
	}
	public void setDat_validite(LocalDate dat_validite) {
		this.dat_validite = dat_validite;
	}
	public String getBonification() {
		return bonification;
	}
	public void setBonification(String bonification) {
		this.bonification = bonification;
	}
	public Long getTmmplus() {
		return tmmplus;
	}
	public void setTmmplus(Long tmmplus) {
		this.tmmplus = tmmplus;
	}
	public String getPrt_log() {
		return prt_log;
	}
	public void setPrt_log(String prt_log) {
		this.prt_log = prt_log;
	}
	
	public String getLib_groupe() {
		return lib_groupe;
	}
	public void setLib_groupe(String lib_groupe) {
		this.lib_groupe = lib_groupe;
	}
	public String getLib_pret() {
		return lib_pret;
	}
	public void setLib_pret(String lib_pret) {
		this.lib_pret = lib_pret;
	}
	public pret_pers(String cod_soc, String mat_pers, Long cod_pret, String cod_serv, String cod_categ, String cod_cat,
			String cod_grad, String adm_tech, String cod_fonct, String cod_affect, String cod_motif, Long num_dem_pret,
			String cod_etat_pret, String typ_etat, String cod_grp_pret, String typ_pret, String abrv_fixe,
			String org_pret, LocalDate prt_dat_acc, Long prt_mnt_glb, Long prt_taux, Long prt_ech, Long delai_grace,
			Long nbr_tranche, String mod_remb, LocalDate prt_dat_deb, LocalDate prt_dat_fin, Long prt_interet, Long prt_mnt_rem,
			Long rem_men, Long dern_rem_men, Long prt_rendu, Long nbr_retenue, String app_int_franch, Long int_franch,
			LocalDate dat_deblocage, Long prt_mnt_debloque, String objet_pret, String ass_pret, String cod_pret_ref,
			Long annee_fond, String cod_fond, LocalDate dat_saisie, String cod_user, Long mnt_achat, String obs_litige,
			String derogation, Long sal_ref, String ordonnance, Long seq_ecrt, String ref_pret, Long int_grace,
			String cod_alert, Long seq_alert, LocalDate dat_validite, String bonification, Long tmmplus, String prt_log) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pret = cod_pret;
		this.cod_serv = cod_serv;
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
		this.adm_tech = adm_tech;
		this.cod_fonct = cod_fonct;
		this.cod_affect = cod_affect;
		this.cod_motif = cod_motif;
		this.num_dem_pret = num_dem_pret;
		this.cod_etat_pret = cod_etat_pret;
		this.typ_etat = typ_etat;
		this.cod_grp_pret = cod_grp_pret;
		this.typ_pret = typ_pret;
		this.abrv_fixe = abrv_fixe;
		this.org_pret = org_pret;
		this.prt_dat_acc = prt_dat_acc;
		this.prt_mnt_glb = prt_mnt_glb;
		this.prt_taux = prt_taux;
		this.prt_ech = prt_ech;
		this.delai_grace = delai_grace;
		this.nbr_tranche = nbr_tranche;
		this.mod_remb = mod_remb;
		this.prt_dat_deb = prt_dat_deb;
		this.prt_dat_fin = prt_dat_fin;
		this.prt_interet = prt_interet;
		this.prt_mnt_rem = prt_mnt_rem;
		this.rem_men = rem_men;
		this.dern_rem_men = dern_rem_men;
		this.prt_rendu = prt_rendu;
		this.nbr_retenue = nbr_retenue;
		this.app_int_franch = app_int_franch;
		this.int_franch = int_franch;
		this.dat_deblocage = dat_deblocage;
		this.prt_mnt_debloque = prt_mnt_debloque;
		this.objet_pret = objet_pret;
		this.ass_pret = ass_pret;
		this.cod_pret_ref = cod_pret_ref;
		this.annee_fond = annee_fond;
		this.cod_fond = cod_fond;
		this.dat_saisie = dat_saisie;
		this.cod_user = cod_user;
		this.mnt_achat = mnt_achat;
		this.obs_litige = obs_litige;
		this.derogation = derogation;
		this.sal_ref = sal_ref;
		this.ordonnance = ordonnance;
		this.seq_ecrt = seq_ecrt;
		this.ref_pret = ref_pret;
		this.int_grace = int_grace;
		this.cod_alert = cod_alert;
		this.seq_alert = seq_alert;
		this.dat_validite = dat_validite;
		this.bonification = bonification;
		this.tmmplus = tmmplus;
		this.prt_log = prt_log;

	}
	public pret_pers() {
		super();
	}
	
	
	
	
	
}
