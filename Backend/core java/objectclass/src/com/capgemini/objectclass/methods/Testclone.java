package com.capgemini.objectclass.methods;

public class Testclone
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Marker m = new Marker("komal",1);
		System.out.println(m.id);
		System.out.println(m.name);
		
		System.out.println("------------------");
		
		Object r= m.clone();
		Marker k = (Marker)r;
		System.out.println(k.id);
		System.out.println(k.name);
	}
}
