package com.capgemini.exception.userdefinedexc;

public class Validate
{
	void verify(int age)
	{
		if(age>18)
		{
			throw new InvalidAgeException();//for exception go through throw nv click on variable right click go to refactor go to inline select ok
		}
	}
}
