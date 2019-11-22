package com.capgemini.encapsulation.bean;

public class StudentDatabase 
{
	void receive(Student t)
	{
		System.out.println("-----I am a Database-----");
		System.out.println("Name is:"+t.getName());
		System.out.println("Id id :"+t.getId());
		System.out.println("Height is: "+t.getHeight());
	}
}
