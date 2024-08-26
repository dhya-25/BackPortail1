package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleLigPret;
import com.arabsoft.ajir.entities.LigPret;

public interface LigPretPers extends JpaRepository<LigPret, CleLigPret>{
	
	
	
	@Query(value="\r\n"
			+ "select\r\n"
			+ "cod_soc,\r\n"
			+ "mat_pers,\r\n"
			+ "cod_pret,\r\n"
			+ "l_pret,\r\n"
			+ "cod_typ_bul,\r\n"
			+ "mois_pret_prevu,\r\n"
			+ "mois_pret,\r\n"
			+ "mnt_period,\r\n"
			+ "mnt_int,\r\n"
			+ "int_grace,\r\n"
			+ "cap_rest,\r\n"
			+ "decode(val_pret,'O','Oui','Non')val_pret,\r\n"
			+ "decode(reg_pret,'O','Oui','Non')reg_pret,\r\n"
			+ "nature_etat_pret,\r\n"
			+ "num_tranch,\r\n"
			+ "impaye,\r\n"
			+ "seq_ecrt_ppl,\r\n"
			+ "seq_ecrt_int,\r\n"
			+ "int_tmmplus,\r\n"
			+ "seq_ecrt,\r\n"
			+ "ordonnance,\r\n"
			+ "pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul) lib_typ_bul\r\n"

			+ "from LIG_PRET\r\n"
			+ "where cod_soc = :codSoc and mat_pers= :matPers and cod_pret = :codPret ",nativeQuery=true)
	public List<LigPret> getLigPretPers(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") Long codPret );
	
	@Query(value="select cod_soc,\r\n"
			+ "       mat_pers,\r\n"
			+ "       cod_pret,\r\n"
			+ "       l.l_pret,\r\n"
			+ "       l.cod_typ_bul,\r\n"
			+ "       l.mois_pret_prevu,\r\n"
			+ "       l.mois_pret,\r\n"
			+ "       l.mnt_period,\r\n"
			+ "       l.mnt_int,\r\n"
			+ "       l.int_grace,\r\n"
			+ "       l.cap_rest,\r\n"
			+ "       decode(val_pret,'O','Oui','Non')val_pret,\r\n"
			+ "       decode(reg_pret,'O','Oui','Non')reg_pret,\r\n"
			+ "       l.nature_etat_pret,\r\n"
			+ "       l.num_tranch,\r\n"
			+ "       l.impaye,\r\n"
			+ "       l.seq_ecrt_ppl,\r\n"
			+ "       l.seq_ecrt_int,\r\n"
			+ "       l.int_tmmplus,\r\n"
			+ "       l.seq_ecrt,\r\n"
			+ "       l.ordonnance,\r\n"
			+ "       pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul) lib_typ_bul\r\n"
			+ "  from lig_pret l\r\n"
			+ " where cod_soc =:codSoc\r\n"
			+ "   and mat_pers =:matPers\r\n"
			+ "   and cod_pret =:codPret\r\n",nativeQuery=true)
	public List<LigPret> getLigPret(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") String codPret );

	@Query(value="select cod_pret from LIG_PRET \r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers \r\n"
			+"GROUP BY cod_pret ",nativeQuery=true)
	public List<Integer> getPretPersCode(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

	

}
