package com.arabsoft.ajir.sevices;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.pdf.codec.Base64.InputStream;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import org.springframework.stereotype.Service;

@Service
public class ConnectionBdReport {
	@Value("${spring.datasource.url}")
	private String ConnDatasource;
	@Value("${spring.datasource.driver-class-name}")
	private String DiverBD;
	@Value("${spring.datasource.username}")
	private String UserName;
	@Value("${spring.datasource.password}")
	private String Password;
	

	@Autowired  ServletContext context;

	@Autowired
	DataSource datasource;
	public Connection BdReport() {
		Connection conn = null;

		try {
			Class.forName(DiverBD);

			// conn =
			// DriverManager.getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/local",
			// "fid", "arab");
			// conn =
			// DriverManager.getConnection("jdbc:oracle:thin:@//192.168.2.234:1521/local",
			// "fid", "arab");
			conn = DriverManager.getConnection(ConnDatasource, UserName, Password);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	/*Methode Generate PDF File*/
		public byte[] GeneratePDF(String param1, String param2,String param3,String param4,String param5)
			
			throws JRException, IOException {


			//String path = "D:\\pdf\\report";
			String path ="c:/pdf";
			//String path =".//PDF";
			try {
				File file = ResourceUtils.getFile("classpath:"+ param1 + ".jrxml");
				System.out.println("parameters"+file);
			//File file = ResourceUtils.getFile(read+ param1 + ".jrxml");
			//System.out.println("file **************"+file);
			JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
			Map parameters = new HashMap();
			parameters.put("mat1",param2);
			parameters.put("COD_SOC",param3);
			parameters.put("dat",param4);
			parameters.put("ctb",param5);
			
			System.out.println("parameters"+parameters.values());
			//parameters.put("numFactInd",Long.parseLong(param2));

			//parameters.put("Logo",context.getRealPath("/")+"/images/articles/angular.png");
			// get Connection
			Connection conn = BdReport();
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
			// create file jasper
			param1 = param1+System.currentTimeMillis();
			JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\" + param1+ ".pdf");
			// return Files.readAllBytes(Paths.get(path + "\\" + ReportName + ".pdf"));
			return Files.readAllBytes(Paths.get(path + "\\" +param1+ ".pdf"));
		} catch (Exception ex) {
			return null;
		}
	}
		
		
		
		  public byte[] genererRapportPDF(String param1, String param2, String param3, String param4, String param5) throws JRException, IOException {
		        try {
		            // Chargement du fichier JRXML
		            String cheminJRXML = "E:\\PARTAGE\\rapport_grh_pub\\Jasperfile\\" + param1 + ".jrxml";
		            File jrxmlFile = ResourceUtils.getFile(cheminJRXML);
					System.out.println("jrxmlInputStream **************"+jrxmlFile);
					//System.out.println("cheminJRXML **************"+cheminJRXML);
					String path ="E:/PARTAGE/pdf";
					
		            if (jrxmlFile == null) {
		                // Le fichier JRXML n'a pas été trouvé
		                return null;
		            }

		            // Compilation du rapport JRXML en JasperReport
		            JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlFile.getAbsolutePath());
		            System.out.println("jasperReport **************"+jasperReport);
		            // Paramètres du rapport
		            Map<String, Object> parametres = new HashMap<>();
		            parametres.put("mat1", param2);
		            parametres.put("COD_SOC", param3);
		            parametres.put("dat", param4);
		            parametres.put("ctb", param5);
		            System.out.println("parametres **************"+parametres.values());
		            // Connexion à la base de données (si nécessaire)
		             Connection conn = BdReport();

		            // Remplissage du rapport avec des données
		            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametres, conn);

		            // Export du rapport en PDF
		            byte[] rapportPDF = JasperExportManager.exportReportToPdf(jasperPrint);
		            param1 = param1+System.currentTimeMillis();
					JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\" + param1+ ".pdf");
					// return Files.readAllBytes(Paths.get(path + "\\" + ReportName + ".pdf"));
					return Files.readAllBytes(Paths.get(path + "\\" +param1+ ".pdf"));
		           
		        } catch (Exception ex) {
		            ex.printStackTrace();
		            return null;
		        }
		    }

		    // Vous pouvez inclure la méthode BdReport ici pour gérer la connexion à la base de données si nécessaire
	
	

		public byte[] GeneratePDFF(String param1)
		
				throws JRException, IOException {
				 
				//String path = "D:\\pdf\\report";
				String path ="c:/pdf";
				//String path =".//PDF";
				try {
				File file = ResourceUtils.getFile("classpath:"+ param1 + ".jrxml");
				
				JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
				Map parameters = new HashMap();
				// get Connection
				Connection conn = BdReport();
				JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
				// create file jasper
				param1 = param1+System.currentTimeMillis();
				JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\" + param1+ ".pdf");
				// return Files.readAllBytes(Paths.get(path + "\\" + ReportName + ".pdf"));
				return Files.readAllBytes(Paths.get(path + "\\" +param1+ ".pdf"));
			} catch (Exception ex) {
				return null;
			}
		}
		
	    
}
