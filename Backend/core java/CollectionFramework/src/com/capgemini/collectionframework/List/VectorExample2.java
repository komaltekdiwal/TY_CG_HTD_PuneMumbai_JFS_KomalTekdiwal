package com.capgemini.collectionframework.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample2
{
	public static void main(String[] args) 
	{
		Vector<Character> v = new Vector<Character>();
		v.add('A');
		v.add('P');
		v.add('P');
		v.add('l');
		v.add('E');
		
		System.out.println("--------for loop");
		for(int i =0;i<5;i++)
		{
			Object r = v.get(i);
			System.out.println(r);
		}
		
		System.out.println("--------for-each loop");
		for(Character r:v)        //by using for-each
		{
			System.out.println(r);
		}
		
		System.out.println("--------iterator loop");
		Iterator<Character> it = v.iterator();
		while(it.hasNext())
		{
			Character r=it.next();
			System.out.println(r);
		}
		
		System.out.println("---------ListIterator");
		ListIterator<Character> it1 = v.listIterator();
		System.out.println("----->Forward");
		while(it1.hasNext())
		{
			Character r=it1.next();
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
