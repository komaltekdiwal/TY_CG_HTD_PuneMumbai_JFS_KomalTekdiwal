package com.capgemini.array.generic;

public class ArrayExample4 
{
	public static void main(String[] args) 
	{
		double[] a= {1.1,2.2,3.3,4.4,5.5};
		receive(a);
		
		
	}
	
	static void receive(double[] b)        //passing array to a method
	{
		for(double d:b)
		{
			System.out.println(d);
		}
	}
}
