package com.capg.corejava.inheritance;

public class Daughter extends Father implements InterfaceExample
{
	String dname="Samba";
	
	public static void main(String[] args) 
	{
		Daughter d = new Daughter();
		d.printName();
		d.display();
		d.show();
		
	}
	
	@Override
	public void printName()
	{
		System.out.println(dname+" "+fname+" "+lastname);
		super.printName();  //super keyword corresponds to immediate super class
	}

	@Override
	public void display() 
	{
		System.out.println("Display method in daughter");
	}

	@Override
	public void show()
	{
		System.out.println("Show method in daughter");
		
	}
	
	
}
