package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.EvalationDefinitf;
import com.arabsoft.ajir.dao.Evaluation_Definiif_Dao;
import com.arabsoft.ajir.entities.EVALUATION_DEFINITIVE;
import com.arabsoft.ajir.entities.EvalDef_ParamEval;

@RestController
@CrossOrigin("*")
@RequestMapping("/FicheEvalDef")
public class FicheEvalDef {
	@Autowired 
	Evaluation_Definiif_Dao dao;
	@Autowired 
	EvalationDefinitf evalationDefinitf;
	
	@PostMapping("/FicheEvalDef")
	public List<EVALUATION_DEFINITIVE> getFicheEvaldef(@RequestBody EVALUATION_DEFINITIVE s){
		String mat_pers=s.getMat_pers();
		String cod_soc=s.getCod_soc();
		String annee=s.getAnnee().toString();
		
		return dao.getFicheEvaldef(mat_pers,cod_soc,annee);
		
		
	}
	 
 
	@GetMapping("/getEvaluationDefinitf/{mat}/{cod}")
	public List<EvalDef_ParamEval> getEvaluationDefinitf(@PathVariable("mat") String mat,@PathVariable("cod") String cod){
		return evalationDefinitf.getEvaluationDefinitf(mat, cod);
	
	}

}
