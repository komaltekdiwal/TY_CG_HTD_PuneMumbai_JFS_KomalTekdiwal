package com.capgemini.exception.first;

public class Paytm
{
	void book()
	{
		System.out.println("Book started");
		IRCTC i=new IRCTC();
		try
		{
			i.confirm();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught at book");
		}
		
		System.out.println("Book ended");
	}
}
