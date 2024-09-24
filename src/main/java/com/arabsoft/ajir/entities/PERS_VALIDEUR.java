package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(Cle_PERS_VALIDEUR.class)

public class PERS_VALIDEUR {
	@Id
	  private String cod_soc  ;
	@Id
	  private String  mat_pers ;
	@Id
	  private String  mat_resp ;
	  private Long  niveau   ;
		@Column(insertable = false, updatable = false)

	 private String  libnomprenom;
		@Column(insertable = false, updatable = false)
		private String  libnomprenomresp;
		
	 
	public PERS_VALIDEUR(String cod_soc, String mat_pers, String mat_resp, Long niveau, String libnomprenom,
				String libnomprenomresp) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.mat_resp = mat_resp;
			this.niveau = niveau;
			this.libnomprenom = libnomprenom;
			this.libnomprenomresp = libnomprenomresp;
		}
	public String getLibnomprenomresp() {
			return libnomprenomresp;
		}
		public void setLibnomprenomresp(String libnomprenomresp) {
			this.libnomprenomresp = libnomprenomresp;
		}
	public PERS_VALIDEUR(String cod_soc, String mat_pers, String mat_resp, Long niveau, String libnomprenom) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.mat_resp = mat_resp;
		this.niveau = niveau;
		this.libnomprenom = libnomprenom;
	}
	public String getLibnomprenom() {
		return libnomprenom;
	}
	public void setLibnomprenom(String libnomprenom) {
		this.libnomprenom = libnomprenom;
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
	public String getMat_resp() {
		return mat_resp;
	}
	public void setMat_resp(String mat_resp) {
		this.mat_resp = mat_resp;
	}
	public Long getNiveau() {
		return niveau;
	}
	public void setNiveau(Long niveau) {
		this.niveau = niveau;
	}
	public PERS_VALIDEUR() {
		super();
	}
	public PERS_VALIDEUR(String cod_soc, String mat_pers, String mat_resp, Long niveau) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.mat_resp = mat_resp;
		this.niveau = niveau;
	}
	  

}
