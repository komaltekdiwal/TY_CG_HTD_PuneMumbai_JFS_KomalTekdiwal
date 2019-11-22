package com.capgemini.array.generic;


interface pi
{
	double getPiValue();
}



public class Lambdaforretpi 
{
	public static void main(String[] args)
	{
		pi p=()->3.14;
		double d=p.getPiValue();
		System.out.println(d);
	}
}
