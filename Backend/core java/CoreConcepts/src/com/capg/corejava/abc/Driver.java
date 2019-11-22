package com.capg.corejava.abc;

public class Driver extends Car
{
	void receive(Car c)     // passing object to the method
	{
		c.start();
	}
}
