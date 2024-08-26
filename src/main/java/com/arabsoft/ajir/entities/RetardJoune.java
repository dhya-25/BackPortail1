package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@IdClass(CleRetardJourne.class)
public class RetardJoune {

	
	
    @Id
    public String cod_soc;
    @Id
	public String mat_pers;
    @Id
    @JsonFormat(pattern = "yyyy-MM-dd")
	public Date dat_point;
    @Id
	public Integer num_point;
	public String heur_min ;
	public Integer h_reg;
	public Integer m_reg;
	public String type;
	public Integer duree_h;
	public Integer duree_m;
	public String duree_tot;
	public Integer semaine;
	public String cod_serv;
	public String cod_reg;
	public Date date_shift;
	public String etat_retard;
    @JsonFormat(pattern = "yyyy-MM-dd")
	public Date dat_sais;
    public String cod_ur;

    public String nom_pren;
	
	
	
	
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




	public Date getDat_point() {
		return dat_point;
	}




	public void setDat_point(Date dat_point) {
		this.dat_point = dat_point;
	}




	public Integer getNum_point() {
		return num_point;
	}




	public void setNum_point(Integer num_point) {
		this.num_point = num_point;
	}




	public String getHeur_min() {
		return heur_min;
	}




	public void setHeur_min(String heur_min) {
		this.heur_min = heur_min;
	}




	public Integer getH_reg() {
		return h_reg;
	}




	public void setH_reg(Integer h_reg) {
		this.h_reg = h_reg;
	}




	public Integer getM_reg() {
		return m_reg;
	}




	public void setM_reg(Integer m_reg) {
		this.m_reg = m_reg;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public Integer getDuree_h() {
		return duree_h;
	}




	public void setDuree_h(Integer duree_h) {
		this.duree_h = duree_h;
	}




	public Integer getDuree_m() {
		return duree_m;
	}




	public void setDuree_m(Integer duree_m) {
		this.duree_m = duree_m;
	}




	public String getDuree_tot() {
		return duree_tot;
	}




	public void setDuree_tot(String duree_tot) {
		this.duree_tot = duree_tot;
	}




	public Integer getSemaine() {
		return semaine;
	}




	public void setSemaine(Integer semaine) {
		this.semaine = semaine;
	}




	public String getCod_serv() {
		return cod_serv;
	}




	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}




	public String getCod_reg() {
		return cod_reg;
	}




	public void setCod_reg(String cod_reg) {
		this.cod_reg = cod_reg;
	}




	public Date getDate_shift() {
		return date_shift;
	}




	public void setDate_shift(Date date_shift) {
		this.date_shift = date_shift;
	}




	public String getEtat_retard() {
		return etat_retard;
	}




	public void setEtat_retard(String etat_retard) {
		this.etat_retard = etat_retard;
	}




	public Date getDat_sais() {
		return dat_sais;
	}




	public void setDat_sais(Date dat_sais) {
		this.dat_sais = dat_sais;
	}









	public String getNom_pren() {
		return nom_pren;
	}




	public void setNom_pren(String nom_pren) {
		this.nom_pren = nom_pren;
	}




	public RetardJoune(String cod_soc, String mat_pers, Date dat_point, Integer num_point, String heur_min,
			Integer h_reg, Integer m_reg, String type, Integer duree_h, Integer duree_m, String duree_tot,
			Integer semaine, String cod_serv, String cod_reg, Date date_shift, String etat_retard, Date dat_sais,
		String nom_pren) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_point = dat_point;
		this.num_point = num_point;
		this.heur_min = heur_min;
		this.h_reg = h_reg;
		this.m_reg = m_reg;
		this.type = type;
		this.duree_h = duree_h;
		this.duree_m = duree_m;
		this.duree_tot = duree_tot;
		this.semaine = semaine;
		this.cod_serv = cod_serv;
		this.cod_reg = cod_reg;
		this.date_shift = date_shift;
		this.etat_retard = etat_retard;
		this.dat_sais = dat_sais;

		this.nom_pren = nom_pren;
	}




	public RetardJoune() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
