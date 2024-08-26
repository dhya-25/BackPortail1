

package com.arabsoft.ajir.sevices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arabsoft.ajir.dao.AdmstorageautorisationDAO;
import com.arabsoft.ajir.entities.Admeventtype;
import com.arabsoft.ajir.entities.Admstorageautorisation;
import com.arabsoft.ajir.entities.Admsubmodule;
import com.arabsoft.ajir.entities.JsonResponse;
import com.arabsoft.ajir.entities.Role;

@Service
public class MenuService {
	 @Autowired
	    private AdmstorageautorisationDAO admstorageautorisationDAO;

	    public List<JsonResponse> convertAdmEntities(List<Admsubmodule> admSubmodules, List<Admeventtype> admEventTypes, Role role) {
	        Map<Long, List<Admeventtype>> eventTypeMap = groupEventTypesBySubmodule(admEventTypes);
	        List<JsonResponse> jsonResponses = new ArrayList<>();

	        for (Admsubmodule submodule : admSubmodules) {
	            if (hasAuthorization(role, submodule)) {
	                JsonResponse jsonResponse = createJsonResponse(submodule, eventTypeMap, role);
	                jsonResponses.add(jsonResponse);
	            }
	        }

	        return jsonResponses;
	    }

	    private Map<Long, List<Admeventtype>> groupEventTypesBySubmodule(List<Admeventtype> admEventTypes) {
	        Map<Long, List<Admeventtype>> eventTypeMap = new HashMap<>();

	        for (Admeventtype eventType : admEventTypes) {
	            Long sumId = eventType.getSum_id();
	            eventTypeMap.computeIfAbsent(sumId, k -> new ArrayList<>()).add(eventType);
	        }

	        return eventTypeMap;
	    }

	    private boolean hasAuthorization(Role role, Admsubmodule submodule) {
	        List<Admstorageautorisation> authorisations = admstorageautorisationDAO.getMenuRole(submodule.getSum_id(), role.getRoleId());
	        return !authorisations.isEmpty();
	    }

	    private JsonResponse createJsonResponse(Admsubmodule submodule, Map<Long, List<Admeventtype>> eventTypeMap, Role role) {
	        JsonResponse jsonResponse = new JsonResponse();
	        jsonResponse.setId(submodule.getSum_id());
	        jsonResponse.setLabel(submodule.getSum_name());
	        jsonResponse.setIcon(""); // Assuming icon is stored in mdl_icon as Base64 encoded string
	        jsonResponse.setLink("/" + submodule.getSum_rout());
	        jsonResponse.setParentId(99L);

	        List<Admstorageautorisation> authorisations = admstorageautorisationDAO.getMenuRole(submodule.getSum_id(), role.getRoleId());

	        if (authorisations != null && !authorisations.isEmpty()) {
	            List<JsonResponse> children = new ArrayList<>();

	            for (Admstorageautorisation auth : authorisations) {
	                Admeventtype eventType = auth.getAdmeventtype();
	                if (eventType != null) {
	                    JsonResponse child = createChildJsonResponse(eventType, eventTypeMap);
	                    children.add(child);
	                }
	            }

	            jsonResponse.setSubItems(children.isEmpty() ? null : children);
	        } else {
	            jsonResponse.setSubItems(null);
	        }

	        return jsonResponse;
	    }

	    private JsonResponse createChildJsonResponse(Admeventtype eventType, Map<Long, List<Admeventtype>> eventTypeMap) {
	        JsonResponse child = new JsonResponse();
	        child.setId(eventType.getEvt_id());
	        child.setLabel(eventType.getEvt_name());
	        child.setIcon("");
	        child.setLink(eventType.getEvt_action());
	        child.setParentId(eventType.getEvt_evt_id());

	        List<Admeventtype> nestedEventTypes = eventTypeMap.get(eventType.getEvt_id());
	        if (nestedEventTypes != null && !nestedEventTypes.isEmpty()) {
	            List<JsonResponse> nestedChildren = new ArrayList<>();
	            for (Admeventtype nestedEventType : nestedEventTypes) {
	                JsonResponse nestedChild = createChildJsonResponse(nestedEventType, eventTypeMap);
	                nestedChildren.add(nestedChild);
	            }
	            child.setSubItems(nestedChildren);
	        } else {
	            child.setSubItems(null);
	        }

	        return child;
	    }
	    
	    
	    
	    
	    public List<JsonResponse> convertAdmEntities(List<Admsubmodule> admSubmodules, List<Admeventtype> admEventTypes) {
	        List<JsonResponse> jsonResponses = new ArrayList<>();
	        Map<Long, List<Admeventtype>> eventTypeMap = new HashMap<>();

	        // Group AdmEventType entities by sum_id
	        for (Admeventtype eventType : admEventTypes) {
	            Long sumId = eventType.getSum_id();
	            eventTypeMap.putIfAbsent(sumId, new ArrayList<>());
	            eventTypeMap.get(sumId).add(eventType);
	        }

	        // Convert AdmSubmodule entities along with associated AdmEventType entities
	        for (Admsubmodule submodule : admSubmodules) {
	            JsonResponse jsonResponse = createJsonResponse(submodule, eventTypeMap);
	            jsonResponses.add(jsonResponse);
	        }

	        return jsonResponses;
	    }

