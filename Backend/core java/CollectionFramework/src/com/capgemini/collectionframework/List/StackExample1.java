package com.capgemini.collectionframework.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample1 
{
	public static void main(String[] args) 
	{
		Stack s =new Stack();
		s.push(1);
		s.push("komal");
		s.push(3.3);
		s.push('k');
		
		System.out.println("-----for loop");
		for(int i =0;i<4;i++)
		{
			Object r = s.get(i);
			System.out.println(r);
		}
		
		System.out.println("--------for-each loop");
		for(Object r:s)        //by using for-each
		{
			System.out.println(r);
		}
		
		System.out.println("--------iterator loop");
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}
		
		System.out.println("---------ListIterator");
		ListIterator it1 = s.listIterator();
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
