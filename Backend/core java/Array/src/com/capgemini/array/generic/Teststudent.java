package com.capgemini.array.generic;

public class Teststudent 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[4];
		Student s1 = new Student(1,"komal",23.44);
		Student s2  = new Student(2,"mayur",232.44);
		Student s3 = new Student(3,"dinga",28.94);
		Student s4  = new Student(4,"samba",21.33);
		
		
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		
		receive(s);
		
	}
	
	
	static void receive(Student[] ar)
	{
		for(Student f :ar)
		{
		System.out.println(f.id);
		System.out.println(f.name);
		System.out.println(f.per);
		System.out.println("--------------------------");
		}
	}
}
