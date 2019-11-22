package com.capgemini.predicate.first;

import java.util.function.Predicate;

public class Student
{
	public static void main(String[] args)
	{
		int id =1;
		String name="komal";
		double percentage=77.99;

		Predicate<Student> p =i->{
			if(percentage>35)
			{
				return true;
			}
			else
			{
				return false;
			}
		};

		Student s = new Student();

		boolean res = p.test(s);
		System.out.println(res);
	}
}


