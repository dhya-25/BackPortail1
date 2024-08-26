package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.bulletinhDAO;
import com.arabsoft.ajir.dao.possedeVhDAO;
import com.arabsoft.ajir.entities.BulletinH;
import com.arabsoft.ajir.entities.PossedeVh;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/consPaie")
public class consultPaieClotureController {
	
	@Autowired
	possedeVhDAO possVH;
	
	@Autowired
	bulletinhDAO bulH;
	
	@PostMapping("/getPaie")
	public BulletinH getConsPaieCloture(@RequestBody BulletinH bh) {
		String codSoc = bh.getCod_soc();
		String matPers = bh.getMat_pers();
		String codTypBul = bh.getCod_typ_bul();
		String dt = bh.getDateBul();
		System.out.println(codSoc+matPers+codTypBul+dt);
		BulletinH b = this.bulH.getBulletin(codSoc, matPers, codTypBul, dt);
		
		
		b.setPossVH(this.possVH.getPossede(codSoc, matPers, codTypBul, dt));
		return b;
	}

	@PostMapping("/getPaieRh")
	public BulletinH getConsPaieClotureRh(@RequestBody BulletinH bh) {
		String codSoc = bh.getCod_soc();
		String matPers = bh.getMat_pers();
		String codTypBul = bh.getCod_typ_bul();
		String dt = bh.getDateBul();
		String nom_pers = bh.getNom_pers();

		System.out.println(codSoc+matPers+codTypBul+dt);
		BulletinH b = this.bulH.getBulletinRh(codSoc, matPers, codTypBul, dt);
		
		
		b.setPossVH(this.possVH.getPossede(codSoc, matPers, codTypBul, dt));
		return b;
	}
	
	@PostMapping("/getPaieRhh")
	public List<PossedeVh> getConsPaieClotureRhh(@RequestBody PossedeVh bh) {
		String codSoc = bh.getCod_soc();
		String matPers = bh.getMat_pers();
		String codTypBul = bh.getCod_typ_bul();
		String dt = bh.getDateBul();
		String nom_pers = bh.getNom_pers();

		System.out.println(codSoc+matPers+codTypBul+dt);
		
		
		return  this.possVH.getPossede(codSoc, matPers, codTypBul, dt);
	}
}
