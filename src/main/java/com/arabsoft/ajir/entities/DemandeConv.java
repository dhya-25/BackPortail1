package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="Demande_conv")
@IdClass(CleDemandeConv.class)
public class DemandeConv {

	@Id
	private String cod_conv;
	@Id
	private String  cod_soc;
	@Id
	private String  mat_pers;
	private Date  dat_dem_conv;
	private String  etat_dem;
	private Date  dat_saisie;
	private String 	cod_user;
	private Date  dat_min_fin;
	private String  obs	;
	private String  cod_lieu_geog;
	private String  	cod_typ_depart;
	private String  	cod_affect;
	private Date  dat_susp;
	private String  cin	;
	private String libelle_conv;
	public String getCod_conv() {
		return cod_conv;
	}
	public void setCod_conv(String cod_conv) {
		this.cod_conv = cod_conv;
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
	public Date getDat_dem_conv() {
		return dat_dem_conv;
	}
	public void setDat_dem_conv(Date dat_dem_conv) {
		this.dat_dem_conv = dat_dem_conv;
	}
	public String getEtat_dem() {
		return etat_dem;
	}
	public void setEtat_dem(String etat_dem) {
		this.etat_dem = etat_dem;
	}
	public Date getDat_saisie() {
		return dat_saisie;
	}
	public void setDat_saisie(Date dat_saisie) {
		this.dat_saisie = dat_saisie;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public Date getDat_min_fin() {
		return dat_min_fin;
	}
	public void setDat_min_fin(Date dat_min_fin) {
		this.dat_min_fin = dat_min_fin;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getCod_lieu_geog() {
		return cod_lieu_geog;
	}
	public void setCod_lieu_geog(String cod_lieu_geog) {
		this.cod_lieu_geog = cod_lieu_geog;
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
	public Date getDat_susp() {
		return dat_susp;
	}
	public void setDat_susp(Date dat_susp) {
		this.dat_susp = dat_susp;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getLibelle_conv() {
		return libelle_conv;
	}
	public void setLibelle_conv(String libelle_conv) {
		this.libelle_conv = libelle_conv;
	}
	
	

}
