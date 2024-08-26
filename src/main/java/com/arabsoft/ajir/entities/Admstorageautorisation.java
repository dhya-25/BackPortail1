package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "admstorageautorisation")
public class Admstorageautorisation {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLibre")
    @SequenceGenerator(name = "seqLibre", sequenceName = "ADMSTORAGEAUTORISATION_SEQ", allocationSize = 1)
    private Long id_autho;
	@ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
 
    @ManyToOne
    @JoinColumn(name = "sum_id", nullable = true)
    private Admsubmodule admsubmodule;
    
    @ManyToOne
    @JoinColumn(name = "evt_id", nullable = true)
    private Admeventtype admeventtype;

	public Admstorageautorisation(Long id, Role role, Admsubmodule admsubmodule, Admeventtype admeventtype) {
		super();
		this.id_autho = id;
		this.role = role;
		this.admsubmodule = admsubmodule;
		this.admeventtype = admeventtype;
	}

	public Admstorageautorisation() {
		super();
	}

	public Long getId() {
		return id_autho;
	}

	public void setId(Long id) {
		this.id_autho = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Admsubmodule getAdmsubmodule() {
		return admsubmodule;
	}

	public void setAdmsubmodule(Admsubmodule admsubmodule) {
		this.admsubmodule = admsubmodule;
	}

	public Admeventtype getAdmeventtype() {
		return admeventtype;
	}

	public void setAdmeventtype(Admeventtype admeventtype) {
		this.admeventtype = admeventtype;
	}

	@Override
	public String toString() {
		return "Admstorageautorisation [id_autho=" + id_autho + ", role=" + role + ", admsubmodule=" + admsubmodule
				+ ", admeventtype=" + admeventtype + "]";
	}
    
    
}
