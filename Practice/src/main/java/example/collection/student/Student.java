package example.collection.student;

import java.util.Comparator;

public class Student implements Comparator<Student>, Comparable<Student>
{ 
	
	private String name;
	private int rollNumber;
	private float percentage = 33.0f; 
	private String std = "X";
	
	
	public Student()
	{
		
	}
	
	public Student(String name , int rollNumber)
	{
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getStandard() { 
		return std; 
	}
	
	public void setStd(String std) {
		this.std = std; 
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		if(arg0.getRollNumber() > arg1.getRollNumber())
		{
			return 1;
		}
		else if(arg0.getRollNumber() < arg1.getRollNumber())
		{
			return -1;
		}
		return 0;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.rollNumber > o.rollNumber)
		{
			return 1;
		}
		else if(this.rollNumber < o.rollNumber)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	@Override
	public String toString()
	{
		return "Roll Number :: "+rollNumber+"\nName :: "+name+"\n%age :: "+percentage+"\nStandard :: "+std;
	}


}
