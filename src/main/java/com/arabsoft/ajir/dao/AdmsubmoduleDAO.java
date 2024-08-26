package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.Admsubmodule;

public interface AdmsubmoduleDAO extends JpaRepository<Admsubmodule, Long>{
	
	@Query(value="select sum_id, sum_name, sum_rank, mod_id, sum_status, sum_rout, mdl_icon from Admsubmodule where sum_status='O' order by sum_rank asc",nativeQuery=true)
	public List<Admsubmodule> getListSubmodule();

	
	@Query(value="select sum_id, sum_name, sum_rank, mod_id, sum_status, sum_rout, mdl_icon from Admsubmodule order by sum_rank asc",nativeQuery=true)
	public List<Admsubmodule> getListSubmoduleAdminis();
}
