package com.arabsoft.ajir.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;



@Entity
@IdClass(CleLigBult.class)
public class LigBult{
	
	    @Id
	    @JsonProperty(access = Access.WRITE_ONLY)
		private String cod_soc;
	    @Id
	    @JsonProperty(access = Access.WRITE_ONLY)
		private String mat_pers;
	    @Id
	    @JsonProperty(access = Access.WRITE_ONLY)
	    private Integer num_soins;
	    @Id
	    @JsonFormat(pattern = "dd/MM/yyyy")
		private Date dat_soins;
	    @Id 
        public Integer num_lig;
        public Float type_act;
        public String abrv_act;
        public String cod_trait;
        public String cod_mld;
        public String num_ass;
        public String cod_prestataire;
        @JsonFormat(pattern = "dd/MM/yyyy")
        public Date dat_acte;
        public Float tot_honor;
        public Float tot_net;
        public Float indice_propos;
        public Float indice;
        public String mld;
        public Float mnt_rembourse;
        public Float nbr_piece;
        public String obs_lig_bult;
        public Float num_dent_lim1;
        public String pos_dent_lim1;
        public Float num_dent_lim2;
        public String pos_dent_lim2;
        public String mode_remb;
        public String num_ass_conj;
        public String mat_pers_conj;
        public String typ_praticien;
        public String abrv_act_acc;
        public Float tot_net_conj;
        public String typ_trait;
        public Float nbr_vign;
        public Float num_fam_bult;
        public String typ_parent;
        public Date dat_rembourse;
        public Float annee_bord;
        public Float num_bord_assur;
        public String etat_avanc_etablis;
        public Float mnt_eng_star;
        public Float indice__star;
        public Float tot_honor_star;
        public Float tot_net_star;
        public String abrv_act_star;
        public Float num_av_etablis;
        public String num_bord_etablis;
        public String cod_etablis;
        public Float tot_remb_comp;
        public Float tot_honor_comp;
        public Float mnt_etab_conv;
       
        public String libcact;
        public String liborg;
        
