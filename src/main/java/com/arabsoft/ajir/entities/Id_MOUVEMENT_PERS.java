package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class Id_MOUVEMENT_PERS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers;
	private Long num_mvt;
	public Id_MOUVEMENT_PERS() {
		super();
	}
	public Id_MOUVEMENT_PERS(String cod_soc, String mat_pers, Long num_mvt) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_mvt = num_mvt;
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
	public Long getNum_mvt() {
		return num_mvt;
	}
	public void setNum_mvt(Long num_mvt) {
		this.num_mvt = num_mvt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
