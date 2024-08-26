package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ClePrimeMutPers;
import com.arabsoft.ajir.entities.PrimeMutPers;

public interface PrimeMutPersDao extends JpaRepository<PrimeMutPers, ClePrimeMutPers>{
	
	@Query(value="select cod_soc,\r\n"
			+ "mat_pers,\r\n"
			+ "num_prime,\r\n"
			+ "typ_prime,\r\n"
			+ "dat_deb,\r\n"
			+ "dat_fin,\r\n"
			+ "mnt_a_payer,\r\n"
			+ "mnt_payer,\r\n"
			+ "mod_pay,\r\n"
			+ "ref_pay,\r\n"
			+ "dat_saisie,\r\n"
			+ "etat_prime,\r\n"
			+ "corps,\r\n"
			+ "cod_typ_depart,\r\n"
			+ "cod_affect,\r\n"
			+ "mnt_param,\r\n"
			+ "num_retr,\r\n"
			+ "seq_ecrt1,\r\n"
			+ "seq_ecrt2,\r\n"
			+ "imput\r\n"
			+ " from prime_mut_pers where cod_soc=:soc and mat_pers=:mat and dat_deb between CASE \r\n"
			+ "          WHEN LENGTH(:moisDeb) = 4 THEN TRUNC(TO_DATE(:moisDeb, 'YYYY'), 'YYYY') \r\n"
			+ "          ELSE TRUNC(TO_DATE(:moisDeb, 'MM/YYYY'), 'MM') \r\n"
			+ "      END \r\n"
			+ "      AND \r\n"
			+ "      CASE \r\n"
			+ "          WHEN LENGTH(:moisFin) = 4 THEN LAST_DAY(ADD_MONTHS(TO_DATE(:moisFin, 'YYYY'), 11)) \r\n"
			+ "          ELSE LAST_DAY(TO_DATE(:moisFin, 'MM/YYYY')) \r\n"
			+ "      END",nativeQuery = true)
	List<PrimeMutPers> getPrimeMutPers(@Param("soc") String soc,@Param("mat")String pers,@Param("moisDeb")String moisDeb,@Param("moisFin")String moisFin);
 
}
