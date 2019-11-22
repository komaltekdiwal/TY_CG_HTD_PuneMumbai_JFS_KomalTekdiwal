package com.capgemini.general.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper
{
	void displayPass(ArrayList<Student> al)
	{
		List<Student> li =al.stream().filter(i->i.percentage>35).collect(Collectors.toList());
		
		Iterator<Student> it = li.iterator();
		while(it.hasNext())
			{
				Student s = it.next();
				System.out.println("Id is:"+s.id);
				System.out.println("Name is:"+s.name);
				System.out.println("Percentage is:"+s.percentage);
				System.out.println("Gender is:"+s.gender);
				System.out.println("-----------------------------");
			}
		}
	
	
		Comparator <Student>  comp = (s1,s2)->
		{
			Double i =s1.percentage;
			Double j =s1.percentage;
		
			return i.compareTo(j);
		};
		
		void topper(ArrayList<Student> al)
		{
			Student small = al.stream().max(comp).get();
			System.out.println("Topper:" +small.name);
		}
		
		
	
	void displayFail(ArrayList<Student> al)
	{
		List<Student> li1 =al.stream().filter(i->i.percentage<35).collect(Collectors.toList());
		
		Iterator<Student> it = li1.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Id is:"+s.id);
			System.out.println("Name is:"+s.name);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("Gender is:"+s.gender);
			System.out.println("-----------------------------");
		}
	}
	
	void displayPassGender(ArrayList<Student> al)
	{
		List<Student> li2 =al.stream().filter(i->i.percentage>35&&i.gender=='f').collect(Collectors.toList());
		
		Iterator<Student> it = li2.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Id is:"+s.id);
			System.out.println("Name is:"+s.name);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("Gender is:"+s.gender);
			System.out.println("-----------------------------");
		}
	}
	
	
	void displayFailGender(ArrayList<Student> al)
	{
		List<Student> li3 =al.stream().filter(i->i.percentage<35&&i.gender=='m').collect(Collectors.toList());
		
		Iterator<Student> it = li3.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Id is:"+s.id);
			System.out.println("Name is:"+s.name);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("Gender is:"+s.gender);
			System.out.println("-----------------------------");
		}
	}
	
	void displayAll(ArrayList<Student> al)
	{
		Iterator<Student> it = al.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Id is:"+s.id);
			System.out.println("Name is:"+s.name);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("Gender is:"+s.gender);
			System.out.println("-----------------------------");
		}
	}
}
