package example.collections;

import java.util.Comparator;

import example.collection.student.*;

public class StudentPercentageComparator implements Comparator<Object> 
{
	
	@Override
	public int compare(Object o1 , Object o2) 
	{ 
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		if(s1.getPercentage() > s2.getPercentage())
		{
			return 1;
		}
		else if(s1.getPercentage() < s2.getPercentage())
		{
			return -1;
		}
		return 0;
	}


}
