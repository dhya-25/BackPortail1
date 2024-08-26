package com.arabsoft.ajir.sevices;


import com.arabsoft.ajir.dao.AttachmentDemandeDao;
import com.arabsoft.ajir.entities.AttachmentDemande; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AttachmentServiceImpl implements AttachmentService{

    @Autowired
    private AttachmentDemandeDao attachmentRepository;


    @Override
    public AttachmentDemande saveAttachment(MultipartFile file,Long id,Long id_Attachment) throws Exception {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if(fileName.contains("..")) {
                throw  new Exception("Filename contains invalid path sequence "
                        + fileName);
            }
            System.out.println("type : "+file.getContentType());
            AttachmentDemande attachment
                    =AttachmentDemande.builder().data(file.getBytes()).file_type(file.getContentType())
                    .file_name(fileName).time(LocalDateTime.now())
                    .build();
            attachment.setId_demande(id);
            attachment.setId(id_Attachment);

            return attachmentRepository.save(attachment);

        } catch (Exception e) {
            throw new Exception("Could not save File: " + fileName);
        }
    }

    @Override
    public AttachmentDemande getAttachment(Long fileId) throws Exception {
        return attachmentRepository
                .findById(fileId)
                .orElseThrow(
                        () -> new Exception("File not found with Id: " + fileId));
    }

	@Override
	public List<AttachmentDemande> getAttachmentByIdDemande(Long fileId) throws Exception {
		// TODO Auto-generated method stub
		return attachmentRepository.getAttachmentByIdDemande(fileId);
	}

	@Override
	public List<AttachmentDemande> getAllAttachments() {
		// TODO Auto-generated method stub
		return attachmentRepository.findAll();
	}
	
	
}
