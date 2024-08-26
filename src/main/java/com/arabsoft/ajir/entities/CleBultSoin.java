package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;



public class CleBultSoin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	 
    public String cod_soc;
	 
    public String mat_pers;
	
    public Long num_fam;
	
    public LocalDate dat_soin;

	public CleBultSoin(String cod_soc, String mat_pers, Long num_soins, LocalDate dat_soins) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_fam = num_soins;
		this.dat_soin = dat_soins;
	}

	public CleBultSoin() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}