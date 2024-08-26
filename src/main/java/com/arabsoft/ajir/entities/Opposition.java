package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Opposition {
	@Id
	private Integer cod_pret;
	private String libpret;
	public Integer getCod_pret() {
		return cod_pret;
	}
	public void setCod_pret(Integer cod_pret) {
		this.cod_pret = cod_pret;
	}
	public String getLibpret() {
		return libpret;
	}
	public void setLibpret(String libpret) {
		this.libpret = libpret;
	}
	public Opposition() {
		super();
	}
	public Opposition(Integer cod_pret, String libpret) {
		super();
		this.cod_pret = cod_pret;
		this.libpret = libpret;
	}
	

}