        public String imput_plaf;	
    	public Long duree_act;	
    	public String ctr_duree;	
    	public String a_indice;
    	public Long plafond;
    	public String plafonne;
    	public Long taux_act;
    	public Long mtt_acte;
    	public String nat_act;
    	public String obs_a	;
    	public String obs;
    	public Long mnt_remb;	
    	public Long mnt_net	;	
    	public Long mnt_honor;
    	public Date dat_act	;
    	public String prf_cod;	
    	public String prf_typ;	
    	public Date dat_soin;
    	public Long num_fam	;	
        
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
		public Integer getNum_lig() {
			return num_lig;
		}
		public void setNum_lig(Integer num_lig) {
			this.num_lig = num_lig;
		}
		public Float getType_act() {
			return type_act;
		}
		public void setType_act(Float type_act) {
			this.type_act = type_act;
		}
		public String getAbrv_act() {
			return abrv_act;
		}
		public void setAbrv_act(String abrv_act) {
			this.abrv_act = abrv_act;
		}
		public String getCod_trait() {
			return cod_trait;
		}
		public void setCod_trait(String cod_trait) {
			this.cod_trait = cod_trait;
		}
		public String getCod_mld() {
			return cod_mld;
		}
		public void setCod_mld(String cod_mld) {
			this.cod_mld = cod_mld;
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
		public Date getDat_acte() {
			return dat_acte;
		}
		public void setDat_acte(Date dat_acte) {
			this.dat_acte = dat_acte;
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
		public Float getIndice_propos() {
			return indice_propos;
		}
		public void setIndice_propos(Float indice_propos) {
			this.indice_propos = indice_propos;
		}
		public Float getIndice() {
			return indice;
		}
		public void setIndice(Float indice) {
			this.indice = indice;
		}
		public String getMld() {
			return mld;
		}
		public void setMld(String mld) {
			this.mld = mld;
		}
		public Float getMnt_rembourse() {
			return mnt_rembourse;
		}
		public void setMnt_rembourse(Float mnt_rembourse) {
			this.mnt_rembourse = mnt_rembourse;
		}
		public Float getNbr_piece() {
			return nbr_piece;
		}
		public void setNbr_piece(Float nbr_piece) {
			this.nbr_piece = nbr_piece;
		}
		public String getObs_lig_bult() {
			return obs_lig_bult;
		}
		public void setObs_lig_bult(String obs_lig_bult) {
			this.obs_lig_bult = obs_lig_bult;
		}
		public Float getNum_dent_lim1() {
			return num_dent_lim1;
		}
		public void setNum_dent_lim1(Float num_dent_lim1) {
			this.num_dent_lim1 = num_dent_lim1;
		}
		public String getPos_dent_lim1() {
			return pos_dent_lim1;
		}
		public void setPos_dent_lim1(String pos_dent_lim1) {
			this.pos_dent_lim1 = pos_dent_lim1;
		}
		public Float getNum_dent_lim2() {
			return num_dent_lim2;
		}
		public void setNum_dent_lim2(Float num_dent_lim2) {
			this.num_dent_lim2 = num_dent_lim2;
		}
		public String getPos_dent_lim2() {
			return pos_dent_lim2;
		}
		public void setPos_dent_lim2(String pos_dent_lim2) {
			this.pos_dent_lim2 = pos_dent_lim2;
		}
		public String getMode_remb() {
			return mode_remb;
		}
		public void setMode_remb(String mode_remb) {
			this.mode_remb = mode_remb;
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
		public String getTyp_praticien() {
			return typ_praticien;
		}
		public void setTyp_praticien(String typ_praticien) {
			this.typ_praticien = typ_praticien;
		}
		public String getAbrv_act_acc() {
			return abrv_act_acc;
		}
		public void setAbrv_act_acc(String abrv_act_acc) {
			this.abrv_act_acc = abrv_act_acc;
		}
		public Float getTot_net_conj() {
			return tot_net_conj;
		}
		public void setTot_net_conj(Float tot_net_conj) {
			this.tot_net_conj = tot_net_conj;
		}
		public String getTyp_trait() {
			return typ_trait;
		}
		public void setTyp_trait(String typ_trait) {
			this.typ_trait = typ_trait;
		}
		public Float getNbr_vign() {
			return nbr_vign;
		}
		public void setNbr_vign(Float nbr_vign) {
			this.nbr_vign = nbr_vign;
		}
		public Float getNum_fam_bult() {
			return num_fam_bult;
		}
		public void setNum_fam_bult(Float num_fam_bult) {
			this.num_fam_bult = num_fam_bult;
		}
		public String getTyp_parent() {
			return typ_parent;
		}
		public void setTyp_parent(String typ_parent) {
			this.typ_parent = typ_parent;
		}
		public Date getDat_rembourse() {
			return dat_rembourse;
		}
		public void setDat_rembourse(Date dat_rembourse) {
			this.dat_rembourse = dat_rembourse;
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
		public String getEtat_avanc_etablis() {
			return etat_avanc_etablis;
		}
		public void setEtat_avanc_etablis(String etat_avanc_etablis) {
			this.etat_avanc_etablis = etat_avanc_etablis;
		}
		public Float getMnt_eng_star() {
			return mnt_eng_star;
		}
		public void setMnt_eng_star(Float mnt_eng_star) {
			this.mnt_eng_star = mnt_eng_star;
		}
		public Float getIndice__star() {
			return indice__star;
		}
		public void setIndice__star(Float indice__star) {
			this.indice__star = indice__star;
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
		public String getAbrv_act_star() {
			return abrv_act_star;
		}
		public void setAbrv_act_star(String abrv_act_star) {
			this.abrv_act_star = abrv_act_star;
		}
		public Float getNum_av_etablis() {
			return num_av_etablis;
		}
		public void setNum_av_etablis(Float num_av_etablis) {
			this.num_av_etablis = num_av_etablis;
		}
		public String getNum_bord_etablis() {
			return num_bord_etablis;
		}
		public void setNum_bord_etablis(String num_bord_etablis) {
			this.num_bord_etablis = num_bord_etablis;
		}
		public String getCod_etablis() {
			return cod_etablis;
		}
		public void setCod_etablis(String cod_etablis) {
			this.cod_etablis = cod_etablis;
		}
		
		public Float getTot_remb_comp() {
			return tot_remb_comp;
		}
		public void setTot_remb_comp(Float tot_remb_comp) {
			this.tot_remb_comp = tot_remb_comp;
		}
		public Float getTot_honor_comp() {
			return tot_honor_comp;
		}
		public void setTot_honor_comp(Float tot_honor_comp) {
			this.tot_honor_comp = tot_honor_comp;
		}
		public Float getMnt_etab_conv() {
			return mnt_etab_conv;
		}
		public void setMnt_etab_conv(Float mnt_etab_conv) {
			this.mnt_etab_conv = mnt_etab_conv;
		}
		
		public String getLibcact() {
			return libcact;
		}
		public void setLibcact(String libcact) {
			this.libcact = libcact;
		}
		public String getLiborg() {
			return liborg;
		}
		public void setLiborg(String liborg) {
			this.liborg = liborg;
		}
		
		
		public String getImput_plaf() {
			return imput_plaf;
		}
		public void setImput_plaf(String imput_plaf) {
			this.imput_plaf = imput_plaf;
		}
		public Long getDuree_act() {
			return duree_act;
		}
		public void setDuree_act(Long duree_act) {
			this.duree_act = duree_act;
		}
		public String getCtr_duree() {
			return ctr_duree;
		}
		public void setCtr_duree(String ctr_duree) {
			this.ctr_duree = ctr_duree;
		}
		public String getA_indice() {
			return a_indice;
		}
		public void setA_indice(String a_indice) {
			this.a_indice = a_indice;
		}
		public Long getPlafond() {
			return plafond;
		}
		public void setPlafond(Long plafond) {
			this.plafond = plafond;
		}
		public String getPlafonne() {
			return plafonne;
		}
		public void setPlafonne(String plafonne) {
			this.plafonne = plafonne;
		}
		public Long getTaux_act() {
			return taux_act;
		}
		public void setTaux_act(Long taux_act) {
			this.taux_act = taux_act;
		}
		public Long getMtt_acte() {
			return mtt_acte;
		}
		public void setMtt_acte(Long mtt_acte) {
			this.mtt_acte = mtt_acte;
		}
		public String getNat_act() {
			return nat_act;
		}
		public void setNat_act(String nat_act) {
			this.nat_act = nat_act;
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
		public Long getMnt_remb() {
			return mnt_remb;
		}
		public void setMnt_remb(Long mnt_remb) {
			this.mnt_remb = mnt_remb;
		}
		public Long getMnt_net() {
			return mnt_net;
		}
		public void setMnt_net(Long mnt_net) {
			this.mnt_net = mnt_net;
		}
		public Long getMnt_honor() {
			return mnt_honor;
		}
		public void setMnt_honor(Long mnt_honor) {
			this.mnt_honor = mnt_honor;
		}
		public Date getDat_act() {
			return dat_act;
		}
		public void setDat_act(Date dat_act) {
			this.dat_act = dat_act;
		}
		public String getPrf_cod() {
			return prf_cod;
		}
		public void setPrf_cod(String prf_cod) {
			this.prf_cod = prf_cod;
		}
		public String getPrf_typ() {
			return prf_typ;
		}
		public void setPrf_typ(String prf_typ) {
			this.prf_typ = prf_typ;
		}
		public Date getDat_soin() {
			return dat_soin;
		}
		public void setDat_soin(Date dat_soin) {
			this.dat_soin = dat_soin;
		}
		public Long getNum_fam() {
			return num_fam;
		}
		public void setNum_fam(Long num_fam) {
			this.num_fam = num_fam;
		}
		public LigBult(String cod_soc, String mat_pers, Integer num_soins, Date dat_soins, Integer num_lig,
				Float type_act, String abrv_act, String cod_trait, String cod_mld, String num_ass,
				String cod_prestataire, Date dat_acte, Float tot_honor, Float tot_net, Float indice_propos,
				Float indice, String mld, Float mnt_rembourse, Float nbr_piece, String obs_lig_bult,
				Float num_dent_lim1, String pos_dent_lim1, Float num_dent_lim2, String pos_dent_lim2, String mode_remb,
				String num_ass_conj, String mat_pers_conj, String typ_praticien, String abrv_act_acc,
				Float tot_net_conj, String typ_trait, Float nbr_vign, Float num_fam_bult, String typ_parent,
				Date dat_rembourse, Float annee_bord, Float num_bord_assur, String etat_avanc_etablis,
				Float mnt_eng_star, Float indice__star, Float tot_honor_star, Float tot_net_star, String abrv_act_star,
				Float num_av_etablis, String num_bord_etablis, String cod_etablis,  Float tot_remb_comp,
				Float tot_honor_comp, Float mnt_etab_conv, String libcact, String liborg) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.num_soins = num_soins;
			this.dat_soins = dat_soins;
			this.num_lig = num_lig;
			this.type_act = type_act;
			this.abrv_act = abrv_act;
			this.cod_trait = cod_trait;
			this.cod_mld = cod_mld;
			this.num_ass = num_ass;
			this.cod_prestataire = cod_prestataire;
			this.dat_acte = dat_acte;
			this.tot_honor = tot_honor;
			this.tot_net = tot_net;
			this.indice_propos = indice_propos;
			this.indice = indice;
			this.mld = mld;
			this.mnt_rembourse = mnt_rembourse;
			this.nbr_piece = nbr_piece;
			this.obs_lig_bult = obs_lig_bult;
			this.num_dent_lim1 = num_dent_lim1;
			this.pos_dent_lim1 = pos_dent_lim1;
			this.num_dent_lim2 = num_dent_lim2;
			this.pos_dent_lim2 = pos_dent_lim2;
			this.mode_remb = mode_remb;
			this.num_ass_conj = num_ass_conj;
			this.mat_pers_conj = mat_pers_conj;
			this.typ_praticien = typ_praticien;
			this.abrv_act_acc = abrv_act_acc;
			this.tot_net_conj = tot_net_conj;
			this.typ_trait = typ_trait;
			this.nbr_vign = nbr_vign;
			this.num_fam_bult = num_fam_bult;
			this.typ_parent = typ_parent;
			this.dat_rembourse = dat_rembourse;
			this.annee_bord = annee_bord;
			this.num_bord_assur = num_bord_assur;
			this.etat_avanc_etablis = etat_avanc_etablis;
			this.mnt_eng_star = mnt_eng_star;
			this.indice__star = indice__star;
			this.tot_honor_star = tot_honor_star;
			this.tot_net_star = tot_net_star;
			this.abrv_act_star = abrv_act_star;
			this.num_av_etablis = num_av_etablis;
			this.num_bord_etablis = num_bord_etablis;
			this.cod_etablis = cod_etablis;
			this.tot_remb_comp = tot_remb_comp;
			this.tot_honor_comp = tot_honor_comp;
			this.mnt_etab_conv = mnt_etab_conv;
			
			this.libcact = libcact;
			this.liborg = liborg;
		}
		public LigBult() {
			super();
			// TODO Auto-generated constructor stub
		}
        
        
      
}