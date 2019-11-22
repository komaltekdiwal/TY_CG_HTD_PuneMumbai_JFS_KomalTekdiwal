package com.capg.corejava.abstraction;

public class TestATM
{
	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		Machine m = new Machine();
		m.slot(h);	
	}
}
