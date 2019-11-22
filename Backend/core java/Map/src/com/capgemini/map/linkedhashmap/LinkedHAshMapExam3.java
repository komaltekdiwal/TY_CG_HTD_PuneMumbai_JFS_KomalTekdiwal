package com.capgemini.map.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHAshMapExam3
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String,Integer> h1 = new LinkedHashMap<String,Integer>();
		h1.put("komal",1);
		h1.put("mayur",2);
		h1.put("dholu",3);
		h1.put("sonu",4);
		
		System.out.println(h1.containsKey("komal"));
		System.out.println("---------------------------");

		System.out.println(h1.get("mayu"));
	}
}
