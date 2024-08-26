package com.arabsoft.ajir.entities;
import java.io.Serializable;

public class CleDemandeConv implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_conv;
	private String  cod_soc;
	private String  mat_pers;
	public String getCod_conv() {
		return cod_conv;
	}
	public void setCod_conv(String cod_conv) {
		this.cod_conv = cod_conv;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
