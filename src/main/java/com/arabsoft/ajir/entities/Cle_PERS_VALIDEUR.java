package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class Cle_PERS_VALIDEUR implements Serializable {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cod_soc  ;
		
	  private String  mat_pers ;
	
	  private String  mat_resp ;

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

	public String getMat_resp() {
		return mat_resp;
	}

	public void setMat_resp(String mat_resp) {
		this.mat_resp = mat_resp;
	}

	public Cle_PERS_VALIDEUR() {
		super();
	}

	public Cle_PERS_VALIDEUR(String cod_soc, String mat_pers, String mat_resp) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.mat_resp = mat_resp;
	}

}
