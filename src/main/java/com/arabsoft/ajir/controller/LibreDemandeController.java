package com.arabsoft.ajir.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
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
import org.springframework.web.multipart.MultipartFile;

import com.arabsoft.ajir.dao.AttachmentDemandeDao;
import com.arabsoft.ajir.dao.CalPersDao;
import com.arabsoft.ajir.dao.DecidionDao;
import com.arabsoft.ajir.dao.DemandeDao;
import com.arabsoft.ajir.dao.GroupePretDao;
import com.arabsoft.ajir.dao.LibreDemandeBisDao;
import com.arabsoft.ajir.dao.LibreDemandeKDao;
import com.arabsoft.ajir.dao.LibreDemandeRep;
import com.arabsoft.ajir.dao.LibreDemandeValDao;
import com.arabsoft.ajir.dao.MotifJDao;
import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.dao.ThemeDao;
import com.arabsoft.ajir.dao.TitreFormationDao;
import com.arabsoft.ajir.dao.TypeAutorisationDao;
import com.arabsoft.ajir.dao.TypeFormationDao;
import com.arabsoft.ajir.dao.TypePretDao;
import com.arabsoft.ajir.dao.ValidationDemandeChefRep;
import com.arabsoft.ajir.entities.AttachmentDemande;
import com.arabsoft.ajir.entities.CalPersPK;
import com.arabsoft.ajir.entities.Cal_Pers;
import com.arabsoft.ajir.entities.Decision;
import com.arabsoft.ajir.entities.Groupe_pret;
import com.arabsoft.ajir.entities.LibreDemande;
import com.arabsoft.ajir.entities.Libre_demande;
import com.arabsoft.ajir.entities.Libre_demandeBis;
import com.arabsoft.ajir.entities.Motif_j;
import com.arabsoft.ajir.entities.PretPersDet;
import com.arabsoft.ajir.entities.ResponseDataAttachement;
import com.arabsoft.ajir.entities.Theme;
import com.arabsoft.ajir.entities.TitreFormation;
import com.arabsoft.ajir.entities.TypeFormation;
import com.arabsoft.ajir.entities.Type_autorisation;
import com.arabsoft.ajir.entities.Type_pret;
import com.arabsoft.ajir.entities.ValidationDemandeChef;
import com.arabsoft.ajir.entities.libreDemandek;
import com.arabsoft.ajir.entities.libre_demande_val;
import com.arabsoft.ajir.sevices.AttachmentService;
import com.arabsoft.ajir.sevices.LibreDemandeService; 

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
@CrossOrigin("*")
@RestController
@RequestMapping(value="demande")
public class LibreDemandeController {
	@Autowired
	PersonnelRep personnelRep;
	@Autowired
	DemandeDao demandeDAO;
	@Autowired 
	LibreDemandeValDao demandeValDao;
	@Autowired
	LibreDemandeKDao demandeK;
	@Autowired
	LibreDemandeBisDao bisDao;
	@Autowired
	ThemeDao themeDao;
	@Autowired
	TypeAutorisationDao autorisationDao;
	@Autowired
	TitreFormationDao formationDao;
	@Autowired
	TypeFormationDao typeDao;
	@Autowired
	GroupePretDao groupePretController;
	@Autowired 
	TypePretDao pretDao;
	@Autowired 
	MotifJDao motifJDao;
	@Autowired
	LibreDemandeService LibreService;
	@Autowired
	ValidationDemandeChefRep validationDemandeChefRep;
	@Autowired
	LibreDemandeValDao libreDemandeValRep;
	@Autowired
	LibreDemandeRep libreDemandeRep;
	
	@Autowired
	DecidionDao decidionDao;
	  @Autowired
	  CalPersDao calPersDao;
	  
	 @Autowired
	 AttachmentService attachmentService;
	 @Autowired
	 AttachmentDemandeDao attachmentDemandeDao;
	  
