package com.capgemini.array.generic;

public class ArrayExample2 
{
		public static void main(String[] args) 
		{
			int arr[]= {1,2,3,4,5};
			
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
				
			}
			
			
			System.out.println("-------------------------");
			char arr1[]= {'A','P','P','L','E'};
			
			for(char a:arr1)
			{
				System.out.println(a);
			}
			
			System.out.println("-------------------------");
		    double arr2[]= {1.1,2.2,3.3,4.4,5.5};
			
			for(double b: arr2)
			{
				System.out.println(b);
			}
			
			System.out.println("----------------------------");
			double arr3[]=new double[4];
			
			arr3[2]=100;
			for(int i=0;i<4;i++)
			{
				System.out.println(arr3[i]);
			}
			
			
			
		}
	}


