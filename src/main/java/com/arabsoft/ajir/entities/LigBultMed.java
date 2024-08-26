package com.arabsoft.ajir.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name="lig_bult_med")
@IdClass(CleLigBultMed.class)
public class LigBultMed {
	@Id
	private String cod_soc;
	@Id
	private String mat_pers	;
	@Id
	private String num_fam	;
	@Id
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dat_soin;
	@Id
	private String abrv_act;
	@Id
	private String 	cod_med;
	private String num_lig;
	private String indice;
	private String mnt_honor;
	private String mnt_net;
	private String mnt_remb;
	private String accord_med;
	@JsonFormat(pattern = "dd/MM/yyyy")

	private LocalDate dat_act;
	private String prf_typ;
	private String prf_cod;
	private String num_pec_med	;
	private String 	mdc_prix;
	private String med_prix	;
	private String prix_remb;
    @Id
	private String num_lig_med;
	private String mut_mnt_net;
	private String nbr_j;
	@Column(insertable = false, updatable = false)
	private String lib_med; 
	public String getLib_med() {
		return lib_med;
	}
	public void setLib_med(String lib_med) {
		this.lib_med = lib_med;
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
		return num_lig;
	}
	public void setNum_lig(String num_lig) {
		this.num_lig = num_lig;
	}
	public String getIndice() {
		return indice;
	}
	public void setIndice(String indice) {
		this.indice = indice;
	}
	public String getMnt_honor() {
		return mnt_honor;
	}
	public void setMnt_honor(String mnt_honor) {
		this.mnt_honor = mnt_honor;
	}
	public String getMnt_net() {
		return mnt_net;
	}
	public void setMnt_net(String mnt_net) {
		this.mnt_net = mnt_net;
	}
	public String getMnt_remb() {
		return mnt_remb;
	}
	public void setMnt_remb(String mnt_remb) {
		this.mnt_remb = mnt_remb;
	}
	public String getAccord_med() {
		return accord_med;
	}
	public void setAccord_med(String accord_med) {
		this.accord_med = accord_med;
	}
	public LocalDate getDat_act() {
		return dat_act;
	}
	public void setDat_act(LocalDate dat_act) {
		this.dat_act = dat_act;
	}
	public String getPrf_typ() {
		return prf_typ;
	}
	public void setPrf_typ(String prf_typ) {
		this.prf_typ = prf_typ;
	}
	public String getPrf_cod() {
		return prf_cod;
	}
	public void setPrf_cod(String prf_cod) {
		this.prf_cod = prf_cod;
	}
	public String getNum_pec_med() {
		return num_pec_med;
	}
	public void setNum_pec_med(String num_pec_med) {
		this.num_pec_med = num_pec_med;
	}
	public String getMdc_prix() {
		return mdc_prix;
	}
	public void setMdc_prix(String mdc_prix) {
		this.mdc_prix = mdc_prix;
	}
	public String getMed_prix() {
		return med_prix;
	}
	public void setMed_prix(String med_prix) {
		this.med_prix = med_prix;
	}
	public String getPrix_remb() {
		return prix_remb;
	}
	public void setPrix_remb(String prix_remb) {
		this.prix_remb = prix_remb;
	}
	public String getNum_lig_med() {
		return num_lig_med;
	}
	public void setNum_lig_med(String num_lig_med) {
		this.num_lig_med = num_lig_med;
	}
	public String getMut_mnt_net() {
		return mut_mnt_net;
	}
	public void setMut_mnt_net(String mut_mnt_net) {
		this.mut_mnt_net = mut_mnt_net;
	}
	public String getNbr_j() {
		return nbr_j;
	}
	public void setNbr_j(String nbr_j) {
		this.nbr_j = nbr_j;
	}
 
	
	

}
