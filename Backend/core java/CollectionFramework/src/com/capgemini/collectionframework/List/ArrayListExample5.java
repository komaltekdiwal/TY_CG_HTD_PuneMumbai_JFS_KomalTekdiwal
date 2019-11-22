package com.capgemini.collectionframework.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample5
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("priya");
		a1.add(2);
		a1.add('f');
		a1.add(5.6);
			
		Iterator it = a1.iterator();
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}
	}
}
