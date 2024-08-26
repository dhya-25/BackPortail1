package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="LIG_COTIS_MUT_PERS")
@IdClass(CleLigCotisMutPers.class)
public class LigCotisMut_Pers {
	@Id
	private String cod_soc;
	@Id
	private String mat_pers;
	@Id
	private Long num_cot;
	private Date dat_mut;
	private Long mnt_payer;
	@Id
	private Date dat_cot;
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
	public Date getDat_mut() {
		return dat_mut;
	}
	public void setDat_mut(Date dat_mut) {
		this.dat_mut = dat_mut;
	}
	public Long getMnt_payer() {
		return mnt_payer;
	}
	public void setMnt_payer(Long mnt_payer) {
		this.mnt_payer = mnt_payer;
	}
	public Date getDat_cot() {
		return dat_cot;
	}
	public void setDat_cot(Date dat_cot) {
		this.dat_cot = dat_cot;
	}


}
