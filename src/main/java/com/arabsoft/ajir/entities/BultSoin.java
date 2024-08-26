package com.arabsoft.ajir.entities;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="bult_soin")
@IdClass(CleBultSoin.class)
public class BultSoin{

    @Id
    public String cod_soc;
    @Id
    public String mat_pers;
    
    public Integer num_soins;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_soins;	
    
    private String npers;
    public String cod_etablis;
	
    public String num_bord_etablis;
	
    public Float num_bord;
	
    public Float annee_envoi;
	
    public Float num_fam_bult;
	
    public String num_ass;
	
    public String cod_prestataire;
	
    public String typ_parent;
	
    public Date date_recp;
	
    public String etat_bult;
	
    public String observ;
	
    public String nature_bs;
	
    public Date dat_avance_agent;
	
    public Date dat_avance_etablis;
	
    public String mode_avanc_agent;
	
    public String mode_avanc_etablis;
	
    public Float mnt_avance_agent;
	
    public Float mnt_avance_etablis;
	
    public Date dat_entree_etablis;

    public Date dat_sortie_etablis;

    public String valide;
	
    public Date dat_valide;

    public Float tot_honor;

    public Float tot_net;

    public Float nbr_pieces;

    public String num_ass_conj;

    public String mat_pers_conj;

    public String mode_remb;
    @JsonFormat(pattern = "dd/MM/yyyy")
    public LocalDate dat_saisie;

    public String p_charge;

    public Date dat_p_charge;

    public Float num_p_charge;

    public Float nbr_jours;

    public String num_piece;

    public String mode_pay;

    public Float annee_bord;

    public Float num_bord_assur;

    public String etat_avance_agent;

    public String etat_avance_conj;

    public Date dat_avance_conj;

    public Float mnt_avance_conj;

    public String typ_bult;

    public Float tot_honor_star;

    public Float tot_net_star;

    public Float tot_mnt_etablis;

    public Float mnt_caa;
	
    public String mod_remb_recup;
	
    public String mod_pay_av_agent;

    public String obs_avance_agent;

    public String obs_avance_etablis;

    public String lib_bord_pc;

    public String id_bord_pc;

    public String etat_avance_etablis;

    public Float num_resume_agent;

    public Float num_resume_etablis;

    public String cod_motif;

    public String mat_agent;

    public String docteur;


    public String cod_serv;

    public String cod_dept;

    public Float annee_pec;
	
    
    public Date dat_vir;	
    public String  mod_pay;	
    public String reg_adh;
    public String  ann_plaf_imp;
    public String envoi	;
    public String  obs_a;	
    public String  obs;	
    public String  nat_bult;
    public Date dat_prev_accouch	;	
    public String  num_assur;
    public String cod_fil;
    public String num_pec	;
    public String cod_malad	;
    public String  reg_remb	;
    public Long tot_remb;	
    public Long  ord_bult;
    public String   num_soin;
    public String  cod_assur;	
    public String  cod_bord;
    @Id
    @JsonFormat(pattern = "dd/MM/yyyy")

     public LocalDate dat_soin;
    @Id
    public Long  num_fam;
    public String  lib_fam;

    public String lib_assur;
    public String lib_malad;
  public String dat_pec;
    
    @Transient
	private List<LigBult> ligBult;
    @Transient
    public List<String> numSoinParam ;
   
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

	public Integer getNum_soins() {
		return num_soins;
	}

	public void setNum_soins(Integer num_soins) {
		this.num_soins = num_soins;
	}

	public Date getDat_soins() {
		return dat_soins;
	}

	public void setDat_soins(Date dat_soins) {
		this.dat_soins = dat_soins;
	}
	
	public String getNpers() {
		return npers;
	}

	public void setNpers(String npers) {
		this.npers = npers;
	}

	public String getCod_etablis() {
		return cod_etablis;
	}

	public void setCod_etablis(String cod_etablis) {
		this.cod_etablis = cod_etablis;
	}

	public String getNum_bord_etablis() {
		return num_bord_etablis;
	}

	public void setNum_bord_etablis(String num_bord_etablis) {
		this.num_bord_etablis = num_bord_etablis;
	}

