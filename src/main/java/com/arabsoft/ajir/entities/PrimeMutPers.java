package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="prime_mut_pers")
@IdClass(ClePrimeMutPers.class)
public class PrimeMutPers {
	
	 @Id
	private String cod_soc;
	 @Id
	private String mat_pers;
	 @Id
	private Long num_prime;
	private String	typ_prime;
	private Date	dat_deb	;
	private Date dat_fin;
	private Long mnt_a_payer;
	private Long 	mnt_payer;
	private String	mod_pay;
	private String	ref_pay;
	private Date dat_saisie;
	private String	etat_prime;
	private String	corps;
	private String	cod_typ_depart;
	private String	cod_affect;
	private Long mnt_param;
	private String	num_retr;
	private Long seq_ecrt1;
	private Long seq_ecrt2;
	private String	imput;
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
	public String getTyp_prime() {
		return typ_prime;
	}
	public void setTyp_prime(String typ_prime) {
		this.typ_prime = typ_prime;
	}
	public Date getDat_deb() {
		return dat_deb;
	}
	public void setDat_deb(Date dat_deb) {
		this.dat_deb = dat_deb;
	}
	public Date getDat_fin() {
		return dat_fin;
	}
	public void setDat_fin(Date dat_fin) {
		this.dat_fin = dat_fin;
	}
	public Long getMnt_a_payer() {
		return mnt_a_payer;
	}
	public void setMnt_a_payer(Long mnt_a_payer) {
		this.mnt_a_payer = mnt_a_payer;
	}
	public Long getMnt_payer() {
		return mnt_payer;
	}
	public void setMnt_payer(Long mnt_payer) {
		this.mnt_payer = mnt_payer;
	}
	public String getMod_pay() {
		return mod_pay;
	}
	public void setMod_pay(String mod_pay) {
		this.mod_pay = mod_pay;
	}
	public String getRef_pay() {
		return ref_pay;
	}
	public void setRef_pay(String ref_pay) {
		this.ref_pay = ref_pay;
	}
	public Date getDat_saisie() {
		return dat_saisie;
	}
	public void setDat_saisie(Date dat_saisie) {
		this.dat_saisie = dat_saisie;
	}
	public String getEtat_prime() {
		return etat_prime;
	}
	public void setEtat_prime(String etat_prime) {
		this.etat_prime = etat_prime;
	}
	public String getCorps() {
		return corps;
	}
	public void setCorps(String corps) {
		this.corps = corps;
	}
	public String getCod_typ_depart() {
		return cod_typ_depart;
	}
	public void setCod_typ_depart(String cod_typ_depart) {
		this.cod_typ_depart = cod_typ_depart;
	}
	public String getCod_affect() {
		return cod_affect;
	}
	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}
	public Long getMnt_param() {
		return mnt_param;
	}
	public void setMnt_param(Long mnt_param) {
		this.mnt_param = mnt_param;
	}
	public String getNum_retr() {
		return num_retr;
	}
	public void setNum_retr(String num_retr) {
		this.num_retr = num_retr;
	}
	public Long getSeq_ecrt1() {
		return seq_ecrt1;
	}
	public void setSeq_ecrt1(Long seq_ecrt1) {
		this.seq_ecrt1 = seq_ecrt1;
	}
	public Long getSeq_ecrt2() {
		return seq_ecrt2;
	}
	public void setSeq_ecrt2(Long seq_ecrt2) {
		this.seq_ecrt2 = seq_ecrt2;
	}
	public String getImput() {
		return imput;
	}
	public void setImput(String imput) {
		this.imput = imput;
	}


}
