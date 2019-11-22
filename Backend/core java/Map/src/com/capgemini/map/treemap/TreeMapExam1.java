package com.capgemini.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam1 
{
	public static void main(String[] args) 
	{
		TreeMap<String,Integer> h1 = new TreeMap<String,Integer>();
		h1.put("komal",1);
		h1.put("mayur",2);
		h1.put("dholu",3);
		h1.put("sonu",4);
		
		for(Map.Entry<String,Integer> m :h1.entrySet())
		{
			String k = m.getKey();
			Integer v = m.getValue();
			
			System.out.println("Key is:"+k);
			System.out.println("Value is:"+v);
			System.out.println("--------------------------------");
		}
	}
}
