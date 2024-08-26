package com.arabsoft.ajir.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(Id_MOUVEMENT_PERS.class)

public class MOUVEMENT_PERS {
	@Id
	private String cod_soc;
	@Id
	private String mat_pers;
	@Id
	private Long num_mvt;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dat_mvt;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dat_effet;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dat_decision;
	private String num_decision;
	private String etat_mvt;
	private String cod_mvt;
	private String cod_dept;
	private String cod_serv;
	private String org_serv;
	private String cod_lieu_geog;
	private String qualf;
	private String adm_tech;
	private String cod_class;
	private String cod_fil;
	private String cod_categ;
	private String cod_cat;
	private String cod_grad;
	private String cod_ech;
	private String cod_fonct;
	private String cod_affect;
	private String cod_motif;
	private String cod_typ_depart;
	private String cod_metier;
	private String cod_post;
	private Long niv_sal;
	private String ncod_dept;
	private String ncod_serv;
	private String norg_serv;
	private String ncod_lieu_geog;
	private String nqualf;
	private String nadm_tech;
	private String ncod_class;
	private String ncod_fil;
	private String ncod_categ;
	private String ncod_cat;
	private String ncod_grad;
	private String ncod_ech;
	private String ncod_fonct;
	private String ncod_affect;
	private String ncod_motif;
	private String ncod_typ_depart;
	private String ncod_metier;
	private String ncod_post;
	private Long nniv_sal;
	private String ref_mvt;
	private String ordonnance;
	private String etat_act;
	private String val_pers;
	private String reg_post;
	private String nreg_post;

	private String libmvt;
	@Column(insertable = false, updatable = false)

	private String libcaeg;
	
	//@Column(insertable = false, updatable = false)
	//private String nLibcat;
//	@Column(insertable = false, updatable = false)
//	private String libcat;
	@Column(insertable = false, updatable = false)

	private String libgrade;
	@Column(insertable = false, updatable = false)

	private String lib_affect;
	@Column(insertable = false, updatable = false)

	private String lib_etat_act;
	@Column(insertable = false, updatable = false)

	private String lib_serv;
	@Column(insertable = false, updatable = false)

	private String lib_adm_tech;
	@Column(insertable = false, updatable = false)

	private String nlibcaeg;
	@Column(insertable = false, updatable = false)

	private String nlibgrade;
	@Column(insertable = false, updatable = false)

	private String nlib_affect;
	@Column(insertable = false, updatable = false)

	private String nlib_serv;
	@Column(insertable = false, updatable = false)

	private String nlib_adm_tech;
	@Column(insertable = false, updatable = false)

	private String nlib_fil;
	@Column(insertable = false, updatable = false)

	private String lib_lieu_geog ;
	@Column(insertable = false, updatable = false)

	private String nlib_lieu_geog ;

	
	