	  @CrossOrigin
	  @PostMapping("/createDemande")
	  public ResponseEntity<ResponseMessage> createDemande(@RequestParam("file") MultipartFile file,@RequestParam("demande") String dem) throws IOException {	        
	    ResponseMessage responseMessage;
	    responseMessage = this.LibreService.createDem(file,dem);
	    if(responseMessage.getCode()=="0") {
	    	return ResponseEntity.ok(responseMessage);
	    } else {
	    	return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseMessage);
	    }
	  }
	  
	 /* @CrossOrigin
	  @PostMapping("/getListDemande")
	  public Libre_demande getListDemande(@RequestBody Libre_demande dem) throws IOException {	        
		  String codSoc = dem.getCodSoc();
			
			Libre_demande d = this.demandeDAO.getListDemande();
			System.out.println(codSoc);
			return d;
	    }*/
	
	@CrossOrigin
	@GetMapping("/getDemande")
	public ResponseEntity<List<Libre_demande>> getAllDemande() {

		return ResponseEntity.ok(demandeDAO.findAll());
	}
	@CrossOrigin
	@GetMapping("/getDemande/{id}")
	public Optional<libreDemandek> findByIdlibredemande(@PathVariable Long id) {

		return demandeK.findById(id);
	}
	@CrossOrigin
	@PostMapping("/addDemandeWithoutFile")
	public libreDemandek addDemande(@RequestBody libreDemandek demande ) throws ParseException {
//	     SimpleDateFormat dateFormatter = new SimpleDateFormat ("dd/mm/yyyy");
//		 Date datedeb = demande.getDatDebut();
//		 System.out.println(datedeb);
//		 Date datedemande = demande.getDateDemande();
//	        Date formateddatedeb =  new SimpleDateFormat("dd/mm/yyyy").parse(dateFormatter.format(datedeb));
//	        Date formateddemandedemande =  new SimpleDateFormat("dd/mm/yyyy").parse(dateFormatter.format(datedemande));
//System.out.println(formateddatedeb);
//System.out.println(formateddemandedemande);
//
//	        demande.setDatDebut(formateddatedeb); //Printing the date
//	        demande.setDatDebut(formateddemandedemande);
	return 	demandeK.save (demande);
		
	}
	@CrossOrigin
	@PostMapping("/addDemandeWithoutFileConge")
	public libreDemandek addDemandeConge(@RequestBody libreDemandek demande ) throws ParseException {
//	     SimpleDateFormat dateFormatter = new SimpleDateFormat ("dd/mm/yyyy");
//	     LocalDate datedeb = demande.getDatDebut();
//	     LocalDate datefin = demande.getDatFin();
//	     LocalDate datedemande = demande.getDateDemande();
//	     LocalDate formateddatedeb =  new SimpleDateFormat("dd/mm/yyyy").parse(dateFormatter.format(datedeb));
//	     LocalDate formateddatefin =  new SimpleDateFormat("dd/mm/yyyy").parse(dateFormatter.format(datefin));
//	     LocalDate formateddemandedemande =  new SimpleDateFormat("dd/mm/yyyy").parse(dateFormatter.format(datedemande));
//
//	        demande.setDatDebut(formateddatedeb); //Printing the date
//	        demande.setDatDebut(formateddatefin);
//	        demande.setDatDebut(formateddemandedemande);
	return 	demandeK.save (demande);
		
	}
	@CrossOrigin
	@GetMapping("/getDec")
	public ResponseEntity<List<Decision>> getDecidion() {

		return ResponseEntity.ok(decidionDao.getDecidion());
	}
	@CrossOrigin
	@GetMapping("/getDemandes")
	public ResponseEntity<List<Libre_demande>> getDemande() {

		return ResponseEntity.ok(demandeDAO.getDemRh());
	}
	@CrossOrigin
	@GetMapping("/getDemandesRepRh")
	public ResponseEntity<List<Libre_demande>> getDemandeRepRhnotnull() {

		return ResponseEntity.ok(demandeDAO.getDemRhByRepNotNull());
	}
	@CrossOrigin
	@GetMapping("/getListConje/{codSoc}/{matpers}")
	public ResponseEntity<List<Cal_Pers>> getConge(@PathVariable("codSoc") String codSoc,@PathVariable("matpers") String matPers) {

		return ResponseEntity.ok(calPersDao.getListConje(codSoc,matPers));
	}
	@CrossOrigin
	@GetMapping("/getTypeFormation/{codTit}")
	public ResponseEntity<List<TypeFormation>> getTypeFormation(@PathVariable("codTit") String codTit) {

		return ResponseEntity.ok(typeDao.getTypeFormation(codTit));
	}
	@CrossOrigin
	@GetMapping("/getTitreFormation")
	public ResponseEntity<List<TitreFormation>> getTitreFormation() {

		return ResponseEntity.ok(formationDao.getTitreFormation());
	}
	
	@CrossOrigin
	@GetMapping("/getGroupePret")
	public ResponseEntity<List<Groupe_pret>> getGroupePret() {

		return ResponseEntity.ok(groupePretController.getGroupePret());
	}
	@CrossOrigin
	@GetMapping("/getTypePret/{codpret}")
	public ResponseEntity<List<Type_pret>> getTypePret(@PathVariable("codpret") String codpret) {

		return ResponseEntity.ok(pretDao.getTypePret(codpret));
	}
	
	@CrossOrigin
	@GetMapping("/getThemeFormation/{codTit}/{codTyp}")
	public ResponseEntity<List<Theme>> getThemeFormation(@PathVariable("codTit") String codTit,@PathVariable("codTyp") String codTyp) {

		return ResponseEntity.ok(themeDao.getThemeFormation(codTit,codTyp));
	}
	@CrossOrigin
	@GetMapping("/getTypeAut")
	public ResponseEntity<List<Type_autorisation>> getTypeAutorisation() {

		return ResponseEntity.ok(autorisationDao.getTypeAutorisation());
	}
	
	@CrossOrigin
	@GetMapping("/getplafond/{x}")
	public Motif_j getMotif_j(@PathVariable("x")String x) {

		return motifJDao.getplafond(x);
	}
	
	
	 
	
	@CrossOrigin
	@GetMapping("/GetPlafond/{cod_grp_pret}/{typ_pret}")
	public Type_pret GetPlafond(@PathVariable("cod_grp_pret")String cod_grp_pret,@PathVariable("typ_pret")String typ_pret) {

		return pretDao.GetPlafond(cod_grp_pret,typ_pret);
	}
	
	
	
	@CrossOrigin
	@GetMapping("/getMotifCng")
	public ResponseEntity<List<Motif_j>> getMotifCng() {

		return ResponseEntity.ok(motifJDao.getMotifCng());
	}
	
	@CrossOrigin
	@GetMapping("/getMotifCngExep")
	public ResponseEntity<List<Motif_j>> getMotifCngExep() {

		return ResponseEntity.ok(motifJDao.getMotifCngExeption());
	}
