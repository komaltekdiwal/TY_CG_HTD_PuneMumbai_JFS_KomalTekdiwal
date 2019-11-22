package com.capgemini.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank 
{
	public static void main(String[] args) 
	{
		ById conn = new ById();
		
		Byname conn1 = new Byname();
		
		Bymicr conn2= new Bymicr();
		
		TreeSet t = new TreeSet(conn2);
		Bank b1 = new Bank(123,"HDFC",9874563210l);
		Bank b2 = new Bank(234,"SBI",4521563210l);
		Bank b3 = new Bank(456,"AXIS",6314563210l);
		Bank b4 = new Bank(789,"IndianOverseas",93132563210l);
		
		t.add(b1);
		t.add(b2);
		t.add(b3);
		t.add(b4);
		
		Iterator<Bank> it =t.iterator();
		while(it.hasNext())
		{
			Bank b =it.next(); 
			System.out.println("Pin is:"+b.pin);
			System.out.println("Name is:"+b.name);
			System.out.println("Micr is:"+b.micr);
			System.out.println("----------------------");
		}
	}

}
