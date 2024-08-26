package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Admeventtype;

public interface AdmeventtypeDAO extends JpaRepository<Admeventtype, Long> {
	
	@Query(value="select evt_id	,evt_name, evt_evt_id,sum_id,evt_action	,evt_rank,evt_maint from Admeventtype where sum_id=:sumId",nativeQuery=true)
	List<Admeventtype> getMenuBySumId(@Param("sumId") Long sumId);
	@Query(value="select evt_id	,evt_name, evt_evt_id,sum_id,evt_action	,evt_rank,evt_maint from Admeventtype where EVT_MAINT='O' order by EVT_RANK asc",nativeQuery=true)
	List<Admeventtype> getListAdmeventtype();
	@Query(value="select evt_id	,evt_name, evt_evt_id,sum_id,evt_action	,evt_rank,evt_maint from Admeventtype where sum_id=:sum and evt_evt_id is null order by EVT_RANK asc",nativeQuery=true)
	List<Admeventtype> getListAdmeventtypeNiv(@Param("sum") String sum);
	
	@Query(value="select evt_id	,evt_name, evt_evt_id,sum_id,evt_action	,evt_rank,evt_maint from Admeventtype where evt_evt_id is null and evt_id=:evt order by EVT_RANK asc",nativeQuery=true)
	List<Admeventtype> getListAdmeventtypeNiv1(@Param("evt") String evt);
	
	@Query(value="select evt_id	,evt_name, evt_evt_id,sum_id,evt_action	,evt_rank,evt_maint from Admeventtype where  evt_evt_id=:evt order by EVT_RANK asc",nativeQuery=true)
	List<Admeventtype> getListAdmeventtypeNiv2(@Param("evt") String evt);
}
