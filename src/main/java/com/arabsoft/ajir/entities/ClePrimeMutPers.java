package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class ClePrimeMutPers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers;
	private Long num_prime;
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
	public Long getNum_prime() {
		return num_prime;
	}
	public void setNum_prime(Long num_prime) {
		this.num_prime = num_prime;
	}
	
	
}
