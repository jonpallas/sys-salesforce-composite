package com.salesforce.compositegraph;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.varelma.utils.Jsonable;
import com.varelma.utils.StringUtils;

public class Graph  implements Jsonable{
  
	public String graphId;

	public void setGraphId(String graphId) {
		this.graphId = graphId;
	}

	public String getGraphId() {
		return graphId;
	}

	
	
	public int sleepTimeBeforeExecuting = 0;
 	
	public int getSleepTimeBeforeExecuting() {
		return sleepTimeBeforeExecuting;
	}

	public void setSleepTimeBeforeExecuting(int sleepTimeBeforeExecuting) {
		this.sleepTimeBeforeExecuting = sleepTimeBeforeExecuting;
	}
 
	@JsonProperty("compositeRequest")
	public List<Compositerequest> compositeRequest = new ArrayList<Compositerequest>();

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