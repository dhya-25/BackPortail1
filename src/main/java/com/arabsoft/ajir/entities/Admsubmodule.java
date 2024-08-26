package com.arabsoft.ajir.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Admsubmodule")
public class Admsubmodule {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqSUB")
    @SequenceGenerator(name = "seqSUB", sequenceName = "SEQ_ADMSUBMODULE", allocationSize = 1)
	private Long sum_id;
	private String sum_name;
	private Long sum_rank;
	private Long mod_id;
	private String sum_status;
	private String sum_rout	;
	private byte[] mdl_icon	;
	public Admsubmodule() {
		super();
	}
	public Admsubmodule(Long sum_id, String sum_name, Long sum_rank, Long mod_id, String sum_status, String sum_rout,
			byte[] mdl_icon) {
		super();
		this.sum_id = sum_id;
		this.sum_name = sum_name;
		this.sum_rank = sum_rank;
		this.mod_id = mod_id;
		this.sum_status = sum_status;
		this.sum_rout = sum_rout;
		this.mdl_icon = mdl_icon;
	}
	public Long getSum_id() {
		return sum_id;
	}
	public void setSum_id(Long sum_id) {
		this.sum_id = sum_id;
	}
	public String getSum_name() {
		return sum_name;
	}
	public void setSum_name(String sum_name) {
		this.sum_name = sum_name;
	}
	public Long getSum_rank() {
		return sum_rank;
	}
	public void setSum_rank(Long sum_rank) {
		this.sum_rank = sum_rank;
	}
	public Long getMod_id() {
		return mod_id;
	}
	public void setMod_id(Long mod_id) {
		this.mod_id = mod_id;
	}
	public String getSum_status() {
		return sum_status;
	}
	public void setSum_status(String sum_status) {
		this.sum_status = sum_status;
	}
	public String getSum_rout() {
		return sum_rout;
	}
	public void setSum_rout(String sum_rout) {
		this.sum_rout = sum_rout;
	}
	public byte[] getMdl_icon() {
		return mdl_icon;
	}
	public void setMdl_icon(byte[] mdl_icon) {
		this.mdl_icon = mdl_icon;
	}
	@Override
	public String toString() {
		return "Admsubmodule [sum_id=" + sum_id + ", sum_name=" + sum_name + ", sum_rank=" + sum_rank + ", mod_id="
				+ mod_id + ", sum_status=" + sum_status + ", sum_rout=" + sum_rout + ", mdl_icon="
				+ Arrays.toString(mdl_icon) + "]";
	}
	
	
	

}
