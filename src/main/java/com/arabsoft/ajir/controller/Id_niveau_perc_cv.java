package com.arabsoft.ajir.controller;

import java.io.Serializable;

public class Id_niveau_perc_cv implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc ;       
	private String mat_pers  ;     
	 private Long  num_niveau     ;
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
	public Long getNum_niveau() {
		return num_niveau;
	}
	public void setNum_niveau(Long num_niveau) {
		this.num_niveau = num_niveau;
	}
	
	public Id_niveau_perc_cv(String cod_soc, String mat_pers, Long num_niveau) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_niveau = num_niveau;
	}
	public Id_niveau_perc_cv() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
