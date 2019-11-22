package com.capgemini.set.hashset;

import java.util.HashSet;

public class HashSetExample3 
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add(15);
		h.add('A');
		h.add(2.3);
		h.add("dholu");
		h.add('A');
		h.add(15);
		h.add(null);
		h.add(null);
		
		for(Object o :h)
		{
			System.out.println(o);
		}
		
	}
}
