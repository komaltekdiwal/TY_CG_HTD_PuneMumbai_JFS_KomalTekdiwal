package com.capgemini.collectionframework.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample2 
{
	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<String>();
		s.push("komal");
		s.push("mayur");
		s.push("sonu");
		s.push("mayu");
		
		System.out.println("--------for loop");
		for(int i =0;i<4;i++)
		{
			Object r = s.get(i);
			System.out.println(r);
		}
		
		System.out.println("--------for-each loop");
		for(String r:s)        //by using for-each
		{
			System.out.println(r);
		}
		
		System.out.println("--------iterator loop");
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
			String r=it.next();
			System.out.println(r);
		}
		
		System.out.println("---------ListIterator");
		ListIterator<String> it1 = s.listIterator();
		System.out.println("----->Forward");
		while(it1.hasNext())
		{
			String r=it1.next();
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
