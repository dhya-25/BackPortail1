package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(ID_Note_Rendement.class)
public class Note_Rendement {
	@Id
	private String cod_soc;
	@Id

	private String mat_pers;
	@Id

	@JsonFormat(pattern = "dd/MM/yyyy")

	private Date dat_note;
	private String cod_nat;
	private Long note_propose;
	private Long note_calcule;
	private Long note_definitive;
	private String valid;
	@Column(insertable = false, updatable = false)

	private String libnat;
	
	
	
	public Note_Rendement() {
		super();
	}

	public Note_Rendement(String cod_soc, String mat_pers, Date dat_note, String cod_nat, Long note_propose,
			Long note_calcule, Long note_definitive, String valid, String libnat) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_note = dat_note;
		this.cod_nat = cod_nat;
		this.note_propose = note_propose;
		this.note_calcule = note_calcule;
		this.note_definitive = note_definitive;
		this.valid = valid;
		this.libnat = libnat;
	}

	public String getLibnat() {
		return libnat;
	}

	public void setLibnat(String libnat) {
		this.libnat = libnat;
	}

	public Note_Rendement(String cod_soc, String mat_pers, Date dat_note, String cod_nat, Long note_propose,
			Long note_calcule, Long note_definitive, String valid) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_note = dat_note;
		this.cod_nat = cod_nat;
		this.note_propose = note_propose;
		this.note_calcule = note_calcule;
		this.note_definitive = note_definitive;
		this.valid = valid;
	}
	
	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
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
	public Date getDat_note() {
		return dat_note;
	}
	public void setDat_note(Date dat_note) {
		this.dat_note = dat_note;
	}
	public String getCod_nat() {
		return cod_nat;
	}
	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}
	public Long getNote_propose() {
		return note_propose;
	}
	public void setNote_propose(Long note_propose) {
		this.note_propose = note_propose;
	}
	public Long getNote_calcule() {
		return note_calcule;
	}
	public void setNote_calcule(Long note_calcule) {
		this.note_calcule = note_calcule;
	}
	public Long getNote_definitive() {
		return note_definitive;
	}
	public void setNote_definitive(Long note_definitive) {
		this.note_definitive = note_definitive;
	}
	public Note_Rendement(String cod_soc, String mat_pers, Date dat_note, String cod_nat, Long note_propose,
			Long note_calcule, Long note_definitive) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_note = dat_note;
		this.cod_nat = cod_nat;
		this.note_propose = note_propose;
		this.note_calcule = note_calcule;
		this.note_definitive = note_definitive;
	}
	

}
