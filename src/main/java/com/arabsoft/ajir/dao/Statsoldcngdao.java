package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.Stat_Soldcng;

@Repository
public interface Statsoldcngdao extends JpaRepository<Stat_Soldcng, Long> {
	@Query(value="select s.annee_cng,s.sold_cng,s.cod_soc,s.mat_pers \r\n"
			+ "from SOLD_CNG s \r\n"
			+ "where s.cod_soc = :x\r\n"
			+ "and s.mat_pers =:y  \r\n",nativeQuery = true)
	public List<Stat_Soldcng> getStat_Soldcng(@Param("x")String x,@Param("y")String y);
	@Query(value="select   sum(MONTV) , to_char( p.dt_bul,'yyyy')  dat        \r\n"
			+ "       from possedevh p,par_fixe l\r\n"
			+ "        where p.cod_soc =:soc \r\n"
			+ "          and p.mat_pers =:mat \r\n"
			+ "          and p.abrv_fixe=l.abrv_fixe\r\n"
			+ "          and (l.cod_niv ='810'  )         \r\n"
			+ "         and   p.dt_bul between (trunc(sysdate)  - interval '10' year) and trunc(sysdate)\r\n"
			+ "          and  p.cod_typ_bul   = nvl('',p.cod_typ_bul)\r\n"
			+ "          group by  to_char( p.dt_bul,'yyyy')\r\n"
			+ "          order by to_char( p.dt_bul,'yyyy')",nativeQuery = true)
	public List<?> getMasseByPers(@Param("soc")String x,@Param("mat")String y);	

}