package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.AttachmentDemande;

public interface AttachmentDemandeDao extends JpaRepository<AttachmentDemande, Long>{

	
	@Query(value="select id,time,data,file_type,file_name,id_demande from ATTACHMENT_DEAMNDE where id_demande=:id",nativeQuery = true)
	List<AttachmentDemande> getAttachmentByIdDemande(@Param("id") Long id);
}