	    private JsonResponse createJsonResponse(Admsubmodule submodule, Map<Long, List<Admeventtype>> eventTypeMap) {
	        JsonResponse jsonResponse = new JsonResponse();
	        jsonResponse.setId(submodule.getSum_id());
	        jsonResponse.setLabel(submodule.getSum_name());
	        jsonResponse.setIcon(""); // Assuming icon is stored in mdl_icon as Base64 encoded string
	        jsonResponse.setLink("/" + submodule.getSum_rout());
	        jsonResponse.setParentId(99L);

	        // Check if there are associated event types for this submodule
	        if (eventTypeMap.containsKey(submodule.getSum_id())) {
	            List<JsonResponse> children = new ArrayList<>();
	            Map<Long, JsonResponse> childMap = new HashMap<>();

	            
	            // First, create all children without nesting
	            for (Admeventtype eventType : eventTypeMap.get(submodule.getSum_id())) {
	                JsonResponse child = createChildJsonResponse(eventType, submodule.getSum_rout(), eventTypeMap);
	                children.add(child);
	                childMap.put(eventType.getEvt_id(), child);
	            }
	            System.out.println("child-------"+children);
	            System.out.println("childMap-------"+childMap);

	            // Then, nest children correctly based on evt_evt_id
	            List<JsonResponse> topLevelChildren = new ArrayList<>();
	            for (JsonResponse child : children) {
	            	System.out.println("###### child.getParentId() : "+child.getParentId()+"***** child.getId() : "+child.getId());	         
	                if (child.getParentId() != null) {
	                    JsonResponse parent = childMap.get(child.getParentId());
	                    if (parent != null) {
	                        if (parent.getSubItems() == null) {
	                            parent.setSubItems(new ArrayList<>());
	                        }
	                        parent.getSubItems().add(child);
	                    }
	                } else {
	                	child.setParentId(submodule.getSum_id());
	                    topLevelChildren.add(child);
	                }
	            }
	            jsonResponse.setSubItems(topLevelChildren.isEmpty() ? null : topLevelChildren);
	        } else {
	            jsonResponse.setSubItems(null);
	        }

	        return jsonResponse;
	    }

	    private JsonResponse createChildJsonResponse(Admeventtype eventType, String submoduleRoute, Map<Long, List<Admeventtype>> eventTypeMap) {
	        JsonResponse child = new JsonResponse();
	        child.setId(eventType.getEvt_id());
	        child.setLabel(eventType.getEvt_name());
	        child.setIcon("");
	        child.setLink("/" + submoduleRoute + "/" + eventType.getEvt_action());
        	child.setParentId(eventType.getEvt_evt_id());
            //child.setParentId(eventType.getEvt_evt_id() != null ? eventType.getEvt_evt_id() : eventType.getSum_id());

//	        if(eventType.getEvt_evt_id()==null) {
//	        	System.out.println("test");
//	        child.setParentId(eventType.getSum_id());
//	        }else {
//	        }
	        // Check for nested event types
	        if (eventTypeMap.containsKey(eventType.getEvt_id())) {
	            List<JsonResponse> nestedChildren = new ArrayList<>();
	            for (Admeventtype nestedEventType : eventTypeMap.get(eventType.getEvt_id())) {
	                JsonResponse nestedChild = createChildJsonResponse(nestedEventType, submoduleRoute, eventTypeMap);
	                nestedChildren.add(nestedChild);
	            }
	            child.setSubItems(nestedChildren.isEmpty() ? null : nestedChildren);
	        } else {
	            child.setSubItems(null);
	        }

	        return child;
	    }
	}