package com.capgemini.collectionframework.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample3
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add("komal");
		a1.add(2.3);
		a1.add('f');
			
		ListIterator it = a1.listIterator();
		System.out.println("-------------Forward");
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}
		
		System.out.println("------------Backward");
		while(it.hasPrevious())
		{
			Object r=it.previous();
			System.out.println(r);
		}
	}
}
