package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lig_mess_star {

	
	@Id
	private String txt_mess;

	public String getTxt_mess() {
		return txt_mess;
	}

	public void setTxt_mess(String txt_mess) {
		this.txt_mess = txt_mess;
	}
	
}
