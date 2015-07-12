package example.collection.student;

import java.util.Collection;
import java.util.Iterator;

public class StudentCollectionUtil
{  
	public void printStudentDetails(Collection collection)
	{
		Iterator iterator = collection.iterator();
		while(iterator.hasNext())
		{
			Object obj = iterator.next();
			Student student = (Student)obj;
			System.out.println("\nDetails of roll number :: "+student.getRollNumber()); 
			System.out.println("Name :: "+student.getName()); 
			System.out.println("Standard :: "+student.getStandard()); 
			System.out.println("Percentage :: "+student.getPercentage()); 
		}
	}
	
	 
	
	
}
