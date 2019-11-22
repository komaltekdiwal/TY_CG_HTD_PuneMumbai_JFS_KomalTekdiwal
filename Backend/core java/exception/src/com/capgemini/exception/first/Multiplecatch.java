package com.capgemini.exception.first;

public class Multiplecatch 
{
	public static void main(String[] args)
	{
		System.out.println("Main started");
		String k = null;
		int a[]=new int[3];
		
		try 
		{
			System.out.println(k.length());
			System.out.println(a[7]);
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main ended");
	}
}
