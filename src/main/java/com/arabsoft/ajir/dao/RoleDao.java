package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Role;

public interface RoleDao extends JpaRepository<Role,Long>{

	@Query(value="select role_id as roleId,role_name as roleName from role where role_name=:name",nativeQuery = true)
	public Role getRoleName(@Param("name") String name);
	
	
	public Role findByRoleName(String name);
}
