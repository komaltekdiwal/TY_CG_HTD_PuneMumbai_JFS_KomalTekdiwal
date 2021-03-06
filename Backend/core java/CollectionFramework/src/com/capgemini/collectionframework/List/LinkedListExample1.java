package com.capgemini.collectionframework.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample1 
{
	public static void main(String[] args) 
	{
		LinkedList li= new LinkedList();
		li.add(1);
		li.add("komal");
		li.add(2.2);
		li.add('k');
		
		System.out.println("--------for loop");
		for(int i =0;i<4;i++)
		{
			Object r = li.get(i);
			System.out.println(r);
		}
		
		System.out.println("--------for-each loop");
		for(Object r:li)        //by using for-each
		{
			System.out.println(r);
		}
		
		System.out.println("--------iterator loop");
		Iterator it = li.iterator();
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}
		
		System.out.println("---------ListIterator");
		ListIterator it1 = li.listIterator();
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
