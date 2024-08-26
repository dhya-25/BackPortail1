package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RolePortail {

	@Id
	public String use_login;
	public String role_portail;
	public String getUse_login() {
		return use_login;
	}
	public void setUse_id(String use_login) {
		this.use_login = use_login;
	}
	public String getRole_portail() {
		return role_portail;
	}
	public void setRole_portail(String role_portail) {
		this.role_portail = role_portail;
	}
	public RolePortail(String use_login, String role_portail) {
		super();
		this.use_login = use_login;
		this.role_portail = role_portail;
	}
	public RolePortail() {
		super();
	}
	
	
	
	
}
