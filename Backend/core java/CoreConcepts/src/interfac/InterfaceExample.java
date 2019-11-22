package interfac;

import java.io.Serializable;

public interface InterfaceExample extends Serializable
{
	public void print();
	public void printNum();
	
	default void display()
	{
		System.out.println("Default method of Interface");
	}
	
	public static void show()
	{
		System.out.println("Static method of interface");
		
	}
}
