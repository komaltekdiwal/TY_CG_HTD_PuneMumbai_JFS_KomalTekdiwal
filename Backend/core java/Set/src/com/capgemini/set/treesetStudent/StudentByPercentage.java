package com.capgemini.set.treesetStudent;

import java.util.Comparator;

public class StudentByPercentage implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		if(o1.getPercentage()>o2.getPercentage())
		{
			return 1;
		}
		else if(o1.getPercentage()<o2.getPercentage())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
