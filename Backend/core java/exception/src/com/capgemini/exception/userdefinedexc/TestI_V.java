package com.capgemini.exception.userdefinedexc;

public class TestI_V 
{
	public static void main(String[] args) 
	{
		Validate v = new Validate();
		
		
		try
		{
			v.verify(19);
			System.out.println("Welcome to pub");
	    }
		catch(InvalidAgeException e)
		{
			System.err.println(e.getMessage());
		}
	}
}
