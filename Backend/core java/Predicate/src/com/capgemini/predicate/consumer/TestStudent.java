package com.capgemini.predicate.consumer;

import java.util.function.Consumer;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		Consumer<Student> c = (s)->{
			System.out.println("Name is:"+s.name);
			System.out.println("Name is:"+s.id);
			System.out.println("Percentage is:"+s.percentage);
		};
		
		Student s1 = new Student(1,"komal",33.33);
		c.accept(s1);
	}
}
