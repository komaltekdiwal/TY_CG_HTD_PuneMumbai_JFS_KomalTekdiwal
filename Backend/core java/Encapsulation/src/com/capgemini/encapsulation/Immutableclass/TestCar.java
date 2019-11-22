package com.capgemini.encapsulation.Immutableclass;

public class TestCar 
{
	public static void main(String[] args) 
	{
		Car c = new Car(20,"komal");
	
		System.out.println("Name is :"+c.getName());
		System.out.println("Cost is:"+c.getCost());
	}
	
}
