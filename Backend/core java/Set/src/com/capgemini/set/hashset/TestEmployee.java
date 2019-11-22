package com.capgemini.set.hashset;

import java.util.HashSet;

public class TestEmployee
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		Employee e1 = new Employee(1,"komal",9999.99);
		Employee e2= new Employee(2,"mayur",9999.99);
		Employee e3 = new Employee(3,"sonu",9999.99);
		Employee e4= new Employee(4,"mayu",9999.99);
		Employee e5= new Employee(2,"mayur",9999.99);
		
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		Helper h = new Helper();
	
		h.details(hs);
	}
}
