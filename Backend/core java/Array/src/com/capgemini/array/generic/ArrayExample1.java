package com.capgemini.array.generic;

public class ArrayExample1 
{
	public static void main(String[] args) 
	{
		String arr[]= new String[4];
		
		arr[0]="Komal";
		arr[1]="Rajesh";
		arr[2]="Mayur";
		arr[3]="Sonu";
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------------------------");
		
		int arr1[]= new int[4];
		
		arr1[0]=24;
		arr1[1]=06;
		arr1[2]=10;
		arr1[3]=12;
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
