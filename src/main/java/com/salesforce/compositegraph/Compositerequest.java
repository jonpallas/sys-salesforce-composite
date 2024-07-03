package com.salesforce.compositegraph;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.varelma.utils.Jsonable;
import com.varelma.utils.NullHashMap;
import com.varelma.utils.StringUtils;
 
 
public class Compositerequest implements Jsonable{

	public String method;
    public String url;
    public String referenceId;
    @JsonIgnore 
    public boolean filterNulls = false;
 
    @JsonIgnore 
    public boolean isFilterNulls() {
		return filterNulls;
	}
    @JsonIgnore 
	public void setFilterNulls(boolean filterNulls) {
    
		this.filterNulls = filterNulls;
		if (filterNulls) {
			NullHashMap<String, Object> nullHashMap = new NullHashMap<String, Object>();
			nullHashMap.putAll(body);
			body = nullHashMap;
		}
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	private  Map<String, Object> body= new HashMap<String, Object>(); 
    
    public void setBody(Map<String, Object> body) {
        this.body = body;
    }
    public  Map<String, Object> getBody() {
        return body;
    }
    
    public void setMethod(String method) {
         this.method = method;
     }
     public String getMethod() {
         return method;
     }

    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }
 
     
 	public String toJson() {
 		return StringUtils.toJson(this);
	}
 	
 	@Override
 	public String toString() {
 		return StringUtils.toJson(this);
 	}
}