package com.capgemini.thread.first;

public class TestPVR_Pay 
{
	public static void main(String[] args)
	{
		PVR a = new PVR(); //on single object multiple threads are reacting
	
		Paytm t1=new Paytm(a);
		t1.start();
		
		Paytm t2=new Paytm(a);
		t2.start();
		
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		a.leaveMe();
		
	}
}
