package com.capgemini.map.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExam2 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String,Integer> h1 = new LinkedHashMap<String,Integer>();
		h1.put("komal",1);
		h1.put("mayur",2);
		h1.put("dholu",3);
		h1.put("sonu",4);
		
		System.out.println("------------------Keys------------------");
		
		Set<String> s = h1.keySet();
		
		for(String r:s)
		{
			System.out.println(r);
		}
			
		System.out.println("----------------Values---------------------");
		
		Collection<Integer> col = h1.values();
		for(Integer r:col)
		{
			System.out.println(r);
		}
	;;}
}
