package example.generic;

import java.util.ArrayList;
import java.util.List;



public class StudentDetails
{
	StudentHelper studentHelper = new StudentHelper();
	
	public void studentListExample() 
	{
		List<Student> students = new ArrayList<Student>();
		for(int i = 0 ; i < 20 ; i++)
		{
			students.add(new Student(studentHelper.getRandomStringOfAlphabets(20), i));    
		}
		
		new Util().printStudentDetails(students);
		
	  
	}
	
	public static void main(String args[])
	{
		StudentDetails test = new StudentDetails();  
		test.studentListExample(); 
	}

}
