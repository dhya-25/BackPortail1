package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class ID_Interim_Cng implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  private Long id_libre_demande;
	  private String mat_pers_int  ;
	public Long getId_libre_demande() {
		return id_libre_demande;
	}
	public void setId_libre_demande(Long id_libre_demande) {
		this.id_libre_demande = id_libre_demande;
	}
	public String getMat_pers_int() {
		return mat_pers_int;
	}
	public void setMat_pers_int(String mat_pers_int) {
		this.mat_pers_int = mat_pers_int;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ID_Interim_Cng(Long id_libre_demande, String mat_pers_int) {
		super();
		this.id_libre_demande = id_libre_demande;
		this.mat_pers_int = mat_pers_int;
	}
	public ID_Interim_Cng() {
		super();
	}  

	

}
