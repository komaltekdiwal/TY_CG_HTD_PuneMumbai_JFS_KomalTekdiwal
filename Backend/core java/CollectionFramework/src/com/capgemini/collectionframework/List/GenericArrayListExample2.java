package com.capgemini.collectionframework.List;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayListExample2
{
	public static void main(String[] args) 
	{
		ArrayList<Double> a1= new ArrayList<Double>();
		a1.add(2.4);
		a1.add(3.3);
		a1.add(4.4);
		a1.add(5.5);
		
		Iterator<Double> it = a1.iterator();
		while(it.hasNext())
		{
			Double r =it.next();
			System.out.println(r);
		}
	}
}
