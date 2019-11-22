package com.capgemini.exception.uncheckeduserdefinedexc;

public class TestI_A 
{
	public static void main(String[] args) 
	{
		Amount a = new Amount();
		
		try
		{
			a.check(50000);
			System.out.println("Collect cash");
		}
		catch(InvalidLimitException e)
		{
			e.printStackTrace();
		}
	}
}
