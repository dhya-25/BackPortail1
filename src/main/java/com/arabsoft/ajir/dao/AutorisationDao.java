package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Autorisation;
import com.arabsoft.ajir.entities.AutorisationPK;


public interface AutorisationDao extends JpaRepository<Autorisation, AutorisationPK>{
	
	@Query(value="select cod_soc,mat_pers, num_aut, dat_debut_aut, dat_fin_aut, cod_aut,pk_get_lib.GET_TYP_AUTORI$LIB_TYP_AUT(cod_aut) lib_aut, \r\n"
			+ "etat_aut, heur_s, min_s,heur_s, \r\n"
			+ "heur_r, min_r, duree, dat_decision, num_decision, obs_aut, cod_ur, cod_serv, cod_class, cod_metier, poste_trav, org_serv, \r\n"
			+ "dat_saisie, dat_maj, duree_m, typ_aut, duree_j,"
			+ "pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)nom_pren\r\n"
			+ "from autorisation_sort a where (mat_pers =:matChef  or mat_pers in \r\n"
			+ "(select mat_pers from pers_valideur where mat_resp=:matChef))", nativeQuery=true)
	public List<Autorisation> getAutorisstion(@Param("matChef")String matChef);

}