	public MOUVEMENT_PERS(String cod_soc, String mat_pers, Long num_mvt, LocalDate dat_mvt, LocalDate dat_effet,
			LocalDate dat_decision, String num_decision, String etat_mvt, String cod_mvt, String cod_dept, String cod_serv,
			String org_serv, String cod_lieu_geog, String qualf, String adm_tech, String cod_class, String cod_fil,
			String cod_categ, String cod_cat, String cod_grad, String cod_ech, String cod_fonct, String cod_affect,
			String cod_motif, String cod_typ_depart, String cod_metier, String cod_post, Long niv_sal, String ncod_dept,
			String ncod_serv, String norg_serv, String ncod_lieu_geog, String nqualf, String nadm_tech,
			String ncod_class, String ncod_fil, String ncod_categ, String ncod_cat, String ncod_grad, String ncod_ech,
			String ncod_fonct, String ncod_affect, String ncod_motif, String ncod_typ_depart, String ncod_metier,
			String ncod_post, Long nniv_sal, String ref_mvt, String ordonnance, String etat_act, String val_pers,
			String reg_post, String nreg_post, String libmvt, String libcaeg, String nLibcat, String libgrade,
			String lib_affect, String lib_etat_act, String lib_serv, String lib_adm_tech, String nlibcaeg,
			String nlibgrade, String nlib_affect, String nlib_serv, String nlib_adm_tech, String nlib_fil,
			String lib_lieu_geog, String nlib_lieu_geog) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_mvt = num_mvt;
		this.dat_mvt = dat_mvt;
		this.dat_effet = dat_effet;
		this.dat_decision = dat_decision;
		this.num_decision = num_decision;
		this.etat_mvt = etat_mvt;
		this.cod_mvt = cod_mvt;
		this.cod_dept = cod_dept;
		this.cod_serv = cod_serv;
		this.org_serv = org_serv;
		this.cod_lieu_geog = cod_lieu_geog;
		this.qualf = qualf;
		this.adm_tech = adm_tech;
		this.cod_class = cod_class;
		this.cod_fil = cod_fil;
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
		this.cod_ech = cod_ech;
		this.cod_fonct = cod_fonct;
		this.cod_affect = cod_affect;
		this.cod_motif = cod_motif;
		this.cod_typ_depart = cod_typ_depart;
		this.cod_metier = cod_metier;
		this.cod_post = cod_post;
		this.niv_sal = niv_sal;
		this.ncod_dept = ncod_dept;
		this.ncod_serv = ncod_serv;
		this.norg_serv = norg_serv;
		this.ncod_lieu_geog = ncod_lieu_geog;
		this.nqualf = nqualf;
		this.nadm_tech = nadm_tech;
		this.ncod_class = ncod_class;
		this.ncod_fil = ncod_fil;
		this.ncod_categ = ncod_categ;
		this.ncod_cat = ncod_cat;
		this.ncod_grad = ncod_grad;
		this.ncod_ech = ncod_ech;
		this.ncod_fonct = ncod_fonct;
		this.ncod_affect = ncod_affect;
		this.ncod_motif = ncod_motif;
		this.ncod_typ_depart = ncod_typ_depart;
		this.ncod_metier = ncod_metier;
		this.ncod_post = ncod_post;
		this.nniv_sal = nniv_sal;
		this.ref_mvt = ref_mvt;
		this.ordonnance = ordonnance;
		this.etat_act = etat_act;
		this.val_pers = val_pers;
		this.reg_post = reg_post;
		this.nreg_post = nreg_post;
		this.libmvt = libmvt;
		this.libcaeg = libcaeg;
		//this.nLibcat = nLibcat;
		this.libgrade = libgrade;
		this.lib_affect = lib_affect;
		this.lib_etat_act = lib_etat_act;
		this.lib_serv = lib_serv;
		this.lib_adm_tech = lib_adm_tech;
		this.nlibcaeg = nlibcaeg;
		this.nlibgrade = nlibgrade;
		this.nlib_affect = nlib_affect;
		this.nlib_serv = nlib_serv;
		this.nlib_adm_tech = nlib_adm_tech;
		this.nlib_fil = nlib_fil;
		this.lib_lieu_geog = lib_lieu_geog;
		this.nlib_lieu_geog = nlib_lieu_geog;
	}

	public String getLib_lieu_geog() {
		return lib_lieu_geog;
	}

	public void setLib_lieu_geog(String lib_lieu_geog) {
		this.lib_lieu_geog = lib_lieu_geog;
	}

	public String getNlib_lieu_geog() {
		return nlib_lieu_geog;
	}

	public void setNlib_lieu_geog(String nlib_lieu_geog) {
		this.nlib_lieu_geog = nlib_lieu_geog;
	}

	public String getNlib_adm_tech() {
		return nlib_adm_tech;
	}

	public void setNlib_adm_tech(String nlib_adm_tech) {
		this.nlib_adm_tech = nlib_adm_tech;
	}

	public String getNlib_fil() {
		return nlib_fil;
	}

	public void setNlib_fil(String nlib_fil) {
		this.nlib_fil = nlib_fil;
	}

