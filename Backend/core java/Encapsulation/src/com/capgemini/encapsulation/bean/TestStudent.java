package com.capgemini.encapsulation.bean;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setId(20);
		s.setName("komal");
		s.setHeight(5.2);
		
		StudentDatabase sb = new StudentDatabase();
		sb.receive(s);
	}
	
}
