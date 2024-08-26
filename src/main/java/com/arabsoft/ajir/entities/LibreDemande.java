package com.arabsoft.ajir.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LibreDemande {


  @Id
  public Long id_libre_demande;
  public String cod_soc;
  public String mat_pers;
  public String typ_demande;
  public Date date_demande;
  public Date dat_debut;
  public Date dat_fin;
  public Long heur_s;
  public Long min_s;
  public Long heur_r;
  public Long min_r;
  public String cod_tit;
  public String cod_typ;
  public String cod_theme;
  public String cod_grp_pret;
  public String typ_pret;
  public Long mnt_dem;
  public Long num_attest;
  public String txt_dem;
  public String txt_reponse;
  public String reponse_chef;
  public String reponse;
  public String txt_chef;
  public String file_name;
  public String content_type;
  public String path;
  public byte[] fichier_joint;
  public String cod_m;
  public String cng_temps_fin;
  public String cng_temps_debut;
  public String cng_temps;
  public String cod_aut;
  public Long annee;
  public Date dat_recep;
  public String motif;
  public String adresse;
  public String tel;
  public Date dat_reprise_prev;
  public String s_reprise_prev;
  public Long nbr_jours;
  public Long nbr_jours_cal;
  public String state;
  public Long sold_cng;
  public String nat_cng;
  public Long bonus_cng;
  public String code_m;
  public Long annee_cng;
public Long getId_libre_demande() {
	return id_libre_demande;
}
public void setId_libre_demande(Long id_libre_demande) {
	this.id_libre_demande = id_libre_demande;
}
public String getCod_soc() {
	return cod_soc;
}
public void setCod_soc(String cod_soc) {
	this.cod_soc = cod_soc;
}
public String getMat_pers() {
	return mat_pers;
}
public void setMat_pers(String mat_pers) {
	this.mat_pers = mat_pers;
}
public String getTyp_demande() {
	return typ_demande;
}
public void setTyp_demande(String typ_demande) {
	this.typ_demande = typ_demande;
}
public Date getDate_demande() {
	return date_demande;
}
public void setDate_demande(Date date_demande) {
	this.date_demande = date_demande;
}
public Date getDat_debut() {
	return dat_debut;
}
public void setDat_debut(Date dat_debut) {
	this.dat_debut = dat_debut;
}
public Date getDat_fin() {
	return dat_fin;
}
public void setDat_fin(Date dat_fin) {
	this.dat_fin = dat_fin;
}
public Long getHeur_s() {
	return heur_s;
}
public void setHeur_s(Long heur_s) {
	this.heur_s = heur_s;
}
public Long getMin_s() {
	return min_s;
}
public void setMin_s(Long min_s) {
	this.min_s = min_s;
}
public Long getHeur_r() {
	return heur_r;
}
public void setHeur_r(Long heur_r) {
	this.heur_r = heur_r;
}
public Long getMin_r() {
	return min_r;
}
public void setMin_r(Long min_r) {
	this.min_r = min_r;
}
public String getCod_tit() {
	return cod_tit;
}
public void setCod_tit(String cod_tit) {
	this.cod_tit = cod_tit;
}
public String getCod_typ() {
	return cod_typ;
}
public void setCod_typ(String cod_typ) {
	this.cod_typ = cod_typ;
}
public String getCod_theme() {
	return cod_theme;
}
public void setCod_theme(String cod_theme) {
	this.cod_theme = cod_theme;
}
public String getCod_grp_pret() {
	return cod_grp_pret;
}
public void setCod_grp_pret(String cod_grp_pret) {
	this.cod_grp_pret = cod_grp_pret;
}
public String getTyp_pret() {
	return typ_pret;
}
public void setTyp_pret(String typ_pret) {
	this.typ_pret = typ_pret;
}
public Long getMnt_dem() {
	return mnt_dem;
}
public void setMnt_dem(Long mnt_dem) {
	this.mnt_dem = mnt_dem;
}
public Long getNum_attest() {
	return num_attest;
}
public void setNum_attest(Long num_attest) {
	this.num_attest = num_attest;
}
public String getTxt_dem() {
	return txt_dem;
}
public void setTxt_dem(String txt_dem) {
	this.txt_dem = txt_dem;
}
public String getTxt_reponse() {
	return txt_reponse;
}
public void setTxt_reponse(String txt_reponse) {
	this.txt_reponse = txt_reponse;
}
public String getReponse_chef() {
	return reponse_chef;
}
public void setReponse_chef(String reponse_chef) {
	this.reponse_chef = reponse_chef;
}
public String getReponse() {
	return reponse;
}
public void setReponse(String reponse) {
	this.reponse = reponse;
}
public String getTxt_chef() {
	return txt_chef;
}
public void setTxt_chef(String txt_chef) {
	this.txt_chef = txt_chef;
}
public String getFile_name() {
	return file_name;
}
public void setFile_name(String file_name) {
	this.file_name = file_name;
}
public String getContent_type() {
	return content_type;
}
public void setContent_type(String content_type) {
	this.content_type = content_type;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public byte[] getFichier_joint() {
	return fichier_joint;
}
public void setFichier_joint(byte[] fichier_joint) {
	this.fichier_joint = fichier_joint;
}
public String getCod_m() {
	return cod_m;
}
public void setCod_m(String cod_m) {
	this.cod_m = cod_m;
}
public String getCng_temps_fin() {
	return cng_temps_fin;
}
public void setCng_temps_fin(String cng_temps_fin) {
	this.cng_temps_fin = cng_temps_fin;
}
public String getCng_temps_debut() {
	return cng_temps_debut;
}
public void setCng_temps_debut(String cng_temps_debut) {
	this.cng_temps_debut = cng_temps_debut;
}
public String getCng_temps() {
	return cng_temps;
}
public void setCng_temps(String cng_temps) {
	this.cng_temps = cng_temps;
}
public String getCod_aut() {
	return cod_aut;
}
public void setCod_aut(String cod_aut) {
	this.cod_aut = cod_aut;
}
public Long getAnnee() {
	return annee;
}
public void setAnnee(Long annee) {
	this.annee = annee;
}
public Date getDat_recep() {
	return dat_recep;
}
public void setDat_recep(Date dat_recep) {
	this.dat_recep = dat_recep;
}
public String getMotif() {
	return motif;
}
public void setMotif(String motif) {
	this.motif = motif;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public Date getDat_reprise_prev() {
	return dat_reprise_prev;
}
public void setDat_reprise_prev(Date dat_reprise_prev) {
	this.dat_reprise_prev = dat_reprise_prev;
}
public String getS_reprise_prev() {
	return s_reprise_prev;
}
public void setS_reprise_prev(String s_reprise_prev) {
	this.s_reprise_prev = s_reprise_prev;
}
public Long getNbr_jours() {
	return nbr_jours;
}
public void setNbr_jours(Long nbr_jours) {
	this.nbr_jours = nbr_jours;
}
public Long getNbr_jours_cal() {
	return nbr_jours_cal;
}
public void setNbr_jours_cal(Long nbr_jours_cal) {
	this.nbr_jours_cal = nbr_jours_cal;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Long getSold_cng() {
	return sold_cng;
}
public void setSold_cng(Long sold_cng) {
	this.sold_cng = sold_cng;
}
public String getNat_cng() {
	return nat_cng;
}
public void setNat_cng(String nat_cng) {
	this.nat_cng = nat_cng;
}
public Long getBonus_cng() {
	return bonus_cng;
}
public void setBonus_cng(Long bonus_cng) {
	this.bonus_cng = bonus_cng;
}
public String getCode_m() {
	return code_m;
}
public void setCode_m(String code_m) {
	this.code_m = code_m;
}
public Long getAnnee_cng() {
	return annee_cng;
}
public void setAnnee_cng(Long annee_cng) {
	this.annee_cng = annee_cng;
}
public LibreDemande(Long id_libre_demande, String cod_soc, String mat_pers, String typ_demande, Date date_demande,
		Date dat_debut, Date dat_fin, Long heur_s, Long min_s, Long heur_r, Long min_r, String cod_tit, String cod_typ,
		String cod_theme, String cod_grp_pret, String typ_pret, Long mnt_dem, Long num_attest, String txt_dem,
		String txt_reponse, String reponse_chef, String reponse, String txt_chef, String file_name, String content_type,
		String path, byte[] fichier_joint, String cod_m, String cng_temps_fin, String cng_temps_debut, String cng_temps,
		String cod_aut, Long annee, Date dat_recep, String motif, String adresse, String tel, Date dat_reprise_prev,
		String s_reprise_prev, Long nbr_jours, Long nbr_jours_cal, String state, Long sold_cng, String nat_cng,
		Long bonus_cng, String code_m, Long annee_cng) {
	super();
	this.id_libre_demande = id_libre_demande;
	this.cod_soc = cod_soc;
	this.mat_pers = mat_pers;
	this.typ_demande = typ_demande;
	this.date_demande = date_demande;
	this.dat_debut = dat_debut;
	this.dat_fin = dat_fin;
	this.heur_s = heur_s;
	this.min_s = min_s;
	this.heur_r = heur_r;
	this.min_r = min_r;
	this.cod_tit = cod_tit;
	this.cod_typ = cod_typ;
	this.cod_theme = cod_theme;
	this.cod_grp_pret = cod_grp_pret;
	this.typ_pret = typ_pret;
	this.mnt_dem = mnt_dem;
	this.num_attest = num_attest;
	this.txt_dem = txt_dem;
	this.txt_reponse = txt_reponse;
	this.reponse_chef = reponse_chef;
	this.reponse = reponse;
	this.txt_chef = txt_chef;
	this.file_name = file_name;
	this.content_type = content_type;
	this.path = path;
	this.fichier_joint = fichier_joint;
	this.cod_m = cod_m;
	this.cng_temps_fin = cng_temps_fin;
	this.cng_temps_debut = cng_temps_debut;
	this.cng_temps = cng_temps;
	this.cod_aut = cod_aut;
	this.annee = annee;
	this.dat_recep = dat_recep;
	this.motif = motif;
	this.adresse = adresse;
	this.tel = tel;
	this.dat_reprise_prev = dat_reprise_prev;
	this.s_reprise_prev = s_reprise_prev;
	this.nbr_jours = nbr_jours;
	this.nbr_jours_cal = nbr_jours_cal;
	this.state = state;
	this.sold_cng = sold_cng;
	this.nat_cng = nat_cng;
	this.bonus_cng = bonus_cng;
	this.code_m = code_m;
	this.annee_cng = annee_cng;
}
public LibreDemande() {
	super();
	// TODO Auto-generated constructor stub
}
public LibreDemande(Long id_libre_demande, String txt_reponse, String reponse) {
	super();
	this.id_libre_demande = id_libre_demande;
	this.txt_reponse = txt_reponse;
	this.reponse = reponse;
}
  
  
  
  
}
