package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Acte_LigBultStar {
	@Id
	private String abrv_act_bct;
	private String lib_act;
	private Long tot_remb_star;
	private Long num_bord_assur;
	private Long annee_bord;
	
	private Long num_bult;
	public String getAbrv_act_bct() {
		return abrv_act_bct;
	}
	public void setAbrv_act_bct(String abrv_act_bct) {
		this.abrv_act_bct = abrv_act_bct;
	}
	public String getLib_act() {
		return lib_act;
	}
	public void setLib_act(String lib_act) {
		this.lib_act = lib_act;
	}
	public Long getTot_remb_star() {
		return tot_remb_star;
	}
	public void setTot_remb_star(Long tot_remb_star) {
		this.tot_remb_star = tot_remb_star;
	}
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
	public Long getNum_bult() {
		return num_bult;
	}
	public void setNum_bult(Long num_bult) {
		this.num_bult = num_bult;
	}
	
	
	
}
