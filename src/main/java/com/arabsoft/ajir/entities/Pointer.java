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
@Table(name = "POINTER")
@IdClass(PointagePK.class)
public class Pointer implements Serializable {

	private static final long serialVersionUID = 1L;
@Id
	private String cod_soc;	
@Id
	private String  mat_pers;
private String typ_point;	
@Id
	private Long h_point;
@Id
	private Long  min_point;	
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date date_point;	
	private Long n_carte;
	private Long num_point;
	private String type;
	private String num_pointeuse;
	private Long semaine;
	private String typ_reg;
	private String cod_reg;
	private Long h_reg;
	private Long m_reg;
	private String cod_m;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date  date_j_point;

	private String typ_valid;
	private String cod_auto;
	
	private String nom_Pren;

	

	public String getTyp_point() {
		return typ_point;
	}
	public void setTyp_point(String typ_point) {
		this.typ_point = typ_point;
	}
	public Long getN_carte() {
		return n_carte;
	}
	public void setN_carte(Long n_carte) {
		this.n_carte = n_carte;
	}
	public Long getNum_point() {
		return num_point;
	}
	public void setNum_point(Long num_point) {
		this.num_point = num_point;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNum_pointeuse() {
		return num_pointeuse;
	}
	public void setNum_pointeuse(String num_pointeuse) {
		this.num_pointeuse = num_pointeuse;
	}
	public Long getSemaine() {
		return semaine;
	}
	public void setSemaine(Long semaine) {
		this.semaine = semaine;
	}
	public String getTyp_reg() {
		return typ_reg;
	}
	public void setTyp_reg(String typ_reg) {
		this.typ_reg = typ_reg;
	}
	public String getCod_reg() {
		return cod_reg;
	}
	public void setCod_reg(String cod_reg) {
		this.cod_reg = cod_reg;
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
	public String getCod_m() {
		return cod_m;
	}
	public void setCod_m(String cod_m) {
		this.cod_m = cod_m;
	}
	public String getTyp_valid() {
		return typ_valid;
	}
	public void setTyp_valid(String typ_valid) {
		this.typ_valid = typ_valid;
	}
	public String getCod_auto() {
		return cod_auto;
	}
	public void setCod_auto(String cod_auto) {
		this.cod_auto = cod_auto;
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
	public String getNomPren() {
		return nom_Pren;
	}
	public void setNomPren(String nomPren) {
		this.nom_Pren = nomPren;
	}
	
	public Long getH_point() {
		return h_point;
	}
	public void setH_point(Long h_point) {
		this.h_point = h_point;
	}
	public Long getMin_point() {
		return min_point;
	}
	public void setMin_point(Long min_point) {
		this.min_point = min_point;
	}
	public Date getDate_point() {
		return date_point;
	}
	public void setDate_point(Date date_point) {
		this.date_point = date_point;
	}
	public Date getDate_j_point() {
		return date_j_point;
	}
	public void setDate_j_point(Date date_j_point) {
		this.date_j_point = date_j_point;
	}
	public Pointer() {
		super();
	}
	
	

}
