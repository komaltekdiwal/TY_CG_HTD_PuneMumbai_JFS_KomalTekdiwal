package com.capgemini.array.generic;

public class Mouse
{
	void onlyOdd(int[] s)
	
	{
		for(int o:s)
		{
			if(o%2!=0)
			{
				System.out.println(o);
			}
		}
	}
	
	
	
	void walk(double[] a)
	{
		for(double t:a)                       //for-each loop
		{
			System.out.println(t);
		}
	}
	
	void run(int[] a)                        //for loop
	{
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
	}
}
