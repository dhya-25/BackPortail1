package com.arabsoft.ajir.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="lib_bult_app")
@IdClass(CleLigBultApp.class)
public class LibBultApp {

	@Id
	private String cod_soc;
	@Id
	private String	mat_pers;
	@Id
	private Long num_fam;
	@Id
	private LocalDate dat_soin;
	@Id
	private String abrv_act;
	@Id
	private String cod_app	;
	private Long num_lig;
	private Long mnt_honor;
	private Long mnt_net;
	private Long mnt_remb	;
	private String	accord_app;
	private Long indice	;
	private LocalDate dat_act;
	private String prf_typ	;
	private String	prf_cod;
	private String num_pec_app	;
	@Id
	private Long num_lig_app;
	private Long 	mut_mnt_net;
	@Column(insertable = false, updatable = false)
	private String lib_app;
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
	public Long getMnt_net() {
		return mnt_net;
	}
	public void setMnt_net(Long mnt_net) {
		this.mnt_net = mnt_net;
	}
	public Long getMnt_remb() {
		return mnt_remb;
	}
	public void setMnt_remb(Long mnt_remb) {
		this.mnt_remb = mnt_remb;
	}
	public String getAccord_app() {
		return accord_app;
	}
	public void setAccord_app(String accord_app) {
		this.accord_app = accord_app;
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
	public String getNum_pec_app() {
		return num_pec_app;
	}
	public void setNum_pec_app(String num_pec_app) {
		this.num_pec_app = num_pec_app;
	}
	public Long getNum_lig_app() {
		return num_lig_app;
	}
	public void setNum_lig_app(Long num_lig_app) {
		this.num_lig_app = num_lig_app;
	}
	public Long getMut_mnt_net() {
		return mut_mnt_net;
	}
	public void setMut_mnt_net(Long mut_mnt_net) {
		this.mut_mnt_net = mut_mnt_net;
	}
	public String getLib_app() {
		return lib_app;
	}
	public void setLib_app(String lib_app) {
		this.lib_app = lib_app;
	}
	
	

}
