package com.capgemini.junit;

public class Calculator {

	public int add(int a , int b) {
		return a+b;
	}
	
	public int sub(int a , int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	public int fact(int a) {
		int fact=1;
		for(int i =1;i<=a;i++)
		{
		 fact = fact*i;
		
		}
		return fact;
	}
	
}