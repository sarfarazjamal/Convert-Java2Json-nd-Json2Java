package com;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	private static ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();
	}

	public static String convertJava2Json(Object object) {
             String jsonResult="";
		try {
			jsonResult=    mapper.writeValueAsString(object);
		} catch (IOException e) {
			System.out.println("Exception occur while converting 2 json "+e.getMessage());
		}
		return jsonResult;

	}
	/**
	 * Using Generics here because to reduce downcasting problem
	 * @param jsonData
	 * @param cls
	 * @return
	 */
	public static <T> T convertJson2Java(String jsonData, Class<T> cls){
		T result=null;
		try {
			result=mapper.readValue(jsonData, cls);
		} catch (IOException e) {
			System.out.println("Exception occur while converting java"+e.getMessage());
		}
		return result;
		
	}
}
