package com.capg.corejava.basics;

public class CompoundOperator
{
	public static void main(String[] args)
	{
		int i =10;
		int j = 5;
		j+=i;                     //Addition assignment operator
		System.out.println(j);
		
		j-=i;                     //Subtraction assignment operator
		System.out.println(j);
		
		j*=i;                      //Multiplication assignment operator
		System.out.println(j);
		
		j/=i;                     //Division assignment operator
		System.out.println(j);
		
		j%=i;                      //Modulus assignment operator
		System.out.println(j);
	}
}
