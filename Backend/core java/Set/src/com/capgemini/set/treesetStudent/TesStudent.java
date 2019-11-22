package com.capgemini.set.treesetStudent;

import java.util.TreeSet;

public class TesStudent 
{
	public static void main(String[] args) 
	{
		StudentById i = new StudentById();
		TreeSet<Student> ts = new TreeSet<Student>(i);
		Student s1=new Student();
		s1.setName("komal");
		s1.setId(1);
		s1.setPercentage(33.33);
		s1.setGender("female");
		
		Student s2=new Student();
		s2.setName("mayur");
		s2.setId(2);
		s2.setPercentage(55.33);
		s2.setGender("male");
		
		Student s3=new Student();
		s3.setName("dholu");
		s3.setId(3);
		s3.setPercentage(36.77);
		s3.setGender("female");
		
		Student s4=new Student();
		s4.setName("sonu");
		s4.setId(4);
		s4.setPercentage(88.33);
		s4.setGender("female");
		
		Student s5=new Student();
		s5.setName("bunga");
		s5.setId(5);
		s5.setPercentage(66.33);
		s5.setGender("male");
		
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		
		for(Student s :ts)
		{
			System.out.println("Name is:"+s.getName());
			System.out.println("ID is:"+s.getId());
			System.out.println("Percentage is:"+s.getPercentage());
			System.out.println("Gender is:"+s.getGender());
			System.out.println("-----------------------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
