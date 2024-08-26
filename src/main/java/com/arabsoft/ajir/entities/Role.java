package com.arabsoft.ajir.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="Role")
public class Role {

	@Id
	@Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name", nullable = false, unique = true)
    private String roleName;

    @OneToMany(mappedBy = "role")
    @JsonProperty(access = Access.WRITE_ONLY)
    private Set<Admstorageautorisation> admstorgeautorisations;

		public Role(Long roleId, String roleName, Set<Admstorageautorisation> admstorgeautorisations) {
			super();
			this.roleId = roleId;
			this.roleName = roleName;
			this.admstorgeautorisations = admstorgeautorisations;
		}

		public Role() {
			super();
		}

		public Long getRoleId() {
			return roleId;
		}

		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public Set<Admstorageautorisation> getAdmstorgeautorisations() {
			return admstorgeautorisations;
		}

		public void setAdmstorgeautorisations(Set<Admstorageautorisation> admstorgeautorisations) {
			this.admstorgeautorisations = admstorgeautorisations;
		}
	    
	    
	    
}
