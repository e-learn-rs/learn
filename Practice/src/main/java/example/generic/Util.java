package example.generic;

import java.util.Iterator;
import java.util.List;


public class Util 
{
	
	public void printStudentDetails(List<Student> students)
	{
		Iterator<Student> studentIterator = students.iterator();
		while(studentIterator.hasNext())
		{
			Student student = studentIterator.next();
			System.out.println("Student name :: "+student.getName()); 
			System.out.println("Student roll number :: "+student.getRollNumber());
			System.out.println("Student percentage :: "+student.getPercentage()); 
		}
	}

}