/*	@CrossOrigin
	@GetMapping("/getListDemande/{CodSoc}")
	public ResponseEntity<List<Libre_demande>> getDemande(@PathVariable String CodSoc) {
List<Libre_demande> d = demandeDAO.getListDemande(CodSoc);
System.out.println(d);
		return ResponseEntity.ok(d);
	}*/

	
	
	@CrossOrigin
	@GetMapping("/getListDemande/{codSoc}/{matpers}/{type}")
	public List<Libre_demande> getDemandee(@PathVariable String codSoc,@PathVariable String matpers,@PathVariable String type) {

		return demandeDAO.getDem(codSoc,matpers,type);
	}
	@CrossOrigin
	@GetMapping("/getListDemandeChef/{codSoc}/{matpers}")
	public List<Libre_demande> getDemandeChef(@PathVariable("codSoc") String codSoc,@PathVariable("matpers") String matpers) {

		return demandeDAO.getDemm(codSoc,matpers);
	}
	@CrossOrigin
	@GetMapping("/getListDemandeByChef/{codSoc}/{matpers}")
	public List<Libre_demande> getDemandeByRepChef(@PathVariable("codSoc") String codSoc,@PathVariable("matpers") String matpers) {

		return demandeDAO.getDemByRepChefNull(codSoc,matpers);
	}
	@CrossOrigin
	@GetMapping("/getListDemandeByChefNotNull/{codSoc}/{matpers}")
	public List<Libre_demande> getDemandeByRepChefNotNull(@PathVariable("codSoc") String codSoc,@PathVariable("matpers") String matpers) {

		return demandeDAO.getDemByRepChefNotNull(codSoc,matpers);
	}
	

	@PostMapping("/getDemByRepChefByDateRep")
	public List<Libre_demande>  getDemByRepChefByDateRep(@RequestBody Libre_demande b)  {
		 
		String codSoc = b.getCodSoc();
		String matPers = b.getMatPers();
		Date datDeb = b.getDatDebut();
		Date dateFin=b.getDatFin();
		String reponse=b.getReponse();
		List<Libre_demande> pr = null;
		if(datDeb!=null&&dateFin!=null) {
		
		 pr= this.demandeDAO.getDemByRepChefByDateRep(codSoc, matPers,datDeb,dateFin,reponse);
		}
		else if(datDeb==null&&dateFin==null) {
			
			pr= this.demandeDAO.getDemByRepChefByRep(codSoc, matPers,reponse);
		}

		return pr ;
	}

	@PostMapping("/getDemByRepChefByDateRepRh")
	public List<Libre_demande>  getDemByRepChefByDateRepRh(@RequestBody Libre_demande b)  {
		 
		String codSoc = b.getCodSoc();
		Date datDeb = b.getDatDebut();
		Date dateFin=b.getDatFin();
		String reponse=b.getReponse();
		String matPers=b.getMatPers();
		System.out.println("Matpers  : "+matPers);
		System.out.println("codSoc  : "+codSoc);
		System.out.println("datDeb  : "+datDeb);
		System.out.println("dateFin  : "+dateFin);
		System.out.println("reponse  : "+reponse);

		List<Libre_demande> pr = this.demandeDAO.getDemByRepChefByDateRepRH(codSoc,matPers,datDeb,dateFin,reponse);
	

		return pr ;
	}
	

	@PostMapping("/getDemRh")
	public List<Libre_demande>  getDemRh(@RequestBody Libre_demande b)  {
		 
		String codSoc = b.getCodSoc();
		Date datDeb = b.getDatDebut();
		Date dateFin=b.getDatFin();
		String reponse=b.getReponse();
		String matPers=b.getMatPers();
		System.out.println("Matpers  : "+matPers);
		System.out.println("codSoc  : "+codSoc);
		System.out.println("datDeb  : "+datDeb);
		System.out.println("dateFin  : "+dateFin);
		System.out.println("reponse  : "+reponse);

		List<Libre_demande> pr = this.demandeDAO.getDemRH(codSoc,datDeb,dateFin,reponse);
	

		return pr ;
	}
	@CrossOrigin
	@GetMapping("/getDemByRepChefByRep/{codSoc}/{matPers}/{reponse}")
	public List<Libre_demande>  getDemByRepChefByRep(@PathVariable String codSoc,@PathVariable String matPers,@PathVariable String reponse)  {
		 
						return this.demandeDAO.getDemByRepChefByRep(codSoc, matPers,reponse);
	
	}
	@CrossOrigin
	@GetMapping("/getDemByRepChefByRepRh/{codSoc}/{reponse}")
	public List<Libre_demande>  getDemByRepChefByRepRh(@PathVariable String codSoc,@PathVariable String reponse)  {
		 
						return this.demandeDAO.getDemByRepChefByRepRh(codSoc,reponse);
	
	}
    @GetMapping("/updatRepChefLibreDemRh/{id_libre_demande}/{etat_val}/{reponseChef}") 
    public LibreDemande updatRepChefLibreDemRh(@PathVariable Long id_libre_demande,
        @PathVariable String etat_val,
        @PathVariable String reponseChef) {
      LibreDemande libval=libreDemandeRep.findById(id_libre_demande).orElse(null);
      if(libval!=null) {
        libval.setTxt_chef(reponseChef);
      }
        return  libreDemandeRep.save(libval);
     
      }
	@CrossOrigin
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Libre_demandeBis> findDemandeById(@PathVariable Long id) {
		return ResponseEntity.ok(
				bisDao.gettByid(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDemande(@PathVariable Long id) {
		demandeDAO.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}
	/*@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Libre_demande>> getDemandeList() {

		return ResponseEntity.ok(demandeService.getDemande());
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public ResponseEntity<Boolean> deleteClient(@PathVariable Long id) throws Exception{
		return ResponseEntity.ok(demandeService.deleteDemande(id));
	}*/
	
	/*@GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable String fileId) {

		Libre_demande fileModel =  LibreService.getFile(fileId);
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(fileModel.getContentType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileModel.getFileName() + "\"")
				.body(new ByteArrayResource(fileModel.getFichierJoint()));
	}*/
	
	@GetMapping("/files/{id}")
	  public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
	    Libre_demandeBis fileDB = LibreService.getFile(id);

	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getFileName() + "\"")
	        .body(fileDB.getFichierJoint());
	  }
	  
	  
	  @CrossOrigin
	  @GetMapping("/downloadFile/{documentId}")
		public void downloadFile(@PathVariable("documentId") Long documentId, HttpServletResponse response)
				throws IOException {
		
			Libre_demandeBis document = LibreService.getDocument(documentId);
			try {
				System.out.println("fileDB.getFileName()"+document.getFileName());
				response.setHeader("Content-Disposition", "inline;filename=\"" + document.getFileName() + "\"");
				response.setContentType(document.getContentType());
				
				

				InputStream ins = new ByteArrayInputStream(document.getFichierJoint());
				IOUtils.copy(ins, response.getOutputStream());
				System.out.println("ins : "+ins);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	 
	  
	  @GetMapping("/updatDesChef/{id_libre_demande}/{etat_val}/{matResp}") 
	  public libre_demande_val updatDesChef(@PathVariable Long id_libre_demande,
			  @PathVariable String etat_val,@PathVariable String matResp) {
		  
		  
			///  ValidationDemandeChef validationDemandeChef=validationDemandeChefRep.findById(matResp).orElse(null);

		  libre_demande_val libval=libreDemandeValRep.findById(id_libre_demande).orElse(null);
		//  Libre_demande lib_dem=demandeDAO.findById(id_libre_demande).orElse(null);
		  
		  if(libval!=null) {
			  libval.setEtat_val(etat_val);
			  
			  libreDemandeValRep.save(libval);
		  }
			  return libreDemandeValRep.save(libval);
		  
		  
		  }
	  
	  @GetMapping("/updateDemListById/{id_libre_demande}/{etat_val}/{matResp}") 
	  public void updateDemListById(@PathVariable Long id_libre_demande,
			  @PathVariable String etat_val,@PathVariable String matResp) {
		  
		  
			///  ValidationDemandeChef validationDemandeChef=validationDemandeChefRep.findById(matResp).orElse(null);

		validationDemandeChefRep.updateDemListById(id_libre_demande, etat_val, matResp);
		 
	

		 
	  }
	  @GetMapping("/getDemReponse/{id_libre_demande}") 
	  public List<LibreDemande> getDemReponse(@PathVariable Long id_libre_demande) {
		  
		  
			///  ValidationDemandeChef validationDemandeChef=validationDemandeChefRep.findById(matResp).orElse(null);

		
		 
		return validationDemandeChefRep.getRepChef(id_libre_demande);

		 
	  }
		  
	  @GetMapping("/updateDemRepChef/{id_libre_demande}/{etat_val}") 
	  public void updateDemRepChef(@PathVariable Long id_libre_demande,
			  @PathVariable String etat_val) {
		  
		  
			///  ValidationDemandeChef validationDemandeChef=validationDemandeChefRep.findById(matResp).orElse(null);

		 validationDemandeChefRep.updateDemRepChef(id_libre_demande, etat_val);
		//  Libre_demande lib_dem=demandeDAO.findById(id_libre_demande).orElse(null);
		  
		 
	  }
	  @PostMapping("/updateDemRepRh/{id_libre_demande}/{etat_val}") 
	  public void updateDemRepRh(@PathVariable Long id_libre_demande,
			  @PathVariable String etat_val,@RequestBody String observation) {
		  
		  
			///  ValidationDemandeChef validationDemandeChef=validationDemandeChefRep.findById(matResp).orElse(null);

		 validationDemandeChefRep.updateDemRepRh(id_libre_demande, etat_val,observation);
		//  Libre_demande lib_dem=demandeDAO.findById(id_libre_demande).orElse(null);
		 System.out.println(observation);

		 
	  }  
	  
	  @GetMapping("/updatRepChefLibreDem/{id_libre_demande}/{etat_val}/{reponseChef}") 
	  public LibreDemande updatRepChefLibreDem(@PathVariable Long id_libre_demande,
			  @PathVariable String etat_val,
			  @PathVariable String reponseChef) {
		  
		  
			///  ValidationDemandeChef validationDemandeChef=validationDemandeChefRep.findById(matResp).orElse(null);

		  //libre_demande_val libval=libreDemandeValRep.findById(id_libre_demande).orElse(null);
		  LibreDemande libval=libreDemandeRep.findById(id_libre_demande).orElse(null);
		  
		  if(libval!=null) {
			  libval.setReponse(etat_val);
			  libval.setState(etat_val);
			  libval.setTxt_chef(reponseChef);
			//  libreDemandeRep.save(libval);
		  }
			  return  libreDemandeRep.save(libval);
		 
		  }
		  
	     
	  
	  @GetMapping("/getDemCheff/{matResp}")
	  public List<ValidationDemandeChef> getDemCheff( @PathVariable String matResp) 
	  {
		  
		  
		 List<ValidationDemandeChef> validationDemandeChef=validationDemandeChefRep.getValidationDemList(matResp);

		
		  
		  return validationDemandeChefRep.getValidationDemList(matResp);

		  
	  }
	  @GetMapping("/getDemCheffById/{matResp}/{id}")
	  public List<ValidationDemandeChef> getDemCheffById( @PathVariable String matResp, @PathVariable Long id) 
	  {
		  
		  
		 //List<ValidationDemandeChef> validationDemandeChef=validationDemandeChefRep.getValidationDemList(matResp);

		
		  
		  return validationDemandeChefRep.getValidationDemListById(matResp,id);

		  
	  }
	  @GetMapping("/getValidationDemListByIdRH/{matResp}/{id}")
	  public List<ValidationDemandeChef> getValidationDemListByIdRH( @PathVariable String matResp, @PathVariable Long id) 
	  {
		  
		  
		 //List<ValidationDemandeChef> validationDemandeChef=validationDemandeChefRep.getValidationDemList(matResp);

		
		  
		  return validationDemandeChefRep.getValidationDemListByIdRH(matResp,id);

		  
	  }
	  @CrossOrigin
	  @PutMapping("/updateag")
		 
	  public ResponseEntity<libre_demande_val> updateUclt( @RequestBody libre_demande_val Ag) {
	  
	     Optional<libre_demande_val> AgData = demandeValDao.findById(Ag.getId_libre_demande());
	     Optional<libreDemandek> demande = demandeK.findById(Ag.getId_libre_demande());

	     
	    if (AgData.isPresent()) {
	    	libre_demande_val agg = AgData.get();
	    	libreDemandek dem=demande.get();
	   agg.setEtat_val(Ag.getEtat_val());
	   dem.setState(Ag.getEtat_val());
	   demandeK.save(dem);
	      System.out.println(Ag.getEtat_val());
	     return new ResponseEntity<>(demandeValDao.save(agg), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } }
	  @CrossOrigin
	  @PutMapping("/updateRh")
		 
	  public ResponseEntity<libreDemandek> updateRh( @RequestBody libreDemandek Ag) {
	  
	     Optional<libreDemandek> AgData = demandeK.findById(Ag.getId_libre_demande());
	    if (AgData.isPresent()) {
	    	libreDemandek agg = AgData.get();
	   agg.setTxtReponse(Ag.getTxtReponse());
	   agg.setReponse(Ag.getReponse());
	      
	     return new ResponseEntity<>(demandeK.save(agg), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } }
	  @GetMapping("/getdemcongee")
	  public List <Libre_demande> getdemcongee(){
		return demandeDAO.getDemCONGE();
		  
		  
		  
	  }
	  @GetMapping("/getdemauto")
	  public List <Libre_demande> getdemauto(){
		return demandeDAO.getDemauto();
		  
		  
		  
	  }
	  @GetMapping("/getdemattestation")
	  public List <Libre_demande> getdemattestation(){
		return demandeDAO.getDemAttestation();
		  
		  
		  
	  }
	  @GetMapping("/getdempret")
	  public List <Libre_demande> getdempret(){
		return demandeDAO.getDemPret();
		  
		  
		  
	  }
	  @GetMapping("/getdemformation")
	  public List <Libre_demande> getdemformation(){
		return demandeDAO.getDemFormation();
		  
		  
		  
	  }
	  @GetMapping("/getDemSituation")
	  public List <Libre_demande> getdemsituation(){
		return demandeDAO.getDemSituation();
		  
		  
		  
	  }
	  @GetMapping("/gethistdemcongee")
	  public List <Libre_demande> gethistdemcongee(){
		return demandeDAO.gethisDemCongeeRh();
		  
		  
		  
	  }
	  @GetMapping("/gethistdemauto")
	  public List <Libre_demande> gethistdemauto(){
		return demandeDAO.gethisDemAutorisationRh();
		  
		  
		  
	  }
	  @GetMapping("/gethistdemattestation")
	  public List <Libre_demande> gethisdemattestation(){
		return demandeDAO.gethisDemAttestationRh();
		  
		  
		  
	  }
	  @GetMapping("/gethistdempret")
	  public List <Libre_demande> gethistdempret(){
		return demandeDAO.gethisDemPretavancesRh();
		  
		  
		  
	  }
	  @GetMapping("/gethistdemformation")
	  public List <Libre_demande> gethistdemformation(){
		return demandeDAO.gethisDemFormationRh();
		  
		  
		  
	  }
	  @GetMapping("/gethistDemSituation")
	  public List <Libre_demande> gethistdemsituation(){
		return demandeDAO.gethisSituationCRh();
		  
		  
		  
	  }
	  @GetMapping("/getapi")
	  public String getapi(@RequestParam("myparam")String param){
		return "hello"+param;
		  
		  
		  
	  }
	  @GetMapping("/getapiE/{cod}/{mat}/{id}")
	  public libreDemandek getlibredemcngE(@PathVariable("cod")String cod,@PathVariable("mat") String mat,@PathVariable("id") long id){
		return   demandeK.getlibreDemandeE(cod, mat, id);
		
		  
		  
		  
	  }
	  @GetMapping("/getapiC/{cod}/{mat}/{id}")
	  public libreDemandek getlibredemcngC(@PathVariable("cod")String cod,@PathVariable("mat") String mat,@PathVariable("id") long id){
		return   demandeK.getlibreDemandeC(cod, mat, id);
		
		  
		  
		  
	  }
	  @GetMapping("/getapiautorisation/{cod}/{mat}/{id}")
	  public  libreDemandek getlibreDemandeAutourisation(@PathVariable("cod")String cod,@PathVariable("mat") String mat,@PathVariable("id") long id) {
		  return demandeK.getlibreDemandeAutourisation(cod, mat, id);
	  }
	  @GetMapping("/getapiFormation/{cod}/{mat}/{id}")
	  public  libreDemandek getlibreDemandeFormation(@PathVariable("cod")String cod,@PathVariable("mat") String mat,@PathVariable("id") long id) {
		  return demandeK.getlibreDemandeFormation(cod, mat, id);
	  }
	  @GetMapping("/getapiPret/{cod}/{mat}/{id}")
	  public libreDemandek getlibredemPret(@PathVariable("cod")String cod,@PathVariable("mat") String mat,@PathVariable("id") long id){
		return   demandeK.getlibreDemandekPret(cod, mat, id);
	
	  }
	  @GetMapping("/getapiDocument/{cod}/{mat}/{id}")
	  public  libreDemandek getlibreDemandeDocument(@PathVariable("cod")String cod,@PathVariable("mat") String mat,@PathVariable("id") long id) {
		  return demandeK.getlibreDemandeDocument(cod, mat, id);
	  }
	  @GetMapping("/getapisit/{cod}/{mat}/{id}")
	  public libreDemandek getlibredemSituation(@PathVariable("cod")String cod,@PathVariable("mat") String mat,@PathVariable("id") long id){
		return   demandeK.getlibreDemandekSituation(cod, mat, id);
		  
		  
		  
	  }
	  
	  @PostMapping("/getcngbyid")
	  public Cal_Pers getcngbyid(@RequestBody CalPersPK id ) {
		  
		  String codSoc = id.getCod_soc();
			String matPers = id.getMat_pers();
		  long months=id.getMonths();
			long years=id.getYears();
			long days=id.getDays();
				
		return calPersDao.getListConjebyid(codSoc,matPers,days,months,years);}
	  @GetMapping("/getsoldcng/{cod}/{mat}")
	  public Long getsoldcng(@PathVariable("cod")String cod,@PathVariable("mat")String mat) {
		  return demandeDAO.getsoldcng(cod, mat);
		  
		  
	  }
	  @CrossOrigin
	  @PostMapping("/upload")
	  public ResponseEntity<List<ResponseDataAttachement>> uploadFile(
	          @RequestParam("files") List<MultipartFile> files,
	          @RequestParam("id") Long id,
	          @RequestParam(value = "idAttachment", required = false) List<String> idAttachmentStrings) throws Exception {

	      // Convertir les chaînes en Long et gérer les valeurs nulles
	      List<Long> idAttachments = idAttachmentStrings != null ? 
	                                 idAttachmentStrings.stream()
	                                                     .map(str -> str.isEmpty() ? null : Long.parseLong(str))
	                                                     .collect(Collectors.toList()) 
	                                 : Collections.emptyList();

	      if (files.size() != idAttachments.size() && !idAttachments.isEmpty()) {
	          return null;
	      }

	      List<ResponseDataAttachement> res = new ArrayList<>();
	      for (int i = 0; i < files.size(); i++) {
	          MultipartFile file = files.get(i);
	          Long attachmentId = idAttachments.size() > i ? idAttachments.get(i) : null; // Utilisez null si aucun idAttachment n'est disponible
	          System.out.println("attachmentId "+attachmentId);
	          AttachmentDemande attachment = attachmentService.saveAttachment(file, id, attachmentId);
	          res.add(new ResponseDataAttachement(attachment.getFile_name(),
	                  attachment.getId().toString(),
	                  file.getContentType(),
	                  file.getSize()));
	      }

	      return ResponseEntity.ok().body(res);
	  }

	    @GetMapping("/download/{fileId}")
	    public ResponseEntity<Resource> downloadFile(@PathVariable Long fileId) throws Exception {
	        AttachmentDemande attachment = attachmentService.getAttachment(fileId);
	        HttpHeaders httpHeaders = new HttpHeaders();
	        httpHeaders.add("File-Name", attachment.getFile_name());

	        return ResponseEntity.ok().contentType(MediaType.parseMediaType(attachment.getFile_type()))
	                .headers(httpHeaders).body(new ByteArrayResource(attachment.getData()));
	    }

	    @GetMapping("/getAttachment/{id}")
	    List<AttachmentDemande> getAttachment(@PathVariable("id") Long id) throws Exception
	    {
	    	return attachmentService.getAttachmentByIdDemande(id);
	    }
	    
	    
	    @CrossOrigin
	    @GetMapping("/downloadListFile/{documentId}")
	    public void downloadFilee(@PathVariable("documentId") Long documentId, HttpServletResponse response) throws Exception {
	        List<AttachmentDemande> documents = attachmentService.getAttachmentByIdDemande(documentId);

	        if (documents.isEmpty()) {
	            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	            return;
	        }

	        for (AttachmentDemande document : documents) {
	            try {
	                System.out.println("fileDB.getFileName(): " + document.getFile_name());
	                response.setHeader("Content-Disposition", "inline;filename=\"" + document.getFile_name() + "\"");
	                response.setContentType(document.getFile_type());

	                InputStream ins = new ByteArrayInputStream(document.getData());
	                IOUtils.copy(ins, response.getOutputStream());
	                System.out.println("ins: " + ins);

	                response.flushBuffer(); // Important to flush after each file
	            } catch (IOException e) {
	                e.printStackTrace();
	                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	            } catch (Exception e) {
	                e.printStackTrace();
	                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	            }
	        }
	    }
	    
		@DeleteMapping("/attachment/{id}")
		public ResponseEntity<String> deleteAttachment(@PathVariable Long id) {
			attachmentDemandeDao.deleteById(id);
			return ResponseEntity.ok("Deleted");
		}
	    @CrossOrigin
		@GetMapping("/getAllAttachment")
		public List<AttachmentDemande> getAllAttchment(){
			return attachmentDemandeDao.findAll();}
	    
	    @GetMapping("/getAll")
	    public List<AttachmentDemande> getAllAttachments(){
	    	return attachmentService.getAllAttachments();
	    }
}
