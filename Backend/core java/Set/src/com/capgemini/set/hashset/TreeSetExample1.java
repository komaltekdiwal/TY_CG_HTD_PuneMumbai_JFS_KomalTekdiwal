package com.capgemini.set.hashset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.TreeSet;
public class TreeSetExample1
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet();
		t.add(1);
		t.add("komal");
		t.add('k');
		
		Iterator it =t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
