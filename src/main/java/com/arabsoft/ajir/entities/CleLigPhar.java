package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.sql.Date;

public class CleLigPhar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc ;
	private String mat_pers;
	private Long  num_fam ;
	private Date  dat_soin ;
	  private String cod_med ;
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
	public Long getNum_fam() {
		return num_fam;
	}
	public void setNum_fam(Long num_fam) {
		this.num_fam = num_fam;
	}
	public Date getDat_soin() {
		return dat_soin;
	}
	public void setDat_soin(Date dat_soin) {
		this.dat_soin = dat_soin;
	}
	public String getCod_med() {
		return cod_med;
	}
	public void setCod_med(String cod_med) {
		this.cod_med = cod_med;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	  
	  
}
