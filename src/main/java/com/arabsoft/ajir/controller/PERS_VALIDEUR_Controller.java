package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.INTERIM_CNG_Dao;
import com.arabsoft.ajir.dao.PERS_VALIDEUR_Dao;
import com.arabsoft.ajir.dao.RoleDao;
import com.arabsoft.ajir.entities.Cle_PERS_VALIDEUR;
import com.arabsoft.ajir.entities.PERS_VALIDEUR;
import com.arabsoft.ajir.entities.Role;

import java.util.List;

import javax.transaction.Transactional;
@RestController
@CrossOrigin("*")
@RequestMapping("/PERS_VALIDEUR")
public class PERS_VALIDEUR_Controller {
	@Autowired
	PERS_VALIDEUR_Dao dao;
	@Autowired INTERIM_CNG_Dao cng_Dao;
	@Autowired
	RoleDao roleDao;
	@GetMapping("/getpersvalideur/{cod}/{mat}")
	public List<PERS_VALIDEUR> getPERS_VALIDEURbyId(@PathVariable("cod")String cod,@PathVariable("mat")String mat){
		return dao.getall(cod,mat);}
	@GetMapping("/matchefbyniv/{matChef}/{mat}")
	public PERS_VALIDEUR matchefbyniv(@PathVariable("matChef")String matChef,@PathVariable("mat")String mat) {
		return dao.matchefbyniv(matChef,mat);
	}

	@GetMapping("/getPersValid")
	public List<PERS_VALIDEUR> getPersValid() {
		return dao.getPersValid();
	}
	
	@PostMapping("/addPersValid")
	public void addPers(@RequestBody PERS_VALIDEUR pers)
	{
		try {
			String soc=pers.getCod_soc();
			String mat=pers.getMat_pers();
			String mat_resp=pers.getMat_resp();
			Long niv=pers.getNiveau();
			
			dao.addPersValid(soc, mat, mat_resp, niv);
			cng_Dao.commit();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	
	@PutMapping("/updatePersValid")
	public void updatePers(@RequestBody PERS_VALIDEUR pers)
	{
		try {
			String soc=pers.getCod_soc();
			String mat=pers.getMat_pers();
			String mat_resp=pers.getMat_resp();
			Long niv=pers.getNiveau();
			dao.updatePersValid(soc, mat, mat_resp, niv);
			cng_Dao.commit();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	 }
	

	@PostMapping("/AddRole")
	public Role addRole(@RequestBody Role role)
	{ 
			return roleDao.save(role);
		 
	}
	@Transactional
	@DeleteMapping("/DeletePersValide/{cod_soc}/{mat_pers}/{mat_resp}")
	public ResponseEntity<String> DeletePersValide(@PathVariable String cod_soc, @PathVariable String mat_pers, @PathVariable String mat_resp) {
	    dao.DeletePersValideur(cod_soc, mat_pers, mat_resp);
	    return ResponseEntity.ok("OK");
	}
	
	@DeleteMapping("/DeleteRole/{roleId}")
	public ResponseEntity<Void> deleteRole(@PathVariable Long roleId) {
		roleDao.deleteById(roleId);
		return ResponseEntity.ok().build();
	}
	
}
