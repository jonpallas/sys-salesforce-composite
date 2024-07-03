package com.salesforce.composite;

 
import java.util.ArrayList;
import java.util.List;

import com.varelma.utils.Jsonable;
import com.varelma.utils.StringUtils;
 
 
public class Composite  implements Jsonable{

	
	public boolean allOrNone = true;
	public boolean collateSubrequests;
	public List<Compositerequest> compositeRequest = new ArrayList<Compositerequest>();
	
	
	public boolean isAllOrNone() {
		return allOrNone;
	}
	public void setAllOrNone(boolean allOrNone) {
		this.allOrNone = allOrNone;
	}
	public boolean isCollateSubrequests() {
		return collateSubrequests;
	}
	public void setCollateSubrequests(boolean collateSubrequests) {
		this.collateSubrequests = collateSubrequests;
	}
	public List<Compositerequest> getCompositeRequest() {
		return compositeRequest;
	}
	public void setCompositeRequest(List<Compositerequest> compositeRequest) {
		this.compositeRequest = compositeRequest;
	}
 
 
	public String toJson() {
		return StringUtils.toJson(this);
	}
	
	@Override
	public String toString() {
		return StringUtils.toJson(this);
	}
}