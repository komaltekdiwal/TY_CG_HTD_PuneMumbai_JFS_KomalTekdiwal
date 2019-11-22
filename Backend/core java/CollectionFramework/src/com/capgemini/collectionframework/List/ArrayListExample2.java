package com.capgemini.collectionframework.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add("komal");
		a1.add(2.3);
		a1.add('f');
			
		Iterator it = a1.iterator();
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}
	}
}


