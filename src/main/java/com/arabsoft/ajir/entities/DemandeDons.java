package com.arabsoft.ajir.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="Demande_dons")
@IdClass(CleDemandeDons.class)
public class DemandeDons {
	@Id
	private String typ_don;
	@Id
	private String cod_soc	;
	@Id
	private String mat_pers;
	@Id
	private Long num_fam;
	@Id
	private Date dat_dem_don;
	private String nat_don;
	private Long mnt_dem_don;
	private String raison;
	private String etat_dem;
	private Long mnt_acc_don;
	private String etat_act;
	private String cod_lieu_geog;
	private String corps;
	private String cod_typ_depart;
	private String cod_affect;
	private Date dat_debut;
	private String cod_dest	;
	private String cod_fond	;
	private Date dat_deblocage;
	private String mode_payement;
	private Long ref_payement;
	private String 	num_piece;
	private String 	rib;
	private String cod_user;
	private Date dat_saisie;
	private String typ_benificiaire;
	private Long mnt_livre;
	private Long seq_ecrt;
	private String imput_cpt;
	private String ref_metier;
	private Long num_vir;
	private String nom;
	private String lib_depart;
	private String lib_lieu;
	private String lib_don;
	private String lib_affect;

	public String getTyp_don() {
		return typ_don;
	}
	public void setTyp_don(String typ_don) {
		this.typ_don = typ_don;
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
	public Long getNum_fam() {
		return num_fam;
	}
	public void setNum_fam(Long num_fam) {
		this.num_fam = num_fam;
	}
	public Date getDat_dem_don() {
		return dat_dem_don;
	}
	public void setDat_dem_don(Date dat_dem_don) {
		this.dat_dem_don = dat_dem_don;
	}
	public String getNat_don() {
		return nat_don;
	}
	public void setNat_don(String nat_don) {
		this.nat_don = nat_don;
	}
	public Long getMnt_dem_don() {
		return mnt_dem_don;
	}
	public void setMnt_dem_don(Long mnt_dem_don) {
		this.mnt_dem_don = mnt_dem_don;
	}
	public String getRaison() {
		return raison;
	}
	public void setRaison(String raison) {
		this.raison = raison;
	}
	public String getEtat_dem() {
		return etat_dem;
	}
	public void setEtat_dem(String etat_dem) {
		this.etat_dem = etat_dem;
	}
	public Long getMnt_acc_don() {
		return mnt_acc_don;
	}
	public void setMnt_acc_don(Long mnt_acc_don) {
		this.mnt_acc_don = mnt_acc_don;
	}
	public String getEtat_act() {
		return etat_act;
	}
	public void setEtat_act(String etat_act) {
		this.etat_act = etat_act;
	}
	public String getCod_lieu_geog() {
		return cod_lieu_geog;
	}
	public void setCod_lieu_geog(String cod_lieu_geog) {
		this.cod_lieu_geog = cod_lieu_geog;
	}
	public String getCorps() {
		return corps;
	}
	public void setCorps(String corps) {
		this.corps = corps;
	}
	public String getCod_typ_depart() {
		return cod_typ_depart;
	}
	public void setCod_typ_depart(String cod_typ_depart) {
		this.cod_typ_depart = cod_typ_depart;
	}
	public String getCod_affect() {
		return cod_affect;
	}
	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}
	public Date getDat_debut() {
		return dat_debut;
	}
	public void setDat_debut(Date dat_debut) {
		this.dat_debut = dat_debut;
	}
	public String getCod_dest() {
		return cod_dest;
	}
	public void setCod_dest(String cod_dest) {
		this.cod_dest = cod_dest;
	}
	public String getCod_fond() {
		return cod_fond;
	}
	public void setCod_fond(String cod_fond) {
		this.cod_fond = cod_fond;
	}
	public Date getDat_deblocage() {
		return dat_deblocage;
	}
	public void setDat_deblocage(Date dat_deblocage) {
		this.dat_deblocage = dat_deblocage;
	}
	public String getMode_payement() {
		return mode_payement;
	}
	public void setMode_payement(String mode_payement) {
		this.mode_payement = mode_payement;
	}
	public Long getRef_payement() {
		return ref_payement;
	}
	public void setRef_payement(Long ref_payement) {
		this.ref_payement = ref_payement;
	}
	public String getNum_piece() {
		return num_piece;
	}
	public void setNum_piece(String num_piece) {
		this.num_piece = num_piece;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public Date getDat_saisie() {
		return dat_saisie;
	}
	public void setDat_saisie(Date dat_saisie) {
		this.dat_saisie = dat_saisie;
	}
	public String getTyp_benificiaire() {
		return typ_benificiaire;
	}
	public void setTyp_benificiaire(String typ_benificiaire) {
		this.typ_benificiaire = typ_benificiaire;
	}
	public Long getMnt_livre() {
		return mnt_livre;
	}
	public void setMnt_livre(Long mnt_livre) {
		this.mnt_livre = mnt_livre;
	}
	public Long getSeq_ecrt() {
		return seq_ecrt;
	}
	public void setSeq_ecrt(Long seq_ecrt) {
		this.seq_ecrt = seq_ecrt;
	}
	public String getImput_cpt() {
		return imput_cpt;
	}
	public void setImput_cpt(String imput_cpt) {
		this.imput_cpt = imput_cpt;
	}
	public String getRef_metier() {
		return ref_metier;
	}
	public void setRef_metier(String ref_metier) {
		this.ref_metier = ref_metier;
	}
	public Long getNum_vir() {
		return num_vir;
	}
	public void setNum_vir(Long num_vir) {
		this.num_vir = num_vir;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLib_depart() {
		return lib_depart;
	}
	public void setLib_depart(String lib_depart) {
		this.lib_depart = lib_depart;
	}
	public String getLib_lieu() {
		return lib_lieu;
	}
	public void setLib_lieu(String lib_lieu) {
		this.lib_lieu = lib_lieu;
	}
	public String getLib_don() {
		return lib_don;
	}
	public void setLib_don(String lib_don) {
		this.lib_don = lib_don;
	}
	public String getLib_affect() {
		return lib_affect;
	}
	public void setLib_affect(String lib_affect) {
		this.lib_affect = lib_affect;
	}
	
	


}
