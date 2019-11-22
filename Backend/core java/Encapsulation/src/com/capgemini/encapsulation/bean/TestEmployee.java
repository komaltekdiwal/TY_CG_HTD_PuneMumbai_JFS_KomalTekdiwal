package com.capgemini.encapsulation.bean;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("komal");
		e1.setSalary(30000.8);
		e1.setRole("Developer");
		e1.setDepartment("cse");
		
        e1.receive(e1);
		
		
	}
}
