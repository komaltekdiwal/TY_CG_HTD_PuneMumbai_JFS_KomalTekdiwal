package com.capgemini.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add("komal");
		hs.add('k');
		hs.add(1.1);
		
		System.out.println("Using for-each loop");
		for(Object r:hs)
		{
			System.out.println(r);
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("Using Iterator");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
