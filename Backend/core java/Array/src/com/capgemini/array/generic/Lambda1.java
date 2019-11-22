package com.capgemini.array.generic;

interface Sample
{
	void gm();
}



public class Lambda1 
{
	public static void main(String[] args) 
	{
		Sample s =()->System.out.println("Good Morning");
		s.gm();
	}
}
