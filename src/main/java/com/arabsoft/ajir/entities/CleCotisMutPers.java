package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class CleCotisMutPers  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cod_soc;
	private String mat_pers;
	private Long num_cot;
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
	public Long getNum_cot() {
		return num_cot;
	}
	public void setNum_cot(Long num_cot) {
		this.num_cot = num_cot;
	}

	
	

}
