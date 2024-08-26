package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class libre_demande_val {

	private String cod_soc;
	@Id

	private Long id_libre_demande;
	private String mat_resp;

	private String etat_val;

	public libre_demande_val() {
		super();
		// TODO Auto-generated constructor stub
	}

	public libre_demande_val(String cod_soc, Long id_libre_demande, String mat_resp, String etat_val) {
		super();
		this.cod_soc = cod_soc;
		this.id_libre_demande = id_libre_demande;
		this.mat_resp = mat_resp;
		this.etat_val = etat_val;
	}

	public String getCod_soc() {
		return cod_soc;
	}

	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}

	public Long getId_libre_demande() {
		return id_libre_demande;
	}

	public void setId_libre_demande(Long id_libre_demande) {
		this.id_libre_demande = id_libre_demande;
	}

	public String getMat_resp() {
		return mat_resp;
	}

	public void setMat_resp(String mat_resp) {
		this.mat_resp = mat_resp;
	}

	public String getEtat_val() {
		return etat_val;
	}

	public void setEtat_val(String etat_val) {
		this.etat_val = etat_val;
	}

	


}
