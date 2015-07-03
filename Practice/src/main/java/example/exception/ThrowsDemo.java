package example.exception;

public class ThrowsDemo 
{
	public static void throwOne() throws IllegalAccessException
	{
		System.out.println("Inside throw one..");  
		throw new IllegalAccessException("Illegal access.. ");  
	}
	
	public static void main(String args[])
	{
		try
		{
		throwOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println(e.getMessage()); 
		}
		
	}

}
