package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PARAM_EVAL_DEFINITIVE {

	@Id
	private String COD_APP_DEF;                                                                                         
	private Long TAUX_MIN;                                                                                   
	private Long TAUX_MAX;                                                                                                     
	private String APPRECTAION;    
	private String LIB_APP;                                                                                        
	private String OBSERVATIONS;
	public String getCOD_APP_DEF() {
		return COD_APP_DEF;
	}
	public void setCOD_APP_DEF(String cOD_APP_DEF) {
		COD_APP_DEF = cOD_APP_DEF;
	}
	public Long getTAUX_MIN() {
		return TAUX_MIN;
	}
	public void setTAUX_MIN(Long tAUX_MIN) {
		TAUX_MIN = tAUX_MIN;
	}
	public Long getTAUX_MAX() {
		return TAUX_MAX;
	}
	public void setTAUX_MAX(Long tAUX_MAX) {
		TAUX_MAX = tAUX_MAX;
	}
	public String getAPPRECTAION() {
		return APPRECTAION;
	}
	public void setAPPRECTAION(String aPPRECTAION) {
		APPRECTAION = aPPRECTAION;
	}
	public String getLIB_APP() {
		return LIB_APP;
	}
	public void setLIB_APP(String lIB_APP) {
		LIB_APP = lIB_APP;
	}
	public String getOBSERVATIONS() {
		return OBSERVATIONS;
	}
	public void setOBSERVATIONS(String oBSERVATIONS) {
		OBSERVATIONS = oBSERVATIONS;
	}  
	
	
}
