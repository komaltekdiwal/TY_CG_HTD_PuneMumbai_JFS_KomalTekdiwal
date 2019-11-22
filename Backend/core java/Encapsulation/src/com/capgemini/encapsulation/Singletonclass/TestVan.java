package com.capgemini.encapsulation.Singletonclass;

public class TestVan
{
	public static void main(String[] args) 
	{
		Van r = Van.getVan();
		System.out.println(r);
		
		Van t = Van.getVan();
		System.out.println(t);
		
		Van s = Van.getVan();
		System.out.println(s);
				
		
	}
}
