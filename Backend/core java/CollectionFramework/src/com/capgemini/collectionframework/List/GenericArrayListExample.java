package com.capgemini.collectionframework.List;

import java.util.ArrayList;

public class GenericArrayListExample 
{
	public static void main(String[] args)
	{
		ArrayList<Double> a1= new ArrayList<Double>();
		a1.add(2.4);
		a1.add(3.3);
		a1.add(4.4);
		a1.add(5.5);
		
		for(int i =0;i<4;i++)
		{
			Object r = a1.get(i);
			System.out.println(r);
		}
		
		
	}
}
