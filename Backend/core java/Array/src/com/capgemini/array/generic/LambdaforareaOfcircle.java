package com.capgemini.array.generic;

interface Area
{
	double areaOfCircle(double r);
}

public class LambdaforareaOfcircle 
{
	public static void main(String[] args) 
	{
		Area a=r->3.142*r*r;
		double r = a.areaOfCircle(2);
		System.out.println(r);
	}
}
