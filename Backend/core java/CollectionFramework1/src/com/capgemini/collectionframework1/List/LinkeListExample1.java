package com.capgemini.collectionframework1.List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkeListExample1 
{
	 public static void main(String[] args) 
	 {
		 LinkedList<Double> li = new LinkedList<Double>();
		 li.add(2.2);
		 li.add(4.2);
		 li.add(2.7);
		 li.add(7.2);
		 
		 System.out.println("Before sorting"+li);
		 
		 Collections.sort(li);
		 System.out.println("After sorting "+li);
	}
}
