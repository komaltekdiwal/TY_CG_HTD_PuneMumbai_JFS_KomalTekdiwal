package com.capgemini.encapsulation.bean;

public class Employee
{
	private int id;
	private String name;
	private double salary;
	private String role;
	private String department;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public String getRole() 
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	
	void receive(Employee e)
	{
		System.out.println("Id is"+e.getId());
		System.out.println("Name is"+e.getName());
		System.out.println("Salary is"+e.getSalary());
		System.out.println("Role is"+e.getRole());
		System.out.println("Department is"+e.getDepartment());
	}
	
	
}
