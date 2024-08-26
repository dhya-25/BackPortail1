package com.arabsoft.ajir.sevices;

 import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.arabsoft.ajir.entities.AttachmentDemande;

public interface AttachmentService {
    AttachmentDemande saveAttachment(MultipartFile file,Long id,Long id_Attachment) throws Exception;

    AttachmentDemande getAttachment(Long fileId) throws Exception;
    
    List<AttachmentDemande> getAttachmentByIdDemande(Long fileId) throws Exception;
    
    List<AttachmentDemande> getAllAttachments();

    
}
