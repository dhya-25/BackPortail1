package com.arabsoft.ajir.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="LIG_PHAR")
@IdClass(CleLigPhar.class)
public class LigPhar {

	@Id
	private String cod_soc ;
	@Id
	private String mat_pers;
	@Id
	private Long  num_fam ;
	@Id
	private Date  dat_soin ;
	@Id
	  private String cod_med ;
	@Id
	  private Long num_lig ;
	  private Long  indice  ;
	  private Date  dat_act;
	  private String prf_typ ;
	  private String  prf_cod ;
	  private Long  mnt_honor ;
	  private Long  mnt_net ;
	  private Long  mnt_remb ;
	  private Long  mdc_prix  ;
	  private Long  med_prix;
	  private Long  prix_remb ;
	  private String  obs ;
	  private String  obs_a ;
	  private Long nbr_piece ;
	  private Long  nbr_vign ;
	  private String  abrv_act ;
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
	public String getCod_med() {
		return cod_med;
	}
	public void setCod_med(String cod_med) {
		this.cod_med = cod_med;
	}
	public Long getNum_lig() {
		return num_lig;
	}
	public void setNum_lig(Long num_lig) {
		this.num_lig = num_lig;
	}
	public Long getIndice() {
		return indice;
	}
	public void setIndice(Long indice) {
		this.indice = indice;
	}
	public Date getDat_act() {
		return dat_act;
	}
	public void setDat_act(Date dat_act) {
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
	public Long getMdc_prix() {
		return mdc_prix;
	}
	public void setMdc_prix(Long mdc_prix) {
		this.mdc_prix = mdc_prix;
	}
	public Long getMed_prix() {
		return med_prix;
	}
	public void setMed_prix(Long med_prix) {
		this.med_prix = med_prix;
	}
	public Long getPrix_remb() {
		return prix_remb;
	}
	public void setPrix_remb(Long prix_remb) {
		this.prix_remb = prix_remb;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getObs_a() {
		return obs_a;
	}
	public void setObs_a(String obs_a) {
		this.obs_a = obs_a;
	}
	public Long getNbr_piece() {
		return nbr_piece;
	}
	public void setNbr_piece(Long nbr_piece) {
		this.nbr_piece = nbr_piece;
	}
	public Long getNbr_vign() {
		return nbr_vign;
	}
	public void setNbr_vign(Long nbr_vign) {
		this.nbr_vign = nbr_vign;
	}
	public String getAbrv_act() {
		return abrv_act;
	}
	public void setAbrv_act(String abrv_act) {
		this.abrv_act = abrv_act;
	}
	  
	  
}
