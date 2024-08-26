package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ValidationDemandeChef {
	
	
	public String mat_pers;
	
	public String mat_resp;
	public Long niveau;
	public String nom_resp; 
	@Id
	public Long id_libre_demande;
	public String etat_val;
	public String reponse;
	public String txt_chef;
	
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public String getMat_resp() {
		return mat_resp;
	}
	public void setMat_resp(String mat_resp) {
		this.mat_resp = mat_resp;
	}
	public Long getNiveau() {
		return niveau;
	}
	public void setNiveau(Long niveau) {
		this.niveau = niveau;
	}
	public String getNom_resp() {
		return nom_resp;
	}
	public void setNom_resp(String nom_resp) {
		this.nom_resp = nom_resp;
	}
	public Long getId_libre_demande() {
		return id_libre_demande;
	}
	public void setId_libre_demande(Long id_libre_demande) {
		this.id_libre_demande = id_libre_demande;
	}
	public String getEtat_val() {
		return etat_val;
	}
	public void setEtat_val(String etat_val) {
		this.etat_val = etat_val;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public String getTxt_chef() {
		return txt_chef;
	}
	public void setTxt_chef(String txt_chef) {
		this.txt_chef = txt_chef;
	}
	public ValidationDemandeChef(String mat_pers, String mat_resp, Long niveau, String nom_resp, Long id_libre_demande,
			String etat_val, String reponse, String txt_chef) {
		super();
		this.mat_pers = mat_pers;
		this.mat_resp = mat_resp;
		this.niveau = niveau;
		this.nom_resp = nom_resp;
		this.id_libre_demande = id_libre_demande;
		this.etat_val = etat_val;
		this.reponse = reponse;
		this.txt_chef = txt_chef;
	}
	public ValidationDemandeChef() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
