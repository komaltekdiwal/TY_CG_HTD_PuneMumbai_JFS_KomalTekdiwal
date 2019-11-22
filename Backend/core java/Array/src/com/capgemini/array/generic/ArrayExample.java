package com.capgemini.array.generic;

public class ArrayExample 
{
	public static void main(String[] args)
	{
		double d []= new double[4];
		d[0]=1.0;
		d[1]=2.0;
		d[2]=3.0;
		d[3]=4.0;
		
		System.out.println(d[0]);
		
		System.out.println("----------------");
		
		for(int i =0;i<4;i++)
		{
			System.out.println(d[i]);
		}
		
	}
}
