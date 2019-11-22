package com.capgemini.exception.first;

public class ArrayIndexOutOfBounds 
{
	public static void main(String[] args)
	{
		System.out.println("Main started");
		int a[]=new int[3];
		
		try 
		{
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Don't cross array  boundary");
		}
		
		System.out.println("main ended");
	}
}
