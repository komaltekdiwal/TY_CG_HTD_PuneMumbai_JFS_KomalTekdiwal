package com.capgemini.exception.userdefinedexc; 
//custom unchecked example in this package

public class InvalidAgeException extends RuntimeException 
{
	private String message="Invalid age to procceed";
	
	@Override
	public String getMessage()
	{
		return message;
	}
}
