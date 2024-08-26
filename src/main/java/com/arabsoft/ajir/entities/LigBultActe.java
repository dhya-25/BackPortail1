package com.arabsoft.ajir.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="lig_bult_act")
@IdClass(CleLigBultActe.class)
public class LigBultActe {
	@Id
	private String cod_soc;
	@Id
	private String mat_pers	;
	@Id
	private Long num_fam;
	@Id
	private Date dat_soin;
	@Id
	private String abrv_act	;
	@Id
	private String cod_act;
	private Long num_lig;
	private String let_cod;
	private Long cot_act;
	private Long act_prix;
	private Long mnt_honor;
	private Long mnt_remb;
	private String accord_act;
	private Long mnt_net;
	private Long 	indice;
	@Id
	private LocalDate dat_act;
	private String prf_typ;
	private String prf_cod	;
	private Long mut_mnt_net;
	private String num_pec_act;
	private Long taux_act;
	private String typ_prf;

	@Column(insertable = false, updatable = false)
	private String lib_act;
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
	public Date getDat_soin() {
		return dat_soin;
	}
	public void setDat_soin(Date dat_soin) {
		this.dat_soin = dat_soin;
	}
	public String getAbrv_act() {
		return abrv_act;
	}
	public void setAbrv_act(String abrv_act) {
		this.abrv_act = abrv_act;
	}
	public String getCod_act() {
		return cod_act;
	}
	public void setCod_act(String cod_act) {
		this.cod_act = cod_act;
	}
	public Long getNum_lig() {
		return num_lig;
	}
	public void setNum_lig(Long num_lig) {
		this.num_lig = num_lig;
	}
	public String getLet_cod() {
		return let_cod;
	}
	public void setLet_cod(String let_cod) {
		this.let_cod = let_cod;
	}
	public Long getCot_act() {
		return cot_act;
	}
	public void setCot_act(Long cot_act) {
		this.cot_act = cot_act;
	}
	public Long getAct_prix() {
		return act_prix;
	}
	public void setAct_prix(Long act_prix) {
		this.act_prix = act_prix;
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
	public String getAccord_act() {
		return accord_act;
	}
	public void setAccord_act(String accord_act) {
		this.accord_act = accord_act;
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
	public Long getMut_mnt_net() {
		return mut_mnt_net;
	}
	public void setMut_mnt_net(Long mut_mnt_net) {
		this.mut_mnt_net = mut_mnt_net;
	}
	public String getNum_pec_act() {
		return num_pec_act;
	}
	public void setNum_pec_act(String num_pec_act) {
		this.num_pec_act = num_pec_act;
	}
	public Long getTaux_act() {
		return taux_act;
	}
	public void setTaux_act(Long taux_act) {
		this.taux_act = taux_act;
	}
	public String getTyp_prf() {
		return typ_prf;
	}
	public void setTyp_prf(String typ_prf) {
		this.typ_prf = typ_prf;
	}
	public String getLib_act() {
		return lib_act;
	}
	public void setLib_act(String lib_act) {
		this.lib_act = lib_act;
	}
	
	
}
