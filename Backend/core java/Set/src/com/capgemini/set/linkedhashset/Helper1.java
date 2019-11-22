package com.capgemini.set.linkedhashset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Helper1 
{
	void details(LinkedHashSet<Employee> k)
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
	
	

