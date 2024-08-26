package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.EvalDef_ParamEval;

public interface EvalationDefinitf extends JpaRepository<EvalDef_ParamEval, String>{

	
	@Query(value="select cod_soc,mat_pers, annee, taux_real_obj, taux_app_comp, taux_eval_def, \r\n"
			+ "t.cod_app_def,p.lib_app,p.observations, observation\r\n"
			+ " from EVALUATION_DEFINITIVE t , PARAM_EVAL_DEFINITIVE p\r\n"
			+ "    where t.cod_app_def = p.cod_app_def(+) and t.mat_pers=:mat and t.cod_soc=:cod  ",nativeQuery=true)
	public List<EvalDef_ParamEval> getEvaluationDefinitf(@Param("mat")String mat,@Param("cod")String cod);
}
