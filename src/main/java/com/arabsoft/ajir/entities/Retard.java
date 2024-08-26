package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name = "RETARD_JOURNEE")
@IdClass(RetardPK.class)
public class Retard implements Serializable {

	private static final long serialVersionUID = 1L;

	
	
	@Column(insertable = false,updatable = false)
	@Id
	private String cod_soc;	
	@Column(insertable = false,updatable = false)
	@Id
	private String  mat_pers;	
	
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date dat_point;
	@Id
	private Long num_point;
	private Long h_point;
	private Long m_point;
	private Long h_reg;
	private Long m_reg;
	private String type;
	private Long duree_h;
	private Long duree_m;
	private String duree_tot;
	private Long semaine;
	private String cod_serv; 
	private String cod_reg; 
	private Date date_shift; 
	private String etat_retard; 
	private Date dat_sais; 
	
	private String cod_ur;
	
	
	private String nom_pren;
	
	public String getNom_Pren() {
		return nom_pren;
	}
	public void setNom_Pren(String nom_Pren) {
		this.nom_pren = nom_Pren;
	}
	public String getCod_ur() {
		return cod_ur;
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
	public Date getDat_point() {
		return dat_point;
	}
	public void setDat_point(Date dat_point) {
		this.dat_point = dat_point;
	}
	public Long getNum_point() {
		return num_point;
	}
	public void setNum_point(Long num_point) {
		this.num_point = num_point;
	}
	public Long getH_point() {
		return h_point;
	}
	public void setH_point(Long h_point) {
		this.h_point = h_point;
	}
	public Long getM_point() {
		return m_point;
	}
	public void setM_point(Long m_point) {
		this.m_point = m_point;
	}
	public Long getH_reg() {
		return h_reg;
	}
	public void setH_reg(Long h_reg) {
		this.h_reg = h_reg;
	}
	public Long getM_reg() {
		return m_reg;
	}
	public void setM_reg(Long m_reg) {
		this.m_reg = m_reg;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getDuree_h() {
		return duree_h;
	}
	public void setDuree_h(Long duree_h) {
		this.duree_h = duree_h;
	}
	public Long getDuree_m() {
		return duree_m;
	}
	public void setDuree_m(Long duree_m) {
		this.duree_m = duree_m;
	}
	public String getDuree_tot() {
		return duree_tot;
	}
	public void setDuree_tot(String duree_tot) {
		this.duree_tot = duree_tot;
	}
	public Long getSemaine() {
		return semaine;
	}
	public void setSemaine(Long semaine) {
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
	
	public String getNat_comp() {
		return cod_ur;
	}
	public void setCod_ur(String cod_ur) {
		this.cod_ur = cod_ur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public Retard() {
		super();
	}

	
	
}
