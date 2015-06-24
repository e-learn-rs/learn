package Example.StaticVariable;

public class Student 
{
	private String student_name;
	private String roll_no;
	private static String college_name = "PEC" ;
	
	
	public Student(String studentName, String rollNo)
	{
		student_name = studentName;
		roll_no = rollNo;
	}
	
	public static void updateCollegeName()
	{
		
	}
	
	public void display()
	{
		System.out.println("Memory of student_name [ "+student_name+" ]");
		System.out.println("Memory of Roll no [ "+roll_no+" ]"); 
		System.out.println("Memory of College name [ "+college_name+" ] ");  
	}
 
	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	

}
