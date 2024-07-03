/* Copyright 2023 freecodeformat.com */
package com.salesforce.compositegraph;
import java.util.ArrayList;
import java.util.List;

import com.varelma.utils.Jsonable;
import com.varelma.utils.StringUtils;

public class Compositegraph  implements Jsonable{

	
 
	public List<Graph> graphs = new ArrayList<Graph>();
   
    
    public void setGraphs(List<Graph> graphs) {
         this.graphs = graphs;
     }
     public List<Graph> getGraphs() {
         return graphs;
     }
 	
 	public String toJson() {
		return StringUtils.toJson(this);
	}
 	
     @Override
 	public String toString() {
 		return StringUtils.toJson(this);
 	}
 	

}