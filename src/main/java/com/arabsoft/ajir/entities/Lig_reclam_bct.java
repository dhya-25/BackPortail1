package com.arabsoft.ajir.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lig_reclam_bct {

	
private Long num_bord_assur;
private Long annee_bord;
private Long num_lig_reclam;
@Id
private String cod_soc;
private String mat_pers;
private String num_ass;
private String cod_prest;
private String typ_parent;
private Long num_bult;
private LocalDate dat_soins;
private String txt_reclam;
private LocalDate dat_envoi_star;
private String abrv_act_star;
private Long num_lig_bord;
private String etat_reclan;
public Long getNum_bord_assur() {
	return num_bord_assur;
}
public void setNum_bord_assur(Long num_bord_assur) {
	this.num_bord_assur = num_bord_assur;
}
public Long getAnnee_bord() {
	return annee_bord;
}
public void setAnnee_bord(Long annee_bord) {
	this.annee_bord = annee_bord;
}
public Long getNum_lig_reclam() {
	return num_lig_reclam;
}
public void setNum_lig_reclam(Long num_lig_reclam) {
	this.num_lig_reclam = num_lig_reclam;
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
public String getNum_ass() {
	return num_ass;
}
public void setNum_ass(String num_ass) {
	this.num_ass = num_ass;
}
public String getCod_prest() {
	return cod_prest;
}
public void setCod_prest(String cod_prest) {
	this.cod_prest = cod_prest;
}
public String getTyp_parent() {
	return typ_parent;
}
public void setTyp_parent(String typ_parent) {
	this.typ_parent = typ_parent;
}
public Long getNum_bult() {
	return num_bult;
}
public void setNum_bult(Long num_bult) {
	this.num_bult = num_bult;
}
public LocalDate getDat_soins() {
	return dat_soins;
}
public void setDat_soins(LocalDate dat_soins) {
	this.dat_soins = dat_soins;
}
public String getTxt_reclam() {
	return txt_reclam;
}
public void setTxt_reclam(String txt_reclam) {
	this.txt_reclam = txt_reclam;
}
public LocalDate getDat_envoi_star() {
	return dat_envoi_star;
}
public void setDat_envoi_star(LocalDate dat_envoi_star) {
	this.dat_envoi_star = dat_envoi_star;
}
public String getAbrv_act_star() {
	return abrv_act_star;
}
public void setAbrv_act_star(String abrv_act_star) {
	this.abrv_act_star = abrv_act_star;
}
public Long getNum_lig_bord() {
	return num_lig_bord;
}
public void setNum_lig_bord(Long num_lig_bord) {
	this.num_lig_bord = num_lig_bord;
}
public String getEtat_reclan() {
	return etat_reclan;
}
public void setEtat_reclan(String etat_reclan) {
	this.etat_reclan = etat_reclan;
}


}
