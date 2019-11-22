package com.capgemini.thread.first;

public class TestPen 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		Pen p = new Pen();
		p.run();
		
		Pen t = new Pen();
		try 
		{
			t.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main ended");
		
		
	}
}
