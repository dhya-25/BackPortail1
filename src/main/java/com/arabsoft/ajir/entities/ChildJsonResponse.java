package com.arabsoft.ajir.entities;

import java.util.List;
import java.util.Objects;

public class ChildJsonResponse extends JsonResponse{
	private Long parentId;
    private String icon;
    
    
	 

	public ChildJsonResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChildJsonResponse(Long id, String label, String icon, String link, List<JsonResponse> subItems,
			Long parentId) {
		super(id, label, icon, link, subItems);
		// TODO Auto-generated constructor stub
	}
	public ChildJsonResponse(Long id, String label, String icon, String link, List<JsonResponse> subItems,
			Long parentId, Long parentId2, String icon2) {
		super(id, label, icon, link, subItems);
		parentId = parentId2;
		icon = icon2;
	}
	@Override
	public int hashCode() {
		return Objects.hash(icon, parentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChildJsonResponse other = (ChildJsonResponse) obj;
		return Objects.equals(icon, other.icon) && Objects.equals(parentId, other.parentId);
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "ChildJsonResponse [parentId=" + parentId + ", icon=" + icon + "]";
	}
     

     
     
}
