package com.capgemini.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("mayur");
		hs.add("komal");
		hs.add("bunga");
		hs.add("dinga");
		
		System.out.println("Using for-each loop");
		for(String r:hs)
		{
			System.out.println(r);
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("Using Iterator");
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			String res = it.next();
			System.out.println(res);
		}
	}
}
