package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@IdClass(ClePersonnel.class)
public class PersonnelP {

	
	@Id
	public String cod_soc;
	@Id
	public String mat_pers;
	
	public String nom_pers;
	public String pren_pers;
	public String nom_pers_a;
	public String pren_pers_a;
	public String nom_jf;
	public String nom_jf_a;
	public String cin;
	public String sexe;
	public String cod_sit;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_sit;
	public String chef_fam;
	public Long nbre_enf;
	public String charg_enf;
	public String charg_all;
	public String fct_fam;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_ent;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_tit;
	public String cod_serv;
	public String cod_fonct;
	public String cod_categ;
	public String cod_cat;
	public String cod_grad;
	public String cod_motif;
	public String cod_natp;
	public String cod_stat;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_serv;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_fonct;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_qualf;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_categ;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_cat;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_grad;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_ech;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_emb;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_motif;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_nais;
	public String etat_act;
	public String per_mat_pers;
	public String qualf;
	public Long cod_ech;
	public String cod_affect;
	public String cod_niveau;
	public String poste_trav;
	public String cod_metier;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_maj;
	public String adm_tech;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_stat;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_cin;
	public String lie_emi_cin;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_affect;
	public String lieu_nais;
	public String cod_lieu_geog;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_lieu_geog;
	public String grp_sang;
	public String num_retr;
	public String cod_fil;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_fil;
	public String serv_mil;
	public String code_domaine;
	public String cod_ur;
	public String cod_class;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_class;
	public String cod_typ_depart;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_depart;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_ur;
	public String org_serv;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_poste_trav;
	public String cod_nat_recr;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_adm_tech;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_org_serv;
	public String maintien_pers;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date maintien_date;
	public String typ_rang;
	public String handicap;
	public Long pourcent_hand;
	public String typ_handicap;
	public String num_fich_hand;
	public Long niv_sal;
	public String cod_assur;
	public String num_assur;
	public String cod_retr;
	public String typ_id;
	public String etat_sante;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_eff_fich_hand;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_fin_fich_hand;
	public String ref_fonct;
	public String nat_texte_fonct;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date nouv_dat_ech;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_niv_sal;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_ass;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_aff_cnam;
	public String etat_poste_trav;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_fin_cont;
	public String presum_nais;
	public String cod_fill;
	public String suspens_ass;
	public String cod_motif_susp;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_fin_suspens;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_deb_suspens;
	public String chronique;
	public String cod_cat_class;




	
	//@Column(insertable=false,updatable=false)

	public String nom_pren;
	
	

