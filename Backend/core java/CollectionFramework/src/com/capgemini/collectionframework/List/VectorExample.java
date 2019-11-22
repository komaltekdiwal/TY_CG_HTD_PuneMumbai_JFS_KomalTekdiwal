package com.capgemini.collectionframework.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(1);
		v.add("komal");
		v.add('k');
		v.add(2.4);
		
		System.out.println("-----for loop");
		for(int i =0;i<4;i++)
		{
			Object r = v.get(i);
			System.out.println(r);
		}
		
		System.out.println("--------for-each loop");
		for(Object r:v)        //by using for-each
		{
			System.out.println(r);
		}
		
		System.out.println("--------iterator loop");
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}
		
		System.out.println("---------ListIterator");
		ListIterator it1 = v.listIterator();
		System.out.println("----->Forward");
		while(it1.hasNext())
		{
			Object r=it1.next();
			System.out.println(r);
		}
		
		System.out.println("<-----Backward");
		while(it1.hasPrevious())
		{
			Object r=it1.previous();
			System.out.println(r);
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
