package com.capg.corejava.methods;

public class Methods
{
	static int y = 10;
	public static void main(String[] args)
	{
		print();
		int i=areaOfsquare(10);
		System.out.println("Area of square is:"+i);        /* or we can do like System.out.prinltn("Area of square"+areaOfsquare(10));*/
		
		//Methods m = new Methods();
		//int area = new Methods().areaOfrectangle(2,5);
		int area = new Methods().areaOfrectangle(2,5);
		System.out.println(area);
		
		
		//System.out.println(Methods().areaOfrectangle(2,5));
		                                                  
	}
	    
		public static void print()
		{
			System.out.println("print() method");
		}
		
		public static int areaOfsquare(int side)
		{
			return side*side ;
		}
		
		public int areaOfrectangle(int length,int breadth)
		{
			return length*breadth;
		}
		
		
	
}
