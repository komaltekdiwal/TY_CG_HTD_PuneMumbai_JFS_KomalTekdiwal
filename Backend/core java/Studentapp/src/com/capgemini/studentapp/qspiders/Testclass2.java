package com.capgemini.studentapp.qspiders;

import com.capgemini.studentapp.jspiders.Remote;

public class Testclass2 
{
	public static void main(String[] args) 
	{
		System.out.println(Remote.sum);
		Remote.on();
		
		 Remote r = new Remote();
		 System.out.println(r.count);
		 r.off();
	}
}
