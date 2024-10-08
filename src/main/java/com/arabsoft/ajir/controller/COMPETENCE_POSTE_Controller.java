package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.arabsoft.ajir.entities.COMPETENCE_POSTE;
import com.arabsoft.ajir.entities.Competence_P;
import com.arabsoft.ajir.dao.COMPETENCE_POSTE_Dao;
import com.arabsoft.ajir.dao.Competence_PDao;

@RestController
@CrossOrigin("*")
@RequestMapping("/COMPETENCE_POSTE")
public class COMPETENCE_POSTE_Controller {
	@Autowired COMPETENCE_POSTE_Dao cmp;
	@Autowired
	Competence_PDao competence_PDao;
	
	
	@GetMapping("/get/{mat}")
	public List <COMPETENCE_POSTE> get(@PathVariable("mat")String mat){
		return cmp.get(mat);
		
		
		
		
	}
	@GetMapping("/getComp/{soc}/{mat}")
	public List <Competence_P> getComp(@PathVariable("soc")String soc,@PathVariable("mat")String mat){
		return competence_PDao.getCompetP(soc,mat);
		
	}
	@GetMapping("/getComp/{soc}/{mat}/{metier}/{post}")
	public Object getTauxComp(@PathVariable("soc")String soc,@PathVariable("mat")String mat,
			@PathVariable("metier")String metier,@PathVariable("post")String post){
		return competence_PDao.getTauxComp(soc,mat,metier,post);
		
	}
}
