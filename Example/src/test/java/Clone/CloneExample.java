package Clone;

public class CloneExample 
{
	public static void main(String args[])
	{
		try
		{
		Student s1 = new Student("Robin Singh", 6014);
		s1.printDetails();
		Student s2 = (Student)s1.clone(); 
		//Student s2 = s1;
		s2.printDetails();
		s1.updateName("Mr gill");
		System.out.println("After updation");
		s1.printDetails();
		s2.printDetails();
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}

}
