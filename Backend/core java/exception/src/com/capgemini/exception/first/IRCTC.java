package com.capgemini.exception.first;

public class IRCTC
{
	void confirm()
	{
		System.out.println("Confirm started");
		try
		{
		
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught at confirm ");
		}
		
		System.out.println("Confirm ended");
	}
}
