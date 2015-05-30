package StaticVariable;

public class StudentDetails
{

	static
	{
		Student s1 =  new Student("Robin", "6164");
		s1.display();
	}
 /* public static void main(String args[])
  {  
	 Student s1 =  new Student("Robin", "6164");
	 s1.display();
	 Student.updateCollegeName();
	 s1.display();
	 Student s2 =  new Student("Aman", "6162");
	 s2.display();
	 Student s3 =  new Student("Aashish", "6163");
	 s3.display();
  }
*/
}
