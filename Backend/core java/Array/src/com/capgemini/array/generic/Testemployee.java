package com.capgemini.array.generic;

public class Testemployee
{
	public static void main(String[] args) 
	{
				Employee e[] = new Employee[4];
				Employee e1 = new Employee(1,"komal",2333.44);
				Employee e2  = new Employee(2,"mayur",23266.44);
				Employee e3 = new Employee(3,"dinga",28555.94);
				Employee e4  = new Employee(4,"samba",21444.33);
				
				
				e[0]=e1;
				e[1]=e2;
				e[2]=e3;
				e[3]=e4;
				
				receive(e);
				
			}
			
			
			static void receive(Employee[] ar)
			{
				for(Employee f :ar)
				{
				System.out.println(f.id);
				System.out.println(f.name);
				System.out.println(f.sal);
				System.out.println("--------------------------");
				}
			}
		}


