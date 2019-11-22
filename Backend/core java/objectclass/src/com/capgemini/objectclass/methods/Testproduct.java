package com.capgemini.objectclass.methods;

public class Testproduct 
{
	public static void main(String[] args) 
	{
		Product p = new Product();
		p.id=1;
		p.name="Komal";
		p.type="pro";
		
		Product r= new Product();
		r.id=2;
		r.name="Samba";
		r.type="ndjn";
		
		Product t = new Product();
		t.id=1;
		t.name="Komal";
		t.type="pro";
		
		boolean res=p.equals(t);
		System.out.println(res);
	}
}
