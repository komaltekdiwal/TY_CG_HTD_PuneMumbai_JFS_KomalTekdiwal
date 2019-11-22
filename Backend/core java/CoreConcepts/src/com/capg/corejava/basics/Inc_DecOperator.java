package com.capg.corejava.basics;

public class Inc_DecOperator
{
	public static void main(String[] args) 
	{
		int i =10;
		int j =20;
		i=++i;                 //Increment and re-initialization
		System.out.println(i);
		
		int k=j++;                //INcrement and re-initialization
		System.out.println(j);
		System.out.println(k);
		i=--i;                 //Decrement and re-initialization
		System.out.println(i);
		
		j=j--;                 // Decrement and re-initializtion
		System.out.println(j);
	}
}
