package com.capg.corejava.cfs;

public class Ifelseif 
{
	public static void main(String[] args) 
	{
		int marks = 15;
		if(marks>=75)                                  //if statement
		{
			System.out.println("Grade A");
			
		}
		else if(marks<75 && marks>=50)               //else if statement 
		{
			System.out.println("Grade B");
			
		}
		else if(marks<50 && marks>25)             //else if statement
		{
			System.out.println("Grade C");
		}
		
		else                                       // it is not mandatory
		{
			System.out.println("Fail");
		}
	}
}
