package com.capgemini.collectionframework.List;

import java.util.ArrayList;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 = new Student(1,"komal",33.33);
		Student s2 = new Student(2,"mayur",34.33);
		Student s3 = new Student(3,"samba",35.33);
		Student s4 = new Student(4,"dinga",36.33);
		Student s5 = new Student(5,"bunga",39.33);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		
		for(int i = 0;i<5;i++)
		{
			Student s = a1.get(i);
			System.out.println("Name is:"+s.name);
			System.out.println("Id is:"+s.id);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("------------------------------");
		}
		
	}
}