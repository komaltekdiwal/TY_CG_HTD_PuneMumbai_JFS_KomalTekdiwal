package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts
{
	public static void main(String[] args)
	{
		Pattern pat= Pattern.compile("\\d");  //pattern for single digit
		//compile method is used to create object of Pattern class
		Matcher mat=pat.matcher("1");
		System.out.println("For pattern \\d:"+mat.matches());
		
		System.out.println("----------------------");
		
		Pattern pat1= Pattern.compile("\\d{10}");  //pattern for 10 digit
		Matcher mat1=pat1.matcher("1234567890");
		System.out.println("For pattern \\d{10}:"+mat1.matches());
		
		System.out.println("----------------------");
		
		pat= Pattern.compile("\\d+");  //pattern for n digit
		mat=pat.matcher("112345678");
		System.out.println("For pattern \\d+:"+mat.matches());
		
		System.out.println("----------------------");
		
		pat= Pattern.compile("\\d{0}");  //pattern for n digit
		mat=pat.matcher("");
		System.out.println("For pattern \\d{0}:"+mat.matches());
		
		System.out.println("----------------------");
		
		pat= Pattern.compile("\\d{1,10}");  //pattern for n digit (if we give below 1and above 10 it give false and it between true)
		mat=pat.matcher("112345678");
		System.out.println("For pattern \\d{1,10}:"+mat.matches());
		
		System.out.println("-----------------------");
		
		pat= Pattern.compile("\\d{0}");  //pattern for n digit
		mat=pat.matcher("1");
		System.out.println("For pattern \\d{0}:"+mat.matches());
		
		System.out.println("-----------------------");
		
		pat= Pattern.compile("\\d{1,9}");  //pattern for n digit
		mat=pat.matcher("112345678");
		System.out.println("For pattern \\d{1,9}:"+mat.matches());
		
		System.out.println("-----------------------");
		
		pat= Pattern.compile("\\d{1,10}");  //pattern for n digit (if we give below 1and above 10 it give false and it between true)
		mat=pat.matcher("");
		System.out.println("For pattern \\d{1,10}:"+mat.matches());
		
		System.out.println("-----------------------");
		
		Pattern pat8= Pattern.compile("\\D");  //pattern for anything except digit
		Matcher mat8=pat8.matcher("1");
		System.out.println("For pattern \\D:"+mat8.matches());
		
		System.out.println("-----------------------");
		
		pat=Pattern.compile("\\D");
		mat=pat.matcher("A");
		System.out.println("For pattern \\D:"+mat.matches() );
		
		System.out.println("-----------------------");
		
		pat=Pattern.compile("\\D");
		mat=pat.matcher("@");
		System.out.println("For pattern \\D:"+mat.matches());
		System.out.println("--------------------------");
		
		pat=Pattern.compile("\\s");          // s- is used to give single space 
		mat=pat.matcher(" ");
		System.out.println("For pattern \\s:"+mat.matches());
		
		System.out.println("--------------------------");
		
		pat=Pattern.compile("\\S");          // S- is used to give multiple space 
		mat=pat.matcher(" ");
		System.out.println("For pattern \\S:"+mat.matches());
		
		
		
	}
}
