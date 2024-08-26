package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admeventtype")
public class Admeventtype {
	
	@Id
	private Long evt_id;
	private String evt_name;
	private Long evt_evt_id;
	private Long 	sum_id;
	private String evt_action;
	private Long evt_rank	;
	private String evt_maint	;
	
	
	public Admeventtype(Long evt_id, String evt_name, Long evt_evt_id, Long sum_id, String evt_action, Long evt_rank,
			String evt_maint) {
		super();
		this.evt_id = evt_id;
		this.evt_name = evt_name;
		this.evt_evt_id = evt_evt_id;
		this.sum_id = sum_id;
		this.evt_action = evt_action;
		this.evt_rank = evt_rank;
		this.evt_maint = evt_maint;
	}


	public Admeventtype() {
		super();
	}


	public Long getEvt_id() {
		return evt_id;
	}


	public void setEvt_id(Long evt_id) {
		this.evt_id = evt_id;
	}


	public String getEvt_name() {
		return evt_name;
	}


	public void setEvt_name(String evt_name) {
		this.evt_name = evt_name;
	}


	public Long getEvt_evt_id() {
		return evt_evt_id;
	}


	public void setEvt_evt_id(Long evt_evt_id) {
		this.evt_evt_id = evt_evt_id;
	}


	public Long getSum_id() {
		return sum_id;
	}


	public void setSum_id(Long sum_id) {
		this.sum_id = sum_id;
	}


	public String getEvt_action() {
		return evt_action;
	}


	public void setEvt_action(String evt_action) {
		this.evt_action = evt_action;
	}


	public Long getEvt_rank() {
		return evt_rank;
	}


	public void setEvt_rank(Long evt_rank) {
		this.evt_rank = evt_rank;
	}


	public String getEvt_maint() {
		return evt_maint;
	}


	public void setEvt_maint(String evt_maint) {
		this.evt_maint = evt_maint;
	}


	@Override
	public String toString() {
		return "Admeventtype [evt_id=" + evt_id + ", evt_name=" + evt_name + ", evt_evt_id=" + evt_evt_id + ", sum_id="
				+ sum_id + ", evt_action=" + evt_action + ", evt_rank=" + evt_rank + ", evt_maint=" + evt_maint + "]";
	}
	
	

}
