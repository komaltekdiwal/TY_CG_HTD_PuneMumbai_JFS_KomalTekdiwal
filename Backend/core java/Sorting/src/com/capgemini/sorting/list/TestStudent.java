package com.capgemini.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student(1,"komal",70.14);
		Student s2 = new Student(2,"mayur",83.09);
		Student s3 = new Student(3,"dinga",98.99);
		Student s4 = new Student(4,"bunga",65.25);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		
		Collections.sort(a1);
		Iterator<Student> it = a1.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Id is :"+s.id);
			System.out.println("Name is :"+s.name);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("---------------------------------");
			
		}
		
		
		
		
		
	}
}
