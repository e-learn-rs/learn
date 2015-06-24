package Example.Loop;

public class ErrorMessage 
{
	static int i =0 ;
	
	public static void main(String args[])
  	{
		validateEquality(); 
	}
	
	public static void validateEquality()
	{
		int a  = -1;
		int b = 0;
		if(a > b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
	}
	
	public static void validateErrorMessage()
	{
		String ERROR_MESSAGE = "";
		for(int i =0 ; i < 10 ; i++)
		{
			ERROR_MESSAGE = getErrorMessage(ERROR_MESSAGE);
		}
		System.out.println("ERROR MESSAGE  "+ERROR_MESSAGE+"  ");  
	}
	
	public static String getErrorMessage(String ERROR_MESSAGE)
	{
		ERROR_MESSAGE += (i++); 
		return ERROR_MESSAGE;
	}
	

}
