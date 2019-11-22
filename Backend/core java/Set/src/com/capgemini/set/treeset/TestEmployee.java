package com.capgemini.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;


public class TestEmployee
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet();
		
		Employee e1 = new Employee(1,"komal",9999.99);
		Employee e2= new Employee(2,"mayur",9999.99);
		Employee e3 = new Employee(3,"sonu",9999.99);
		Employee e4= new Employee(4,"mayu",9999.99);
		Employee e5= new Employee(2,"mayur",9999.99);
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		Helper h = new Helper();
	
		h.details(t);
		
		Iterator it =t.iterator();
		while(it.hasNext())
		{
			Employee e =(Employee) it.next();
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
		}
	}
}
