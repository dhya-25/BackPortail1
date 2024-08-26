package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.DemandeConvDao;
import com.arabsoft.ajir.dao.DemandeDonsDao;
import com.arabsoft.ajir.dao.OffDemandeConvDao;
import com.arabsoft.ajir.entities.DemandeConv;
import com.arabsoft.ajir.entities.DemandeDons;
import com.arabsoft.ajir.entities.OffDemandeConv;

@RestController
@RequestMapping("/DemandeDons")
@CrossOrigin("*")
public class DemandeDonsController {

	@Autowired
	DemandeDonsDao donsDao;
	@Autowired
	DemandeConvDao convDao;
	@Autowired
	OffDemandeConvDao offDemandeConvDao;
	@CrossOrigin
	@GetMapping("/get")
	public List<DemandeDons> getDemandeDons(@RequestParam String soc,@RequestParam String pers,@RequestParam String moisDeb,@RequestParam String moisFin)
	{
		return donsDao.getDemandeDons(soc,pers,moisDeb,moisFin);
	}
	
	@CrossOrigin
	@GetMapping("/getConv")
	public List<DemandeConv> getDemandeConv(@RequestParam String soc,@RequestParam String pers,@RequestParam String moisDeb,@RequestParam String moisFin)
	{
		return convDao.getAllDemandeConv(soc,pers,moisDeb,moisFin);
	}
	@CrossOrigin
	@GetMapping("/getOffConv/{soc}/{mat}/{conv}")
	public List<OffDemandeConv> getOffDemandeConv(@PathVariable String soc,@PathVariable String mat,@PathVariable String conv)
	{
		return offDemandeConvDao.getOffDemandeConv(soc,mat,conv);
	}
}
