package com.arabsoft.ajir.dao;

 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.AdmUser;



@Repository
public interface AdmUserRep extends JpaRepository<AdmUser, Long>{
	  Boolean existsByUselogin(String email);
	 AdmUser findByMatpers(String username);
	  // AdmUser findByUselogin(String username);
	  Optional<AdmUser> findBymatpers(String matpers);


	/* @Query("select a from AdmUser a where a.mat_pers=:mat_pers and a.use_psw=:use_psw")
	  AdmUser Login(@Param("mat_pers") String mat_pers,@Param("use_psw") String use_psw);  */
	  
	  	@Query("select a from AdmUser a where a.role_portail = 'RH' ")
		public AdmUser MatRH();
		@Query("select a from AdmUser a where a.uselogin=:x ")
		public AdmUser login(@Param("x") String mat);
		@Query("select a from AdmUser a where a.uselogin=:x and a.usepsw=:y ")
		 public AdmUser login2(@Param("x") String mat,@Param("y") String pass);
		@Query("UPDATE AdmUser u SET u.use_nbessai = ?1 WHERE u.matpers = ?2")
	    @Modifying
	    public void updateFailedAttempts(long failAttempts, String email);
		
		@Query("select a from AdmUser a where a.cod_soc=:codsoc and a.matpers=:matpers ")
		Optional<AdmUser> finduser(@Param("codsoc")String cod,@Param("matpers") String mat);
		@Query("select a from AdmUser a where a.resettoken=:x ")
	    Optional<AdmUser> findByResetToken(@Param("x") String resetToken);
		
		}
