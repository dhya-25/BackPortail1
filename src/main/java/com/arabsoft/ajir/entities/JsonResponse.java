package com.arabsoft.ajir.entities;

import java.util.List;

public class JsonResponse {
	 private Long id;
     private String label;
     private String icon;
     private String link;
     private List<JsonResponse> subItems;
     private Long parentId;

	public JsonResponse(Long id, String label, String icon, String link, List<JsonResponse> subItems) {
		super();
		this.id = id;
		this.label = label;
		this.icon = icon;
		this.link = link;
		this.subItems = subItems;
	}
	public JsonResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<JsonResponse> getSubItems() {
		return subItems;
	}
	public void setSubItems(List<JsonResponse> subItems) {
		this.subItems = subItems;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return "JsonResponse [id=" + id + ", label=" + label + ", icon=" + icon + ", link=" + link + ", subItems="
				+ subItems + ", parentId=" + parentId + "]";
	}
     
     
     
}
