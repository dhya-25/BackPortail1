package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.arabsoft.ajir.entities.LibreDemande;
import com.arabsoft.ajir.entities.ValidationDemandeChef;


	@Repository
	public interface ValidationDemandeChefRep extends JpaRepository<ValidationDemandeChef, Long>{
		
		@Query(value="select distinct t.mat_pers,t.mat_resp,t.niveau,Pk_Get_Lib.Get_personnel$NomPrenom(t.cod_soc,t.mat_resp) nom_resp ,l.id_libre_demande,v.etat_val,l.reponse,l.txt_chef \r\n"
				+ "from PERS_VALIDEUR t,personnel p,libre_demande l,libre_demande_val v\r\n"
				+ "where t.mat_pers=p.mat_pers\r\n"
				+ "and t.mat_resp=:matResp\r\n"
				+ "and t.mat_pers=l.mat_pers\r\n"
				+ "and l.id_libre_demande=v.id_libre_demande and v.mat_resp=t.mat_resp",nativeQuery=true)
		public List<ValidationDemandeChef> getValidationDemList(@Param("matResp") String matResp);
		
		@Query(value="select distinct t.mat_pers,t.mat_resp,t.niveau,Pk_Get_Lib.Get_personnel$NomPrenom(t.cod_soc,t.mat_resp) nom_resp ,l.id_libre_demande,v.etat_val,l.reponse,l.txt_chef \r\n"
				+ "from PERS_VALIDEUR t,personnel p,libre_demande l,libre_demande_val v\r\n"
				+ "where t.mat_pers=p.mat_pers\r\n"
				+ "and t.mat_resp=:matResp\r\n"
				+ "and t.mat_pers=l.mat_pers\r\n"
				+ "and l.id_libre_demande=v.id_libre_demande\r\n"
				+ "and l.id_libre_demande=:id and v.mat_resp=t.mat_resp ",nativeQuery=true)
		public List<ValidationDemandeChef> getValidationDemListById(@Param("matResp") String matResp,@Param("id") Long id);
		@Query(value="select distinct t.mat_pers,t.mat_resp,t.niveau,Pk_Get_Lib.Get_personnel$NomPrenom(t.cod_soc,t.mat_resp) nom_resp ,l.id_libre_demande,v.etat_val,l.reponse,l.txt_chef \r\n"
				+ "from PERS_VALIDEUR t,personnel p,libre_demande l,libre_demande_val v\r\n"
				+ "where t.mat_pers=p.mat_pers\r\n"
				+ "and t.mat_resp=:matResp\r\n"
				+ "and t.mat_pers=l.mat_pers\r\n"
				+ "and l.id_libre_demande=v.id_libre_demande\r\n"
				+ "and l.id_libre_demande=:id and v.mat_resp=t.mat_resp",nativeQuery=true)
		public List<ValidationDemandeChef> getValidationDemListByIdRH(@Param("matResp") String matResp,@Param("id") Long id);
		
		@Modifying
		@Transactional
		@Query(value="update libre_demande_val v\r\n"
				+ "   set v.etat_val = :etatVal\r\n"
				+ " where v.mat_resp = :matResp\r\n"
				+ "   and v.id_libre_demande = :id_libre_demande",nativeQuery=true)
		public   void updateDemListById(@Param("id_libre_demande") Long id_libre_demande,@Param("etatVal") String etatVal,@Param("matResp") String matResp);
		@Modifying
		@Transactional
		@Query(value="update libre_demande v\r\n"
				+ "   set v.reponse = :etatVal\r\n"
				+ " where \r\n"
				+ "    v.id_libre_demande = :id_libre_demande",nativeQuery=true)
		public   void updateDemRepChef(@Param("id_libre_demande") Long id_libre_demande,@Param("etatVal") String etatVal);
		
		@Modifying
		@Transactional
		@Query(value="update libre_demande v\r\n"
				+ "   set v.reponse = :etatVal\r\n"
				+", v.txt_reponse=:observation"
				+ " where   v.id_libre_demande = :id_libre_demande",nativeQuery=true)
		public   void updateDemRepRh(@Param("id_libre_demande") Long id_libre_demande,@Param("etatVal") String etatVal,@Param("observation") String observation);

		@Query(value="select distinct l.id_libre_demande,l.txt_chef,l.reponse \r\n"
				+ "from libre_demande_val v,libre_demande l \r\n"
				+ "where v.id_libre_demande=:id_libre_demande \r\n"
				+ "and l.id_libre_demande=v.id_libre_demande\r\n"
				+ "and v.cod_soc=l.cod_soc",nativeQuery=true)
		public List<LibreDemande> getRepChef(@Param("id_libre_demande") Long id_libre_demande);
}
