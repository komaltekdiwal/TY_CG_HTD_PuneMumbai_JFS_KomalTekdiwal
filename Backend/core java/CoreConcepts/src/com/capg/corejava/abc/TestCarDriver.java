package com.capg.corejava.abc;

public class TestCarDriver
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.start();
		
		Driver d = new Driver();
		d.receive(c);
		
		
	}
}
