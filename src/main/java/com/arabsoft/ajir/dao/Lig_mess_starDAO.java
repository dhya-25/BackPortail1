package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Lig_mess_star;

 

public interface Lig_mess_starDAO extends JpaRepository<Lig_mess_star, String> {
	@Query(value=" select txt_mess  from lig_mess_star\r\n"
			+ "      where   cod_soc  =:soc\r\n"
			+ "     and mat_pers =:mat \r\n"
			+ "     and num_bult =:num_bult",nativeQuery = true)
	public List<Lig_mess_star> getMessage(@Param("soc") String soc,@Param("mat") String mat,@Param("num_bult") Long num_bult);
}
