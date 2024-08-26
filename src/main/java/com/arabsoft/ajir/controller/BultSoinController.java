package com.arabsoft.ajir.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.ActeRep;
import com.arabsoft.ajir.dao.BulletinStarRep;
import com.arabsoft.ajir.dao.BultSoinRep;
import com.arabsoft.ajir.dao.LigBultActeDao;
import com.arabsoft.ajir.dao.LigBultAppDao;
import com.arabsoft.ajir.dao.LigBultMedDao;
import com.arabsoft.ajir.dao.LigBultRep;
import com.arabsoft.ajir.dao.LigBultStarRep;
import com.arabsoft.ajir.dao.LigBultVisitDao;
import com.arabsoft.ajir.dao.LigPharDao;
import com.arabsoft.ajir.entities.BulletinStar;
import com.arabsoft.ajir.entities.BultSoin;
import com.arabsoft.ajir.entities.LibBultApp;
import com.arabsoft.ajir.entities.LigBult;
import com.arabsoft.ajir.entities.LigBultActe;
import com.arabsoft.ajir.entities.LigBultMed;
import com.arabsoft.ajir.entities.LigBultStar;
import com.arabsoft.ajir.entities.LigBultVisit;
import com.arabsoft.ajir.entities.LigPhar;


@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/bultSoin")
public class BultSoinController {


	
	@Autowired
	BultSoinRep bultSoinRep;
	@Autowired
	LigBultRep ligBultRep;
	
	@Autowired
	ActeRep actRep;
	
	
	@Autowired 
	BulletinStarRep bulletinStarRep;
	
	@Autowired
	LigBultStarRep ligBultStarRep;
	@Autowired
	LigPharDao pharDao;
	
	@Autowired
	LigBultVisitDao bultVisitDao;
	@Autowired
	LigBultActeDao acteDao;
	@Autowired
	LigBultMedDao bultMedDao;
	@Autowired 
	LigBultAppDao appDao;
	/*
	@PostMapping("/bsoindet")
	public BultSoin getBsoinDet(@RequestBody BultSoin b){
		
		
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		Integer numSoins = b.getNum_soins();
		
		List<BultSoin> bs = this.bultSoinRep.getBultSoins(codSoc, matPers, numSoins);
		
		
	    for (int i = 0; i <bs.size(); i++) {
	    	if(i==bs.size()-1) {
	        System.out.println(bs.get(i));
	    	bs.get(i).setLigBult(ligBultRep.getLigBult(codSoc, matPers, numSoins));
			bs.get(i).setNumSoinParam(ligBultRep.getNumSoinParam(codSoc, matPers));
			 
	    }
	    }
	    
	    
	    if (!bs.isEmpty()) {
		return  bs.get(bs.size()-1);
	    }
	    else
	    {
	    	return null;
	    }
	    
		
	}*/
	
	@CrossOrigin
	@GetMapping("/bsoindet/{codSoc}/{matPers}/{numSoins}")
	 public List<LigBult> getListCodSoin(@PathVariable String codSoc,@PathVariable String matPers,@PathVariable Integer numSoins){
		
		
		
		return ligBultRep.getLigBult(codSoc, matPers,numSoins);
		
		
	}
	
	@CrossOrigin
	@GetMapping("/bsoindetPresid")
	 public List<LigBult> getListLigBultPresid(@RequestParam String codSoc,@RequestParam String matPers,@RequestParam Long numFam,@RequestParam String datSoin){
 		
		
		return ligBultRep.getLigBultPresid(codSoc, matPers,numFam,datSoin);
		
		
	}
	@CrossOrigin
	@GetMapping("/getbultsoinscode/{codSoc}/{matPers}")
	 public List<String> getListCodSoin(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		
		return ligBultRep.getNumSoinParam(codSoc, matPers);
		
		
	}
	
	@CrossOrigin
	@GetMapping("/getbultsoinstar/{matPers}/{codSoc}")
	 public List<BulletinStar> getListBultStar(@PathVariable String matPers,@PathVariable String codSoc){

		return bulletinStarRep.getBulletinStarDet(matPers, codSoc);
	}
	@CrossOrigin
	@GetMapping("/getbultlist/{codSoc}/{matPers}")
	 public List<BultSoin> getListBultDet(@PathVariable String matPers,@PathVariable String codSoc){

		return bultSoinRep.getBultSoinsList(codSoc,matPers);
	}
	@CrossOrigin
	@GetMapping("/getbultlistCnam/{codSoc}/{matPers}")
	 public List<BultSoin> getListBultCnam(@PathVariable String matPers,@PathVariable String codSoc){

		return bultSoinRep.getBultSoinsCnam(codSoc,matPers);
	}
	@CrossOrigin
	@GetMapping("/LigPhar")
	 public List<LigPhar> getListLigPhar(@RequestParam String matPers,@RequestParam String codSoc,@RequestParam Long numFam,@RequestParam String datSoin){

		return pharDao.getLigPhar(codSoc,matPers,numFam,datSoin);
	}
	@CrossOrigin
	@GetMapping("/getbultPresid/{codSoc}/{matPers}/{num_fam}")
	 public List<LigBultStar> getListBultDet(@PathVariable String matPers,@PathVariable String codSoc,@PathVariable String num_fam){

		return ligBultStarRep.getListLigBultPresid(matPers,codSoc,num_fam);
	}
	@CrossOrigin
	@GetMapping("/getligbultstardetlist/{codSoc}/{matPers}/{numSoins}")
	 public List<LigBultStar> getListLigBultStar(@PathVariable String matPers,@PathVariable String codSoc,@PathVariable String numSoins){

		return ligBultStarRep.getListLigBultStartDet(matPers, codSoc,numSoins);
	}
	@CrossOrigin
	@GetMapping("/getligbultstarlist/{codSoc}/{matPers}")
	 public List<LigBultStar> getListLigBultStar(@PathVariable String matPers,@PathVariable String codSoc){

		return ligBultStarRep.getListLigBultStart(matPers, codSoc);
	}
	@CrossOrigin
	@GetMapping("/getligbultVisit")
	 public List<LigBultVisit> getListLigBultbultVisitDaVisit(@RequestParam String matPers,@RequestParam String codSoc,@RequestParam String numFam,@RequestParam String datSoin){
 		return bultVisitDao.getLigBultVisit(matPers,codSoc,numFam,datSoin);
	}
	
	@CrossOrigin
	@GetMapping("/getligbultAct")
	 public List<LigBultActe> getListLigBultbultAct(@RequestParam String matPers,@RequestParam String codSoc,@RequestParam Long numFam,@RequestParam String datSoin){
 		return acteDao.getLigBultAct(matPers,codSoc,numFam,datSoin);
	}
	
	@CrossOrigin
	@GetMapping("/getligbultMed")
	 public List<LigBultMed> getListLigBultbultMed(@RequestParam String matPers,@RequestParam String codSoc,@RequestParam String numFam,@RequestParam String datSoin){
 		return bultMedDao.getMedicaments(matPers,codSoc,numFam,datSoin);
	}
	
	@CrossOrigin
	@GetMapping("/getligbultApp")
	 public List<LibBultApp> getListLigBultbultApp(@RequestParam String matPers,@RequestParam String codSoc,@RequestParam Long numFam,@RequestParam String datSoin){
 		return appDao.getLigBultApp(matPers,codSoc,numFam,datSoin);
	}
}

