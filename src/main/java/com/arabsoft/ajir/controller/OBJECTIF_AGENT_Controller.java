package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.Objectif_Agent_Dao;
import com.arabsoft.ajir.entities.INTERIM_LIBRE_DEM;
import com.arabsoft.ajir.entities.OBJECTIF_AGENT;

@RestController
@CrossOrigin("*")
@RequestMapping("/OBJECTIF")
public class OBJECTIF_AGENT_Controller {
	@Autowired
	Objectif_Agent_Dao ob;
	@GetMapping("/getobj/{cod}/{mat}")
	List <OBJECTIF_AGENT> getobj(@PathVariable("cod")String cod,@PathVariable("mat")String mat){
 return ob.getOBJECTIF_AGENT(cod, mat);
 }
	@CrossOrigin
	@PostMapping("/save")
	public void save (@RequestBody List <OBJECTIF_AGENT> aa) {
		for(int i =0;i<aa.size();i++ ) {
			
			
			OBJECTIF_AGENT Obj=aa.get(i);
			 
			System.out.println(Obj);
			
			
		}
	 	ob.saveAll(aa);

		
		
		
		
	}
	
	@CrossOrigin
	 @DeleteMapping("/DeleteObjectif/{id}/{mat}/{annee}")
	  
	  public void deleteByIdAndMat(@PathVariable("id") Long id,@PathVariable ("mat") String mat,@PathVariable ("annee") String annee) {
		  try {
			  ob.DeleteObjectif(mat, id,annee);
		} catch (Exception e) {
			System.out.println(e);
		}
		   
		  
	  }

}
