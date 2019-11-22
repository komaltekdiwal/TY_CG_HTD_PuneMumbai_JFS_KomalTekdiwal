package com.capgemini.collectionframework.List;

import java.util.ArrayList;

public class ArrayListExample
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add("komal");
		a1.add(2.3);
		a1.add('f');
		
		
		for(int i =0;i<4;i++)
		{
			Object r = a1.get(i);
			System.out.println(r);
		}
	}
}
