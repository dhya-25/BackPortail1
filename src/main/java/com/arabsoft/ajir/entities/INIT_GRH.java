package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class INIT_GRH {
	@Id
	private String cod_soc  ;
	private String  lib    ;
	private String  val1   ;
	private String  val2   ;
	private String	  val3 ;
	private String  type ;
	private String  comm ;
	public INIT_GRH() {
		super();
		// TODO Auto-generated constructor stub
	}
	public INIT_GRH(String cod_soc, String lib, String val1, String val2, String val3, String type, String comm) {
		super();
		this.cod_soc = cod_soc;
		this.lib = lib;
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.type = type;
		this.comm = comm;
	}
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}
	public String getVal1() {
		return val1;
	}
	public void setVal1(String val1) {
		this.val1 = val1;
	}
	public String getVal2() {
		return val2;
	}
	public void setVal2(String val2) {
		this.val2 = val2;
	}
	public String getVal3() {
		return val3;
	}
	public void setVal3(String val3) {
		this.val3 = val3;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComm() {
		return comm;
	}
	public void setId_init_grh(String comm) {
		this.comm = comm;
	}

}
