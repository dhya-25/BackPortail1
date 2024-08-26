package com.arabsoft.ajir.sevices;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.arabsoft.ajir.controller.ResponseMessage;
import com.arabsoft.ajir.dao.DemandeDao;
import com.arabsoft.ajir.dao.LibreDemandeBisDao;
import com.arabsoft.ajir.dao.LibreDemandeKDao;
import com.arabsoft.ajir.entities.Libre_demande;
import com.arabsoft.ajir.entities.Libre_demandeBis;
import com.arabsoft.ajir.entities.libreDemandek;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class LibreDemandeService {

	@Autowired
	DemandeDao demandeDAO;
	@Autowired
	LibreDemandeKDao demandek;
	@Autowired 
	LibreDemandeBisDao bisDao;

	@Transactional
	public ResponseMessage createDem(MultipartFile file, String dem) throws IOException {
		ResponseMessage responseMessage = new ResponseMessage();
		libreDemandek arti = new ObjectMapper().readValue(dem, libreDemandek.class);
		arti.setFichierJoint(file.getBytes());
		arti.setFileName(file.getOriginalFilename());
		arti.setContentType(file.getContentType());
		arti.setPath("DB");

		try {
			demandek.save(arti);
			responseMessage.setCode("0");
			responseMessage.setMessage("Demande created");
		} catch (Exception e) {
			responseMessage.setCode("1");
			responseMessage.setMessage("Demande Not created");
		}
		return responseMessage;
	}
	  public Libre_demandeBis getFile(Long id) {
		    return  bisDao.gettByid(id);
		  }
	  
		public Libre_demandeBis getDocument(Long  docId) {

			Libre_demandeBis document = bisDao.gettByid(docId);
			
			return document;
		}

}
	