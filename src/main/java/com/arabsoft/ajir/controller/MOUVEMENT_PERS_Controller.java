package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.MOUVEMENT_PERS_Dao;
import com.arabsoft.ajir.entities.MOUVEMENT_PERS;

@RestController
@CrossOrigin("*")
@RequestMapping("/mvt")
public class MOUVEMENT_PERS_Controller {
	@Autowired
	MOUVEMENT_PERS_Dao mv;
	@GetMapping("movement/{cod}/{mat}")
	public List<MOUVEMENT_PERS> getMovement(@PathVariable("cod")String cod,@PathVariable("mat")String mat){
		return mv.getContrat(cod,mat);}

}
