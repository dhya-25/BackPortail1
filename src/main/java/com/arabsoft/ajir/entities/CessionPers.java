package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@IdClass(CleCessionPers.class)
public class CessionPers implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	
	
	@Id
	private String cod_soc;
	@Id
	private String mat_pers;
	@Id
	private Integer cod_pret;
	
	private String npers;
	public String cod_etat_pret;
	public String typ_etat;
	public String cod_grp_pret;
	public String typ_pret;
	public String abrv_fixe;
	public String org_pret;
	public String rib_pers;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public LocalDate prt_dat_dem;
	public Long prt_mnt_dem;
	public Long prt_mnt_glb;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public LocalDate prt_dat_deb;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public LocalDate prt_dat_fin;
	public Long prt_ech;
	public Long rem_men;
	public Long dern_rem_men;
	public Long prt_rendu;
	public Long nbr_retenue;
	public String objet_pret;
	public String objet_pret_a;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public LocalDate dat_saisie;
	public String ordonnance;
	public Long seq_ecrt;
	public String ref_pret;
	@Column(insertable = false, updatable = false)
	public String lib_groupe;
	
	
	@Transient
	private List<LigCession> ligCession;
	@Column(insertable = false, updatable = false)
	private String lib_pret;
	
	
	public CessionPers(String cod_soc, String mat_pers, Integer cod_pret, String npers, String cod_etat_pret,
			String typ_etat, String cod_grp_pret, String typ_pret, String abrv_fixe, String org_pret, String rib_pers,
			LocalDate prt_dat_dem, Long prt_mnt_dem, Long prt_mnt_glb, LocalDate prt_dat_deb, LocalDate prt_dat_fin, Long prt_ech,
			Long rem_men, Long dern_rem_men, Long prt_rendu, Long nbr_retenue, String objet_pret, String objet_pret_a,
			LocalDate dat_saisie, String ordonnance, Long seq_ecrt, String ref_pret, 
			 List<LigCession> ligCession, String lib_pret) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pret = cod_pret;
		this.npers = npers;
		this.cod_etat_pret = cod_etat_pret;
		this.typ_etat = typ_etat;
		this.cod_grp_pret = cod_grp_pret;
		this.typ_pret = typ_pret;
		this.abrv_fixe = abrv_fixe;
		this.org_pret = org_pret;
		this.rib_pers = rib_pers;
		this.prt_dat_dem = prt_dat_dem;
		this.prt_mnt_dem = prt_mnt_dem;
		this.prt_mnt_glb = prt_mnt_glb;
		this.prt_dat_deb = prt_dat_deb;
		this.prt_dat_fin = prt_dat_fin;
		this.prt_ech = prt_ech;
		this.rem_men = rem_men;
		this.dern_rem_men = dern_rem_men;
		this.prt_rendu = prt_rendu;
		this.nbr_retenue = nbr_retenue;
		this.objet_pret = objet_pret;
		this.objet_pret_a = objet_pret_a;
		this.dat_saisie = dat_saisie;
		this.ordonnance = ordonnance;
		this.seq_ecrt = seq_ecrt;
		this.ref_pret = ref_pret;
		this.ligCession = ligCession;
		this.lib_pret = lib_pret;
	}


	public String getLib_pret() {
		return lib_pret;
	}


	public void setLib_pret(String lib_pret) {
		this.lib_pret = lib_pret;
	}


	public String getNpers() {
		return npers;
	}


	public void setNpers(String npers) {
		this.npers = npers;
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


	public Integer getCod_pret() {
		return cod_pret;
	}


	public void setCod_pret(Integer cod_pret) {
		this.cod_pret = cod_pret;
	}


	public String getnPers() {
		return npers;
	}


	public void setnPers(String nPers) {
		this.npers = nPers;
	}


	public String getLib_groupe() {
		return lib_groupe;
	}


	public void setLib_groupe(String lib_groupe) {
		this.lib_groupe = lib_groupe;
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


	public String getRib_pers() {
		return rib_pers;
	}


	public void setRib_pers(String rib_pers) {
		this.rib_pers = rib_pers;
	}


	public LocalDate getPrt_dat_dem() {
		return prt_dat_dem;
	}


	public void setPrt_dat_dem(LocalDate prt_dat_dem) {
		this.prt_dat_dem = prt_dat_dem;
	}


	public Long getPrt_mnt_dem() {
		return prt_mnt_dem;
	}


	public void setPrt_mnt_dem(Long prt_mnt_dem) {
		this.prt_mnt_dem = prt_mnt_dem;
	}


	public Long getPrt_mnt_glb() {
		return prt_mnt_glb;
	}


	public void setPrt_mnt_glb(Long prt_mnt_glb) {
		this.prt_mnt_glb = prt_mnt_glb;
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


	public Long getPrt_ech() {
		return prt_ech;
	}


	public void setPrt_ech(Long prt_ech) {
		this.prt_ech = prt_ech;
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


	public String getObjet_pret() {
		return objet_pret;
	}


	public void setObjet_pret(String objet_pret) {
		this.objet_pret = objet_pret;
	}


	public String getObjet_pret_a() {
		return objet_pret_a;
	}


	public void setObjet_pret_a(String objet_pret_a) {
		this.objet_pret_a = objet_pret_a;
	}


	public LocalDate getDat_saisie() {
		return dat_saisie;
	}


	public void setDat_saisie(LocalDate dat_saisie) {
		this.dat_saisie = dat_saisie;
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







	public List<LigCession> getLigCession() {
		return ligCession;
	}


	public void setLigCession(List<LigCession> ligCession) {
		this.ligCession = ligCession;
	}


	

	public CessionPers() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Personnel {cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + "}";
	}
	


}