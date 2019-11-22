package com.capgemini.collectionframework1.List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample2 
{
	 public static void main(String[] args) 
	 {
		 LinkedList li = new LinkedList();
		 li.add('z');
		 li.add('m');
		 li.add('x');
		 li.add('a');
			 
		 System.out.println("Before sorting"+li);
			 
		 Collections.sort(li);
		 System.out.println("After sorting "+li);
		 
		 
		 System.out.println("---------------------------");
		 System.out.println("Before sorting"+li);
		 
		 Collections.shuffle(li);
		 System.out.println("After sorting "+li);
	}
}


