package com.capg.corejava.casting;

public class Testclass 
{
	public static void main(String[] args) 
	{
		Pen p = new Marker();       //up-casting
		
		Marker m = (Marker)p;       //down-casting
		m.cost=100;
		m.write();
		m.size=1.7;
		m.color();
		
	}
}
