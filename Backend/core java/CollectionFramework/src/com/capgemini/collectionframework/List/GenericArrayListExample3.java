package com.capgemini.collectionframework.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class GenericArrayListExample3
{
	public static void main(String[] args) 
	{
		ArrayList<Double> a1= new ArrayList<Double>();
		a1.add(2.4);
		a1.add(3.3);
		a1.add(4.4);
		a1.add(5.5);
		
		ListIterator<Double> it = a1.listIterator();
		System.out.println("------Forward------");
		while(it.hasNext())
		{
			Double r = it.next();
			System.out.println(r);
		}
		System.out.println("------Backward------");
		while(it.hasPrevious())
		{
			Double r =it.previous();
			System.out.println(r);
		}
		
	}
}
