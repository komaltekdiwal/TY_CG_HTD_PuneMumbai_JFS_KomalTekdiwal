package com.capgemini.general.first;

import java.util.ArrayList;

public class TestStudent 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a1 =new ArrayList<Student>();
		Student s1 = new Student(1,"Komal",96.33,'F');
		Student s2 = new Student(2,"Sonu",36.33,'F');
		Student s3 = new Student(3,"Dholu",26.33,'F');
		Student s4 = new Student(4,"Nisha",96.33,'F');
		Student s5 = new Student(5,"Mayu",94.33,'M');
		Student s6 = new Student(6,"Rupesh",34.12,'M');
		Student s7 = new Student(7,"Rajesh",87.55,'M');
		Student s8 = new Student(8,"Vihan",67.99,'M');
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		a1.add(s6);
		a1.add(s7);
		a1.add(s8);
		
		Helper h = new Helper();
		h.displayAll(a1);
		h.displayPass(a1);
		h.displayFail(a1);
		h.displayPassGender(a1);
		h.displayFailGender(a1);
		h.topper(a1);
		
	}
}
