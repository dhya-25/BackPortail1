package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.INTERIM_CNG_Dao;
import com.arabsoft.ajir.dao.InterimEntityDao;
import com.arabsoft.ajir.entities.INTERIM_LIBRE_DEM;
import com.arabsoft.ajir.entities.InterimEntity;

@RestController
@CrossOrigin("*")
@RequestMapping("/INTERIM_CNG")



class INTERIM_CNG_Controller {
	@Autowired INTERIM_CNG_Dao interim;
	@Autowired InterimEntityDao entityDao;
	@PostMapping("/save/{idcng}")
	public void save (@RequestBody List <INTERIM_LIBRE_DEM> aa,@PathVariable("idcng") long idcng ) {
		for(int i =0;i<aa.size();i++ ) {
			
			 aa.get(i).setId_libre_demande(idcng);
			 INTERIM_LIBRE_DEM Obj=aa.get(i);
			 
			System.out.println(Obj);
			
			
		}
	 	interim.saveAll(aa);

		
		
		
		
	}
	
	@GetMapping("/getId/{id}")
	public List<InterimEntity> getInterim(@PathVariable("id") long  id){
		return entityDao.getById_libre_demande(id) ; 
		
	}
	
	@CrossOrigin
	  @PutMapping("/updateInterim/{id}/{mat}")
		 
	  public ResponseEntity<INTERIM_LIBRE_DEM> updateRh( @RequestBody INTERIM_LIBRE_DEM Ag,@PathVariable("id") Long id,@PathVariable("mat")String mat) {
	  try {
		  INTERIM_LIBRE_DEM AgData =interim.updateInter(Ag.getMat_pers_int(), Ag.getDat_debut_int(), Ag.getDat_fin_int(), id, mat);
	    	interim.commit();
	    	  return new ResponseEntity<>(AgData, HttpStatus.OK); 		
	  }
	  catch (Exception e) {
		System.out.println(e);
	}
	  return new ResponseEntity<>(Ag, HttpStatus.OK); 	
	  }
	  
	  @DeleteMapping("/DeleteInterim/{id}/{mat}")
	  
	  public void deleteByIdAndMat(@PathVariable("id") Long id,@PathVariable ("mat") String mat) {
		  try {
			  interim.DeleteByIdAndMat(mat, id);
		} catch (Exception e) {
			System.out.println(e);
		}
		   
		  
	  }
	  
	  @DeleteMapping("/DeleteDem/{id}")
	  
	  public void DeleteDemande(@PathVariable("id") Long id) {
		  try {  
			  interim.DeleteInterimById(id);
				interim.commit();
		  }
		  catch (Exception e) {
			System.out.println(e);
	  }
		  try {    
		   interim.DeleteDemande(id);
		   interim.commit();
		  }
		  catch (Exception e) {
			System.out.println(e);
	  }  	  
	  } 
}
