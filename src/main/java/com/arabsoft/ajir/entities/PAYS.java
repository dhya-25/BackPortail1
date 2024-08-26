package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PAYS {
	@Id
	private String cod_pays    ;
	private String  lib_pays    ;
	private String  abrv_pays   ;
	private String  continent  ;
	private String  lib_pays_a ;
	private String  abrv_pays_a ;
	public String getCod_pays() {
		return cod_pays;
	}
	public void setCod_pays(String cod_pays) {
		this.cod_pays = cod_pays;
	}
	public String getLib_pays() {
		return lib_pays;
	}
	public void setLib_pays(String lib_pays) {
		this.lib_pays = lib_pays;
	}
	public String getAbrv_pays() {
		return abrv_pays;
	}
	public void setAbrv_pays(String abrv_pays) {
		this.abrv_pays = abrv_pays;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getLib_pays_a() {
		return lib_pays_a;
	}
	public void setLib_pays_a(String lib_pays_a) {
		this.lib_pays_a = lib_pays_a;
	}
	public String getAbrv_pays_a() {
		return abrv_pays_a;
	}
	public void setAbrv_pays_a(String abrv_pays_a) {
		this.abrv_pays_a = abrv_pays_a;
	}
	
	public PAYS() {
		super();
	}
	public PAYS(String cod_pays, String lib_pays, String abrv_pays, String continent, String lib_pays_a,
			String abrv_pays_a) {
		super();
		this.cod_pays = cod_pays;
		this.lib_pays = lib_pays;
		this.abrv_pays = abrv_pays;
		this.continent = continent;
		this.lib_pays_a = lib_pays_a;
		this.abrv_pays_a = abrv_pays_a;

	}}