package com.capgemini.exception.uncheckeduserdefinedexc;

public class InvalidLimitException extends Exception
{
	String message="Day limit is 40000";
	
	@Override
	public String getMessage() 
	{
		return message;
	}
}
