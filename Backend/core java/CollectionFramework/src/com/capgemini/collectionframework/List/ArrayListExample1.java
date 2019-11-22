package com.capgemini.collectionframework.List;
import java.util.ArrayList;

public class ArrayListExample1
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add("komal");
		a1.add(2.3);
		a1.add('f');
		
		for(Object r:a1)        //by using for-each
		{
			System.out.println(r);
		}
	}
}


