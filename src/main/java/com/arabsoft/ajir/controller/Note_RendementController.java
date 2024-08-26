package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.Note_Rendement_Dao;
import com.arabsoft.ajir.entities.Note_Rendement;

@RestController
@RequestMapping("/note")
@CrossOrigin("*")
public class Note_RendementController {
	@Autowired Note_Rendement_Dao note;
	
	
	@GetMapping("/get/{cod}/{mat}")
	public List <Note_Rendement> getNotes(@PathVariable("cod")String cod,@PathVariable("mat")String mat){
		return note.getRendement(cod, mat);
		
		
		
	}

}
