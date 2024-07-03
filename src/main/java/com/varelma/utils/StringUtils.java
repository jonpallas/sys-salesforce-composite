package com.varelma.utils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class StringUtils {

	public static String toJson(Object o) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Include.NON_NULL);
			AnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
			mapper.setAnnotationIntrospector(introspector);
			
			
			String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
			return result;
		} catch (Exception e) {
			return "error occouerd in toJson";
		}

	}

	public static String toJson(Object o, boolean includeNulls) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			if (!includeNulls) {
				mapper.setSerializationInclusion(Include.NON_NULL);
			}
			AnnotationIntrospector introspector = new JacksonAnnotationIntrospector();
			mapper.setAnnotationIntrospector(introspector);
			
			
			String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
			return result;
		} catch (Exception e) {
			return "error occouerd in toJson";
		}

	}

	
	
}
