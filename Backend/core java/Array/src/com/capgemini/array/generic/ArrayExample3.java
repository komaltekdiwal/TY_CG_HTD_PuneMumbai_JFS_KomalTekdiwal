package com.capgemini.array.generic;

public class ArrayExample3 
{
	public static void main(String[] args)
	{
		int[] m= {10,20,30,40};
		receive(m);
		
	}
	
	static void receive(int[] a)           //passing array to method 
	{
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}
	
}