	public Float getNum_bord() {
		return num_bord;
	}

	public void setNum_bord(Float num_bord) {
		this.num_bord = num_bord;
	}

	public Float getAnnee_envoi() {
		return annee_envoi;
	}

	public void setAnnee_envoi(Float annee_envoi) {
		this.annee_envoi = annee_envoi;
	}

	public Float getNum_fam_bult() {
		return num_fam_bult;
	}

	public void setNum_fam_bult(Float num_fam_bult) {
		this.num_fam_bult = num_fam_bult;
	}

	public String getNum_ass() {
		return num_ass;
	}

	public void setNum_ass(String num_ass) {
		this.num_ass = num_ass;
	}

	public String getCod_prestataire() {
		return cod_prestataire;
	}

	public void setCod_prestataire(String cod_prestataire) {
		this.cod_prestataire = cod_prestataire;
	}

	public String getTyp_parent() {
		return typ_parent;
	}

	public void setTyp_parent(String typ_parent) {
		this.typ_parent = typ_parent;
	}

	public Date getDate_recp() {
		return date_recp;
	}

	public void setDate_recp(Date date_recp) {
		this.date_recp = date_recp;
	}

	public String getEtat_bult() {
		return etat_bult;
	}

	public void setEtat_bult(String etat_bult) {
		this.etat_bult = etat_bult;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public String getNature_bs() {
		return nature_bs;
	}

	public void setNature_bs(String nature_bs) {
		this.nature_bs = nature_bs;
	}

	public Date getDat_avance_agent() {
		return dat_avance_agent;
	}

	public void setDat_avance_agent(Date dat_avance_agent) {
		this.dat_avance_agent = dat_avance_agent;
	}

	public Date getDat_avance_etablis() {
		return dat_avance_etablis;
	}

	public void setDat_avance_etablis(Date dat_avance_etablis) {
		this.dat_avance_etablis = dat_avance_etablis;
	}

	public String getMode_avanc_agent() {
		return mode_avanc_agent;
	}

	public void setMode_avanc_agent(String mode_avanc_agent) {
		this.mode_avanc_agent = mode_avanc_agent;
	}

	public String getMode_avanc_etablis() {
		return mode_avanc_etablis;
	}

	public void setMode_avanc_etablis(String mode_avanc_etablis) {
		this.mode_avanc_etablis = mode_avanc_etablis;
	}

	public Float getMnt_avance_agent() {
		return mnt_avance_agent;
	}

	public void setMnt_avance_agent(Float mnt_avance_agent) {
		this.mnt_avance_agent = mnt_avance_agent;
	}

	public Float getMnt_avance_etablis() {
		return mnt_avance_etablis;
	}

	public void setMnt_avance_etablis(Float mnt_avance_etablis) {
		this.mnt_avance_etablis = mnt_avance_etablis;
	}

	public Date getDat_entree_etablis() {
		return dat_entree_etablis;
	}

	public void setDat_entree_etablis(Date dat_entree_etablis) {
		this.dat_entree_etablis = dat_entree_etablis;
	}

	public Date getDat_sortie_etablis() {
		return dat_sortie_etablis;
	}

	public void setDat_sortie_etablis(Date dat_sortie_etablis) {
		this.dat_sortie_etablis = dat_sortie_etablis;
	}

	public String getValide() {
		return valide;
	}

	public void setValide(String valide) {
		this.valide = valide;
	}

	public Date getDat_valide() {
		return dat_valide;
	}

	public void setDat_valide(Date dat_valide) {
		this.dat_valide = dat_valide;
	}

	public Float getTot_honor() {
		return tot_honor;
	}

	public void setTot_honor(Float tot_honor) {
		this.tot_honor = tot_honor;
	}

	public Float getTot_net() {
		return tot_net;
	}

	public void setTot_net(Float tot_net) {
		this.tot_net = tot_net;
	}

	public Float getNbr_pieces() {
		return nbr_pieces;
	}

	public void setNbr_pieces(Float nbr_pieces) {
		this.nbr_pieces = nbr_pieces;
	}

	public String getNum_ass_conj() {
		return num_ass_conj;
	}

	public void setNum_ass_conj(String num_ass_conj) {
		this.num_ass_conj = num_ass_conj;
	}

	public String getMat_pers_conj() {
		return mat_pers_conj;
	}

	public void setMat_pers_conj(String mat_pers_conj) {
		this.mat_pers_conj = mat_pers_conj;
	}

	public String getMode_remb() {
		return mode_remb;
	}

	public void setMode_remb(String mode_remb) {
		this.mode_remb = mode_remb;
	}

	public LocalDate getDat_saisie() {
		return dat_saisie;
	}

	public void setDat_saisie(LocalDate dat_saisie) {
		this.dat_saisie = dat_saisie;
	}

	public String getP_charge() {
		return p_charge;
	}

	public void setP_charge(String p_charge) {
		this.p_charge = p_charge;
	}

	public Date getDat_p_charge() {
		return dat_p_charge;
	}

	public void setDat_p_charge(Date dat_p_charge) {
		this.dat_p_charge = dat_p_charge;
	}

	public Float getNum_p_charge() {
		return num_p_charge;
	}

	public void setNum_p_charge(Float num_p_charge) {
		this.num_p_charge = num_p_charge;
	}

	public Float getNbr_jours() {
		return nbr_jours;
	}

	public void setNbr_jours(Float nbr_jours) {
		this.nbr_jours = nbr_jours;
	}

	public String getNum_piece() {
		return num_piece;
	}

	public void setNum_piece(String num_piece) {
		this.num_piece = num_piece;
	}

	public String getMode_pay() {
		return mode_pay;
	}

	public void setMode_pay(String mode_pay) {
		this.mode_pay = mode_pay;
	}

	public Float getAnnee_bord() {
		return annee_bord;
	}

	public void setAnnee_bord(Float annee_bord) {
		this.annee_bord = annee_bord;
	}

	public Float getNum_bord_assur() {
		return num_bord_assur;
	}

	public void setNum_bord_assur(Float num_bord_assur) {
		this.num_bord_assur = num_bord_assur;
	}

	public String getEtat_avance_agent() {
		return etat_avance_agent;
	}

	public void setEtat_avance_agent(String etat_avance_agent) {
		this.etat_avance_agent = etat_avance_agent;
	}

	public String getEtat_avance_conj() {
		return etat_avance_conj;
	}

	public void setEtat_avance_conj(String etat_avance_conj) {
		this.etat_avance_conj = etat_avance_conj;
	}

	public Date getDat_avance_conj() {
		return dat_avance_conj;
	}

	public void setDat_avance_conj(Date dat_avance_conj) {
		this.dat_avance_conj = dat_avance_conj;
	}

	public Float getMnt_avance_conj() {
		return mnt_avance_conj;
	}

	public void setMnt_avance_conj(Float mnt_avance_conj) {
		this.mnt_avance_conj = mnt_avance_conj;
	}

	public String getTyp_bult() {
		return typ_bult;
	}

	public void setTyp_bult(String typ_bult) {
		this.typ_bult = typ_bult;
	}

	public Float getTot_honor_star() {
		return tot_honor_star;
	}

	public void setTot_honor_star(Float tot_honor_star) {
		this.tot_honor_star = tot_honor_star;
	}

	public Float getTot_net_star() {
		return tot_net_star;
	}

	public void setTot_net_star(Float tot_net_star) {
		this.tot_net_star = tot_net_star;
	}

	public Float getTot_mnt_etablis() {
		return tot_mnt_etablis;
	}

	public void setTot_mnt_etablis(Float tot_mnt_etablis) {
		this.tot_mnt_etablis = tot_mnt_etablis;
	}

	public Float getMnt_caa() {
		return mnt_caa;
	}

	public void setMnt_caa(Float mnt_caa) {
		this.mnt_caa = mnt_caa;
	}

	public String getMod_remb_recup() {
		return mod_remb_recup;
	}

	public void setMod_remb_recup(String mod_remb_recup) {
		this.mod_remb_recup = mod_remb_recup;
	}

	public String getMod_pay_av_agent() {
		return mod_pay_av_agent;
	}

	public void setMod_pay_av_agent(String mod_pay_av_agent) {
		this.mod_pay_av_agent = mod_pay_av_agent;
	}

	public String getObs_avance_agent() {
		return obs_avance_agent;
	}

	public void setObs_avance_agent(String obs_avance_agent) {
		this.obs_avance_agent = obs_avance_agent;
	}

	public String getObs_avance_etablis() {
		return obs_avance_etablis;
	}

	public void setObs_avance_etablis(String obs_avance_etablis) {
		this.obs_avance_etablis = obs_avance_etablis;
	}

	public String getLib_bord_pc() {
		return lib_bord_pc;
	}

	public void setLib_bord_pc(String lib_bord_pc) {
		this.lib_bord_pc = lib_bord_pc;
	}

	public String getId_bord_pc() {
		return id_bord_pc;
	}

	public void setId_bord_pc(String id_bord_pc) {
		this.id_bord_pc = id_bord_pc;
	}

	public String getEtat_avance_etablis() {
		return etat_avance_etablis;
	}

	public void setEtat_avance_etablis(String etat_avance_etablis) {
		this.etat_avance_etablis = etat_avance_etablis;
	}

	public Float getNum_resume_agent() {
		return num_resume_agent;
	}

	public void setNum_resume_agent(Float num_resume_agent) {
		this.num_resume_agent = num_resume_agent;
	}

	public Float getNum_resume_etablis() {
		return num_resume_etablis;
	}

	public void setNum_resume_etablis(Float num_resume_etablis) {
		this.num_resume_etablis = num_resume_etablis;
	}

	public String getCod_motif() {
		return cod_motif;
	}

	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}

