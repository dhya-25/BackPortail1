package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Competence_P {
	@Id
	private String cod_comp;
	private String lib_comp;
	private String coef_pond;
	private String cod_niv;
	private String	libnivcmp;
	private String pourcentage;
	
	
	public String getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(String pourcentage) {
		this.pourcentage = pourcentage;
	}
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}
	public String getLib_comp() {
		return lib_comp;
	}
	public void setLib_comp(String lib_comp) {
		this.lib_comp = lib_comp;
	}
	public String getCoef_pond() {
		return coef_pond;
	}
	public void setCoef_pond(String coef_pond) {
		this.coef_pond = coef_pond;
	}
	public String getCod_niv() {
		return cod_niv;
	}
	public void setCod_niv(String cod_niv) {
		this.cod_niv = cod_niv;
	}
	public String getLibnivcmp() {
		return libnivcmp;
	}
	public void setLibnivcmp(String libnivcmp) {
		this.libnivcmp = libnivcmp;
	}
	
	
	
}

