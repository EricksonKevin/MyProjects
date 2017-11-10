package com.kee.json;

import org.json.*;

public class Main {
	
	public static void main(String[] args) {
		JSONObject obj = JSONUtils.getJSONObjectFromFile("/obj.json");
		String[] names = JSONObject.getNames(obj);
		for(String string : names) {
			System.out.println(string + ": " + obj.get(string));
		}
		
		System.out.print("\n");
		
		
	}

}
