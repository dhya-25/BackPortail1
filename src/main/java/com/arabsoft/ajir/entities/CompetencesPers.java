package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CompetencesPers {

	
	
	public String cod_soc;
	@Id
	public String cod_candidat;
	public String typ_candidat;
	public String cod_nat_comp;
	public String cod_comp;
	public String cod_crit_comp;
	public String val_crit_comp;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_valid;
	public String appreciation;
	public String cod_niv_comp;
	public Integer denom;
	public Integer div;
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

	public CompetencesPers(String cod_soc, String cod_candidat, String typ_candidat, String cod_nat_comp,
			String cod_comp, String cod_crit_comp, String val_crit_comp, Date dat_valid, String appreciation,
			String cod_niv_comp, Integer denom, Integer div, Integer id_competence_pers) {
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
	}
	public CompetencesPers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