//	public String getnLibcat() {
//		return nLibcat;
//	}
//
//	public void setnLibcat(String nLibcat) {
//		this.nLibcat = nLibcat;
//	}
//
//	public String getLibcat() {
//		return libcat;
//	}
//
//	public void setLibcat(String libcat) {
//		this.libcat = libcat;
//	}

	
	public String getNlibcaeg() {
		return nlibcaeg;
	}

	public void setNlibcaeg(String nlibcaeg) {
		this.nlibcaeg = nlibcaeg;
	}

	public String getNlibgrade() {
		return nlibgrade;
	}

	public void setNlibgrade(String nlibgrade) {
		this.nlibgrade = nlibgrade;
	}

	public String getNlib_affect() {
		return nlib_affect;
	}

	public void setNlib_affect(String nlib_affect) {
		this.nlib_affect = nlib_affect;
	}

	public String getNlib_serv() {
		return nlib_serv;
	}

	public void setNlib_serv(String nlib_serv) {
		this.nlib_serv = nlib_serv;
	}

	

	public String getLibmvt() {
		return libmvt;
	}

	public void setLibmvt(String libmvt) {
		this.libmvt = libmvt;
	}

	public String getLibcaeg() {
		return libcaeg;
	}

	public void setLibcaeg(String libcaeg) {
		this.libcaeg = libcaeg;
	}

	public String getLibgrade() {
		return libgrade;
	}

	public void setLibgrade(String libgrade) {
		this.libgrade = libgrade;
	}

	public String getLib_affect() {
		return lib_affect;
	}

	public void setLib_affect(String lib_affect) {
		this.lib_affect = lib_affect;
	}

	public String getLib_etat_act() {
		return lib_etat_act;
	}

	public void setLib_etat_act(String lib_etat_act) {
		this.lib_etat_act = lib_etat_act;
	}

	public String getLib_serv() {
		return lib_serv;
	}

	public void setLib_serv(String lib_serv) {
		this.lib_serv = lib_serv;
	}

	public String getLib_adm_tech() {
		return lib_adm_tech;
	}

	public void setLib_adm_tech(String lib_adm_tech) {
		this.lib_adm_tech = lib_adm_tech;
	}

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

	public Long getNum_mvt() {
		return num_mvt;
	}

	public void setNum_mvt(Long num_mvt) {
		this.num_mvt = num_mvt;
	}

	public LocalDate getDat_mvt() {
		return dat_mvt;
	}

	public void setDat_mvt(LocalDate dat_mvt) {
		this.dat_mvt = dat_mvt;
	}

	public LocalDate getDat_effet() {
		return dat_effet;
	}

	public void setDat_effet(LocalDate dat_effet) {
		this.dat_effet = dat_effet;
	}

	public LocalDate getDat_decision() {
		return dat_decision;
	}

	public void setDat_decision(LocalDate dat_decision) {
		this.dat_decision = dat_decision;
	}

	public String getNum_decision() {
		return num_decision;
	}

	public void setNum_decision(String num_decision) {
		this.num_decision = num_decision;
	}

	public String getEtat_mvt() {
		return etat_mvt;
	}

	public void setEtat_mvt(String etat_mvt) {
		this.etat_mvt = etat_mvt;
	}

	public String getCod_mvt() {
		return cod_mvt;
	}

	public void setCod_mvt(String cod_mvt) {
		this.cod_mvt = cod_mvt;
	}

	public String getCod_dept() {
		return cod_dept;
	}

	public void setCod_dept(String cod_dept) {
		this.cod_dept = cod_dept;
	}

	public String getCod_serv() {
		return cod_serv;
	}

	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}

	public String getOrg_serv() {
		return org_serv;
	}

	public void setOrg_serv(String org_serv) {
		this.org_serv = org_serv;
	}

	public String getCod_lieu_geog() {
		return cod_lieu_geog;
	}

	public void setCod_lieu_geog(String cod_lieu_geog) {
		this.cod_lieu_geog = cod_lieu_geog;
	}

	public String getQualf() {
		return qualf;
	}

	public void setQualf(String qualf) {
		this.qualf = qualf;
	}

	public String getAdm_tech() {
		return adm_tech;
	}

	public void setAdm_tech(String adm_tech) {
		this.adm_tech = adm_tech;
	}

	public String getCod_class() {
		return cod_class;
	}

	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}

	public String getCod_fil() {
		return cod_fil;
	}

	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
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

	public String getCod_ech() {
		return cod_ech;
	}

	public void setCod_ech(String cod_ech) {
		this.cod_ech = cod_ech;
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

	public String getCod_typ_depart() {
		return cod_typ_depart;
	}

	public void setCod_typ_depart(String cod_typ_depart) {
		this.cod_typ_depart = cod_typ_depart;
	}

	public String getCod_metier() {
		return cod_metier;
	}

	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}

	public String getCod_post() {
		return cod_post;
	}

	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}

	public Long getNiv_sal() {
		return niv_sal;
	}

	public void setNiv_sal(Long niv_sal) {
		this.niv_sal = niv_sal;
	}

	public String getNcod_dept() {
		return ncod_dept;
	}

	public void setNcod_dept(String ncod_dept) {
		this.ncod_dept = ncod_dept;
	}

	public String getNcod_serv() {
		return ncod_serv;
	}

	public void setNcod_serv(String ncod_serv) {
		this.ncod_serv = ncod_serv;
	}

	public String getNorg_serv() {
		return norg_serv;
	}

	public void setNorg_serv(String norg_serv) {
		this.norg_serv = norg_serv;
	}

	public String getNcod_lieu_geog() {
		return ncod_lieu_geog;
	}

	public void setNcod_lieu_geog(String ncod_lieu_geog) {
		this.ncod_lieu_geog = ncod_lieu_geog;
	}

	public String getNqualf() {
		return nqualf;
	}

	public void setNqualf(String nqualf) {
		this.nqualf = nqualf;
	}

	public String getNadm_tech() {
		return nadm_tech;
	}

	public void setNadm_tech(String nadm_tech) {
		this.nadm_tech = nadm_tech;
	}

	public String getNcod_class() {
		return ncod_class;
	}

	public void setNcod_class(String ncod_class) {
		this.ncod_class = ncod_class;
	}

	public String getNcod_fil() {
		return ncod_fil;
	}

	public void setNcod_fil(String ncod_fil) {
		this.ncod_fil = ncod_fil;
	}

	public String getNcod_categ() {
		return ncod_categ;
	}

	public void setNcod_categ(String ncod_categ) {
		this.ncod_categ = ncod_categ;
	}

	public String getNcod_cat() {
		return ncod_cat;
	}

	public void setNcod_cat(String ncod_cat) {
		this.ncod_cat = ncod_cat;
	}

	public String getNcod_grad() {
		return ncod_grad;
	}

	public void setNcod_grad(String ncod_grad) {
		this.ncod_grad = ncod_grad;
	}

	public String getNcod_ech() {
		return ncod_ech;
	}

	public void setNcod_ech(String ncod_ech) {
		this.ncod_ech = ncod_ech;
	}

	public String getNcod_fonct() {
		return ncod_fonct;
	}

	public void setNcod_fonct(String ncod_fonct) {
		this.ncod_fonct = ncod_fonct;
	}

	public String getNcod_affect() {
		return ncod_affect;
	}

	public void setNcod_affect(String ncod_affect) {
		this.ncod_affect = ncod_affect;
	}

	public String getNcod_motif() {
		return ncod_motif;
	}

	public void setNcod_motif(String ncod_motif) {
		this.ncod_motif = ncod_motif;
	}

	public String getNcod_typ_depart() {
		return ncod_typ_depart;
	}

	public void setNcod_typ_depart(String ncod_typ_depart) {
		this.ncod_typ_depart = ncod_typ_depart;
	}

	public String getNcod_metier() {
		return ncod_metier;
	}

	public void setNcod_metier(String ncod_metier) {
		this.ncod_metier = ncod_metier;
	}

	public String getNcod_post() {
		return ncod_post;
	}

	public void setNcod_post(String ncod_post) {
		this.ncod_post = ncod_post;
	}

	public Long getNniv_sal() {
		return nniv_sal;
	}

	public void setNniv_sal(Long nniv_sal) {
		this.nniv_sal = nniv_sal;
	}

	public String getRef_mvt() {
		return ref_mvt;
	}

	public void setRef_mvt(String ref_mvt) {
		this.ref_mvt = ref_mvt;
	}

	public String getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}

	public String getEtat_act() {
		return etat_act;
	}

	public void setEtat_act(String etat_act) {
		this.etat_act = etat_act;
	}

	public String getVal_pers() {
		return val_pers;
	}

	public void setVal_pers(String val_pers) {
		this.val_pers = val_pers;
	}

	public String getReg_post() {
		return reg_post;
	}

	public void setReg_post(String reg_post) {
		this.reg_post = reg_post;
	}

	public String getNreg_post() {
		return nreg_post;
	}

	public void setNreg_post(String nreg_post) {
		this.nreg_post = nreg_post;
	}


	public MOUVEMENT_PERS() {
		super();
	}


}
