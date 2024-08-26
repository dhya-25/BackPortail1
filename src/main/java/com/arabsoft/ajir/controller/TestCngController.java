package com.arabsoft.ajir.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import java.sql.Timestamp;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.DemandeDao;
import com.arabsoft.ajir.dao.TestCngExceptDao;
import com.arabsoft.ajir.dao.TestCongeeDao;
import com.arabsoft.ajir.entities.TestCngExcept;
import com.arabsoft.ajir.entities.TestCongee;
import com.fasterxml.jackson.annotation.JsonFormat;

@RestController
@CrossOrigin("*")
@RequestMapping("/testcn")
public class TestCngController {
	@Autowired TestCongeeDao test;
	@Autowired TestCngExceptDao except;
	@Autowired 	DemandeDao demandeDAO;

	public <T> T nvl(T a,T b) {
		return ((a==null)?b:a);
	}
	
	//soc_,String mat_pers_,Date dat_debut_,Date dat_fin_, String cng_temps_debut_, String cng_temps_fin_,Long sold_cng
	@GetMapping("/gettestcng")
	public  Object  getdate(
			@RequestParam("soc_") String soc_,
			@RequestParam("mat_pers_") String mat_pers_,
			@RequestParam("dat_debut_") String dat_debut_,
			@RequestParam("dat_fin_") String dat_fin_,
			@RequestParam("cng_temps_debut_") String cng_temps_debut_,
			@RequestParam("cng_temps_fin_") String cng_temps_fin_
			
			 ) {
		
		System.out.println("soc_"+soc_+"mat_pers_"+mat_pers_+"dat_debut_"+dat_debut_+"dat_fin_"+dat_fin_+"cng_temps_debut_"+cng_temps_debut_+"cng_temps_fin_"+cng_temps_fin_);
		//sold_cng_=demandeDAO.getsoldcng(soc_, mat_pers_);
		
		
		
		
		
	
				return test.getaaaaaaaaa(soc_, mat_pers_, dat_debut_, dat_fin_, cng_temps_debut_, cng_temps_fin_);}
	//String wcod_soc, String wmat_pers,String wcode_m,Date wdat_debut,  Date wdat_fin, String p_message
	@GetMapping("/gettestcngexcept")
	public  Object  getdateexcept(
			@RequestParam("wcod_soc") String wcod_soc,
			@RequestParam("wmat_pers") String wmat_pers,
			@RequestParam("wcode_m") String wcode_m,
			@RequestParam("wdat_debut") String wdat_debut,
			@RequestParam("wdat_fin")String wdat_fin,
			@RequestParam("p_message") String p_message
			
			 ) {
		
		//String datfin[]=wdat_fin.split("/");
		//System.out.println("1"+datfin[0]);
		//System.out.println("2"+datfin[1]);
		//System.out.println("3"+datfin[2]);


		
		
		//throws ParseException {
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		 //SimpleDateFormat customdateformatter = new SimpleDateFormat("EEEE, dd, MM yyyy hh:mm a");
		 //String parsedCustomDate = customdateformatter.format(wdat_fin);
		  
		 
		 //String parseDateFin = sdf.format(wdat_fin);		
		 

		//LocalDate d = LocalDate.parse(parseDateFin, formater);
		// String stringdatfin = wdat_fin.toString();
		//String newS =  stringdatfin.replace('-', '/');


	//	String [] dateParts = newS.split("/");
		//String year = dateParts[0];
		//String month = dateParts[1];
		//String day = dateParts[2];

		//String fulldate = day+"/"+month+ "/" + year;
		//System.out.println("full date "+fulldate);
	//	LocalDate localdatefin = LocalDate.parse(fulldate,formater);
		
		 
		 
		 // System.out.println("message datfin : "+wdat_fin+" ******** "+newS+ " ****** "+localdatefin);
		 
		 
		 
		
		return except.TestCngExceptt(wcod_soc, wmat_pers, wcode_m, wdat_debut,   wdat_fin, p_message);
		
		
		/*if(wdat_fin.isEmpty()) {
			SimpleDateFormat dateFormatter = new SimpleDateFormat ("dd/mm/yyyy");
		     Date datefin =dateFormatter.parse(wdat_fin);
		     String formatwdat_fin = dateFormatter.format(datefin);		     
		     System.out.println("message "+formatwdat_fin);
			return except.getcngexcept(wcod_soc, wmat_pers, wcode_m, wdat_debut, wdat_fin, p_message);
		}
		
			SimpleDateFormat dateFormatter = new SimpleDateFormat ("dd/mm/yyyy");
		     Date datefin =dateFormatter.parse(wdat_fin);
		     String formatwdat_fin = dateFormatter.format(datefin);	     
		     System.out.println("message "+formatwdat_fin);
		     return except.getcngexcept(wcod_soc, wmat_pers, wcode_m, wdat_debut, wdat_fin, p_message);*/
		
	     
				}


	
/*	@GetMapping("/GetJour") 
	public  Object  GetJour(@RequestParam("soc_") String soc_,@RequestParam("mat_pers_") String mat_pers_, 
			@RequestParam("dat_debut_") Date dat_debut_,@RequestParam("dat_fin_") Date dat_fin_,@RequestParam("dat_reprise_prev_") Date dat_reprise_prev_ ,
			@RequestParam("cng_temps_debut_") String cng_temps_debut_,@RequestParam("cng_temps_fin_") String cng_temps_fin_
			,@RequestParam("nat_cng_") String nat_cng_ ,
			@RequestParam("bonus_cng_") String bonus_cng_ ,
			@RequestParam("sold_cng_") Long sold_cng_,
			@RequestParam("nbr_jours_") Long nbr_jours_ ,
			
			@RequestParam("nbr_jours_cal_") Long nbr_jours_cal_ ,
			@RequestParam("nbr_jours_fer_")Long nbr_jours_fer_,
			@RequestParam("message_")String message_) 
	//{
	
				return test.GetJour(soc_, mat_pers_, dat_debut_, dat_fin_, dat_reprise_prev_, cng_temps_debut_,
						 cng_temps_fin_,  nat_cng_, bonus_cng_,  sold_cng_, nbr_jours_,  nbr_jours_cal_,  nbr_jours_fer_,  message_);}*/
	
}
/*@StoredProcedureParameter(mode = ParameterMode.IN, name = "soc_", type = String.class),
@StoredProcedureParameter(mode = ParameterMode.IN, name = "mat_pers_", type = String.class),
@StoredProcedureParameter(mode = ParameterMode.IN, name = "dat_debut_", type = Date.class),
@StoredProcedureParameter(mode = ParameterMode.IN, name = "dat_fin_", type = Date.class),
@StoredProcedureParameter(mode = ParameterMode.OUT, name = "dat_reprise_prev_", type = Date.class),
@StoredProcedureParameter(mode = ParameterMode.IN, name = "cng_temps_debut_", type = String.class),
@StoredProcedureParameter(mode = ParameterMode.IN, name = "cng_temps_fin_", type = String.class),
@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nat_cng_", type = String.class),
@StoredProcedureParameter(mode = ParameterMode.OUT, name = "bonus_cng_", type = String.class),
@StoredProcedureParameter(mode = ParameterMode.OUT,  name = "sold_cng_", type = Long.class),
@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nbr_jours_", type = Long.class),
@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nbr_jours_cal_", type = Long.class),
@StoredProcedureParameter(mode = ParameterMode.OUT, name = "nbr_jours_fer_", type = Long.class),
@StoredProcedureParameter(mode = ParameterMode.OUT, name = "message_", type = String.class)*/