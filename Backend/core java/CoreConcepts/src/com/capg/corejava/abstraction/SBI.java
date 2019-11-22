package com.capg.corejava.abstraction;

public class SBI implements ATM
{
	@Override
	public void validateCard() 
	{
		System.out.println(".....Connecting to SBI Bank");
		System.out.println("Validating SBI card");
	}

	@Override
	public void getInfo()
	{
		System.out.println("......Conneting to SBI bank");
		System.out.println("Getting info from SBI bank");
	}
}
