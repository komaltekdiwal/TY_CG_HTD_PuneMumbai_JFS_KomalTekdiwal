package com.capgemini.collectionframework1.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper
{
	void display(ArrayList<Student> k)
	{
		for(Student s :k)
		{
			System.out.println("Id is:"+s.id);
			System.out.println("Name is:"+s.name);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("-----------------------------");
		}
	}
	void onlyPass(ArrayList<Student> k)
	{
		Iterator<Student> it = k.iterator();
			while(it.hasNext())
			{
				Student r=it.next();
				if(r.percentage>35)
				{
					System.out.println("Id is:"+r.id);
					System.out.println("Name is:"+r.name);
					System.out.println("Percentage is:"+r.percentage);
					System.out.println("-----------------------------");
				}
		}
	}
	
	void onlyDistinction(ArrayList<Student> k)
	{
		Iterator<Student> it = k.iterator();
			while(it.hasNext())
			{
				Student r=it.next();
				if(r.percentage>70)
				{
					System.out.println("Id is:"+r.id);
					System.out.println("Name is:"+r.name);
					System.out.println("Percentage is:"+r.percentage);
					System.out.println("-----------------------------");
				}
			}
	}
}

