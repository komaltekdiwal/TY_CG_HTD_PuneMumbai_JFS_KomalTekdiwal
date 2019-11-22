package com.capgemini.collectionframework.List;

import java.util.ArrayList;

public class ArrayListExample6 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("Raju");
		a1.add(19);
		a1.add('M');
		a1.add(6.14);
		
		for(Object r :a1)
		{
			System.out.println(r);
		}
		
	}
}
