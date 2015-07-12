package example.collection.student;

public class Student 
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

}
