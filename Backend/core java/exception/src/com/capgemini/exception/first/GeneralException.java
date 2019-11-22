package com.capgemini.exception.first;

public class GeneralException 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		
		int a[]=new int[3];
		String s=null;
		try 
		{
			System.out.println(s.toUpperCase());
			System.out.println(a[1]);
			System.out.println(10/2);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Don't cross array boundary");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Don't divide by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont deal with null pointer");
		}
		catch(Exception e)
		{
			System.out.println("I am general catch block");
		}
		
		
		
		System.out.println("Main ended");
		
	}
}
