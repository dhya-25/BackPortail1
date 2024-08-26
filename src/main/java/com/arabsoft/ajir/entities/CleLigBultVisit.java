package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class CleLigBultVisit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers	;
	private Long num_fam;
	private LocalDate dat_soin;
	private String abrv_act	;
	private String cod_visit;
	private LocalDate dat_act;
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
	public String getCod_visit() {
		return cod_visit;
	}
	public void setCod_visit(String cod_visit) {
		this.cod_visit = cod_visit;
	}
	public LocalDate getDat_act() {
		return dat_act;
	}
	public void setDat_act(LocalDate dat_act) {
		this.dat_act = dat_act;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
