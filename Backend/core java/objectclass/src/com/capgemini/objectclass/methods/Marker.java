package com.capgemini.objectclass.methods;

public class Marker implements Cloneable
 
{
	String name;
	int id;
	public Marker(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
