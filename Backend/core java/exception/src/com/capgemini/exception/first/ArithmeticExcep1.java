package com.capgemini.exception.first;

public class ArithmeticExcep1 
{
	public static void main(String[] args)
	{
		System.out.println("Main started");
		try
		{
			System.out.println(10/5);
			System.out.println("Hi");
			System.out.println("Keep Smiling");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please dont divide by zero");
		}
		
		System.out.println("Main ended");
	}
}
