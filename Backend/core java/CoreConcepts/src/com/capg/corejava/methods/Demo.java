package com.capg.corejava.methods;

public class Demo
{
	static Methods m = new Methods();
	public static void main(String[] args) 
	{
		Methods m1 = new Methods();
		System.out.println(m);
		System.out.println(m1);
		System.out.println(Methods.areaOfsquare(6));
		System.out.println(m.areaOfrectangle(6,7));
		System.out.println(m1.areaOfrectangle(6,7));
	    int r = m.y;
	    System.out.println(r);
	}
}



