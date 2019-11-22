package com.capgemini.collectionframework1.List;

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
		
		Helper h = new Helper();
		
		h.display(a1);
		h.onlyPass(a1);
		h.onlyDistinction(a1);
	}
}
