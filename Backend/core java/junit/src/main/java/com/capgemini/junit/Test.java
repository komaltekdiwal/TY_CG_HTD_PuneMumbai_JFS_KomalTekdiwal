package com.capgemini.junit;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("Samba",77.77,'M');
		
		Student s2 = new Student("Dinga",88.88,'F');
		
		School school = new School();
		
		Student student1 = school.registerStudent(s1);
		Student student2 = school.registerStudent(s2);
		
		System.out.println("ID is " + student1.getId());
		System.out.println("Name is" + student1.getName());
		
		System.out.println("---------------------");
	
		System.out.println("ID is " + student2.getId());
		System.out.println("Name is" + student2.getName());
		
	
	}
}
