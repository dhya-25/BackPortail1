package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Decision {
	private String	cod_soc;
	@Id
	private Long	num;
	private String	nom;
	private String	nom_a;
	private String	typ_dec;
	private String	cod_affect;


	
	
	
	public String getCod_soc() {
		return cod_soc;
	}

	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom_a() {
		return nom_a;
	}

	public void setNom_a(String nom_a) {
		this.nom_a = nom_a;
	}

	public String getTyp_dec() {
		return typ_dec;
	}

	public void setTyp_dec(String typ_dec) {
		this.typ_dec = typ_dec;
	}

	public String getCod_affect() {
		return cod_affect;
	}

	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}



	public Decision() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
//select cod_soc,
//num,
//nom,
//nom_a,
//typ_dec,
//cod_affect,
//id_decision,
//nom_rdf
//
// from decision where typ_dec='A'