package com.arabsoft.ajir.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.*;


import org.jetbrains.annotations.Nullable;
import org.springframework.data.mapping.Parameter;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@NamedStoredProcedureQueries(
		{
			@NamedStoredProcedureQuery(
					name = "Testcng",
					procedureName = "libre_conge_annuel.libre_calcul_jours",
					parameters = {
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "soc_", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "mat_pers_", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "dat_debut_", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "dat_fin_", type = String.class),

							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "dat_reprise_prev_", type = LocalDate.class),
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "cng_temps_debut_", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "cng_temps_fin_", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nat_cng_", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "bonus_cng_", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nbr_jours_", type = Long.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nbr_jours_cal_", type = Long.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nbr_jours_fer_", type = Long.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "message_", type = String.class)

							
					}
					
					)
			
		}
		)

public class TestCongee {

	

	
	private String soc_	;
	@Id
	private String mat_pers_	;

	private String dat_debut_		;

	private String dat_fin_		;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dat_reprise_prev_	;
	private String cng_temps_debut_	;
	private String cng_temps_fin_	;
	private String nat_cng_	;
	private String bonus_cng_;
	private Long nbr_jours_		;
	private Long nbr_jours_cal_	;	
	private Long nbr_jours_fer_	;
	private String  message_	;
	public String getSoc_() {
		return soc_;
	}
	public void setSoc_(String soc_) {
		this.soc_ = soc_;
	}
	public String getMat_pers_() {
		return mat_pers_;
	}
	public void setMat_pers_(String mat_pers_) {
		this.mat_pers_ = mat_pers_;
	}
	public String getDat_debut_() {
		return dat_debut_;
	}
	public void setDat_debut_(String dat_debut_) {
		this.dat_debut_ = dat_debut_;
	}
	public String getDat_fin_() {
		return dat_fin_;
	}
	public void setDat_fin_(String dat_fin_) {
		this.dat_fin_ = dat_fin_;
	}
	public LocalDate getDat_reprise_prev_() {
		return dat_reprise_prev_;
	}
	public void setDat_reprise_prev_(LocalDate dat_reprise_prev_) {
		this.dat_reprise_prev_ = dat_reprise_prev_;
	}
	public String getCng_temps_debut_() {
		return cng_temps_debut_;
	}
	public void setCng_temps_debut_(String cng_temps_debut_) {
		this.cng_temps_debut_ = cng_temps_debut_;
	}
	public String getCng_temps_fin_() {
		return cng_temps_fin_;
	}
	public void setCng_temps_fin_(String cng_temps_fin_) {
		this.cng_temps_fin_ = cng_temps_fin_;
	}
	public String getNat_cng_() {
		return nat_cng_;
	}
	public void setNat_cng_(String nat_cng_) {
		this.nat_cng_ = nat_cng_;
	}
	public String getBonus_cng_() {
		return bonus_cng_;
	}
	public void setBonus_cng_(String bonus_cng_) {
		this.bonus_cng_ = bonus_cng_;
	}
	public Long getNbr_jours_() {
		return nbr_jours_;
	}
	public void setNbr_jours_(Long nbr_jours_) {
		this.nbr_jours_ = nbr_jours_;
	}
	public Long getNbr_jours_cal_() {
		return nbr_jours_cal_;
	}
	public void setNbr_jours_cal_(Long nbr_jours_cal_) {
		this.nbr_jours_cal_ = nbr_jours_cal_;
	}
	public Long getNbr_jours_fer_() {
		return nbr_jours_fer_;
	}
	public void setNbr_jours_fer_(Long nbr_jours_fer_) {
		this.nbr_jours_fer_ = nbr_jours_fer_;
	}
	public String getMessage_() {
		return message_;
	}
	public void setMessage_(String message_) {
		this.message_ = message_;
	}
	
	
}