package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class CleLigBultMed implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers	;
	private String num_fam	;
	private LocalDate dat_soin;
	private String abrv_act;
	private String 	cod_med;
	private String num_lig_med;
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
	public String getNum_fam() {
		return num_fam;
	}
	public void setNum_fam(String num_fam) {
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
	public String getCod_med() {
		return cod_med;
	}
	public void setCod_med(String cod_med) {
		this.cod_med = cod_med;
	}
	public String getNum_lig() {
		return num_lig_med;
	}
	public void setNum_lig(String num_lig) {
		this.num_lig_med = num_lig;
	}
	
	
}
