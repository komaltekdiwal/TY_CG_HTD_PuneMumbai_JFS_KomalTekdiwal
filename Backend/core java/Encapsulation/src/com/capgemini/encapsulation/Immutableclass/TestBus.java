package com.capgemini.encapsulation.Immutableclass;

public class TestBus 
{
	public static void main(String[] args) 
	{
		Bus b = new Bus("Purple",30);
		System.out.println("Name is :"+b.getName());
		System.out.println("Seats is :"+b.getSeats());
	}
}