	public String getNom_pren() {
		return nom_pren;
	}
	public void setNom_pren(String nom_pren) {
		this.nom_pren = nom_pren;
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
	public String getNom_pers() {
		return nom_pers;
	}
	public void setNom_pers(String nom_pers) {
		this.nom_pers = nom_pers;
	}
	public String getPren_pers() {
		return pren_pers;
	}
	public void setPren_pers(String pren_pers) {
		this.pren_pers = pren_pers;
	}
	public String getNom_pers_a() {
		return nom_pers_a;
	}
	public void setNom_pers_a(String nom_pers_a) {
		this.nom_pers_a = nom_pers_a;
	}
	public String getPren_pers_a() {
		return pren_pers_a;
	}
	public void setPren_pers_a(String pren_pers_a) {
		this.pren_pers_a = pren_pers_a;
	}
	public String getNom_jf() {
		return nom_jf;
	}
	public void setNom_jf(String nom_jf) {
		this.nom_jf = nom_jf;
	}
	public String getNom_jf_a() {
		return nom_jf_a;
	}
	public void setNom_jf_a(String nom_jf_a) {
		this.nom_jf_a = nom_jf_a;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getCod_sit() {
		return cod_sit;
	}
	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}
	public Date getDat_sit() {
		return dat_sit;
	}
	public void setDat_sit(Date dat_sit) {
		this.dat_sit = dat_sit;
	}
	public String getChef_fam() {
		return chef_fam;
	}
	public void setChef_fam(String chef_fam) {
		this.chef_fam = chef_fam;
	}
	public Long getNbre_enf() {
		return nbre_enf;
	}
	public void setNbre_enf(Long nbre_enf) {
		this.nbre_enf = nbre_enf;
	}
	public String getCharg_enf() {
		return charg_enf;
	}
	public void setCharg_enf(String charg_enf) {
		this.charg_enf = charg_enf;
	}
	public String getCharg_all() {
		return charg_all;
	}
	public void setCharg_all(String charg_all) {
		this.charg_all = charg_all;
	}
	public String getFct_fam() {
		return fct_fam;
	}
	public void setFct_fam(String fct_fam) {
		this.fct_fam = fct_fam;
	}
	public Date getDat_ent() {
		return dat_ent;
	}
	public void setDat_ent(Date dat_ent) {
		this.dat_ent = dat_ent;
	}
	public Date getDat_tit() {
		return dat_tit;
	}
	public void setDat_tit(Date dat_tit) {
		this.dat_tit = dat_tit;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getCod_fonct() {
		return cod_fonct;
	}
	public void setCod_fonct(String cod_fonct) {
		this.cod_fonct = cod_fonct;
	}
	public String getCod_categ() {
		return cod_categ;
	}
	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getCod_grad() {
		return cod_grad;
	}
	public void setCod_grad(String cod_grad) {
		this.cod_grad = cod_grad;
	}
	public String getCod_motif() {
		return cod_motif;
	}
	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}
	public String getCod_natp() {
		return cod_natp;
	}
	public void setCod_natp(String cod_natp) {
		this.cod_natp = cod_natp;
	}
	public String getCod_stat() {
		return cod_stat;
	}
	public void setCod_stat(String cod_stat) {
		this.cod_stat = cod_stat;
	}
	public Date getDat_serv() {
		return dat_serv;
	}
	public void setDat_serv(Date dat_serv) {
		this.dat_serv = dat_serv;
	}
	public Date getDat_fonct() {
		return dat_fonct;
	}
	public void setDat_fonct(Date dat_fonct) {
		this.dat_fonct = dat_fonct;
	}
	public Date getDat_qualf() {
		return dat_qualf;
	}
	public void setDat_qualf(Date dat_qualf) {
		this.dat_qualf = dat_qualf;
	}
	public Date getDat_categ() {
		return dat_categ;
	}
	public void setDat_categ(Date dat_categ) {
		this.dat_categ = dat_categ;
	}
	public Date getDat_cat() {
		return dat_cat;
	}
	public void setDat_cat(Date dat_cat) {
		this.dat_cat = dat_cat;
	}
	public Date getDat_grad() {
		return dat_grad;
	}
	public void setDat_grad(Date dat_grad) {
		this.dat_grad = dat_grad;
	}
	public Date getDat_ech() {
		return dat_ech;
	}
	public void setDat_ech(Date dat_ech) {
		this.dat_ech = dat_ech;
	}
	public Date getDat_emb() {
		return dat_emb;
	}
	public void setDat_emb(Date dat_emb) {
		this.dat_emb = dat_emb;
	}
	public Date getDat_motif() {
		return dat_motif;
	}
	public void setDat_motif(Date dat_motif) {
		this.dat_motif = dat_motif;
	}
	public Date getDat_nais() {
		return dat_nais;
	}
	public void setDat_nais(Date dat_nais) {
		this.dat_nais = dat_nais;
	}
	public String getEtat_act() {
		return etat_act;
	}
	public void setEtat_act(String etat_act) {
		this.etat_act = etat_act;
	}
	public String getPer_mat_pers() {
		return per_mat_pers;
	}
	public void setPer_mat_pers(String per_mat_pers) {
		this.per_mat_pers = per_mat_pers;
	}
	public String getQualf() {
		return qualf;
	}
	public void setQualf(String qualf) {
		this.qualf = qualf;
	}
	public Long getCod_ech() {
		return cod_ech;
	}
	public void setCod_ech(Long cod_ech) {
		this.cod_ech = cod_ech;
	}
	public String getCod_affect() {
		return cod_affect;
	}
	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}
	public String getCod_niveau() {
		return cod_niveau;
	}
	public void setCod_niveau(String cod_niveau) {
		this.cod_niveau = cod_niveau;
	}
	public String getPoste_trav() {
		return poste_trav;
	}
	public void setPoste_trav(String poste_trav) {
		this.poste_trav = poste_trav;
	}
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}


	public Date getDat_maj() {
		return dat_maj;
	}
	public void setDat_maj(Date dat_maj) {
		this.dat_maj = dat_maj;
	}
	public String getAdm_tech() {
		return adm_tech;
	}
	public void setAdm_tech(String adm_tech) {
		this.adm_tech = adm_tech;
	}
	public Date getDat_stat() {
		return dat_stat;
	}
	public void setDat_stat(Date dat_stat) {
		this.dat_stat = dat_stat;
	}
	public Date getDat_cin() {
		return dat_cin;
	}
	public void setDat_cin(Date dat_cin) {
		this.dat_cin = dat_cin;
	}
	public String getLie_emi_cin() {
		return lie_emi_cin;
	}
	public void setLie_emi_cin(String lie_emi_cin) {
		this.lie_emi_cin = lie_emi_cin;
	}
	public Date getDat_affect() {
		return dat_affect;
	}
	public void setDat_affect(Date dat_affect) {
		this.dat_affect = dat_affect;
	}
	public String getLieu_nais() {
		return lieu_nais;
	}
	public void setLieu_nais(String lieu_nais) {
		this.lieu_nais = lieu_nais;
	}
	public String getCod_lieu_geog() {
		return cod_lieu_geog;
	}
	public void setCod_lieu_geog(String cod_lieu_geog) {
		this.cod_lieu_geog = cod_lieu_geog;
	}
	public Date getDat_lieu_geog() {
		return dat_lieu_geog;
	}
	public void setDat_lieu_geog(Date dat_lieu_geog) {
		this.dat_lieu_geog = dat_lieu_geog;
	}
	public String getGrp_sang() {
		return grp_sang;
	}
	public void setGrp_sang(String grp_sang) {
		this.grp_sang = grp_sang;
	}
	public String getNum_retr() {
		return num_retr;
	}
	public void setNum_retr(String num_retr) {
		this.num_retr = num_retr;
	}
	public String getCod_fil() {
		return cod_fil;
	}
	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
	}
	public Date getDat_fil() {
		return dat_fil;
	}
	public void setDat_fil(Date dat_fil) {
		this.dat_fil = dat_fil;
	}
	public String getServ_mil() {
		return serv_mil;
	}
	public void setServ_mil(String serv_mil) {
		this.serv_mil = serv_mil;
	}
	public String getCode_domaine() {
		return code_domaine;
	}
	public void setCode_domaine(String code_domaine) {
		this.code_domaine = code_domaine;
	}
	public String getCod_ur() {
		return cod_ur;
	}
	public void setCod_ur(String cod_ur) {
		this.cod_ur = cod_ur;
	}
	public String getCod_class() {
		return cod_class;
	}
	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}
	public Date getDat_class() {
		return dat_class;
	}
	public void setDat_class(Date dat_class) {
		this.dat_class = dat_class;
	}
	public String getCod_typ_depart() {
		return cod_typ_depart;
	}
	public void setCod_typ_depart(String cod_typ_depart) {
		this.cod_typ_depart = cod_typ_depart;
	}
	public Date getDat_depart() {
		return dat_depart;
	}
	public void setDat_depart(Date dat_depart) {
		this.dat_depart = dat_depart;
	}
	public Date getDat_ur() {
		return dat_ur;
	}
	public void setDat_ur(Date dat_ur) {
		this.dat_ur = dat_ur;
	}
	public String getOrg_serv() {
		return org_serv;
	}
	public void setOrg_serv(String org_serv) {
		this.org_serv = org_serv;
	}
	public Date getDat_poste_trav() {
		return dat_poste_trav;
	}
	public void setDat_poste_trav(Date dat_poste_trav) {
		this.dat_poste_trav = dat_poste_trav;
	}
	public String getCod_nat_recr() {
		return cod_nat_recr;
	}
	public void setCod_nat_recr(String cod_nat_recr) {
		this.cod_nat_recr = cod_nat_recr;
	}
	public Date getDat_adm_tech() {
		return dat_adm_tech;
	}
	public void setDat_adm_tech(Date dat_adm_tech) {
		this.dat_adm_tech = dat_adm_tech;
	}
	public Date getDat_org_serv() {
		return dat_org_serv;
	}
	public void setDat_org_serv(Date dat_org_serv) {
		this.dat_org_serv = dat_org_serv;
	}
	public String getMaintien_pers() {
		return maintien_pers;
	}
	public void setMaintien_pers(String maintien_pers) {
		this.maintien_pers = maintien_pers;
	}
	public Date getMaintien_date() {
		return maintien_date;
	}
	public void setMaintien_date(Date maintien_date) {
		this.maintien_date = maintien_date;
	}
	public String getTyp_rang() {
		return typ_rang;
	}
	public void setTyp_rang(String typ_rang) {
		this.typ_rang = typ_rang;
	}
	public String getHandicap() {
		return handicap;
	}
	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}
	public Long getPourcent_hand() {
		return pourcent_hand;
	}
	public void setPourcent_hand(Long pourcent_hand) {
		this.pourcent_hand = pourcent_hand;
	}
	public String getTyp_handicap() {
		return typ_handicap;
	}
	public void setTyp_handicap(String typ_handicap) {
		this.typ_handicap = typ_handicap;
	}
	public String getNum_fich_hand() {
		return num_fich_hand;
	}
	public void setNum_fich_hand(String num_fich_hand) {
		this.num_fich_hand = num_fich_hand;
	}
	public Long getNiv_sal() {
		return niv_sal;
	}
	public void setNiv_sal(Long niv_sal) {
		this.niv_sal = niv_sal;
	}
	public String getCod_assur() {
		return cod_assur;
	}
	public void setCod_assur(String cod_assur) {
		this.cod_assur = cod_assur;
	}
	public String getNum_assur() {
		return num_assur;
	}
	public void setNum_assur(String num_assur) {
		this.num_assur = num_assur;
	}
	public String getCod_retr() {
		return cod_retr;
	}
	public void setCod_retr(String cod_retr) {
		this.cod_retr = cod_retr;
	}
	public String getTyp_id() {
		return typ_id;
	}
	public void setTyp_id(String typ_id) {
		this.typ_id = typ_id;
	}
	public String getEtat_sante() {
		return etat_sante;
	}
	public void setEtat_sante(String etat_sante) {
		this.etat_sante = etat_sante;
	}
	public Date getDat_eff_fich_hand() {
		return dat_eff_fich_hand;
	}
	public void setDat_eff_fich_hand(Date dat_eff_fich_hand) {
		this.dat_eff_fich_hand = dat_eff_fich_hand;
	}
	public Date getDat_fin_fich_hand() {
		return dat_fin_fich_hand;
	}
	public void setDat_fin_fich_hand(Date dat_fin_fich_hand) {
		this.dat_fin_fich_hand = dat_fin_fich_hand;
	}
	public String getRef_fonct() {
		return ref_fonct;
	}
	public void setRef_fonct(String ref_fonct) {
		this.ref_fonct = ref_fonct;
	}
	public String getNat_texte_fonct() {
		return nat_texte_fonct;
	}
	public void setNat_texte_fonct(String nat_texte_fonct) {
		this.nat_texte_fonct = nat_texte_fonct;
	}
	public Date getNouv_dat_ech() {
		return nouv_dat_ech;
	}
	public void setNouv_dat_ech(Date nouv_dat_ech) {
		this.nouv_dat_ech = nouv_dat_ech;
	}
	public Date getDat_niv_sal() {
		return dat_niv_sal;
	}
	public void setDat_niv_sal(Date dat_niv_sal) {
		this.dat_niv_sal = dat_niv_sal;
	}
	public Date getDat_ass() {
		return dat_ass;
	}
	public void setDat_ass(Date dat_ass) {
		this.dat_ass = dat_ass;
	}
	public Date getDat_aff_cnam() {
		return dat_aff_cnam;
	}
	public void setDat_aff_cnam(Date dat_aff_cnam) {
		this.dat_aff_cnam = dat_aff_cnam;
	}
	public String getEtat_poste_trav() {
		return etat_poste_trav;
	}
	public void setEtat_poste_trav(String etat_poste_trav) {
		this.etat_poste_trav = etat_poste_trav;
	}
	public Date getDat_fin_cont() {
		return dat_fin_cont;
	}
	public void setDat_fin_cont(Date dat_fin_cont) {
		this.dat_fin_cont = dat_fin_cont;
	}
	public String getPresum_nais() {
		return presum_nais;
	}
	public void setPresum_nais(String presum_nais) {
		this.presum_nais = presum_nais;
	}
	public String getCod_fill() {
		return cod_fill;
	}
	public void setCod_fill(String cod_fill) {
		this.cod_fill = cod_fill;
	}
	public String getSuspens_ass() {
		return suspens_ass;
	}
	public void setSuspens_ass(String suspens_ass) {
		this.suspens_ass = suspens_ass;
	}
	public String getCod_motif_susp() {
		return cod_motif_susp;
	}
	public void setCod_motif_susp(String cod_motif_susp) {
		this.cod_motif_susp = cod_motif_susp;
	}
	public Date getDat_fin_suspens() {
		return dat_fin_suspens;
	}
	public void setDat_fin_suspens(Date dat_fin_suspens) {
		this.dat_fin_suspens = dat_fin_suspens;
	}
	public Date getDat_deb_suspens() {
		return dat_deb_suspens;
	}
	public void setDat_deb_suspens(Date dat_deb_suspens) {
		this.dat_deb_suspens = dat_deb_suspens;
	}
	public String getChronique() {
		return chronique;
	}
	public void setChronique(String chronique) {
		this.chronique = chronique;
	}
	public String getCod_cat_class() {
		return cod_cat_class;
	}
	public void setCod_cat_class(String cod_cat_class) {
		this.cod_cat_class = cod_cat_class;
	}
	



	public PersonnelP(String cod_soc, String mat_pers, String nom_pers, String pren_pers, String nom_pers_a,
			String pren_pers_a, String nom_jf, String nom_jf_a, String cin, String sexe, String cod_sit, Date dat_sit,
			String chef_fam, Long nbre_enf, String charg_enf, String charg_all, String fct_fam, Date dat_ent,
			Date dat_tit, String cod_serv, String cod_fonct, String cod_categ, String cod_cat, String cod_grad,
			String cod_motif, String cod_natp, String cod_stat, Date dat_serv, Date dat_fonct, Date dat_qualf,
			Date dat_categ, Date dat_cat, Date dat_grad, Date dat_ech, Date dat_emb, Date dat_motif, Date dat_nais,
			String etat_act, String per_mat_pers, String qualf, Long cod_ech, String cod_affect, String cod_niveau,
			String poste_trav, String cod_metier, Date dat_maj, String adm_tech, Date dat_stat,
			Date dat_cin, String lie_emi_cin, Date dat_affect, String lieu_nais, String cod_lieu_geog,
			Date dat_lieu_geog, String grp_sang, String num_retr, String cod_fil, Date dat_fil, String serv_mil,
			String code_domaine, String cod_ur, String cod_class, Date dat_class, String cod_typ_depart,
			Date dat_depart, Date dat_ur, String org_serv, Date dat_poste_trav, String cod_nat_recr, Date dat_adm_tech,
			Date dat_org_serv, String maintien_pers, Date maintien_date, String typ_rang, String handicap,
			Long pourcent_hand, String typ_handicap, String num_fich_hand, Long niv_sal, String cod_assur,
			String num_assur, String cod_retr, String typ_id, String etat_sante, Date dat_eff_fich_hand,
			Date dat_fin_fich_hand, String ref_fonct, String nat_texte_fonct, Date nouv_dat_ech, Date dat_niv_sal,
			Date dat_ass, Date dat_aff_cnam, String etat_poste_trav, Date dat_fin_cont, String presum_nais,
			String cod_fill, String suspens_ass, String cod_motif_susp, Date dat_fin_suspens, Date dat_deb_suspens,
			String chronique, String cod_cat_class,String nom_pren) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.nom_pers = nom_pers;
		this.pren_pers = pren_pers;
		this.nom_pers_a = nom_pers_a;
		this.pren_pers_a = pren_pers_a;
		this.nom_jf = nom_jf;
		this.nom_jf_a = nom_jf_a;
		this.cin = cin;
		this.sexe = sexe;
		this.cod_sit = cod_sit;
		this.dat_sit = dat_sit;
		this.chef_fam = chef_fam;
		this.nbre_enf = nbre_enf;
		this.charg_enf = charg_enf;
		this.charg_all = charg_all;
		this.fct_fam = fct_fam;
		this.dat_ent = dat_ent;
		this.dat_tit = dat_tit;
		this.cod_serv = cod_serv;
		this.cod_fonct = cod_fonct;
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
		this.cod_motif = cod_motif;
		this.cod_natp = cod_natp;
		this.cod_stat = cod_stat;
		this.dat_serv = dat_serv;
		this.dat_fonct = dat_fonct;
		this.dat_qualf = dat_qualf;
		this.dat_categ = dat_categ;
		this.dat_cat = dat_cat;
		this.dat_grad = dat_grad;
		this.dat_ech = dat_ech;
		this.dat_emb = dat_emb;
		this.dat_motif = dat_motif;
		this.dat_nais = dat_nais;
		this.etat_act = etat_act;
		this.per_mat_pers = per_mat_pers;
		this.qualf = qualf;
		this.cod_ech = cod_ech;
		this.cod_affect = cod_affect;
		this.cod_niveau = cod_niveau;
		this.poste_trav = poste_trav;
		this.cod_metier = cod_metier;
		this.dat_maj = dat_maj;
		this.adm_tech = adm_tech;
		this.dat_stat = dat_stat;
		this.dat_cin = dat_cin;
		this.lie_emi_cin = lie_emi_cin;
		this.dat_affect = dat_affect;
		this.lieu_nais = lieu_nais;
		this.cod_lieu_geog = cod_lieu_geog;
		this.dat_lieu_geog = dat_lieu_geog;
		this.grp_sang = grp_sang;
		this.num_retr = num_retr;
		this.cod_fil = cod_fil;
		this.dat_fil = dat_fil;
		this.serv_mil = serv_mil;
		this.code_domaine = code_domaine;
		this.cod_ur = cod_ur;
		this.cod_class = cod_class;
		this.dat_class = dat_class;
		this.cod_typ_depart = cod_typ_depart;
		this.dat_depart = dat_depart;
		this.dat_ur = dat_ur;
		this.org_serv = org_serv;
		this.dat_poste_trav = dat_poste_trav;
		this.cod_nat_recr = cod_nat_recr;
		this.dat_adm_tech = dat_adm_tech;
		this.dat_org_serv = dat_org_serv;
		this.maintien_pers = maintien_pers;
		this.maintien_date = maintien_date;
		this.typ_rang = typ_rang;
		this.handicap = handicap;
		this.pourcent_hand = pourcent_hand;
		this.typ_handicap = typ_handicap;
		this.num_fich_hand = num_fich_hand;
		this.niv_sal = niv_sal;
		this.cod_assur = cod_assur;
		this.num_assur = num_assur;
		this.cod_retr = cod_retr;
		this.typ_id = typ_id;
		this.etat_sante = etat_sante;
		this.dat_eff_fich_hand = dat_eff_fich_hand;
		this.dat_fin_fich_hand = dat_fin_fich_hand;
		this.ref_fonct = ref_fonct;
		this.nat_texte_fonct = nat_texte_fonct;
		this.nouv_dat_ech = nouv_dat_ech;
		this.dat_niv_sal = dat_niv_sal;
		this.dat_ass = dat_ass;
		this.dat_aff_cnam = dat_aff_cnam;
		this.etat_poste_trav = etat_poste_trav;
		this.dat_fin_cont = dat_fin_cont;
		this.presum_nais = presum_nais;
		this.cod_fill = cod_fill;
		this.suspens_ass = suspens_ass;
		this.cod_motif_susp = cod_motif_susp;
		this.dat_fin_suspens = dat_fin_suspens;
		this.dat_deb_suspens = dat_deb_suspens;
		this.chronique = chronique;
		this.cod_cat_class = cod_cat_class;

	

		
		this.nom_pren = nom_pren;
	}
	public PersonnelP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}