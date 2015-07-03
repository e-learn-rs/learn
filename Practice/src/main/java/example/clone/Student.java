package example.clone; 

public class Student implements Cloneable
{

	private String studentName ; 
	private int rollNo ;
	
	public Student(String studentName , int rollNo)
	{
		this.studentName = studentName;
		this.rollNo = rollNo;
	}
	
	public void updateName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void printDetails()
	{
		System.out.println(" Student Name [ "+studentName+" ]. Roll number [ "+rollNo+" ] ");  
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	} 
}
