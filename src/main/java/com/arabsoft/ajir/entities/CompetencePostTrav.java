package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompetencePostTrav {

	public String cod_metier;
	public String lib_post; 
	public String cod_nat_comp; 
	@Id
	public String cod_comp;
	public String lib_comp; 
	public String cod_crit_comp; 
	public String val_crit_comp; 
	public Integer coef_pond;
	public String typ_comp; 
	public String lib_niv_comp;
	public Integer pourcentage;
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getLib_post() {
		return lib_post;
	}
	public void setLib_post(String lib_post) {
		this.lib_post = lib_post;
	}
	public String getCod_nat_comp() {
		return cod_nat_comp;
	}
	public void setCod_nat_comp(String cod_nat_comp) {
		this.cod_nat_comp = cod_nat_comp;
	}
	public String getLib_comp() {
		return lib_comp;
	}
	public void setLib_comp(String lib_comp) {
		this.lib_comp = lib_comp;
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
	public Integer getCoef_pond() {
		return coef_pond;
	}
	public void setCoef_pond(Integer coef_pond) {
		this.coef_pond = coef_pond;
	}
	public String getTyp_comp() {
		return typ_comp;
	}
	public void setTyp_comp(String typ_comp) {
		this.typ_comp = typ_comp;
	}
	public String getLib_niv_comp() {
		return lib_niv_comp;
	}
	public void setLib_niv_comp(String lib_niv_comp) {
		this.lib_niv_comp = lib_niv_comp;
	}

	public Integer getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(Integer pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}
	public CompetencePostTrav() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompetencePostTrav(String cod_metier, String lib_post, String cod_nat_comp, String cod_comp, String lib_comp,
			String cod_crit_comp, String val_crit_comp, Integer coef_pond, String typ_comp, String lib_niv_comp,
			Integer id_competence_poste, Integer pourcentage) {
		super();
		this.cod_metier = cod_metier;
		this.lib_post = lib_post;
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
		this.lib_comp = lib_comp;
		this.cod_crit_comp = cod_crit_comp;
		this.val_crit_comp = val_crit_comp;
		this.coef_pond = coef_pond;
		this.typ_comp = typ_comp;
		this.lib_niv_comp = lib_niv_comp;
		this.pourcentage = pourcentage;
	}

	
	
	

}
