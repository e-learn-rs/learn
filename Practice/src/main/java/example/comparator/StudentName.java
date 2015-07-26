package example.comparator;

import java.util.*;

public class StudentName {

	public static void main(String args[])
	{
		TreeSet studentNames = new TreeSet(new ReverseStringComparator()); 
		studentNames.add("Robin Singh");
		studentNames.add("Aman deep Singh");
		studentNames.add("Tushar");
		studentNames.add("Kuldeep");
		
		Iterator studentIterator = studentNames.iterator();
		while(studentIterator.hasNext())
		{
			System.out.println(studentIterator.next()); 
		}
	}
}
