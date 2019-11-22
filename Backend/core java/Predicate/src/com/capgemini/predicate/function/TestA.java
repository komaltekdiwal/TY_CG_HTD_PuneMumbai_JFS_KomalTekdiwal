package com.capgemini.predicate.function;

import java.util.function.Function;

public class TestA 
{
	public static void main(String[] args) 
	{
		Function<Integer,Integer> f = i->i*i;
		int res = f.apply(5);
		System.out.println("Result is :"+res);
	}
}
