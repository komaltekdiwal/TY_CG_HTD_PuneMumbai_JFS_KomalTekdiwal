package com.capgemini.exception.uncheckeduserdefinedexc;

public class Amount
{
	void check(int val) throws InvalidLimitException
	{
		if(val>40000)
		{
			throw new InvalidLimitException();
			
		}
	}
}

//whenever you are throwing exception with the help
//of method then it is 
//mandatory to used throw keyword following the
//exception which has occured