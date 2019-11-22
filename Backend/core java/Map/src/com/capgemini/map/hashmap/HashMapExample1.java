package com.capgemini.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(1,"komal");
		h1.put(2,"mayur");
		h1.put(3,"dholu");
		h1.put(4,"sonu");
		
		for(Map.Entry<Integer,String> m :h1.entrySet())
		{
			Integer k = m.getKey();
			String v = m.getValue();
			
			System.out.println("Key is:"+k);
			System.out.println("Value is:"+v);
			System.out.println("--------------------------------");
		}
	}
}
