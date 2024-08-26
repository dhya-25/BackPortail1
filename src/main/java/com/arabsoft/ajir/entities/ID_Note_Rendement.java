package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ID_Note_Rendement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers;
	@JsonFormat(pattern = "dd/MM/yyyy")

	private Date dat_note;
	private String cod_nat;
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
	public Date getDat_note() {
		return dat_note;
	}
	public void setDat_note(Date dat_note) {
		this.dat_note = dat_note;
	}
	public String getCod_nat() {
		return cod_nat;
	}
	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ID_Note_Rendement() {
		super();
	}
	public ID_Note_Rendement(String cod_soc, String mat_pers, Date dat_note, String cod_nat) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_note = dat_note;
		this.cod_nat = cod_nat;
	}
	
	
	
	

}
