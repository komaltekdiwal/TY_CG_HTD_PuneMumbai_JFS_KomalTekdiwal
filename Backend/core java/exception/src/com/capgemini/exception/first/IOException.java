package com.capgemini.exception.first;
                                              //checked exception example
import java.io.File;                                    

public class IOException 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		File f=new File("vikas.txt");

			try 
			{
				f.createNewFile();
			} 
			catch (java.io.IOException e) 
			{
				
				e.printStackTrace();
			}
		
		System.out.println("Main ended");
		
		
	}
}
