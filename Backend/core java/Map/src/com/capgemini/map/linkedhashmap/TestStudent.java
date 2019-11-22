package com.capgemini.map.linkedhashmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestStudent
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String,ArrayList<Student>> l1 = new LinkedHashMap<String,ArrayList<Student>>();
		
		Student s1 =new Student(1,"komal",33.33);
		Student s2 =new Student(2,"mayur",83.33);
		Student s3 =new Student(3,"sonu",43.33);
		Student s4 =new Student(4,"dholu",93.33);
		Student s5 =new Student(5,"nisha",67.33);
		Student s6 =new Student(6,"priya",13.33);
		Student s7 =new Student(7,"rajesh",66.33);
		Student s8 =new Student(8,"rupesh",22.33);
		Student s9 =new Student(9,"mithhu",73.33);
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		ArrayList<Student> a2 = new ArrayList<Student>();
		a2.add(s4);
		a2.add(s5);
		
		ArrayList<Student> a3 = new ArrayList<Student>();
		a3.add(s6);
		a3.add(s7);
		a3.add(s8);
		a3.add(s9);
		
		LinkedHashMap<String,ArrayList<Student>> h2 = new LinkedHashMap<String,ArrayList<Student>>();
		h2.put("first",a1);
		h2.put("second",a2);
		h2.put("third",a3);
		
		ArrayList<Student> al1 = h2.get("first");
		Iterator<Student> it = al1.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Name is:"+s.name);
			System.out.println("Id is:"+s.id);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("-------------------------------------");
		}
		
		
		ArrayList<Student> al2 = h2.get("second");
		Iterator<Student> it1 = al2.iterator();
		while(it1.hasNext())
		{
			Student s = it1.next();
			System.out.println("Name is:"+s.name);
			System.out.println("Id is:"+s.id);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("-------------------------------------");
		}
		
		
		ArrayList<Student> al3 = h2.get("third");
		Iterator<Student> it2 = al3.iterator();
		while(it2.hasNext())
		{
			Student s = it2.next();
			System.out.println("Name is:"+s.name);
			System.out.println("Id is:"+s.id);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("-------------------------------------");
		}
	}
}
