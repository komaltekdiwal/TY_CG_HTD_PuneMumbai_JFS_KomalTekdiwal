package com.capgemini.array.generic;

interface Factorial
{
	int fact(int k);
}




public class LambdaFact 
{
	public static void main(String[] args) 
	{
		Factorial f =k->{
			int fa=1;
			for(int i=1;i<=k;i++)
			{
				fa=fa*i;
				
			}
			return fa;
		};
	}
}
