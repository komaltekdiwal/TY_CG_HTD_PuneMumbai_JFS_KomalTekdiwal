package com.capgemini.queue.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueueexample1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(10);
		p.add(6);
		p.add(4);
		p.add(9);
		
		Iterator<Integer> it =p.iterator();
		while(it.hasNext())
		{
			Integer r =it.next();
			System.out.println(r);
		}
	}
}
