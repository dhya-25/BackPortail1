package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class CompetenceDet {

	
	public String cod_soc;
	public String cod_candidat;
	public String typ_candidat;
	public String cod_nat_comp;
	@Id
	public String cod_comp;
	public String cod_crit_comp;
	public String val_crit_comp;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date   dat_valid;
	public String appreciation;
	public String cod_niv_comp;
	public Integer denom;
	public Integer div;


	public String cod_serv;

	
	public String lib_niv_comp;
	public String lib_comp;
	public String nom_pers;
	
	
	public String lib_serv;
	public String lib_nat_comp;

	
	
	
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getLib_serv() {
		return lib_serv;
	}
	public void setLib_serv(String lib_serv) {
		this.lib_serv = lib_serv;
	}
	public String getLib_nat_comp() {
		return lib_nat_comp;
	}
	public void setLib_nat_comp(String lib_nat_comp) {
		this.lib_nat_comp = lib_nat_comp;
	}
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getCod_candidat() {
		return cod_candidat;
	}
	public void setCod_candidat(String cod_candidat) {
		this.cod_candidat = cod_candidat;
	}
	public String getTyp_candidat() {
		return typ_candidat;
	}
	public void setTyp_candidat(String typ_candidat) {
		this.typ_candidat = typ_candidat;
	}
	public String getCod_nat_comp() {
		return cod_nat_comp;
	}
	public void setCod_nat_comp(String cod_nat_comp) {
		this.cod_nat_comp = cod_nat_comp;
	}
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}
	public String getCod_crit_comp() {
		return cod_crit_comp;
	}
	public void setCod_crit_comp(String cod_crit_comp) {
		this.cod_crit_comp = cod_crit_comp;
	}
	public String getVal_crit_comp() {
		return val_crit_comp;
	}
	public void setVal_crit_comp(String val_crit_comp) {
		this.val_crit_comp = val_crit_comp;
	}
	public Date getDat_valid() {
		return dat_valid;
	}
	public void setDat_valid(Date dat_valid) {
		this.dat_valid = dat_valid;
	}
	public String getAppreciation() {
		return appreciation;
	}
	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
	public String getCod_niv_comp() {
		return cod_niv_comp;
	}
	public void setCod_niv_comp(String cod_niv_comp) {
		this.cod_niv_comp = cod_niv_comp;
	}
	public Integer getDenom() {
		return denom;
	}
	public void setDenom(Integer denom) {
		this.denom = denom;
	}
	public Integer getDiv() {
		return div;
	}
	public void setDiv(Integer div) {
		this.div = div;
	}
	
	public String getLib_niv_comp() {
		return lib_niv_comp;
	}
	public void setLib_niv_comp(String lib_niv_comp) {
		this.lib_niv_comp = lib_niv_comp;
	}
	public String getLib_comp() {
		return lib_comp;
	}
	public void setLib_comp(String lib_comp) {
		this.lib_comp = lib_comp;
	}
	public String getNom_pers() {
		return nom_pers;
	}
	public void setNom_pers(String nom_pers) {
		this.nom_pers = nom_pers;
	}
	public CompetenceDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompetenceDet(String cod_soc, String cod_candidat, String typ_candidat, String cod_nat_comp, String cod_comp,
			String cod_crit_comp, String val_crit_comp, Date dat_valid, String appreciation, String cod_niv_comp,
			Integer denom, Integer div, String cod_serv, String lib_niv_comp,
			String lib_comp, String nom_pers, String lib_serv, String lib_nat_comp) {
		super();
		this.cod_soc = cod_soc;
		this.cod_candidat = cod_candidat;
		this.typ_candidat = typ_candidat;
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
		this.cod_crit_comp = cod_crit_comp;
		this.val_crit_comp = val_crit_comp;
		this.dat_valid = dat_valid;
		this.appreciation = appreciation;
		this.cod_niv_comp = cod_niv_comp;
		this.denom = denom;
		this.div = div;
		
		this.cod_serv = cod_serv;
		this.lib_niv_comp = lib_niv_comp;
		this.lib_comp = lib_comp;
		this.nom_pers = nom_pers;
		this.lib_serv = lib_serv;
		this.lib_nat_comp = lib_nat_comp;
	}

	
	
	
	
	
}
