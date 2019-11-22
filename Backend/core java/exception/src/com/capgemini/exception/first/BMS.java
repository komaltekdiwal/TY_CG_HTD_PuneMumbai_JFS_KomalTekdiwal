package com.capgemini.exception.first;

public class BMS 
{
	public static void main(String[] args)
	{
		System.out.println("Main started");
		PVR p = new PVR();
		try
		{
			p.confirm();
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception handled");
		}
		
		System.out.println("Main ended");
	}
}
