package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(ID_Interim_Cng.class)

public class InterimEntity {
	@Id
	  private long id_libre_demande;
	@Id
	  private String mat_pers_int  ;  
	  private String cod_soc   ;  
		@JsonFormat(pattern = "dd/MM/yyyy")

	 private Date  dat_debut_int    ;
		@JsonFormat(pattern = "dd/MM/yyyy")

	 private Date dat_fin_int ;   
	 private Date  dat_decision  ;  
	 private String  num_decision    ;
	 private String nature_int      ;
	 private String ordonance       ;
	 private Long  mnt_int        ;
	 private String cod_ur          ;
	 private String  cod_serv        ;
	  private String  cod_motif       ;
	  private String  cod_affect      ;
	  private String  cod_class       ;
	  private String  regime_trav      ;
	  @Column(insertable = false,updatable = false)
	  private String nom;
	  @Column(insertable = false,updatable = false)
	  private String prenom;
	  
	  
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public long getId_libre_demande() {
		return id_libre_demande;
	}
	public void setId_libre_demande(long id_libre_demande) {
		this.id_libre_demande = id_libre_demande;
	}
	public String getMat_pers_int() {
		return mat_pers_int;
	}
	public void setMat_pers_int(String mat_pers_int) {
		this.mat_pers_int = mat_pers_int;
	}
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public Date getDat_debut_int() {
		return dat_debut_int;
	}
	public void setDat_debut_int(Date dat_debut_int) {
		this.dat_debut_int = dat_debut_int;
	}
	public Date getDat_fin_int() {
		return dat_fin_int;
	}
	public void setDat_fin_int(Date dat_fin_int) {
		this.dat_fin_int = dat_fin_int;
	}
	public Date getDat_decision() {
		return dat_decision;
	}
	public void setDat_decision(Date dat_decision) {
		this.dat_decision = dat_decision;
	}
	public String getNum_decision() {
		return num_decision;
	}
	public void setNum_decision(String num_decision) {
		this.num_decision = num_decision;
	}
	public String getNature_int() {
		return nature_int;
	}
	public void setNature_int(String nature_int) {
		this.nature_int = nature_int;
	}
	public String getOrdonance() {
		return ordonance;
	}
	public void setOrdonance(String ordonance) {
		this.ordonance = ordonance;
	}
	public Long getMnt_int() {
		return mnt_int;
	}
	public void setMnt_int(Long mnt_int) {
		this.mnt_int = mnt_int;
	}
	public String getCod_ur() {
		return cod_ur;
	}
	public void setCod_ur(String cod_ur) {
		this.cod_ur = cod_ur;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getCod_motif() {
		return cod_motif;
	}
	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}
	public String getCod_affect() {
		return cod_affect;
	}
	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}
	public String getCod_class() {
		return cod_class;
	}
	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}
	public String getRegime_trav() {
		return regime_trav;
	}
	public void setRegime_trav(String regime_trav) {
		this.regime_trav = regime_trav;
	}
	  
	 
}
