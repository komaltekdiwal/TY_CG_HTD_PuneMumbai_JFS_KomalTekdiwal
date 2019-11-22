package com.capgemini.array.generic;

interface Square
{
	int sqr(int a);
}



public class TestLambdaForsqr 
{
	public static void main(String[] args) 
	{
		Square s =(a)->a*a;
		
		int j =s.sqr(10);
		System.out.println(j);
	}
}
