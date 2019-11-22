package com.capgemini.array.generic;

public class TestMouse
{
	public static void main(String[] args) 
	{
		Mouse m = new Mouse();
		
		double[] d= {1.1,2.2,3.3};
		m.walk(d);
		
		System.out.println("---------------------------");
		
		int[] i = {1,2,3};
		m.run(i);
		System.out.println("------------------------------");
		m.onlyOdd(i);
		
		
	}
}
