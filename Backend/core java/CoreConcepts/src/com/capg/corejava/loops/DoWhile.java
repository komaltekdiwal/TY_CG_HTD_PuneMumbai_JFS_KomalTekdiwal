package com.capg.corejava.loops;

public class DoWhile 
{
	public static void main(String[] args) 
	{
		int i =1;
		do
		{
			System.out.println("i = "+i);
			i++;
		}
		while(i<=10);
		System.out.println("Code outside do-while loop");
		
		System.out.println("----------------------------");
		
		int j =11;
		do
		{
			System.out.println("j = "+j);
			j++;
		}
		while(j<=10);
		System.out.println("Code outside do-while loop");
	}
}
