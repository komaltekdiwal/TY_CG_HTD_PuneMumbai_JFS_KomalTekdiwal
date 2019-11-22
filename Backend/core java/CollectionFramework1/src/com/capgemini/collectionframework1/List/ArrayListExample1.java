package com.capgemini.collectionframework1.List;

import java.util.ArrayList;

public class ArrayListExample1
{
	public static void main(String[] args) 
	{
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(3.6);
		a1.add(2.4);
		a1.add(4.7);
		a1.add(1.6);
		
		System.out.println("Before-------");
		
		boolean res = a1.remove(12.4);
		
		System.out.println("After---------");
		           
		
	}
}
