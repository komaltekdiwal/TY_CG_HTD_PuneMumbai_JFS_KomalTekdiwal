package com.capgemini.objectclass.methods;

public class TestA
{
	public static void main(String[] args)
	{
		Pen p = new Pen();
		int add= p.hashCode();
		System.out.println("Address is :"+add);
		
		Pen s = new Pen();
		int add2=s.hashCode();
		System.out.println("Adreess 2  is :"+add2);
	}
}
