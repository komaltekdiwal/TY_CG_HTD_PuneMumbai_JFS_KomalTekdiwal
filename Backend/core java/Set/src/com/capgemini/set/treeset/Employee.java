package com.capgemini.set.treeset;

public class Employee implements Comparable<Employee>
{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) 
	{
		Integer i = this.id;
		Integer j = o.id;
		return i.compareTo(j);
	}

	
	
}

