package com.capgemini.exception.first;

public class AE2 
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
			System.out.println("Main ended");
			
			
			
			
			System.out.println("------------------------");
			
			
			System.out.println("Main started");
			int b[]=new int[3];
			
			try 
			{
				System.out.println(b[9]);
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
			System.out.println("Main ended");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
