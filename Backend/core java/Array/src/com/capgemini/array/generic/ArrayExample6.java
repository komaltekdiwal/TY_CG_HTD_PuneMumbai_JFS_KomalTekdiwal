package com.capgemini.array.generic;

public class ArrayExample6
{
	public static void main(String[] args) 
	{
		double i[] =chinnu();
		for(double k: i)
		{
			System.out.println(k);
		}
	}
	static double[] chinnu()
	{
		double a[]= {10.0,20.0,30.0,40.0};
		return a;
	}
}