	public String getMat_agent() {
		return mat_agent;
	}

	public void setMat_agent(String mat_agent) {
		this.mat_agent = mat_agent;
	}

	public String getDocteur() {
		return docteur;
	}

	public void setDocteur(String docteur) {
		this.docteur = docteur;
	}



	public String getCod_serv() {
		return cod_serv;
	}

	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}

	public String getCod_dept() {
		return cod_dept;
	}

	public void setCod_dept(String cod_dept) {
		this.cod_dept = cod_dept;
	}

	public Float getAnnee_pec() {
		return annee_pec;
	}

	public void setAnnee_pec(Float annee_pec) {
		this.annee_pec = annee_pec;
	}

	

	

	public List<LigBult> getLigBult() {
		return ligBult;
	}

	public void setLigBult(List<LigBult> ligBult) {
		this.ligBult = ligBult;
	}



	
	
	public List<String> getNumSoinParam() {
		return numSoinParam;
	}

	public void setNumSoinParam(List<String> numSoinParam) {
		this.numSoinParam = numSoinParam;
	}
	
	

	public Date getDat_vir() {
		return dat_vir;
	}

	public void setDat_vir(Date dat_vir) {
		this.dat_vir = dat_vir;
	}

	public String getMod_pay() {
		return mod_pay;
	}

	public void setMod_pay(String mod_pay) {
		this.mod_pay = mod_pay;
	}

	public String getReg_adh() {
		return reg_adh;
	}

	public void setReg_adh(String reg_adh) {
		this.reg_adh = reg_adh;
	}

	public String getAnn_plaf() {
		return ann_plaf_imp;
	}

	public void setAnn_plaf(String ann_plaf) {
		this.ann_plaf_imp = ann_plaf;
	}

	public String getEnvoi() {
		return envoi;
	}

	public void setEnvoi(String envoi) {
		this.envoi = envoi;
	}

	public String getObs_a() {
		return obs_a;
	}

	public void setObs_a(String obs_a) {
		this.obs_a = obs_a;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getNat_bult() {
		return nat_bult;
	}

	public void setNat_bult(String nat_bult) {
		this.nat_bult = nat_bult;
	}

	public Date getDat_prev_accouch() {
		return dat_prev_accouch;
	}

	public void setDat_prev_accouch(Date dat_prev_accouch) {
		this.dat_prev_accouch = dat_prev_accouch;
	}

	public String getNum_assur() {
		return num_assur;
	}

	public void setNum_assur(String num_assur) {
		this.num_assur = num_assur;
	}

	public String getCod_fil() {
		return cod_fil;
	}

	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
	}

	public String getNum_pec() {
		return num_pec;
	}

	public void setNum_pec(String num_pec) {
		this.num_pec = num_pec;
	}

	public String getCod_malad() {
		return cod_malad;
	}

	public void setCod_malad(String cod_malad) {
		this.cod_malad = cod_malad;
	}

	public String getReg_remb() {
		return reg_remb;
	}

	public void setReg_remb(String reg_remb) {
		this.reg_remb = reg_remb;
	}

	public Long getTot_remb() {
		return tot_remb;
	}

	public void setTot_remb(Long tot_remb) {
		this.tot_remb = tot_remb;
	}

	public Long getOrd_bult() {
		return ord_bult;
	}

	public void setOrd_bult(Long ord_bult) {
		this.ord_bult = ord_bult;
	}

	public String getNum_soin() {
		return num_soin;
	}

	public void setNum_soin(String num_soin) {
		this.num_soin = num_soin;
	}

	public String getCod_assur() {
		return cod_assur;
	}

	public void setCod_assur(String cod_assur) {
		this.cod_assur = cod_assur;
	}

	public String getCod_bord() {
		return cod_bord;
	}

	public void setCod_bord(String cod_bord) {
		this.cod_bord = cod_bord;
	}

	public LocalDate getDat_soin() {
		return dat_soin;
	}

	public void setDat_soin(LocalDate dat_soin) {
		this.dat_soin = dat_soin;
	}

	public Long getNum_fam() {
		return num_fam;
	}

	public void setNum_fam(Long num_fam) {
		this.num_fam = num_fam;
	}

	
	public String getAnn_plaf_imp() {
		return ann_plaf_imp;
	}

	public void setAnn_plaf_imp(String ann_plaf_imp) {
		this.ann_plaf_imp = ann_plaf_imp;
	}

	public String getLib_assur() {
		return lib_assur;
	}

	public void setLib_assur(String lib_assur) {
		this.lib_assur = lib_assur;
	}

	public String getLib_fam() {
		return lib_fam;
	}

	public void setLib_fam(String lib_fam) {
		this.lib_fam = lib_fam;
	}

	public String getDat_pec() {
		return dat_pec;
	}

	public void setDat_pec(String dat_pec) {
		this.dat_pec = dat_pec;
	}

 

	public String getLib_malad() {
		return lib_malad;
	}

	public void setLib_malad(String lib_malad) {
		this.lib_malad = lib_malad;
	}

	public BultSoin(String cod_soc, String mat_pers, Integer num_soins, Date dat_soins, String npers,
			String cod_etablis, String num_bord_etablis, Float num_bord, Float annee_envoi, Float num_fam_bult,
			String num_ass, String cod_prestataire, String typ_parent, Date date_recp, String etat_bult, String observ,
			String nature_bs, Date dat_avance_agent, Date dat_avance_etablis, String mode_avanc_agent,
			String mode_avanc_etablis, Float mnt_avance_agent, Float mnt_avance_etablis, Date dat_entree_etablis,
			Date dat_sortie_etablis, String valide, Date dat_valide, Float tot_honor, Float tot_net, Float nbr_pieces,
			String num_ass_conj, String mat_pers_conj, String mode_remb, LocalDate dat_saisie, String p_charge,
			Date dat_p_charge, Float num_p_charge, Float nbr_jours, String num_piece, String mode_pay, Float annee_bord,
			Float num_bord_assur, String etat_avance_agent, String etat_avance_conj, Date dat_avance_conj,
			Float mnt_avance_conj, String typ_bult, Float tot_honor_star, Float tot_net_star, Float tot_mnt_etablis,
			Float mnt_caa, String mod_remb_recup, String mod_pay_av_agent, String obs_avance_agent,
			String obs_avance_etablis, String lib_bord_pc, String id_bord_pc, String etat_avance_etablis,
			Float num_resume_agent, Float num_resume_etablis, String cod_motif, String mat_agent, String docteur,
			String cod_serv, String cod_dept, Float annee_pec, Date dat_vir, String mod_pay, String reg_adh,
			String ann_plaf, String envoi, String obs_a, String obs, String nat_bult, Date dat_prev_accouch,
			String num_assur, String cod_fil, String num_pec, String cod_malad, String reg_remb, Long tot_remb,
			Long ord_bult, String num_soin, String cod_assur, String cod_bord, LocalDate dat_soin, Long num_fam,
			List<LigBult> ligBult, List<String> numSoinParam) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_soins = num_soins;
		this.dat_soins = dat_soins;
		this.npers = npers;
		this.cod_etablis = cod_etablis;
		this.num_bord_etablis = num_bord_etablis;
		this.num_bord = num_bord;
		this.annee_envoi = annee_envoi;
		this.num_fam_bult = num_fam_bult;
		this.num_ass = num_ass;
		this.cod_prestataire = cod_prestataire;
		this.typ_parent = typ_parent;
		this.date_recp = date_recp;
		this.etat_bult = etat_bult;
		this.observ = observ;
		this.nature_bs = nature_bs;
		this.dat_avance_agent = dat_avance_agent;
		this.dat_avance_etablis = dat_avance_etablis;
		this.mode_avanc_agent = mode_avanc_agent;
		this.mode_avanc_etablis = mode_avanc_etablis;
		this.mnt_avance_agent = mnt_avance_agent;
		this.mnt_avance_etablis = mnt_avance_etablis;
		this.dat_entree_etablis = dat_entree_etablis;
		this.dat_sortie_etablis = dat_sortie_etablis;
		this.valide = valide;
		this.dat_valide = dat_valide;
		this.tot_honor = tot_honor;
		this.tot_net = tot_net;
		this.nbr_pieces = nbr_pieces;
		this.num_ass_conj = num_ass_conj;
		this.mat_pers_conj = mat_pers_conj;
		this.mode_remb = mode_remb;
		this.dat_saisie = dat_saisie;
		this.p_charge = p_charge;
		this.dat_p_charge = dat_p_charge;
		this.num_p_charge = num_p_charge;
		this.nbr_jours = nbr_jours;
		this.num_piece = num_piece;
		this.mode_pay = mode_pay;
		this.annee_bord = annee_bord;
		this.num_bord_assur = num_bord_assur;
		this.etat_avance_agent = etat_avance_agent;
		this.etat_avance_conj = etat_avance_conj;
		this.dat_avance_conj = dat_avance_conj;
		this.mnt_avance_conj = mnt_avance_conj;
		this.typ_bult = typ_bult;
		this.tot_honor_star = tot_honor_star;
		this.tot_net_star = tot_net_star;
		this.tot_mnt_etablis = tot_mnt_etablis;
		this.mnt_caa = mnt_caa;
		this.mod_remb_recup = mod_remb_recup;
		this.mod_pay_av_agent = mod_pay_av_agent;
		this.obs_avance_agent = obs_avance_agent;
		this.obs_avance_etablis = obs_avance_etablis;
		this.lib_bord_pc = lib_bord_pc;
		this.id_bord_pc = id_bord_pc;
		this.etat_avance_etablis = etat_avance_etablis;
		this.num_resume_agent = num_resume_agent;
		this.num_resume_etablis = num_resume_etablis;
		this.cod_motif = cod_motif;
		this.mat_agent = mat_agent;
		this.docteur = docteur;
		this.cod_serv = cod_serv;
		this.cod_dept = cod_dept;
		this.annee_pec = annee_pec;
		this.dat_vir = dat_vir;
		this.mod_pay = mod_pay;
		this.reg_adh = reg_adh;
		this.ann_plaf_imp = ann_plaf;
		this.envoi = envoi;
		this.obs_a = obs_a;
		this.obs = obs;
		this.nat_bult = nat_bult;
		this.dat_prev_accouch = dat_prev_accouch;
		this.num_assur = num_assur;
		this.cod_fil = cod_fil;
		this.num_pec = num_pec;
		this.cod_malad = cod_malad;
		this.reg_remb = reg_remb;
		this.tot_remb = tot_remb;
		this.ord_bult = ord_bult;
		this.num_soin = num_soin;
		this.cod_assur = cod_assur;
		this.cod_bord = cod_bord;
		this.dat_soin = dat_soin;
		this.num_fam = num_fam;
		this.ligBult = ligBult;
		this.numSoinParam = numSoinParam;
	}

	public BultSoin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BultSoin [cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + ", num_soins=" + num_soins + ", dat_soins="
				+ dat_soins + ", npers=" + npers + ", cod_etablis=" + cod_etablis + ", num_bord_etablis="
				+ num_bord_etablis + ", num_bord=" + num_bord + ", annee_envoi=" + annee_envoi + ", num_fam_bult="
				+ num_fam_bult + ", num_ass=" + num_ass + ", cod_prestataire=" + cod_prestataire + ", typ_parent="
				+ typ_parent + ", date_recp=" + date_recp + ", etat_bult=" + etat_bult + ", observ=" + observ
				+ ", nature_bs=" + nature_bs + ", dat_avance_agent=" + dat_avance_agent + ", dat_avance_etablis="
				+ dat_avance_etablis + ", mode_avanc_agent=" + mode_avanc_agent + ", mode_avanc_etablis="
				+ mode_avanc_etablis + ", mnt_avance_agent=" + mnt_avance_agent + ", mnt_avance_etablis="
				+ mnt_avance_etablis + ", dat_entree_etablis=" + dat_entree_etablis + ", dat_sortie_etablis="
				+ dat_sortie_etablis + ", valide=" + valide + ", dat_valide=" + dat_valide + ", tot_honor=" + tot_honor
				+ ", tot_net=" + tot_net + ", nbr_pieces=" + nbr_pieces + ", num_ass_conj=" + num_ass_conj
				+ ", mat_pers_conj=" + mat_pers_conj + ", mode_remb=" + mode_remb + ", dat_saisie=" + dat_saisie
				+ ", p_charge=" + p_charge + ", dat_p_charge=" + dat_p_charge + ", num_p_charge=" + num_p_charge
				+ ", nbr_jours=" + nbr_jours + ", num_piece=" + num_piece + ", mode_pay=" + mode_pay + ", annee_bord="
				+ annee_bord + ", num_bord_assur=" + num_bord_assur + ", etat_avance_agent=" + etat_avance_agent
				+ ", etat_avance_conj=" + etat_avance_conj + ", dat_avance_conj=" + dat_avance_conj
				+ ", mnt_avance_conj=" + mnt_avance_conj + ", typ_bult=" + typ_bult + ", tot_honor_star="
				+ tot_honor_star + ", tot_net_star=" + tot_net_star + ", tot_mnt_etablis=" + tot_mnt_etablis
				+ ", mnt_caa=" + mnt_caa + ", mod_remb_recup=" + mod_remb_recup + ", mod_pay_av_agent="
				+ mod_pay_av_agent + ", obs_avance_agent=" + obs_avance_agent + ", obs_avance_etablis="
				+ obs_avance_etablis + ", lib_bord_pc=" + lib_bord_pc + ", id_bord_pc=" + id_bord_pc
				+ ", etat_avance_etablis=" + etat_avance_etablis + ", num_resume_agent=" + num_resume_agent
				+ ", num_resume_etablis=" + num_resume_etablis + ", cod_motif=" + cod_motif + ", mat_agent=" + mat_agent
				+ ", docteur=" + docteur + ", cod_serv=" + cod_serv + ", cod_dept=" + cod_dept + ", annee_pec="
				+ annee_pec + ", dat_vir=" + dat_vir + ", mod_pay=" + mod_pay + ", reg_adh=" + reg_adh + ", ann_plaf="
				+ ann_plaf_imp + ", envoi=" + envoi + ", obs_a=" + obs_a + ", obs=" + obs + ", nat_bult=" + nat_bult
				+ ", dat_prev_accouch=" + dat_prev_accouch + ", num_assur=" + num_assur + ", cod_fil=" + cod_fil
				+ ", num_pec=" + num_pec + ", cod_malad=" + cod_malad + ", reg_remb=" + reg_remb + ", tot_remb="
				+ tot_remb + ", ord_bult=" + ord_bult + ", num_soin=" + num_soin + ", cod_assur=" + cod_assur
				+ ", cod_bord=" + cod_bord + ", dat_soin=" + dat_soin + ", num_fam=" + num_fam + ", ligBult=" + ligBult
				+ ", numSoinParam=" + numSoinParam + "]";
	}




}