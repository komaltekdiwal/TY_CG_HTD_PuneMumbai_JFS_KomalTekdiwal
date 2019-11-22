package com.capg.corejava.abstraction;

public class ICICI implements ATM
{

	@Override
	public void validateCard() 
	{
		System.out.println(".....Connecting to ICICI Bank");
		System.out.println("Validating ICICI card");
	}

	@Override
	public void getInfo()
	{
		System.out.println("......Conneting to ICICI bank");
		System.out.println("Getting info from ICICI bank");
	}

}
