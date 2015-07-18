package example.collection.student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentDetails
{
	StudentHelper studentHelper = new StudentHelper();
	
	public void StudentSetExample()
	{ 
		Collection collection= new HashSet();   
		for(int i = 0 ; i < 20 ; i++)
		{
			collection.add(new Student(studentHelper.getRandomStringOfAlphabets(20), i));    
		}
		new StudentCollectionUtil().printStudentDetails(collection);    
		
	} 
	
	public void StudentListExample() 
	{
		Collection collection = new ArrayList(); 
		for(int i = 0 ; i < 20 ; i++)
		{
			collection.add(new Student(studentHelper.getRandomStringOfAlphabets(20), i));    
		}
		new StudentCollectionUtil().printStudentDetails(collection);  
	}
	
	public void StudentTreeSetExample() 
	{
		Collection collection = new TreeSet(); 
		int[] randomNumbers = studentHelper.getRandomNumbers(20); 
		for(int i = 0 ; i < 20 ; i++)
		{
			collection.add(new Student(studentHelper.getRandomStringOfAlphabets(20), randomNumbers[i]));     
		}
		new StudentCollectionUtil().printStudentDetails(collection);  
	}
	
	public static void main(String args[])
	{
		StudentDetails test = new StudentDetails(); 
		test.StudentTreeSetExample();  	 
	}

}
