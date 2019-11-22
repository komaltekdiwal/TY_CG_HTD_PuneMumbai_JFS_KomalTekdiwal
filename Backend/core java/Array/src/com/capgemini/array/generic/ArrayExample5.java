package com.capgemini.array.generic;

public class ArrayExample5 
{
	public static void main(String[] args) 
	{
		String[] str= {"komal","sonu","mayur"};
		receive(str);
		
		
	}
	
	static void receive(String[] b)        //passing array to a method
	{
		for(String d:b)
		{
			System.out.println(d);
		}
	}
}