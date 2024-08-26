package com.arabsoft.ajir.dao;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.arabsoft.ajir.entities.TestCngExcept;

public interface TestCngExceptDao extends JpaRepository<TestCngExcept, String> {
	@Procedure(name="Testcngexcept")
	Object  TestCngExceptt(String wcod_soc, String wmat_pers,String wcode_m,String wdat_debut,  String wdat_fin, String p_message);

}
