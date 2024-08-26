package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.Acte_LigBultStarDAO;
import com.arabsoft.ajir.dao.Lig_mess_starDAO;
import com.arabsoft.ajir.dao.Lig_reclam_bct_DAO;
import com.arabsoft.ajir.entities.Acte_LigBultStar;
import com.arabsoft.ajir.entities.Lig_mess_star;
import com.arabsoft.ajir.entities.Lig_reclam_bct;

@RequestMapping("/Acte_LigBultStar")
@CrossOrigin("*")
@RestController
public class Acte_LigBultStar_Controller {

	@Autowired
	Acte_LigBultStarDAO acte_LigBultStarDAO;
	@Autowired
	Lig_reclam_bct_DAO reclam_bct_DAO;
	@Autowired
	Lig_mess_starDAO lig_mess_starDAO;
	
	@GetMapping("/GetListe/{soc}/{mat}/{num_bult}")
	public List<Acte_LigBultStar> getActe_BultStar(@PathVariable("soc") String soc,@PathVariable ("mat") String mat,@PathVariable ("num_bult") Long num_bult){
		return acte_LigBultStarDAO.GetActe_BuldStar(soc, mat, num_bult);
	}
	
	@GetMapping("/GetReclam/{soc}/{mat}/{num_bult}")
	public List<Lig_reclam_bct> GetReclam(@PathVariable("soc") String soc,@PathVariable ("mat") String mat,@PathVariable ("num_bult") Long num_bult){
		return reclam_bct_DAO.getReclam(soc, mat, num_bult);
	}
	@GetMapping("/GetMessage/{soc}/{mat}/{num_bult}")
	public List<Lig_mess_star> GetMessage(@PathVariable("soc") String soc,@PathVariable ("mat") String mat,@PathVariable ("num_bult") Long num_bult){
		return lig_mess_starDAO.getMessage(soc, mat, num_bult);
	}
	
}
 