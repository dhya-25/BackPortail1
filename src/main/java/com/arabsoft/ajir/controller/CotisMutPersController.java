package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.CotisMutPersDao;
import com.arabsoft.ajir.dao.LigCotisMutPersDao;
import com.arabsoft.ajir.dao.PrimeMutPersDao;
import com.arabsoft.ajir.entities.CotisMutPers;
import com.arabsoft.ajir.entities.LigCotisMut_Pers;
import com.arabsoft.ajir.entities.PrimeMutPers;

@RestController
@RequestMapping("/cotis")
@CrossOrigin("*")
public class CotisMutPersController {
	
	@Autowired
	CotisMutPersDao cotisMutPersDao;
	
	@Autowired
	LigCotisMutPersDao ligCotisMutPersDao;
	@Autowired
	PrimeMutPersDao mutPersDao;
	
	@GetMapping("/get")
	List<CotisMutPers>getCotis(@RequestParam String soc,@RequestParam String pers,@RequestParam String moisDeb,@RequestParam String moisFin)
	{
		return cotisMutPersDao.getCotis(soc, pers,moisDeb,moisFin);
	}
	
	@GetMapping("/get/{soc}/{pers}/{cot}")
	List<LigCotisMut_Pers>getCotis(@PathVariable String soc,@PathVariable String pers,@PathVariable String cot)
	{
		return ligCotisMutPersDao.getLigCotis(soc, pers,cot);
	}
	
	@GetMapping("/GetPrimeMutPers")
	List<PrimeMutPers> getAllPrimeMut(@RequestParam String soc,@RequestParam String pers,@RequestParam String moisDeb,@RequestParam String moisFin)
	{
		return mutPersDao.getPrimeMutPers(soc, pers, moisDeb, moisFin);
	}
}
