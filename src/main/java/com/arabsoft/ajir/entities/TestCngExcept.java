package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Pattern;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
@NamedStoredProcedureQueries(
		{
			@NamedStoredProcedureQuery(
					name = "Testcngexcept",
					procedureName = " libre_conge_annuel.appel_cng_exceptionnel",
					parameters = {
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "wcod_soc", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "wmat_pers", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "wcode_m", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.IN, name = "wdat_debut", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.INOUT, name = "wdat_fin", type =String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wlib_mot", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wplafond_cng", type = Long.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wtyp_plafond", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wtyp_jour", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT,  name = "wnbr_jours", type = Long.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wnbr_jours_cal", type = Long.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wnbr_jours_fer", type = Long.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wdat_reprise_prev", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wlib_dat_rep", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.OUT, name = "wlib_dat_fin", type = String.class),
							@StoredProcedureParameter(mode = ParameterMode.INOUT, name = "p_message", type = String.class)



							
					}
					
					)
			
		}
		)

public class TestCngExcept   {
	private String wcod_soc;
	@Id
	private String wmat_pers;
	private String wcode_m;
	private String wdat_debut;
 	@JsonFormat(pattern = "dd/MM/yyyy")
	private String wdat_fin;
	private String wlib_mot;
	private String wplafond_cng;
	private String wtyp_plafond;
	private String wtyp_jour;
	private Long wnbr_jours;
	private Long wnbr_jours_cal;
	private Long wnbr_jours_fer;

	private String wdat_reprise_prev;
	private String wlib_dat_rep;
	private String wlib_dat_fin;
	private String p_message;
	public TestCngExcept() {
		super();
	}
	public TestCngExcept(String wcod_soc, String wmat_pers, String wcode_m, String wdat_debut, String wdat_fin,
			String wlib_mot, String wplafond_cng, String wtyp_plafond, String wtyp_jour, Long wnbr_jours,
			Long wnbr_jours_cal, Long wnbr_jours_fer, String wdat_reprise_prev, String wlib_dat_rep, String wlib_dat_fin,
			String p_message) {
		super();
		this.wcod_soc = wcod_soc;
		this.wmat_pers = wmat_pers;
		this.wcode_m = wcode_m;
		this.wdat_debut = wdat_debut;
		this.wdat_fin = wdat_fin;
		this.wlib_mot = wlib_mot;
		this.wplafond_cng = wplafond_cng;
		this.wtyp_plafond = wtyp_plafond;
		this.wtyp_jour = wtyp_jour;
		this.wnbr_jours = wnbr_jours;
		this.wnbr_jours_cal = wnbr_jours_cal;
		this.wnbr_jours_fer = wnbr_jours_fer;
		this.wdat_reprise_prev = wdat_reprise_prev;
		this.wlib_dat_rep = wlib_dat_rep;
		this.wlib_dat_fin = wlib_dat_fin;
		this.p_message = p_message;
	}
	public String getWcod_soc() {
		return wcod_soc;
	}
	public void setWcod_soc(String wcod_soc) {
		this.wcod_soc = wcod_soc;
	}
	public String getWmat_pers() {
		return wmat_pers;
	}
	public void setWmat_pers(String wmat_pers) {
		this.wmat_pers = wmat_pers;
	}
	public String getWcode_m() {
		return wcode_m;
	}
	public void setWcode_m(String wcode_m) {
		this.wcode_m = wcode_m;
	}
	
	public String getWdat_debut() {
		return wdat_debut;
	}
	public void setWdat_debut(String wdat_debut) {
		this.wdat_debut = wdat_debut;
	}
	public String getWdat_fin() {
		return wdat_fin;
	}
	public void setWdat_fin( String wdat_fin) {
		this.wdat_fin = wdat_fin;
	}
	public void setWdat_reprise_prev(String wdat_reprise_prev) {
		this.wdat_reprise_prev = wdat_reprise_prev;
	}
	public String getWlib_mot() {
		return wlib_mot;
	}
	public void setWlib_mot(String wlib_mot) {
		this.wlib_mot = wlib_mot;
	}
	public String getWplafond_cng() {
		return wplafond_cng;}
	public void setWplafond_cng(String wplafond_cng) {
		this.wplafond_cng = wplafond_cng;
	}
	public String getWtyp_plafond() {
		return wtyp_plafond;
	}
	public void setWtyp_plafond(String wtyp_plafond) {
		this.wtyp_plafond = wtyp_plafond;
	}
	public String getWtyp_jour() {
		return wtyp_jour;
	}
	public void setWtyp_jour(String wtyp_jour) {
		this.wtyp_jour = wtyp_jour;
	}
	public Long getWnbr_jours() {
		return wnbr_jours;
	}
	public void setWnbr_jours(Long wnbr_jours) {
		this.wnbr_jours = wnbr_jours;
	}
	public Long getWnbr_jours_cal() {
		return wnbr_jours_cal;
	}
	public void setWnbr_jours_cal(Long wnbr_jours_cal) {
		this.wnbr_jours_cal = wnbr_jours_cal;
	}
	public Long getWnbr_jours_fer() {
		return wnbr_jours_fer;
	}
	public void setWnbr_jours_fer(Long wnbr_jours_fer) {
		this.wnbr_jours_fer = wnbr_jours_fer;
	}
	
	public String getWdat_reprise_prev() {
		return wdat_reprise_prev;
	}
	public String getWlib_dat_rep() {
		return wlib_dat_rep;
	}
	public void setWlib_dat_rep(String wlib_dat_rep) {
		this.wlib_dat_rep = wlib_dat_rep;
	}
	public String getWlib_dat_fin() {
		return wlib_dat_fin;
	}
	public void setWlib_dat_fin(String wlib_dat_fin) {
		this.wlib_dat_fin = wlib_dat_fin;
	}
	public String getP_message() {
		return p_message;
	}
	public void setP_message(String p_message) {
		this.p_message = p_message;
	}
	

}
