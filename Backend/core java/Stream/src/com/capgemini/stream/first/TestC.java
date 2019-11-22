package com.capgemini.stream.first;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestC

{
	public static void main(String[] args) 
	{
		Comparator<Employee> c2 =(e1,e2)-> e1.name.compareTo(e2.name);
		
		TreeSet<Employee> ts = new TreeSet<Employee>(c2);
		Employee e1 =new Employee(1,"komal",5.6);
		Employee e2 =new Employee(2,"sonu",4.3);
		Employee e3 =new Employee(3,"mayur",5.1);
		Employee e4 =new Employee(4,"dholu",5.4);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		
		Iterator<Employee> it = ts.iterator();
		{
			while(it.hasNext())
			{
				Employee e=it.next();
				System.out.println("Id is:"+e.id);
				System.out.println("Name is:"+e.name);
				System.out.println("Height is:"+e.height);
				System.out.println("--------------------------");
			}
		}
		
	}
}
