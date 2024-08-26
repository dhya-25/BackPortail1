package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="Off_demande_conv")
@IdClass(CleOffDemandeConv.class)
public class OffDemandeConv {
	@Id
	private String cod_conv;
	@Id
	private String  cod_soc;
	@Id
	private String  mat_pers;
	@Id
	private String  cod_off	;
	private Date  dat_off_dem;
	private Date  dat_fin_off;
	private String  mnt_off;
	private String  etat_off_dem;
	private String  cod_user;
	private Date  dat_saisie;
	@Id
	private Long  seq;
	private Date  dat_susp;
	private String  num_tel;
	private String  cod_mot_susp;
	private String  renouv;
	private Date  dat_renouv;
	private String  obs_off;
	private String lib_off;
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
	public String getCod_off() {
		return cod_off;
	}
	public void setCod_off(String cod_off) {
		this.cod_off = cod_off;
	}
	public Date getDat_off_dem() {
		return dat_off_dem;
	}
	public void setDat_off_dem(Date dat_off_dem) {
		this.dat_off_dem = dat_off_dem;
	}
	public Date getDat_fin_off() {
		return dat_fin_off;
	}
	public void setDat_fin_off(Date dat_fin_off) {
		this.dat_fin_off = dat_fin_off;
	}
	public String getMnt_off() {
		return mnt_off;
	}
	public void setMnt_off(String mnt_off) {
		this.mnt_off = mnt_off;
	}
	public String getEtat_off_dem() {
		return etat_off_dem;
	}
	public void setEtat_off_dem(String etat_off_dem) {
		this.etat_off_dem = etat_off_dem;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public Date getDat_saisie() {
		return dat_saisie;
	}
	public void setDat_saisie(Date dat_saisie) {
		this.dat_saisie = dat_saisie;
	}
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public Date getDat_susp() {
		return dat_susp;
	}
	public void setDat_susp(Date dat_susp) {
		this.dat_susp = dat_susp;
	}
	public String getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}
	public String getCod_mot_susp() {
		return cod_mot_susp;
	}
	public void setCod_mot_susp(String cod_mot_susp) {
		this.cod_mot_susp = cod_mot_susp;
	}
	public String getRenouv() {
		return renouv;
	}
	public void setRenouv(String renouv) {
		this.renouv = renouv;
	}
	public Date getDat_renouv() {
		return dat_renouv;
	}
	public void setDat_renouv(Date dat_renouv) {
		this.dat_renouv = dat_renouv;
	}
	public String getObs_off() {
		return obs_off;
	}
	public void setObs_off(String obs_off) {
		this.obs_off = obs_off;
	}
	public String getLib_off() {
		return lib_off;
	}
	public void setLib_off(String lib_off) {
		this.lib_off = lib_off;
	}
	
	

}
