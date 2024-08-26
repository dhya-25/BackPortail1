package com.arabsoft.ajir.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name="lig_bult_visit")
@IdClass(CleLigBultVisit.class)
public class LigBultVisit {
    @Id
	private String cod_soc;
    @Id
	private String mat_pers	;
    @Id
	private Long num_fam;
    @Id
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dat_soin;
    @Id
	private String abrv_act	;
    @Id
	private String cod_visit;
	private Long num_lig;
	private Long mnt_honor	;
	private Long mnt_remb;
	private Long mnt_net;
	private Long indice;
	@Id
	@JsonFormat(pattern = "dd/MM/yyyy")

	private LocalDate dat_act;
	private String prf_typ	;
	private String 	prf_cod	;
	private Long 	prix_visit;
	private Long taux_remb;
	private Long mut_mnt_net;
	@Column(insertable = false, updatable = false)
	private String lib_visit;
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
	public Long getNum_lig() {
		return num_lig;
	}
	public void setNum_lig(Long num_lig) {
		this.num_lig = num_lig;
	}
	public Long getMnt_honor() {
		return mnt_honor;
	}
	public void setMnt_honor(Long mnt_honor) {
		this.mnt_honor = mnt_honor;
	}
	public Long getMnt_remb() {
		return mnt_remb;
	}
	public void setMnt_remb(Long mnt_remb) {
		this.mnt_remb = mnt_remb;
	}
	public Long getMnt_net() {
		return mnt_net;
	}
	public void setMnt_net(Long mnt_net) {
		this.mnt_net = mnt_net;
	}
	public Long getIndice() {
		return indice;
	}
	public void setIndice(Long indice) {
		this.indice = indice;
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
	public Long getPrix_visit() {
		return prix_visit;
	}
	public void setPrix_visit(Long prix_visit) {
		this.prix_visit = prix_visit;
	}
	public Long getTaux_remb() {
		return taux_remb;
	}
	public void setTaux_remb(Long taux_remb) {
		this.taux_remb = taux_remb;
	}
	public Long getMut_mnt_net() {
		return mut_mnt_net;
	}
	public void setMut_mnt_net(Long mut_mnt_net) {
		this.mut_mnt_net = mut_mnt_net;
	}
	public String getLibVisit() {
		return lib_visit;
	}
	public void setLibVisit(String libVisit) {
		this.lib_visit = libVisit;
	}
	
	

}
