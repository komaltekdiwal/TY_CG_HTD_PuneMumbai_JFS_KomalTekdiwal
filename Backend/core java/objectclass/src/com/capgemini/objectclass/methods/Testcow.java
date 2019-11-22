package com.capgemini.objectclass.methods;

public class Testcow 
{
	public static void main(String[] args) 
	{
		Cow c = new Cow();
		c.id=1;
		c.name="Gamga";
		
		Cow d = new Cow();
		d.id=2;
		d.name="Tunga";
		
		Cow e = new Cow();
		e.id=1;
		e.name="Gamga";
		
		boolean res=c.equals(d);
		System.out.println(res);
		
	}
}
