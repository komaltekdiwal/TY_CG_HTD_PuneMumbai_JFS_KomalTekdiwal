package com.capgemini.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Helper
{

	void details(TreeSet<Employee> k)
	{
		Iterator<Employee> it = k.iterator();
			while(it.hasNext())
			{
				Employee r=it.next();
				if(r.salary>35)
				{
					System.out.println("Id is:"+r.id);
					System.out.println("Name is:"+r.name);
					System.out.println("Salary is:"+r.salary);
					System.out.println("-----------------------------");
				}
		}
	
	}
}
