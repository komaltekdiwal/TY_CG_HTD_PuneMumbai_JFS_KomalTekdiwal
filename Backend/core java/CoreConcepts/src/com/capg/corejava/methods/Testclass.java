package com.capg.corejava.methods;

public class Testclass
{
	public static void main(String[] args) 
	{
		Car car1= new Car("Mustang GT","Yellow",98746.26);
		System.out.println(print(car1));
	}
	
	public static Car print(Car car)    //car  is reference of Car class
	{
		return car;   //reference variable can be input to method and it can be return by particular method
	}
}
