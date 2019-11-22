package com.capgemini.sorting.list;

public class Student implements Comparable<Student>
{
	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) 
	{
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}


	
	//Logic to sort students by id
	/*
	 * @Override public int compareTo(Student s) 
	 * { 
	 * if(this.id>s.id)
	 * 		{
	 * 			 return 1;
	 * 		 }
	 * 		 else if(this.id>s.id)	
	 * 		 {	
	 * 			 return -1;
	 * 		 }
	 * 		 else 
	 * 		{
	 * 			return 0; 	
	 * } }
	 */
	//Logic to sort by percentage
	/*
	 * @Override
	 *  public int compareTo(Student s) 
	 *  { 
	 *  if(this.percentage>s.percentage)
	 * { 
	 * return 1; 
	 * }
	 *  else if(this.percentage>s.percentage) 
	 *  { 
	 *  return -1; 
	 *  } else {
	 * return 0; } }
	 */
	
	//Logic to sort by name
	/*
	 * @Override public int compareTo(Student s)
	 *  {
	 *   String k =this.name; 
	 *   String t =s.name;
	 *  int res = k.compareTo(t);
	 * 
	 * return res; 
	 * }
	 */
	
	
	//Reducing code of above method(sorting by using name)
	/*
	 * @Override public int compareTo(Student s)
	 *  {
	 * 
	 * return this.name.compareTo(s.name); }
	 */
	
	//Logic to sort students by name in descending order
	/*
	 * @Override public int compareTo(Student s) {
	 * 
	 * return this.name.compareTo(s.name)*-1; }
	 */
	
	@Override
	public int compareTo(Student s) 
	{
		Double k = this.percentage;
		Double t = s.percentage;
		
		return k.compareTo(t);
	}
}
