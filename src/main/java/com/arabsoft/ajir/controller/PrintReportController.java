package com.arabsoft.ajir.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.sevices.ConnectionBdReport;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping("/edition")
public class PrintReportController {

	@Autowired
	ConnectionBdReport bdReport;
	
	@CrossOrigin
	@PostMapping(path="/report")
	public byte[] printRep (@RequestParam String jasperName,
			@RequestParam String mat1,
			@RequestParam String COD_SOC,
			@RequestParam String dat,
			@RequestParam String ctb) throws JRException,IOException{
		
		byte[] file;
		System.out.println("jasperName   ="+jasperName +" , "+ "mat1   ="+mat1+" , "+"COD_SOC  ="+ COD_SOC+"dat ="+dat + "  ,"+"ctb   ="+ ctb);
		try {
			file = bdReport.genererRapportPDF(jasperName, mat1, COD_SOC, dat, ctb);
			System.out.println(file);
		}
		catch(Exception ex){
			return null;
		}
		return file;
		}
	@CrossOrigin
	@PostMapping(path="/reportt")
	public byte[] printRept (@RequestParam String jasperName) throws JRException,IOException{
		
		byte[] file;
	//	System.out.println("jasperName   ="+jasperName +" , "+ "mat1   ="+mat1+" , "+"COD_SOC  ="+ COD_SOC+"dat ="+dat + "  ,"+"ctb   ="+ ctb);
		try {
			file = bdReport.GeneratePDFF(jasperName);
			System.out.println(file);
		}
		catch(Exception ex){
			return null;
		}
		return file;
		}
		
	}
	

