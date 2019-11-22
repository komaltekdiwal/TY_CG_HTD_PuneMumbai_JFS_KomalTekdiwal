package com.capg.corejava.abstraction;

public class HDFC implements ATM {

	@Override
	public void validateCard() 
	{
		System.out.println(".....Connecting to HDFC Bank");
		System.out.println("Validating HDFC card");
	}

	@Override
	public void getInfo()
	{
		System.out.println("......Conneting to HDFC bank");
		System.out.println("Getting info from HDFC bank");
	}

}
