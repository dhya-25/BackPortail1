package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ECHELON {
	@Id
	private Long cod_ech   ;
	private Long  duree_ech ;

	public Long getCod_ech() {
		return cod_ech;
	}
	public void setCod_ech(Long cod_ech) {
		this.cod_ech = cod_ech;
	}
	public Long getDuree_ech() {
		return duree_ech;
	}
	public void setDuree_ech(Long duree_ech) {
		this.duree_ech = duree_ech;
	}

	public ECHELON() {
		super();
	}
	public ECHELON(Long cod_ech, Long duree_ech) {
		super();
		this.cod_ech = cod_ech;
		this.duree_ech = duree_ech;

	}

}
