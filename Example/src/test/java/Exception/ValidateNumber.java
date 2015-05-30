package Exception;

public class ValidateNumber 
{
	
	public static void printNumber(int number) throws ValidateNumberException
	{
		if(number > 100)
		{
		  throw new ValidateNumberException(number); 
		}
		else
		{
			System.out.println("Number entered by you is [ "+number+" ] ");  
		}
	}
	
	public static void main(String args[])
	{
		try
		{
		printNumber(100);
		printNumber(200); 
		}
		catch(ValidateNumberException e)
		{ 
			e.printStackTrace();
			System.out.println("Exception [ "+e.getMessage()+" ] ");  
 		}
	}

}
