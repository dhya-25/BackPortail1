package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class CleLigBultApp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String	mat_pers;
	private Long num_fam;
	private LocalDate dat_soin;
	private String abrv_act;
	private String cod_app	;
	private Long num_lig_app;
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
	public LocalDate getDat_soin() {
		return dat_soin;
	}
	public void setDat_soin(LocalDate dat_soin) {
		this.dat_soin = dat_soin;
	}
	public String getAbrv_act() {
		return abrv_act;
	}
	public void setAbrv_act(String abrv_act) {
		this.abrv_act = abrv_act;
	}
	public String getCod_app() {
		return cod_app;
	}
	public void setCod_app(String cod_app) {
		this.cod_app = cod_app;
	}
	public Long getNum_lig_app() {
		return num_lig_app;
	}
	public void setNum_lig_app(Long num_lig_app) {
		this.num_lig_app = num_lig_app;
	}
	
	

}
