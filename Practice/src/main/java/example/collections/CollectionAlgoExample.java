package example.collections;

import java.util.*;

import example.collection.student.Student;

public class CollectionAlgoExample 
{
	
	private static Student getStudent(String name , int rollNumber , float percentage , String std)
	{
		Student student = new Student();
		student.setName(name);
		student.setPercentage(percentage);
		student.setStd(std);
		student.setRollNumber(rollNumber); 
		return student;
	}
	
	private static void printStudentDetails(LinkedList<Student> students)
	{
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()); 
			System.out.println(); 
		}
		
	}
	
	private static void printDetailsOfTopThreeStudents(LinkedList<Student> students)
	{
		Iterator<Student> iterator = students.descendingIterator();
		int num = 2;
		while(iterator.hasNext() && num >= 0)
		{
			System.out.println(iterator.next()); 
			System.out.println(); 
			num--;
		}
	}
	public static void main(String args[])
	{
		LinkedList<Student> students = new LinkedList<Student>();
		Student s1 = getStudent("Robb", 13, 90.3f, "10"); 
		Student s2 = getStudent("Stark", 24, 78.3f, "12"); 
		Student s3 = getStudent("Amid", 1, 55.3f, "11"); 
		Student s4 = getStudent("wolf", 20, 40.4f, "8"); 
		Student s5 = getStudent("cuttie", 30, 95.6f, "10"); 
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5); 
		/*System.out.println("Students Initialization ... ");
		printStudentDetails(students); 
		Comparator<Student> r  = Collections.reverseOrder();
		Collections.sort(students, r); 
		System.out.println("After reversing .. "); 
		printStudentDetails(students); 
		Collections.shuffle(students);
		System.out.println("After shuffling");
		printStudentDetails(students); 
		Student minStudent = Collections.min(students);
		System.out.println("MIN :: "+minStudent);  
		System.out.println("MAX :: "+(Student)Collections.max(students));  
		System.out.println("Sorting on the basis of percentage :: ");*/
		Collections.sort(students, new StudentPercentageComparator()); 
		printStudentDetails(students);
		//Collections.reverse(students);
		//printStudentDetails(students); 
		System.out.println("TOP THREE STUDENTS...");
		printDetailsOfTopThreeStudents(students); 
		
		
		
 	}

}
