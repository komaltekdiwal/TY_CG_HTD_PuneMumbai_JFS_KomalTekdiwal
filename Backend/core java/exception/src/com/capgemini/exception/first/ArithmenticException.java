package com.capgemini.exception.first;

public class ArithmenticException
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		try
		{
			System.out.println(10/0);      //Exception get generated
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please do not divide by zero");
		}
		System.out.println("Min method ended");
	}
	
}
