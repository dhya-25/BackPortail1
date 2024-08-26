package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ID_Note_Rendement;
import com.arabsoft.ajir.entities.Note_Rendement;

public interface Note_Rendement_Dao extends JpaRepository<Note_Rendement, ID_Note_Rendement> {
	@Query(value="Select n.cod_soc ,\r\n"
			+ "  n.mat_pers,\r\n"
			+ "  n.dat_note,\r\n"
			+ "  n.cod_nat,\r\n"
			+ "  n.note_propose,\r\n"
			+ "  n.note_calcule,\r\n"
			+ "  n.note_definitive,\r\n"
			+ " decode(n.valid,'V','Validé(e)','S','Saisie','C','Validé(e) par Comité')valid,\r\n"
			+ " pk_get_lib.GET_NATURE_NOT$LIB_NAT(n.cod_nat) libnat \r\n"
			+ " FROM NOTE_RENDEMENT n where n.cod_soc =:cod and n.mat_pers =:mat\r\n",nativeQuery=true)
	public List<Note_Rendement> getRendement(@Param("cod")String cod,@Param("mat") String mat);}
