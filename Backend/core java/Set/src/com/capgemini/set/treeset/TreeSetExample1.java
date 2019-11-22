package com.capgemini.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 
{
	public static void main(String[] args)
	{
		TreeSet<String> t = new TreeSet<String>();
		t.add("komal");
		t.add("mayuri");
		t.add("dholu");
		t.add("sonu");
		
		Iterator<String> it =t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
