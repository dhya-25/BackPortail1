package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.LibreDemande;
@Repository
public interface LibreDemandeRep  extends JpaRepository<LibreDemande, Long> {

}
